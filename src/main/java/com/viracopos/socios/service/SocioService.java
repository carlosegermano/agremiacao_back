package com.viracopos.socios.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.viracopos.socios.dto.SocioNewDTO;
import com.viracopos.socios.dto.SocioUpDTO;
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
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public Socio find(Integer id) {
		Optional<Socio> obj = socioRepository.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Sócio não encontrado! Id: " + id + 
					", Tipo: " + Socio.class.getName()));
	}
	
	public List<Socio> findAll() {
		return socioRepository.findAll();
	}
	
	public Page<Socio> findPage(Integer page, Integer linesPerPage, String orderBy, String direction) {
		PageRequest pageRequest = PageRequest.of(page, linesPerPage, Direction.valueOf(direction), orderBy);
		return socioRepository.findAll(pageRequest);
	}
	
	public void deleteById(Integer id) {
		socioRepository.deleteById(id);
	}
	
	public Socio insert(Socio obj) {
		obj.setId(null);
		return socioRepository.save(obj);
	}
	
	public Socio update(Socio obj) {
		Socio newObj = find(obj.getId());
		updateData(newObj, obj);
		return socioRepository.save(newObj);
	}

	public Socio fromDTO(SocioNewDTO objDto) {
		Socio socio = new Socio(null, objDto.getNome(), objDto.getDataNascimento(),
				objDto.getEmail(), objDto.getTimeQueTorce(), objDto.getNumeroDaCamisa(),
				objDto.getDataDaAssociacao(), objDto.getStatus(), pe.encode(objDto.getSenha()));
		Cidade cidade = cidadeRepository.getOne(objDto.getCidadeId());
		socio.setCidade(cidade);
		return socio;
	}
	
	public Socio fromDTO(SocioUpDTO objDto) {
		return new Socio(objDto.getId(), objDto.getNome(), objDto.getDataNascimento(),
				objDto.getEmail(), objDto.getTimeQueTorce(), objDto.getNumeroDaCamisa(),
				objDto.getDataDaAssociacao(), objDto.getStatus(), pe.encode(objDto.getSenha()));
	}
	
	private void updateData(Socio newObj, Socio obj) {
		newObj.setNome(obj.getNome());
		newObj.setDataNascimento(obj.getDataNascimento());
		newObj.setEmail(obj.getEmail());
		newObj.setTimeQueTorce(obj.getTimeQueTorce());
		newObj.setNumeroDaCamisa(obj.getNumeroDaCamisa());
		newObj.setDataDaAssociacao(obj.getDataDaAssociacao());
		newObj.setStatus(obj.getStatus());
	}
	
}
