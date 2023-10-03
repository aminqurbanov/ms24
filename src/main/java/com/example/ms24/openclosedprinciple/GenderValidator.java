package com.example.ms24.openclosedprinciple;



public class GenderValidator implements WorkerLicenseValidator {
    @Override
    public boolean isValid(WorkerLicenseDto dto) {
        if (dto.getGender().equals("woman")) {
            return false;
        }
        return true;
    }
}