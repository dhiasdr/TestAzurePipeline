package com.epaynexus.www.service;

import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.epaynexus.www.dto.DemandeCreationCompteRequest;
import com.epaynexus.www.enumeration.EtatDemandeCreationCompteEnum;
import com.epaynexus.www.model.DemandeCreationCompte;
import com.epaynexus.www.repository.DemandeCreationCompteRepository;

@Service
public class DemandeCreationCompteServiceImpl implements DemandeCreationCompteService{
	private final DemandeCreationCompteRepository demandeCreationCompteRepository;
	
	
	@Autowired // c'est useless car les nouvelles versions de spring peuvent traiter l'autowiring automatiquement
	public DemandeCreationCompteServiceImpl(DemandeCreationCompteRepository demandeCCRepository) {
		demandeCreationCompteRepository=demandeCCRepository;
	}
	
	@Override
	public void creerDemande(DemandeCreationCompteRequest demandeCreationCompteRequest) {
		DemandeCreationCompte demandeCreationCompte= DemandeCreationCompte.builder()
				.nom(demandeCreationCompteRequest.nom())
				.prenom(demandeCreationCompteRequest.prenom())
				.telephone(demandeCreationCompteRequest.telephone())
				.email(demandeCreationCompteRequest.email())
				.nomEntreprise(demandeCreationCompteRequest.nomEntreprise())
				.raisonSociale(demandeCreationCompteRequest.raisonSociale())
				.numSiret(demandeCreationCompteRequest.numSiret())
				.codePostal(demandeCreationCompteRequest.codePostal())
				.adresse(demandeCreationCompteRequest.codePostal())
				.effectif(demandeCreationCompteRequest.effectif())
				.Demandeur(demandeCreationCompteRequest.demandeur())
				.dateCreation(new Date())
				.etat(EtatDemandeCreationCompteEnum.enCoursDeTraitement)
				.build();
		demandeCreationCompteRepository.save(demandeCreationCompte);
	}

	@Override
	public void traiterDemande(Long identifiant, String action) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<DemandeCreationCompte> extraireDemandesCreationCompte() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DemandeCreationCompte chercherDemandeCreationCompte(Long identifiant) {
		// TODO Auto-generated method stub
		return null;
	}

}
