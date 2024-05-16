package com.example.demo.Dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
//@AllArgsConstructor
//@NoArgsConstructor
@Builder
public class CreateNewCompanyDto {
    private String company_name;
    private String company_phone;
    private String company_email;

    public CreateNewCompanyDto(String company_name, String company_phone, String company_email) {
        this.company_name = company_name;
        this.company_phone = company_phone;
        this.company_email = company_email;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }

    public String getCompany_phone() {
        return company_phone;
    }

    public void setCompany_phone(String company_phone) {
        this.company_phone = company_phone;
    }

    public String getCompany_email() {
        return company_email;
    }

    public void setCompany_email(String company_email) {
        this.company_email = company_email;
    }

    public CreateNewCompanyDto() {
    }
}
