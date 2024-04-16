package fr.diginamic.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.diginamic.model.Marque;
import fr.diginamic.repository.MarqueRepository;

@Service
public class MarqueService {
	 @Autowired
	    private MarqueRepository marqueRepository;

	    public List<Marque> getAllMarques() {
	        return marqueRepository.findAll();
	    }
}
