package br.com.hexagon.usecases.pokemon;

import br.com.hexagon.negocio.pokemon.validator.ValidacaoNomePokemon;
import br.com.hexagon.pojo.pokemon.ContextoCadastraPokemon;
import br.com.hexagon.usecases.IUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CadastraPokemon implements IUseCase<ContextoCadastraPokemon> {


    // aqui tem q ser uma interface
    // tentar separar isso em um modulo a parte de adapters
    @Autowired
    private ValidacaoNomePokemon validacaoNomePokemon;

    @Override
    public void execucao(ContextoCadastraPokemon contexto) {
        System.out.println(contexto.getRequisicao().getCodigoRequisicao());
    }

}
