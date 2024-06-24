////package com.example.demo.Filters;
//////
//////
//////import com.example.demo.Exceptions.AuthenticationFailedException;
//////import com.example.demo.Exceptions.JwtExpiredException;
//////import com.example.demo.Exceptions.UnauthorisedException;
//////import com.example.demo.Repositories.UserRepository;
//////import com.example.demo.ServiceImpl.JwtServiceImpl;
//////import com.example.demo.models.User;
//////import jakarta.servlet.FilterChain;
//////import jakarta.servlet.ServletException;
//////import jakarta.servlet.http.HttpServletRequest;
//////import jakarta.servlet.http.HttpServletResponse;
//////import lombok.RequiredArgsConstructor;
//////import org.springframework.lang.NonNull;
//////import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//////import org.springframework.security.core.AuthenticationException;
//////import org.springframework.security.core.context.SecurityContextHolder;
//////import org.springframework.security.core.userdetails.UserDetails;
//////import org.springframework.security.core.userdetails.UserDetailsService;
//////import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//////import org.springframework.stereotype.Component;
//////import org.springframework.web.filter.OncePerRequestFilter;
//////
//////
//////
//////import io.jsonwebtoken.ExpiredJwtException;
//////
//////import java.io.IOException;
//////import java.util.Optional;
//////
//////@Component
//////@RequiredArgsConstructor
//////public class JwtAuthFilter extends OncePerRequestFilter {
//////    private final UserDetailsService userDetailsService;
//////    private final JwtServiceImpl jwtService;
//////    private final UserRepository userRepository;
//////
//////    @Override
//////    protected void doFilterInternal(@NonNull HttpServletRequest request, @NonNull HttpServletResponse response,
//////                                    @NonNull FilterChain filterChain) throws ServletException, IOException, ExpiredJwtException {
//////        try {
//////            final String authHeader = request.getHeader("Authorization");
//////            final String jwt;
//////            final String userEmail;
//////            if (authHeader == null || !authHeader.startsWith("Bearer ")) {
//////                filterChain.doFilter(request, response);
//////                return;
//////            }
//////            jwt = authHeader.substring(7);
//////            userEmail = jwtService.extractUserEmail(jwt);
//////            System.out.println(userEmail);
//////            Optional<User> user = userRepository.findByEmail(userEmail);
//////            System.out.println(user);
//////            if(user == null || !user.isPresent()){
//////                throw new UnauthorisedException("User " + userEmail + " not valid!");
//////            }
//////            if (userEmail != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//////                UserDetails userDetails = this.userDetailsService.loadUserByUsername(userEmail);
//////
//////                if (jwtService.isTokenValid(jwt, userDetails)) {
//////                    UsernamePasswordAuthenticationToken authToken = new UsernamePasswordAuthenticationToken(userDetails,
//////                            null, userDetails.getAuthorities());
//////                    authToken.setDetails(
//////                            new WebAuthenticationDetailsSource().buildDetails(request));
//////
//////                    SecurityContextHolder.getContext().setAuthentication(authToken);
//////                } else {
//////                    throw new UnauthorisedException("Token is invalid or expired!");
//////                }
//////
//////            }
//////            filterChain.doFilter(request, response);
//////        } catch (ExpiredJwtException e) {
//////            throw new JwtExpiredException("JWT expired: " + e.getMessage());
//////        } catch (AuthenticationException e) {
//////            throw new AuthenticationFailedException("Authentication failed: " + e.getMessage());
//////        } catch(UnauthorisedException e) {
//////            throw new UnauthorisedException(e.getMessage());
//////        }
//////    }
//////}
//////
////
////
////
////
////import com.example.demo.utils.JwtUtil;
////import jakarta.servlet.FilterChain;
////import jakarta.servlet.ServletException;
////import jakarta.servlet.http.HttpServletRequest;
////import jakarta.servlet.http.HttpServletResponse;
////import org.springframework.beans.factory.annotation.Autowired;
////import org.springframework.security.core.context.SecurityContextHolder;
////import org.springframework.security.core.userdetails.UserDetails;
////import org.springframework.security.core.userdetails.UserDetailsService;
////import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
////import org.springframework.stereotype.Component;
////import org.springframework.web.filter.OncePerRequestFilter;
////import java.io.IOException;
////
////import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
////
////@Component
////public class JwtRequestFilter extends OncePerRequestFilter {
////
////    private final UserDetailsService userDetailsService;
//////    private final JwtUtil jwtUtil;
////    private final JwtUtil jwtUtil;
////
////    @Autowired
////    public JwtRequestFilter(UserDetailsService userDetailsService, @Autowired JwtUtil jwtUtil) {
////        this.userDetailsService = userDetailsService;
////        this.jwtUtil = jwtUtil;
////    }
////
////    @Override
////    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
////            throws ServletException, IOException {
////
////        final String authorizationHeader = request.getHeader("Authorization");
////
////        String username = null;
////        String jwt = null;
////
////        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
////            jwt = authorizationHeader.substring(7);
////            username = jwtUtil.extractUsername(jwt);
////        }
////
////        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
////
////            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
////
////            if (jwtUtil.validateToken(jwt, userDetails.getUsername())) {
////
////                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
////                        userDetails, null, userDetails.getAuthorities());
////                usernamePasswordAuthenticationToken
////                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
////                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
////            }
////        }
////        chain.doFilter(request, response);
////    }
////}
////
////
//////package com.example.demo.Filters;
////
////
////@Component
////public class JwtRequestFilter extends OncePerRequestFilter {
////
////    private final UserDetailsService userDetailsService;
////    private final JwtUtil jwtUtil;
////
////    @Autowired
////    public JwtRequestFilter(UserDetailsService userDetailsService, @Autowired JwtUtil jwtUtil) {
////        this.userDetailsService = userDetailsService;
////        this.jwtUtil = jwtUtil;
////    }
////
////    @Override
////    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
////            throws ServletException, IOException {
////
////        final String authorizationHeader = request.getHeader("Authorization");
////
////        String username = null;
////        String jwt = null;
////
////        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
////            jwt = authorizationHeader.substring(7);
////            username = jwtUtil.extractUsername(jwt);
////        }
////
////        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
////
////            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
////
////            if (jwtUtil.validateToken(jwt, userDetails.getUsername())) {
////
////                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
////                        userDetails, null, userDetails.getAuthorities());
////                usernamePasswordAuthenticationToken
////                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
////                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
////            }
////        }
////        chain.doFilter(request, response);
////    }
////}
//
//
//
//
//package com.example.demo.Filters;
//
////import com.example.demo.utils.JwtUtil;
//import jakarta.servlet.FilterChain;
//import jakarta.servlet.ServletException;
//import jakarta.servlet.http.HttpServletRequest;
//import jakarta.servlet.http.HttpServletResponse;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.core.userdetails.UserDetails;
//import org.springframework.security.core.userdetails.UserDetailsService;
//import org.springframework.security.web.authentication.WebAuthenticationDetailsSource;
//import org.springframework.stereotype.Component;
//import org.springframework.web.filter.OncePerRequestFilter;
//
//import java.io.IOException;
//
//@Component
//public class JwtRequestFilter extends OncePerRequestFilter {
//
//    private final UserDetailsService userDetailsService;
//    private final JwtUtil jwtUtil;
//
//    @Autowired
//    public JwtRequestFilter(UserDetailsService userDetailsService, @Autowired JwtUtil jwtUtil) {
//        this.userDetailsService = userDetailsService;
//        this.jwtUtil = jwtUtil;
//    }
//
//    @Override
//    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
//            throws ServletException, IOException {
//
//        final String authorizationHeader = request.getHeader("Authorization");
//
//        String username = null;
//        String jwt = null;
//
//        if (authorizationHeader != null && authorizationHeader.startsWith("Bearer ")) {
//            jwt = authorizationHeader.substring(7);
//            username = jwtUtil.extractUsername(jwt);
//        }
//
//        if (username != null && SecurityContextHolder.getContext().getAuthentication() == null) {
//
//            UserDetails userDetails = this.userDetailsService.loadUserByUsername(username);
//
//            if (jwtUtil.validateToken(jwt, userDetails.getUsername())) {
//
//                UsernamePasswordAuthenticationToken usernamePasswordAuthenticationToken = new UsernamePasswordAuthenticationToken(
//                        userDetails, null, userDetails.getAuthorities());
//                usernamePasswordAuthenticationToken
//                        .setDetails(new WebAuthenticationDetailsSource().buildDetails(request));
//                SecurityContextHolder.getContext().setAuthentication(usernamePasswordAuthenticationToken);
//            }
//        }
//        chain.doFilter(request, response);
//    }
//}