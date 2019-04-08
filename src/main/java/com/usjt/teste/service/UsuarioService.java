package com.usjt.teste.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.usjt.teste.model.Usuario;
import com.usjt.teste.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepo;
	
	public List<Usuario> buscarTodos(){
		return usuarioRepo.findAll();
	}
	
	public void adicionar(Usuario usuario) {
		usuarioRepo.save(usuario);
	}

	
}
