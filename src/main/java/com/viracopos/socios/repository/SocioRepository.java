package com.viracopos.socios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viracopos.socios.model.Socio;

@Repository
public interface SocioRepository extends JpaRepository<Socio, Integer> {
	
}
