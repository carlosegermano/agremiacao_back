package com.viracopos.socios.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.viracopos.socios.model.Socio;
import com.viracopos.socios.repository.SocioRepository;
import com.viracopos.socios.security.UserSS;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private SocioRepository socioRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Socio socio = socioRepository.findByUsuario(username);
		if (socio == null) {
			throw new UsernameNotFoundException(username);
		}
		return new UserSS(socio.getId(), socio.getUsuario(), socio.getSenha(), socio.getPerfis());
	}

}
