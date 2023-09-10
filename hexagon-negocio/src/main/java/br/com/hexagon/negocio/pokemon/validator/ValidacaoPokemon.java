package br.com.hexagon.negocio.pokemon.validator;

import br.com.hexagon.entidade.Pokemon;
import br.com.hexagon.adapters.negocio.pokemon.validator.IValidacaoPokemon;
import org.springframework.stereotype.Component;

@Component
public class ValidacaoPokemon implements IValidacaoPokemon {

    @Override
    public Boolean verificaNome(Pokemon pokemon) {
        System.out.println(pokemon.getNome());
        return true;
    }

    @Override
    public Boolean verificaNivelPoder() {
        return false;
    }

}
