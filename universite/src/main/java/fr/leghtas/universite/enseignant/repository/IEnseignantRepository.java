package fr.leghtas.universite.enseignant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.leghtas.universite.domain.Enseignant;

@Repository

public interface IEnseignantRepository extends JpaRepository<Enseignant, Integer> {

}
