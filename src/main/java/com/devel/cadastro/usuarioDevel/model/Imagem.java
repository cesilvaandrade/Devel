package com.devel.cadastro.usuarioDevel.model;


import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "tb_imagem")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Imagem {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "format")
    private String format;

    @Column(name = "imgByte" , length = 5000)
    private byte[] imgByte;




}

