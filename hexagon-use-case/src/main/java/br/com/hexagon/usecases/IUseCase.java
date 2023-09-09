package br.com.hexagon.usecases;


import br.com.hexagon.pojo.arquitetura.contexto.Contexto;

public interface IUseCase<C extends Contexto> {

    default void preExecuta(C contexto) {};
    void execucao(C contexto);
    default void posExecuta(C contexto) {};

    default Boolean executaIntegracoesPreExecucao(C contexto) {
        return true;
    };

    default Boolean executaIntegracoesPosExecucao(C contexto) {
        return true;
    };

}
