package com.example.demo.Dto;

import  lombok.*;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CreateNewEmployee {
    private String firstname;
    private String lastname;
    private String institution;
    private String position;
}
