package br.com.hexagon.adapters.negocio.pokemon.validator;

import br.com.hexagon.entidade.Pokemon;

public interface IValidacaoPokemon {

    Boolean verificaNome(Pokemon pokemon);
    Boolean verificaNivelPoder();
}
