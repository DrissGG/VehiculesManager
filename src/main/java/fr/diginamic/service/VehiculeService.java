package fr.diginamic.service;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.model.Marque;
import fr.diginamic.model.Vehicule;
import fr.diginamic.model.VehiculesEnum;
import fr.diginamic.repository.MarqueRepository;
import fr.diginamic.repository.VehiculeRepository;
import jakarta.transaction.Transactional;

@Service
public class VehiculeService {
	 	@Autowired
	    private VehiculeRepository vehiculeRepository;
	 	@Autowired
	    private MarqueRepository marqueRepository;

	    public List<Vehicule> getAllVehicules() {
	        return vehiculeRepository.findAll();
	    }
	   
	    public void insert() {
	    	
	    }
	    
}
