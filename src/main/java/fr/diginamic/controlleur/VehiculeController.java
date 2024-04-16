package fr.diginamic.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.model.Vehicule;
import fr.diginamic.service.VehiculeService;

@RestController
@RequestMapping("/vehicules")
public class VehiculeController {
	 @Autowired
	    private VehiculeService vehiculeService;

	    @GetMapping
	    public List<Vehicule> getAllVehicules() {
	        return vehiculeService.getAllVehicules();
	    }
	    
	  


}
