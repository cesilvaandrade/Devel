package com.devel.cadastro.usuarioDevel.service;

import org.springframework.stereotype.Service;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

@Service
public class ImagemService {

    public static byte[] toByteImg(String path) throws IOException {

        File imagem = new File(path);

        BufferedImage imagemOriginal = ImageIO.read(imagem);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();

        String format = getFormatByPath(path);

        ImageIO.write(imagemOriginal ,format , baos );

        return baos.toByteArray();
    }
    public static String getFormatByPath(String path){
        int i = path.lastIndexOf('.');
        return path.substring(i+1);
    }

}
