package br.com.hexagon.adapters.pokemon;

import br.com.hexagon.entidade.Pokemon;
import br.com.hexagon.pojo.pokemon.PokemonDTO;

public interface IPokemonBuilder {
    Pokemon toEntity(PokemonDTO dto);
    PokemonDTO toDto(Pokemon entity);
}
