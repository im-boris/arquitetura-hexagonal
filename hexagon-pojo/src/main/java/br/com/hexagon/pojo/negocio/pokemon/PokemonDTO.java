package br.com.hexagon.pojo.negocio.pokemon;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PokemonDTO {

    private String nome;

    private String tipo;

    private String habilidades;

    private int nivelDePoder;

}
