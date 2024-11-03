package com.example.demo.services.plant;

import com.example.demo.models.Plant;
import com.example.demo.repositories.IPlantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlantService implements IPlantService {

    private final IPlantRepository plantRepository;

    @Autowired
    public PlantService(IPlantRepository plantRepository) {
        this.plantRepository = plantRepository;
    }

    @Override
    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    @Override
    public Plant getPlantById(Integer id) {
        return plantRepository.findById(id).orElse(null);
    }

    @Override
    public Plant savePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    @Override
    public void deletePlant(Integer id) {
        plantRepository.deleteById(id);
    }
}
