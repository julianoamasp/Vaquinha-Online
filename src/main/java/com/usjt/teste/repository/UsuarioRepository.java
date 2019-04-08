package com.usjt.teste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.usjt.teste.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{

}
