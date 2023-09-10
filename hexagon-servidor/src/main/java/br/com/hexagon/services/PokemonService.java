package br.com.hexagon.services;

import br.com.hexagon.adapters.arquitetura.usecase.IUseCaseRunner;
import br.com.hexagon.api.PokemonController;
import br.com.hexagon.pojo.negocio.pokemon.RequisicaoCadastraPokemonDTO;
import br.com.hexagon.usecases.pokemon.ContextoCadastraPokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService implements PokemonController {

    @Autowired
    private IUseCaseRunner useCaseRunner;

    @Override
    public ContextoCadastraPokemon cadastra(RequisicaoCadastraPokemonDTO requisicao) throws Exception {
        return useCaseRunner.run(requisicao);
    }

}
