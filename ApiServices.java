package com.example.ApiVacinas.services;

import com.example.ApiVacinas.models.ApiVacinas;
import org.springframework.stereotype.Service;
import com.example.ApiVacinas.repositories.repositories

@Service
public class ApiServices {
    ApiVacinasrepository   apiVacinasrepository;
    public void setApiVacinasrepository(ApiVacinasrepository apiVacinasrepository) {
        this.apiVacinasrepository = apiVacinasrepository;
    }

    public ApiVacinasrepository getApiVacinasrepository() {
        return apiVacinasrepository;
    }

public void createApiVacinas(ApiVacinas apiVacinas) {
        ApiVacinasRepository.save(apiVacinas);
    }
}
