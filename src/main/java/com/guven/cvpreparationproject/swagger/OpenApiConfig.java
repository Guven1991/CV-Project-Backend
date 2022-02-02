//package com.guven.cvpreparationproject.swagger;
//
//import io.swagger.v3.oas.annotations.OpenAPIDefinition;
//import io.swagger.v3.oas.models.OpenAPI;
//import io.swagger.v3.oas.models.info.Info;
//import io.swagger.v3.oas.models.info.License;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Bean;
//
//@OpenAPIDefinition
//public class OpenApiConfig {
//
//    @Bean
//    public OpenAPI customOpenAPI(@Value("${application-description}") String appDescription,
//                                 @Value("${application-version}") String appVersion) {
//        return new OpenAPI()
//                .info(new Info()
//                        .title("sample application API")
//                        .version(appVersion)
//                        .description(appDescription)
//                        .termsOfService("http://swagger.io/terms/")
//                        .license(new License().name("Apache 2.0").url("http://springdoc.org")));
//    }
//}