package br.com.hexagon.pojo.arquitetura.integracao;


import br.com.hexagon.pojo.arquitetura.contexto.Contexto;

public interface IntegracaoFluxo {
    void executa(Contexto<?> contexto);
}
