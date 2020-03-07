package ch.mab.plansch.demo.controller;


import java.util.Collections;
import java.util.List;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ch.mab.plansch.demo.model.Degree;
import ch.mab.plansch.demo.model.Student;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/auth")
public class AuthController {

    @PostMapping(path="/login", consumes = "application/json", produces = "application/json")
    @ApiResponses(value = { 
            @ApiResponse(code = 200, message = "ok", response = AuthResponse.class),
            @ApiResponse(code = 401, message = "unauthorized (for wrong login data)"),
            @ApiResponse(code = 400, message = "bad request (e.g. for invalid request-body format)")
    })
    public AuthResponse login(@RequestBody LoginRequestBody body) {
        return new AuthResponse();
    }
    
    @PostMapping(path="/refresh", consumes = "application/json", produces = "application/json")
    @ApiResponses(value = { 
    		@ApiResponse(code = 200, message = "ok", response = AuthResponse.class),
    		@ApiResponse(code = 401, message = "unauthorized (for wrong login data)"),
    		@ApiResponse(code = 400, message = "bad request (e.g. for invalid request-body format)")
    })
    public AuthResponse refresh(@RequestBody RefreshRequestBody body) {
        return new AuthResponse();
    }
    
    @PostMapping(path="/forgot", consumes = "application/json", produces = "application/json")
    @ApiResponses(value = {
    		@ApiResponse(code = 200, message = "ok"),
    		@ApiResponse(code = 400, message = "bad request (general error)")
    })
    public void forgot(@RequestBody ForgotRequestBody body) {
    }
    
    class LoginRequestBody {
    	String email;
    	String password;
    }
    
    class RefreshRequestBody {
    	String refreshToken;
    }
    
    class ForgotRequestBody {
    	String email;
    }

    class AuthResponse {
    	String token;
    	String refreshToken;
    	Student student;
    }
    
}
