package com.example.demo.Response;




import com.example.demo.Enum.Role;
import lombok.*;

import java.util.UUID;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
//@Setter
//@Getter
public class UserResponse {
    private String firstname;
    private String lastname;
    private String email;
    private Role role;
    public UUID id;

//    public UUID getId() {
//        return id;
//    }
}

