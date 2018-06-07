package com.ubal.test.repository;

import com.ubal.test.domain.Persona;
import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.*;


/**
 * Spring Data JPA repository for the Persona entity.
 */
@SuppressWarnings("unused")
@Repository
public interface PersonaRepository extends JpaRepository<Persona, Long> {

}
