package br.com.hexagon.adapters.pokemon.builder;

import br.com.hexagon.entidade.Pokemon;
import br.com.hexagon.pojo.negocio.pokemon.PokemonDTO;

public interface IPokemonBuilder {
    Pokemon toEntity(PokemonDTO dto);
    PokemonDTO toDto(Pokemon entity);
}
