package br.com.hexagon.entidade;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "POKEMON")
public class Pokemon {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID")
    private Long id;

    @Column(name = "NOME", length = 255, nullable = false)
    private String nome;

    @Column(name = "TIPO", length = 50)
    private String tipo;

    @Column(name = "HABILIDADES", length = 255)
    private String habilidades;

    @Column(name = "NIVELPODER")
    private int nivelDePoder;

}