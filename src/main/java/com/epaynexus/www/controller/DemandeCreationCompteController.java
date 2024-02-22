package com.epaynexus.www.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.epaynexus.www.dto.DemandeCreationCompteRequest;
import com.epaynexus.www.service.DemandeCreationCompteService;

@RestController
@RequestMapping("API/DemandeCreationCompte")
public class DemandeCreationCompteController {
	private final DemandeCreationCompteService demandeCreationCompteService;

	@Autowired // c'est useless car les nouvelles versions de spring peuvent traiter l'autowiring automatiquement
	public DemandeCreationCompteController(DemandeCreationCompteService demandeCCService) {
		demandeCreationCompteService=demandeCCService;
	}
	@PostMapping(value = "/creerDemande")
	public ResponseEntity creerDemande(@RequestBody DemandeCreationCompteRequest demaCreationCompteRequest) {
		demandeCreationCompteService.creerDemande(demaCreationCompteRequest);
		return ResponseEntity.status(HttpStatus.CREATED).body("Demande créée avec succès");
		
		
	}
}
