package com.example.demo.repositories;

import com.example.demo.models.Plant;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPlantRepository extends JpaRepository<Plant, Integer> {
}
