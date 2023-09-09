package br.com.hexagon.negocio.pokemon.builder;

import br.com.hexagon.adapters.pokemon.builder.IPokemonBuilder;
import br.com.hexagon.entidade.Pokemon;
import br.com.hexagon.pojo.pokemon.PokemonDTO;
import org.springframework.stereotype.Component;

@Component
public class PokemonBuilder implements IPokemonBuilder {

    @Override
    public Pokemon toEntity(PokemonDTO dto) {
        System.out.println("toEntity POK !");
        return null;
    }

    @Override
    public PokemonDTO toDto(Pokemon entity) {
        System.out.println("toDto POK !");
        return null;
    }

}
