package com.devel.cadastro.usuarioDevel.repository;

import com.devel.cadastro.usuarioDevel.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long > {

}
