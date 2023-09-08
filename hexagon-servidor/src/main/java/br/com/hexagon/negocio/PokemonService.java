package br.com.hexagon.negocio;

import br.com.hexagon.api.PokemonController;
import br.com.hexagon.infraestrutura.service.usecase.UseCaseRunner;
import br.com.hexagon.pojo.pokemon.RequisicaoCadastraPokemonDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PokemonService implements PokemonController {

    @Autowired
    private UseCaseRunner useCaseRunner;

    @Override
    public void cadastra(RequisicaoCadastraPokemonDTO requisicao) throws Exception {
        useCaseRunner.run(requisicao);
        // retornar o caso de uso
        // passar o objeto PokemonDTO para dentro do caso de uso
        // caso de uso com generics vai receber um INPUT e manipular ponteiro para contexto
    }

}
