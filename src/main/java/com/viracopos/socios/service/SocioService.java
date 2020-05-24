package com.viracopos.socios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.viracopos.socios.dto.SocioNewDTO;
import com.viracopos.socios.model.Cidade;
import com.viracopos.socios.model.Socio;
import com.viracopos.socios.repository.CidadeRepository;
import com.viracopos.socios.repository.SocioRepository;
import com.viracopos.socios.service.exceptions.ObjectNotFoundException;

@Service
public class SocioService {

	@Autowired
	private SocioRepository socioRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
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
	
	public Socio insert(Socio obj) {
		obj.setId(null);
		return socioRepository.save(obj);
	}

	public Socio fromDTO(SocioNewDTO objDto) {
		Socio socio = new Socio(null, objDto.getNome(), objDto.getDataNascimento(),
				objDto.getEmail(), objDto.getTimeQueTorce(), objDto.getNumeroDaCamisa(),
				objDto.getDataDaAssociacao(), objDto.getStatus());
		Cidade cidade = cidadeRepository.getOne(objDto.getCidadeId());
		socio.setCidade(cidade);
		return socio;
	}
}
