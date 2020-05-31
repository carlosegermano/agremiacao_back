package com.viracopos.socios.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.viracopos.socios.model.Cidade;
import com.viracopos.socios.model.Estado;
import com.viracopos.socios.model.Socio;
import com.viracopos.socios.model.enums.PerfilSocio;
import com.viracopos.socios.repository.CidadeRepository;
import com.viracopos.socios.repository.EstadoRepository;
import com.viracopos.socios.repository.SocioRepository;

@Service
public class DBService {
	
	@Autowired
	private SocioRepository socioRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;
	
	@Autowired
	private BCryptPasswordEncoder pe;
	
	public void instantiateTestDatabase() {
		
		Estado uf = new Estado(null, "Paraíba");

		estadoRepository.save(uf);

		Cidade cid1 = new Cidade(1, "Rio Tinto", uf);
		Cidade cid2 = new Cidade(2, "Mamanguape", uf);

		cidadeRepository.saveAll(Arrays.asList(cid1, cid2));

		Socio s1 = new Socio(null, "Emerson Felipe", "20/04/1982", "emerson", "São Paulo", 14, "10/01/1997",
				"Ativo", "Presidente", pe.encode("123"));
		Socio s2 = new Socio(null, "Wellington Campos", "10/05/1985", "welliton", "Fluminense", 1,
				"16/05/2000", "Ativo", "Vice_Presidente", pe.encode("123"));
		Socio s3 = new Socio(null, "Tarcizo Junior", "20/08/1981", "cizo", "Flamengo", 5, "11/06/2000",
				"Ativo", "Diretor", pe.encode("123"));
		Socio s4 = new Socio(null, "Franklin", "21/05/1982", "franklin", "Flamengo", 99, "10/01/2010", 
				"Ativo", "Diretor", pe.encode("123"));
		Socio s5 = new Socio(null, "Carlos Eduardo", "25/03/1981", "eduardo", "Flamengo", 8, "10/01/2018",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s6 = new Socio(null, "Emerson Felipe", "20/04/1982", "chico", "São Paulo", 22, "10/01/1997",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s7 = new Socio(null, "Wellington Campos", "10/05/1985", "pedro", "Fluminense", 2,
				"16/05/2000", "Ativo", "Sócio", pe.encode("123"));
		Socio s8 = new Socio(null, "Tarcizo Junior", "20/08/1981", "tonho", "Flamengo", 3, "11/06/2000",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s9 = new Socio(null, "Franklin", "21/05/1982", "francisco", "Flamengo", 4, "10/01/2010", 
				"Ativo", "Sócio", pe.encode("123"));
		Socio s10 = new Socio(null, "Carlos Eduardo", "25/03/1981", "alex", "Flamengo", 6, "10/01/2018",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s11 = new Socio(null, "Emerson Felipe", "20/04/1982", "joao", "São Paulo", 7, "10/01/1997",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s12 = new Socio(null, "Wellington Campos", "10/05/1985", "dada", "Fluminense", 9,
				"16/05/2000", "Ativo", "Sócio", pe.encode("123"));
		Socio s13 = new Socio(null, "Tarcizo Junior", "20/08/1981", "dede", "Flamengo", 10, "11/06/2000",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s14 = new Socio(null, "Franklin", "21/05/1982", "didi", "Flamengo", 11, "10/01/2010", 
				"Ativo", "Sócio", pe.encode("123"));
		Socio s15 = new Socio(null, "Carlos Eduardo", "25/03/1981", "dodo", "Flamengo", 12, "10/01/2018",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s16 = new Socio(null, "Emerson Felipe", "20/04/1982", "dudu", "São Paulo", 13, "10/01/1997",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s17 = new Socio(null, "Wellington Campos", "10/05/1985", "zizo", "Fluminense", 15,
				"16/05/2000", "Ativo", "Sócio", pe.encode("123"));
		Socio s18 = new Socio(null, "Tarcizo Junior", "20/08/1981", "zaza", "Flamengo", 16, "11/06/2000",
				"Ativo", "Sócio", pe.encode("123"));
		Socio s19 = new Socio(null, "Franklin", "21/05/1982", "nenem", "Flamengo", 17, "10/01/2010", 
				"Ativo", "Sócio", pe.encode("123"));
		Socio s20 = new Socio(null, "Carlos Eduardo", "25/03/1981", "luis", "Flamengo", 18, "10/01/2018",
				"Ativo", "Sócio", pe.encode("123"));
		
		s1.addPerfil(PerfilSocio.ADMIN);
		s5.addPerfil(PerfilSocio.ADMIN);

		s1.setCidade(cid1);
		s2.setCidade(cid1);
		s3.setCidade(cid1);
		s4.setCidade(cid1);
		s5.setCidade(cid1);
		s6.setCidade(cid1);
		s7.setCidade(cid1);
		s8.setCidade(cid2);
		s9.setCidade(cid1);
		s10.setCidade(cid1);
		s11.setCidade(cid1);
		s12.setCidade(cid2);
		s13.setCidade(cid1);
		s14.setCidade(cid2);
		s15.setCidade(cid2);
		s16.setCidade(cid1);
		s17.setCidade(cid1);
		s18.setCidade(cid2);
		s19.setCidade(cid1);
		s20.setCidade(cid1);

		socioRepository.saveAll(Arrays.asList(s1, s2, s3, s4, s5, s6, s7, s8, s9, s10, s11, s12, s13, s14, s15, s16, s17, s18, s19, s20));

	}
}
