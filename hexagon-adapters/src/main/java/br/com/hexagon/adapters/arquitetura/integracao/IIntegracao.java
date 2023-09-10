package br.com.hexagon.adapters.arquitetura.integracao;

import br.com.hexagon.adapters.arquitetura.usecase.IUseCase;
import br.com.hexagon.pojo.arquitetura.contexto.Contexto;
import br.com.hexagon.pojo.arquitetura.integracao.IntegracaoEnum;

public interface IIntegracao {
    void executa(IntegracaoEnum integracaoEnum, Contexto contexto);
    void executaIntegracoes(Contexto contexto, IntegracaoEnum[] integracoes) throws Exception;
    void executaIntegracoesPreExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception;
    void executaIntegracoesPosExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception;
}
