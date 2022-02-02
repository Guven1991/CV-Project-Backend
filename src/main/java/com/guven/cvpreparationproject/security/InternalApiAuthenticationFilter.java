package com.guven.cvpreparationproject.security;

import com.guven.cvpreparationproject.util.SecurityUtils;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Slf4j //log kaydı tutmamızı sağlar
public class InternalApiAuthenticationFilter extends OncePerRequestFilter {

    private final String accessKey;

    public InternalApiAuthenticationFilter(String accessKey){
        this.accessKey =accessKey;
    }

    @Override
    protected boolean shouldNotFilter(HttpServletRequest request) throws ServletException {

        return !request.getRequestURI().startsWith("/api/internal");
    }

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {

        try{
            //Baslıktan kimlik dogrulama anahtarını cıkarma
            String requestKey = SecurityUtils.extractAuthTokenFromRequest(request);

            if(requestKey == null || !requestKey.equals(accessKey)){
                log.warn("Internal key endpoint request without/wrong key uri: {}", request.getRequestURI());
                throw  new RuntimeException("UNAUTHORIZED");

            }

            UserPrincipal user = UserPrincipal.createSuperUser();

            //kimlik doğrulama nesneleri için bir sağlayıcı
            UsernamePasswordAuthenticationToken authentication = new UsernamePasswordAuthenticationToken(user, null, user.getAuthorities());

            //Spiring security context te kullanıcıyı tanımlıyoruz  kullanıcının kimliği doğrulanıyor
            SecurityContextHolder.getContext().setAuthentication(authentication);
        }
        catch (Exception ex){
            log.error("Could not set user authentication in security context", ex);
        }
        filterChain.doFilter(request, response);
    }
}
