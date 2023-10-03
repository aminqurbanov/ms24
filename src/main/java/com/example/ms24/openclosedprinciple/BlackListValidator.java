package com.example.ms24.openclosedprinciple;

import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class BlackListValidator implements AbstractValidator {
    private List blacklist = List.of(1867010L, 1902211L, 1234343L);

    @Override
    public boolean isValid(WorkerLicenseDto dto) {
        boolean contains = blacklist.contains(dto.getId());
        if (contains)
            return false;
        return true;


    }
}