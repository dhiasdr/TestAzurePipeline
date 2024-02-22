package com.epaynexus.www.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import com.epaynexus.www.model.DemandeCreationCompte;

@Repository
public interface DemandeCreationCompteRepository extends CrudRepository<DemandeCreationCompte, Long> {

}
