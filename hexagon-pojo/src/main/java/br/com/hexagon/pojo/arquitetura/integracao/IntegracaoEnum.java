package br.com.hexagon.pojo.arquitetura.integracao;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum IntegracaoEnum {

    CADASTRA_POKEMON("ICadastraPokemon");

    private final String nome;
}
