//package com.example.demo.Controlles;
//
//
//import com.example.demo.Auth.AuthService;
//import com.example.demo.Dto.CreateNewCompanyDto;
//import com.example.demo.Dto.LoginDto;
//import com.example.demo.Dto.RegisterUserDto;
//import com.example.demo.Response.ApiResponse;
//import com.example.demo.ServiceImpl.CompanyServiceImpl;
//import com.example.demo.ServiceImpl.UserServiceImpl;
//import com.example.demo.utils.ResponseHandler;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping(path = "/api/v1/users")
//public class UserControllers {
//    private final UserServiceImpl userServiceImpl;
//    private final AuthService authService;
//
//    @PostMapping("/register")
//    public ResponseEntity<ApiResponse<Object>> createNewCompany(@Valid @RequestBody RegisterUserDto dto) throws Exception {
//        Object ob = userServiceImpl.createAccount(dto).getData();
//        return ResponseHandler.success(ob, HttpStatus.CREATED);
//    }
//    @PostMapping("/login")
//    public ResponseEntity<ApiResponse<Object>> loginUser(@Valid @RequestBody LoginDto dto) throws Exception{
//        Object ob = authService.loginUser(dto).getData();
//        return ResponseHandler.success(ob, HttpStatus.OK);
//    }
//}
