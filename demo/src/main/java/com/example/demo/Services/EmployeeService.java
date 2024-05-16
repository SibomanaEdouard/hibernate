package com.example.demo.Services;


import com.example.demo.Dto.CreateNewCompanyDto;
import com.example.demo.Response.ApiResponse;

public interface EmployeeService {
    ApiResponse<Object> createNewCompany(CreateNewCompanyDto dto) throws  Exception;



}
