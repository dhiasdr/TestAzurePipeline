package com.epaynexus.www.service;

import java.util.List;
import com.epaynexus.www.dto.DemandeCreationCompteRequest;
import com.epaynexus.www.model.DemandeCreationCompte;

public interface DemandeCreationCompteService {
	void creerDemande(DemandeCreationCompteRequest demandeCreationCompteRequest);
	void traiterDemande(Long identifiant, String action);
	List<DemandeCreationCompte> extraireDemandesCreationCompte();
	DemandeCreationCompte chercherDemandeCreationCompte(Long identifiant);
}
