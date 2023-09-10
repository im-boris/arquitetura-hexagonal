package br.com.hexagon.usecases.pokemon;

import br.com.hexagon.adapters.negocio.pokemon.integracao.local.ICadastraPokemon;
import br.com.hexagon.pojo.arquitetura.contexto.Contexto;
import br.com.hexagon.pojo.negocio.pokemon.RequisicaoCadastraPokemonDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContextoCadastraPokemon extends Contexto<RequisicaoCadastraPokemonDTO> implements
        ICadastraPokemon {

    private String novoNomePokemon;

    @Override
    public String getNomePokemon() {
        return "Hexagon";
    }
}
