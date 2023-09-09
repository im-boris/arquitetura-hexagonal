package br.com.hexagon.negocio.pokemon.integracao.local;

import br.com.hexagon.adapters.pokemon.integracao.local.ICadastraPokemon;
import br.com.hexagon.pojo.contexto.Contexto;
import br.com.hexagon.pojo.integracao.IntegracaoFluxo;
import org.springframework.stereotype.Component;

@Component(value = "ICadastraPokemon")
public class IntegracaoCadastraPokemon implements IntegracaoFluxo {

    @Override
    public void executa(Contexto<?> contexto) {

        ICadastraPokemon integracao = (ICadastraPokemon) contexto;
        System.out.println(integracao.getNomePokemon());

        System.out.println("Cadastrando POKEMON !");
        integracao.setNovoNomePokemon("Hexagon NOVO");
    }

}
