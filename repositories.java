package com.example.ApiVacinas.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface repositories extends JpaRepository<ApiVacinas, Long> {

}
