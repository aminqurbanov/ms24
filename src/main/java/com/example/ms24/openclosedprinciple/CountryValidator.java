package com.example.ms24.openclosedprinciple;

import org.springframework.stereotype.Component;


public class CountryValidator  implements WorkerLicenseValidator{
    @Override
    public boolean isValid(WorkerLicenseDto dto) {
        if(dto.getCountry().equals("America")){
            return false;
        }
        return true;
    }
}
