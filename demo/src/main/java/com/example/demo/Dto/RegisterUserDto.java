package com.example.demo.Dto;


import lombok.*;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class RegisterUserDto {
    private String firstname;
    private String lastname;
    private String email;
    private String password;

}
