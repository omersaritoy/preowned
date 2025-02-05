package com.cavcav.service;


import com.cavcav.exception.SellerException;
import com.cavcav.exception.UserException;
import com.cavcav.request.LoginRequest;
import com.cavcav.request.SignupRequest;
import com.cavcav.response.AuthResponse;
import jakarta.mail.MessagingException;

public interface AuthService {

    void sentLoginOtp(String email) throws UserException, MessagingException;
    String createUser(SignupRequest req) throws SellerException;
    AuthResponse signin(LoginRequest req) throws SellerException;

}
