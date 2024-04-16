package fr.diginamic.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.diginamic.model.Vehicule;

public interface VehiculeRepository extends JpaRepository<Vehicule, Long>{

}
