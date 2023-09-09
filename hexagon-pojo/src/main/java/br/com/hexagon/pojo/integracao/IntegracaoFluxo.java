package br.com.hexagon.pojo.integracao;

import br.com.hexagon.pojo.contexto.Contexto;

public interface IntegracaoFluxo {
    void executa(Contexto<?> contexto);
}
