package br.com.hexagon.adapters.arquitetura.integracao;

import br.com.hexagon.adapters.arquitetura.usecase.IUseCase;
import br.com.hexagon.pojo.arquitetura.contexto.Contexto;
import br.com.hexagon.pojo.arquitetura.integracao.IntegracaoEnum;

public interface IIntegracao {
    void executa(Contexto contexto, IntegracaoEnum integracaoEnum);
    void executaIntegracoes(Contexto contexto, IntegracaoEnum[] integracoes) throws Exception;
    void executaIntegracoesPreExecucao(IUseCase useCaseBean, Contexto contexto) throws Exception;
    void executaIntegracoesPosExecucao(IUseCase useCaseBean, Contexto contexto) throws Exception;
}
