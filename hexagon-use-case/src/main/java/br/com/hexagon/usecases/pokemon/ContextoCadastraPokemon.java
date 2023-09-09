package br.com.hexagon.usecases.pokemon;

import br.com.hexagon.adapters.pokemon.integracao.local.ICadastraPokemon;
import br.com.hexagon.pojo.contexto.Contexto;
import br.com.hexagon.pojo.pokemon.RequisicaoCadastraPokemonDTO;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ContextoCadastraPokemon extends Contexto<RequisicaoCadastraPokemonDTO> implements
        ICadastraPokemon {

    String novoNomePokemon;

    @Override
    public String getNomePokemon() {
        return "Hexagon";
    }
}
