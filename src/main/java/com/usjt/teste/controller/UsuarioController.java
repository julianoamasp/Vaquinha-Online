package com.usjt.teste.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.usjt.teste.model.Usuario;
import com.usjt.teste.service.UsuarioService;

@Controller
public class UsuarioController {
	
	@Autowired
	private UsuarioService usuarioService;
	
	@GetMapping("/listartodos")
	public ModelAndView listarTodos(){
		
		ModelAndView mv = new ModelAndView("listar");
		
		mv.addObject(new Usuario());
		
		List<Usuario> usuarios = usuarioService.buscarTodos();
		
		mv.addObject("usuarios", usuarios);
		
		return mv;
	}
	
	@PostMapping("/listartodos")
	public String adicionar(Usuario usuario) {
		usuarioService.adicionar(usuario);
		return "redirect:listartodos";
	}
}
