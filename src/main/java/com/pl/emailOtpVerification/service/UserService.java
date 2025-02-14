package com.pl.emailOtpVerification.service;

import com.pl.emailOtpVerification.model.Users;
import com.pl.emailOtpVerification.requests.RegisterRequest;
import com.pl.emailOtpVerification.responses.RegisterResponse;

public interface UserService {

    RegisterResponse register(RegisterRequest registerRequest);

    void verify(String email,String otp);
    
	Users login(String email, String password);
	
	void sendResetPasswordOtp(String email);
	
	void resetPassword(String email, String newPassword, String otp);
}
