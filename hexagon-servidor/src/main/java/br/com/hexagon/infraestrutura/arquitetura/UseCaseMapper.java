package br.com.hexagon.infraestrutura.arquitetura;

import br.com.hexagon.pojo.contexto.Contexto;
import br.com.hexagon.pojo.pokemon.ContextoCadastraPokemon;
import br.com.hexagon.usecases.IUseCase;
import br.com.hexagon.usecases.pokemon.CadastraPokemonUseCase;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum UseCaseMapper {

    CADASTRA_POKEMON(1, new CadastraPokemonUseCase(), new ContextoCadastraPokemon());


    private Integer codigoRequisicao;
    private IUseCase useCase;
    private Contexto contexto;

    public static UseCaseMapper findById(Integer id) {
        for (UseCaseMapper useCase: UseCaseMapper.values()) {
                if(useCase.getCodigoRequisicao().equals(id))
                    return useCase;
        }
        throw new RuntimeException("Caso de uso não pode ser encontrado");
    }
}
