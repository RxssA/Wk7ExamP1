package ie.atu.week7exam;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week7ExamApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week7ExamApplication.class, args);
    }

}
