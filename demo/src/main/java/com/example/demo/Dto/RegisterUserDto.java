package com.example.demo.Dto;


import com.example.demo.Enum.Role;
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
    private Role role;

}
