package com.example.ms24.openclosedprinciple;

import lombok.Data;

import java.util.Date;

@Data
public class WorkerLicenseDto {
    private Long id;

    private Date issueDate;

    private Date  expiredDate;

    private String gender;

    private String country;
}
