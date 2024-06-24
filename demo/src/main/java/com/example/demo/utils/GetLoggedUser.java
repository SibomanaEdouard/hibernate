//package com.example.demo.utils;
//
//
//
//import java.util.Optional;
//
//import com.example.demo.Enum.Role;
//import com.example.demo.Exceptions.JwtExpiredException;
//import com.example.demo.Exceptions.UnauthorisedException;
//import com.example.demo.Repositories.UserRepository;
//import com.example.demo.Response.UserResponse;
//import com.example.demo.models.User;
//import org.springframework.data.crossstore.ChangeSetPersister;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.stereotype.Service;
//
//
//import lombok.RequiredArgsConstructor;
//
//@RequiredArgsConstructor
//@Service
//public class GetLoggedUser {
//    private final UserRepository userRepository;
////    private final LeaderRepository leaderRepository;
//
//    public UserResponse getLoggedUser() throws Exception {
//        try {
//            if (SecurityContextHolder.getContext().getAuthentication().getPrincipal() == "anonymousUser") {
//                throw new UnauthorisedException(("You are not logged in"));
//            }
//
//            String email;
//            Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();
//
//            if (principal instanceof UserDetails) {
//                email = ((UserDetails) principal).getUsername();
//            } else {
//                email = principal.toString();
//            }
//
//            Optional<User> user = userRepository.findByEmail(email);
//            UserResponse u;
//            if (!user.isPresent()) {
//                throw new ChangeSetPersister.NotFoundException();
//            } else {
//
//                u = UserResponse.builder()
//                        .firstname(user.get().getFirstname())
//                        .email(user.get().getEmail())
//                        .lastname(user.get().getLastname())
//                        .role(user.get().getRole())
//                        .id(user.get().getId())
//                        .build();
//            }
//            return u;
//        } catch (JwtExpiredException e) {
//            throw new JwtExpiredException("Jwt expired: " + e.getMessage());
//        } catch (ChangeSetPersister.NotFoundException e) {
//            throw new ChangeSetPersister.NotFoundException();
//        } catch (Exception e) {
//            e.printStackTrace();
//            throw new Exception(e.getMessage());
//        }
//    }
//}
