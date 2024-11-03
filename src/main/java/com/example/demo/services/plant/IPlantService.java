package com.example.demo.services.plant;

import com.example.demo.models.Plant;

import java.util.List;

public interface IPlantService {
    List<Plant> getAllPlants();
    Plant getPlantById(Integer id);
    Plant savePlant(Plant plant);
    void deletePlant(Integer id);
}

