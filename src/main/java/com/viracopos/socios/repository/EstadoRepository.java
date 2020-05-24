package com.viracopos.socios.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.viracopos.socios.model.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {

}
