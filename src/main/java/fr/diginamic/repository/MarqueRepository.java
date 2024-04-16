package fr.diginamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.model.Marque;

public interface MarqueRepository  extends JpaRepository<Marque, Long>{
	public Marque findByNom(String nom); 
}
