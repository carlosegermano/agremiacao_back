package com.viracopos.socios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viracopos.socios.model.Socio;
import com.viracopos.socios.repository.SocioRepository;
import com.viracopos.socios.service.exceptions.ObjectNotFoundException;

@Service
public class SocioService {

	@Autowired
	private SocioRepository socioRepository;
	
	public Socio find(Integer id) {
		Optional<Socio> obj = socioRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Sócio não encontrado! Id: " + id + 
					", Tipo: " + Socio.class.getName()));
	}
	
	public List<Socio> findAll() {
		return socioRepository.findAll();
	}
	
	public void deleteById(Integer id) {
		socioRepository.deleteById(id);
	}
}
