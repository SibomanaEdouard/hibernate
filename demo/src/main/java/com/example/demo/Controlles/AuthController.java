package com.example.demo.Controlles;



import com.example.demo.Auth.AuthService;
import com.example.demo.Dto.LoginDto;
import com.example.demo.Response.ApiResponse;
import com.example.demo.utils.ResponseHandler;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<Object>> loginUser(@Valid @RequestBody LoginDto dto) throws Exception{
        Object ob = authService.loginUser(dto).getData();
        return ResponseHandler.success(ob, HttpStatus.OK);
    }
}

