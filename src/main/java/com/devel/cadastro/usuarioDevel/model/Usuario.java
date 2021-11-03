package com.devel.cadastro.usuarioDevel.model;

import lombok.*;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "tb_usuario")
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Usuario {
    @Id
    @Column(name = "id",length = 8, unique = true ,nullable = false)
    private Long codigo;

    @Column(name = "nome", length = 100,nullable = false)
    private String nome;

    @Column(name = "dt_aniversario")
    private Date dtAniversario;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "imagem_id" , referencedColumnName = "id")
    private Imagem imagem;

}
