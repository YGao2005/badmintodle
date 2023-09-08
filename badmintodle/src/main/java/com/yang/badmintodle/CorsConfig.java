package com.yang.badmintodle;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class CorsConfig {
    @Bean
    public CorsFilter corsFilter() {
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        CorsConfiguration config = new CorsConfiguration();
        //config.setAllowCredentials(true); // You might need to set this depending on your use case
        config.addAllowedOrigin("*"); // Allow requests from any origin (change to a specific origin in production)
        config.addAllowedHeader("*"); // Allow all headers
        config.addAllowedMethod("GET"); // Add more HTTP methods as needed (e.g., POST, PUT)
        source.registerCorsConfiguration("/**", config);
        return new CorsFilter(source);
    }
}
