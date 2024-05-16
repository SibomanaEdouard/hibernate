package com.example.demo.Response;




import com.example.demo.models.Company;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyResponse {

    private Company company;
    private String message;

}
