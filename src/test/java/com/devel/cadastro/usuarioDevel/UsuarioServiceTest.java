package com.devel.cadastro.usuarioDevel;

import com.devel.cadastro.usuarioDevel.model.Imagem;
import com.devel.cadastro.usuarioDevel.model.Usuario;
import com.devel.cadastro.usuarioDevel.repository.UsuarioRepository;
import com.devel.cadastro.usuarioDevel.service.ImagemService;
import com.devel.cadastro.usuarioDevel.service.UsuarioService;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.text.ParseException;
import java.util.Date;
import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class UsuarioServiceTest {

    @Autowired
    UsuarioRepository usuarioRepository;

    @Autowired
    UsuarioService usuarioService;

    @TestConfiguration
    static class UsuarioServiceTestConfiguration{
        @Bean
        public UsuarioService usuarioService(){
            return new UsuarioService();
        }
    }

    @Test
    public void usuarioTestServiceCadastro() throws ParseException, IOException {
        String path = "src/assert/devel.jpeg";
        usuarioService.cadastraUsuario(Usuario.builder()
                        .codigo(1L)
                        .dtAniversario(new Date())
                        .nome("Devel User")
                        .imagem(Imagem.builder()
                                .imgByte(ImagemService.toByteImg(path))
                                .format(ImagemService.getFormatByPath(path))
                                .build())
                .build());
        Optional<Usuario> userTest = usuarioRepository.findById(1L);
        Assertions.assertNotNull(userTest);
        Assertions.assertNotNull(userTest.get().getImagem());
    }

}
