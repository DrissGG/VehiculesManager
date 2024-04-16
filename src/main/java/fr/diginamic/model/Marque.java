package fr.diginamic.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Marque {
	
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long Id;
	
	private String nom;
	
	
	private String paysDorigine;
	private String anneeFondation;
	
	public Marque(String nom, String paysDorigine, String anneeFondation) {
		super();
		this.nom = nom;
		this.paysDorigine = paysDorigine;
		this.anneeFondation = anneeFondation;
	}

	public Long getId() {
		return Id;
	}

	public void setId(Long id) {
		Id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPaysDorigine() {
		return paysDorigine;
	}

	public void setPaysDorigine(String paysDorigine) {
		this.paysDorigine = paysDorigine;
	}

	public String getAnneeFondation() {
		return anneeFondation;
	}

	public void setAnneeFondation(String anneeFondation) {
		this.anneeFondation = anneeFondation;
	}

	public Marque() {
		super();
	}
	
}
