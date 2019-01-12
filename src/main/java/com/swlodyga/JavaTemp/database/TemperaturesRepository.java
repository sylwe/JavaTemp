package com.swlodyga.JavaTemp.database;

import com.swlodyga.JavaTemp.model.Temperatures;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TemperaturesRepository extends JpaRepository<Temperatures, Long> {
}
