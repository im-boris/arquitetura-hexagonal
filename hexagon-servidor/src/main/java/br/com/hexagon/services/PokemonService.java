package br.com.hexagon.services;

import br.com.hexagon.infraestrutura.service.usecase.IUseCaseRunner;
import br.com.hexagon.api.PokemonController;
import br.com.hexagon.pojo.negocio.pokemon.RequisicaoCadastraPokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService implements PokemonController {

    @Autowired
    private IUseCaseRunner useCaseRunner;

    @Override
    public void cadastra(RequisicaoCadastraPokemonDTO requisicao) throws Exception {
        useCaseRunner.run(requisicao);
    }

}
