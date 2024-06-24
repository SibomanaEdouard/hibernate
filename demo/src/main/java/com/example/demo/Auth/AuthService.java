//package com.example.demo.Auth;
//
//
//
//import com.example.demo.Dto.LoginDto;
//import com.example.demo.Repositories.UserRepository;
//import com.example.demo.Response.ApiResponse;
//import com.example.demo.Services.JwtService;
//import com.example.demo.models.User;
//import lombok.RequiredArgsConstructor;
//
//import org.apache.coyote.BadRequestException;
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.http.HttpStatus;
//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.stereotype.Service;
//
//@Service
//@RequiredArgsConstructor
//public class AuthService {
//    private final UserRepository userRepository;
//    private final JwtService jwtService;
//    private final AuthenticationManager authenticationManager;
//
//    public ApiResponse<Object> loginUser(LoginDto dto) throws Exception {
//        if (dto.getEmail() == null || dto.getPassword() == null) {
//            throw new BadRequestException("All credentials are required!");
//        }
//
//        var auth = authenticationManager.authenticate(
//                new UsernamePasswordAuthenticationToken(dto.getEmail(), dto.getPassword()));
//
//        if (!auth.isAuthenticated()) {
//            throw new BadRequestException("Authentication failed");
//        }
//
//        User user = userRepository.findByEmail(dto.getEmail())
//                .orElseThrow(() -> {
//                    return new ChangeSetPersister.NotFoundException();
//                });
//
//
//
//        var token = jwtService.generateToken(user);
//        return ApiResponse.builder()
//                .success(true)
//                .data(token)
//                .status(HttpStatus.OK)
//                .build();
//
//    }
//}
//
