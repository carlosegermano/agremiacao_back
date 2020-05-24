package com.viracopos.socios;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.viracopos.socios.model.Cidade;
import com.viracopos.socios.model.Estado;
import com.viracopos.socios.model.Socio;
import com.viracopos.socios.repository.CidadeRepository;
import com.viracopos.socios.repository.EstadoRepository;
import com.viracopos.socios.repository.SocioRepository;

@SpringBootApplication
public class ViracoposApplication implements CommandLineRunner {

	@Autowired
	private SocioRepository socioRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(ViracoposApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		
		Estado uf = new Estado(null, "Paraíba");
		
		estadoRepository.save(uf);
		
		Cidade cid = new Cidade(1, "Rio Tinto", uf);
		
		cidadeRepository.save(cid);
		
		Socio s1 = new Socio(null, "Emerson Felipe", "20/04/1982", "emerson@gmail.com", cid, "São Paulo", 14, "10/01/1997", null);
		Socio s2 = new Socio(null, "Wellington Campos", "10/05/1985", "wellington@gmail.com", cid, "Fluminense", 1, "16/05/2000", null);
		Socio s3 = new Socio(null, "Tarcizo Junior", "20/08/1981", "tarcizo@gmail.com", cid, "Flamengo", 5, "11/06/2000", null);
		Socio s4 = new Socio(null, "Franklin", "21/05/1982", "franklin@gmail.com", cid, "Flamengo", 99, "10/01/2010", null);
		Socio s5 = new Socio(null, "Carlos Eduardo", "25/03/1981", "eduardo@gmail.com", cid, "Flamengo", 8, "10/01/2018", null);
		Socio s6 = new Socio(null, "Carlos Eduardo", "25/03/1981", "eduardo@gmail.com", cid, "Flamengo", 8, "10/01/2018", null);
		
		s1.setCidade(cid);
		s2.setCidade(cid);
		s3.setCidade(cid);
		s4.setCidade(cid);
		s5.setCidade(cid);
		s6.setCidade(cid);
		
		socioRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6));
		
		
	}

}
