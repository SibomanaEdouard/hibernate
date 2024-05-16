package com.example.demo.Controlles;

import com.example.demo.Dto.CreateNewCompanyDto;
import com.example.demo.Response.ApiResponse;
import com.example.demo.ServiceImpl.EmployeeServiceImpl;
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
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/company")
public class CompanyControllers {
    private final EmployeeServiceImpl employeeServiceImpl;

    @PostMapping("/create_company")
    public ResponseEntity<ApiResponse<Object>> createNewCompany(@Valid @RequestBody CreateNewCompanyDto dto) throws Exception {
        Object ob = employeeServiceImpl.createNewCompany(dto).getData();
        return ResponseHandler.success(ob, HttpStatus.CREATED);
    }
}

