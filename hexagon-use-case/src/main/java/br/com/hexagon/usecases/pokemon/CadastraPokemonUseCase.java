package br.com.hexagon.usecases.pokemon;

import br.com.hexagon.entidade.Pokemon;
import br.com.hexagon.usecases.IUseCase;
import br.com.hexagon.pojo.integracao.DefinicaoIntegracao;
import br.com.hexagon.pojo.integracao.IntegracaoEnum;
import br.com.hexagon.pojo.pokemon.PokemonDTO;
import br.com.hexagon.adapters.pokemon.builder.IPokemonBuilder;
import br.com.hexagon.adapters.pokemon.validator.IValidacaoPokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@DefinicaoIntegracao(preExecucao = {},
                     posExecucao = {IntegracaoEnum.CADASTRA_POKEMON})
public class CadastraPokemonUseCase implements IUseCase<ContextoCadastraPokemon> {

    @Autowired
    private IValidacaoPokemon validacaoPokemon;

    @Autowired
    private IPokemonBuilder builder;


    @Override
    public void execucao(ContextoCadastraPokemon contexto) {
        System.out.println(validacaoPokemon.verificaNome(new Pokemon()));
        System.out.println(validacaoPokemon.verificaNivelPoder());
        builder.toDto(new Pokemon());
        builder.toEntity(new PokemonDTO());
        System.out.println(contexto.getRequisicao().getCodigoRequisicao());
    }

    @Override
    public void posExecuta(ContextoCadastraPokemon contexto) {
        System.out.println("teste pos executa : " + contexto.getNovoNomePokemon());
    }

}
