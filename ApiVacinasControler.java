package com.example.ApiVacinas.controlers;
import com.example.ApiVacinas.services.ApiServices;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/vacinas/")

public class ApiVacinasControler {
    ApiVacinasService apiVacinasService;
    public ApiVacinasControler(ApiVacinasService apiVacinasService) {
        this.apiVacinasService = apiVacinasService;
    }
    @PostMapping
    public ResponseEntity<void> create(RequestBody ApiVacinas apiVacinas) {
        apiVacinasService.create(apiVacinas);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

}
