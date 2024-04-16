package fr.diginamic.runner;

import java.io.BufferedReader;
import java.io.FileReader;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.stereotype.Component;

import fr.diginamic.VehiculesManager;
import fr.diginamic.model.Marque;
import fr.diginamic.model.Vehicule;
import fr.diginamic.model.VehiculesEnum;
import fr.diginamic.repository.MarqueRepository;
import fr.diginamic.repository.VehiculeRepository;
import fr.diginamic.service.VehiculeService;

@Component
public class MyCommandeLineRunner implements CommandLineRunner {
	@Autowired
	private VehiculeRepository vehiculeRepository;
	@Autowired
	private MarqueRepository marqueRepository;
	@Autowired
	private VehiculeService vehiculeServices;
	
	public static void main(String[] args) {

		SpringApplication sa = new SpringApplication(VehiculesManager.class);
		sa.setWebApplicationType(WebApplicationType.NONE);
		sa.run(args);
				
	}
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		String csvFile = "voitures.csv";
        String line;
        String cvsSplitBy = ";";
        
        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))){
			br.readLine();
        	while((line = br.readLine()) != null) {
        		String[] data = line.split(cvsSplitBy);

                Marque marque = marqueRepository.findByNom(data[0]);
                if(marque==null) {
                    marque = new Marque();
                    marque.setAnneeFondation(data[2]);
                    marque.setNom(data[0]);
                    marque.setPaysDorigine(data[3]);
                    marqueRepository.save(marque);
                }
                
                
               
                Vehicule vehicule = new Vehicule();
                
                vehicule.setMarque(vehicule.getMarque());
                vehicule.setType(VehiculesEnum.VOITURE);
                vehicule.setModele(data[1]);
                                	
                vehicule.setMarque(marque);
               
                vehiculeRepository.save(vehicule);
               				
			}}}

}
