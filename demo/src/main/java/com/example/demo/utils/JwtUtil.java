//package com.example.demo.utils;
//
//
////
////import io.jsonwebtoken.Claims;
////import io.jsonwebtoken.Jwts;
////import io.jsonwebtoken.SignatureAlgorithm;
////import org.springframework.stereotype.Component;
////
////import java.util.Date;
////import java.util.HashMap;
////import java.util.Map;
////import java.util.function.Function;
////
////@Component
////public class JwtUtil {
////
////    private final String secret = "3D41112DCF3F434B58C192E379DF13D41112DCF3F434B58C192E379DF1"; // Example base64 string
////
////
////    public String extractUsername(String token) {
////        return extractClaim(token, Claims::getSubject);
////    }
////
////    public Date extractExpiration(String token) {
////        return extractClaim(token, Claims::getExpiration);
////    }
////
////    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
////        final Claims claims = extractAllClaims(token);
////        return claimsResolver.apply(claims);
////    }
////
////    private Claims extractAllClaims(String token) {
////        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
////    }
////
////    private Boolean isTokenExpired(String token) {
////        return extractExpiration(token).before(new Date());
////    }
////
////    public String generateToken(String username) {
////        Map<String, Object> claims = new HashMap<>();
////        return createToken(claims, username);
////    }
////
////    private String createToken(Map<String, Object> claims, String subject) {
////        return Jwts.builder()
////                .setClaims(claims)
////                .setSubject(subject)
////                .setIssuedAt(new Date(System.currentTimeMillis()))
////                .setExpiration(new Date(System.currentTimeMillis() + 1000 * 60 * 60 * 10))
////                .signWith(SignatureAlgorithm.HS256, secret)
////                .compact();
////    }
////
////    public Boolean validateToken(String token, String username) {
////        final String extractedUsername = extractUsername(token);
////        return (extractedUsername.equals(username) && !isTokenExpired(token));
////    }
////}
////
//
//
////
////import io.jsonwebtoken.Claims;
////import io.jsonwebtoken.Jwts;
////import io.jsonwebtoken.SignatureAlgorithm;
////import org.springframework.beans.factory.annotation.Value;
////import org.springframework.stereotype.Component;
////
////import java.util.Date;
////import java.util.HashMap;
////import java.util.Map;
////import java.util.function.Function;
////
////@Component
////public class JwtUtil {
////
////    @Value("${jwt.secret-key}")
////    private String secret;
////
////    @Value("${jwt.expirationMs}")
////    private long expirationMs;
////
////    public String extractUsername(String token) {
////        return extractClaim(token, Claims::getSubject);
////    }
////
////    public Date extractExpiration(String token) {
////        return extractClaim(token, Claims::getExpiration);
////    }
////
////    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
////        final Claims claims = extractAllClaims(token);
////        return claimsResolver.apply(claims);
////    }
////
////    private Claims extractAllClaims(String token) {
////        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
////    }
////
////    private Boolean isTokenExpired(String token) {
////        final Date expiration = extractExpiration(token);
////        return expiration.before(new Date());
////    }
////
////    public String generateToken(String username) {
////        Map<String, Object> claims = new HashMap<>();
////        return createToken(claims, username);
////    }
////
////    private String createToken(Map<String, Object> claims, String subject) {
////        return Jwts.builder()
////                .setClaims(claims)
////                .setSubject(subject)
////                .setIssuedAt(new Date())
////                .setExpiration(new Date(System.currentTimeMillis() + expirationMs))
////                .signWith(SignatureAlgorithm.HS256, secret)
////                .compact();
////    }
////
////    public Boolean validateToken(String token, String username) {
////        final String extractedUsername = extractUsername(token);
////        return (extractedUsername.equals(username) && !isTokenExpired(token));
////    }
////}
//
//
//
////package com.example.demo.utils;
//
//import io.jsonwebtoken.Claims;
//import io.jsonwebtoken.Jwts;
//import io.jsonwebtoken.SignatureAlgorithm;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Component;
//
//import java.util.Date;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.function.Function;
//
//@Component
//public class JwtUtil {
//
//    @Value("${security.jwt.secret-key}")
//    private String secret;
//
//    @Value("${security.jwt.expirationMs}")
//    private long expirationMs;
//
//    public String extractUsername(String token) {
//        return extractClaim(token, Claims::getSubject);
//    }
//
//    public Date extractExpiration(String token) {
//        return extractClaim(token, Claims::getExpiration);
//    }
//
//    public <T> T extractClaim(String token, Function<Claims, T> claimsResolver) {
//        final Claims claims = extractAllClaims(token);
//        return claimsResolver.apply(claims);
//    }
//
//    private Claims extractAllClaims(String token) {
//        return Jwts.parser().setSigningKey(secret).parseClaimsJws(token).getBody();
//    }
//
//    private Boolean isTokenExpired(String token) {
//        final Date expiration = extractExpiration(token);
//        return expiration.before(new Date());
//    }
//
//    public String generateToken(String username) {
//        Map<String, Object> claims = new HashMap<>();
//        return createToken(claims, username);
//    }
//
//    private String createToken(Map<String, Object> claims, String subject) {
//        return Jwts.builder()
//                .setClaims(claims)
//                .setSubject(subject)
//                .setIssuedAt(new Date())
//                .setExpiration(new Date(System.currentTimeMillis() + expirationMs))
//                .signWith(SignatureAlgorithm.HS256, secret)
//                .compact();
//    }
//
//    public Boolean validateToken(String token, String username) {
//        final String extractedUsername = extractUsername(token);
//        return (extractedUsername.equals(username) && !isTokenExpired(token));
//    }
//}