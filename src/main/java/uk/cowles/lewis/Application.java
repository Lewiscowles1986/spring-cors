package uk.cowles.lewis;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import uk.cowles.lewis.util.JwtUtil;

@SpringBootApplication
public class Application {
    @Autowired
    private JwtUtil jwtUtil;

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(Application.class, args);

        // Access the autowired bean from the application context
        JwtUtil jwtUtil = context.getBean(JwtUtil.class);

        System.out.println("JWT:" + jwtUtil.generateToken("Test"));
    }
}
