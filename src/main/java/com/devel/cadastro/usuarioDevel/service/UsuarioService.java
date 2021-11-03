package com.devel.cadastro.usuarioDevel.service;

import com.devel.cadastro.usuarioDevel.model.Usuario;
import com.devel.cadastro.usuarioDevel.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioService {

    @Autowired
    UsuarioRepository usuarioRepository;

    public void cadastraUsuario(Usuario usuario){
       usuarioRepository.save(usuario);
    }

}
