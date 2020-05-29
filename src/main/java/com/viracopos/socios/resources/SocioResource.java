package com.viracopos.socios.resources;

import java.net.URI;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.viracopos.socios.dto.SocioDTO;
import com.viracopos.socios.dto.SocioNewDTO;
import com.viracopos.socios.model.Socio;
import com.viracopos.socios.service.SocioService;

@RestController
@RequestMapping(value = "/socios")
public class SocioResource {

	@Autowired
	private SocioService socioService;
			
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<Socio> find(@PathVariable Integer id) {
		Socio obj = socioService.find(id);
		return ResponseEntity.ok().body(obj);
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<SocioDTO>> findAll() {
		List<Socio> socios = socioService.findAll();
		List<SocioDTO> sociosDTO = socios.stream().map(
				s -> new SocioDTO(s)).collect(Collectors.toList());
		return ResponseEntity.ok().body(sociosDTO);
	}
	
	@RequestMapping(value = "page", method = RequestMethod.GET)
	public ResponseEntity<Page<SocioDTO>> findPage(
			@RequestParam(value = "page", defaultValue = "0") Integer page,
			@RequestParam(value = "linesPerPage", defaultValue = "24") Integer linesPerPage,
			@RequestParam(value = "orderBy", defaultValue = "nome") String orderBy,
			@RequestParam(value = "direction", defaultValue = "ASC") String direction) {
		Page<Socio> list = socioService.findPage(page, linesPerPage, orderBy, direction);
		Page<SocioDTO> listDto = list.map(obj -> new SocioDTO(obj));
		return ResponseEntity.ok().body(listDto);
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> delete(@PathVariable Integer id) {
		socioService.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public ResponseEntity<Void> insert(@RequestBody SocioNewDTO objDto) {
		Socio obj = socioService.fromDTO(objDto);
		obj = socioService.insert(obj);
		URI uri = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(obj.getId()).toUri();
		return ResponseEntity.created(uri).build();
	}
	
	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	public ResponseEntity<Void> update(@RequestBody SocioNewDTO objDto, @PathVariable Integer id) {
		Socio obj = socioService.fromDTO(objDto);
		obj.setId(id);
		obj = socioService.update(obj);
		return ResponseEntity.noContent().build();
	}
	
	@RequestMapping(value = "/picture", method = RequestMethod.POST)
	public ResponseEntity<Void> uploadProfilePicture(@RequestParam(name="file") MultipartFile file) {
		URI uri = socioService.uploadProfilePicture(file);
		return ResponseEntity.created(uri).build();
	}
}
