package com.example.ms24;

import com.example.ms24.openclosedprinciple.WorkerLicenseDto;
import com.example.ms24.openclosedprinciple.WorkerLicenseValidator;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
@Slf4j
@RequiredArgsConstructor
public class Ms24Application implements CommandLineRunner {
    private final WorkerLicenseValidator workerLicenseValidator;

    public static void main(String[] args) {
        SpringApplication.run(Ms24Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("Started");
        WorkerLicenseDto dto = new WorkerLicenseDto();
        dto.setId(1L);
        dto.setExpiredDate(new Date());
        dto.setCountry("America");
        dto.setGender("woman");
        System.out.println(workerLicenseValidator.isValid(dto));


        WorkerLicenseDto dto1 = new WorkerLicenseDto();
        dto1.setId(1867010L);
        dto1.setExpiredDate(new Date());
        dto1.setCountry("Turkey");
        dto1.setGender("man");
        System.out.println(workerLicenseValidator.isValid(dto1));
    }
}
