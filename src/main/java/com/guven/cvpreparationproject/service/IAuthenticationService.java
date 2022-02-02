package com.guven.cvpreparationproject.service;

import com.guven.cvpreparationproject.model.User;

public interface IAuthenticationService {
     User signInAndReturnJWT(User signInRequest);
}
