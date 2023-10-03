package com.example.ms24.openclosedprinciple;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkerLicenseValidatorIml implements WorkerLicenseValidator {
    private final List<AbstractValidator> validators;


    @Override
    public boolean isValid(WorkerLicenseDto dto) {
        boolean valid = true;
        for (AbstractValidator abstractValidator : validators){
            boolean valid1 =abstractValidator.isValid(dto);
            if (!valid1)
                return false;
        }
        return false;
    }
}
