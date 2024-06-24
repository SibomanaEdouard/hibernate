//package com.example.demo.Controlles;
//
//import com.example.demo.Dto.CreateNewCompanyDto;
//import com.example.demo.Response.ApiResponse;
//import com.example.demo.ServiceImpl.CompanyServiceImpl;
//import com.example.demo.utils.ResponseHandler;
//import jakarta.validation.Valid;
//import lombok.RequiredArgsConstructor;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.*;
//
//@RestController
//@RequiredArgsConstructor
//@RequestMapping(path = "/api/v1/company")
//public class CompanyControllers {
//    private final CompanyServiceImpl employeeServiceImpl;
//
//    @PostMapping("/create_company")
//    public ResponseEntity<ApiResponse<Object>> createNewCompany(@Valid @RequestBody CreateNewCompanyDto dto) throws Exception {
//        Object ob = employeeServiceImpl.createNewCompany(dto).getData();
//        return ResponseHandler.success(ob, HttpStatus.CREATED);
//    }
//    @GetMapping("/companies")
//    public ResponseEntity<ApiResponse<Object>> getAllCompanies() throws Exception {
//        Object ob = employeeServiceImpl.getAllCompanies().getData();
//        return ResponseHandler.success(ob, HttpStatus.CREATED);
//    }
//}
//
