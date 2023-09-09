package br.com.hexagon.adapters.pokemon;

import br.com.hexagon.entidade.Pokemon;

public interface IValidacaoPokemon {

    Boolean verificaNome(Pokemon pokemon);
    Boolean verificaNivelPoder();
}
