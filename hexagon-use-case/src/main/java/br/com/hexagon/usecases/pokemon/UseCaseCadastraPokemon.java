package br.com.hexagon.usecases.pokemon;

import br.com.hexagon.adapters.arquitetura.integracao.IIntegracao;
import br.com.hexagon.entidade.Pokemon;
import br.com.hexagon.adapters.arquitetura.usecase.IUseCase;
import br.com.hexagon.pojo.arquitetura.integracao.DefinicaoIntegracao;
import br.com.hexagon.pojo.arquitetura.integracao.IntegracaoEnum;
import br.com.hexagon.pojo.negocio.pokemon.PokemonDTO;
import br.com.hexagon.adapters.negocio.pokemon.builder.IPokemonBuilder;
import br.com.hexagon.adapters.negocio.pokemon.validator.IValidacaoPokemon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@DefinicaoIntegracao(preExecucao = {IntegracaoEnum.CADASTRA_POKEMON},
                     posExecucao = {IntegracaoEnum.CADASTRA_POKEMON})
public class UseCaseCadastraPokemon implements IUseCase<ContextoCadastraPokemon> {

    @Autowired
    private IValidacaoPokemon validacaoPokemon;

    @Autowired
    private IPokemonBuilder builder;

    @Autowired
    private IIntegracao integracao;


    @Override
    public void execucao(ContextoCadastraPokemon contexto) {
        System.out.println(validacaoPokemon.verificaNivelPoder());
        builder.toDto(new Pokemon());
        builder.toEntity(new PokemonDTO());
        integracao.executa(IntegracaoEnum.CADASTRA_POKEMON, contexto);
    }

}
