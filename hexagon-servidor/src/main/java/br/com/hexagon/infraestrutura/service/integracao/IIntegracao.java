package br.com.hexagon.infraestrutura.service.integracao;

import br.com.hexagon.pojo.arquitetura.contexto.Contexto;
import br.com.hexagon.pojo.arquitetura.integracao.IntegracaoEnum;
import br.com.hexagon.usecases.IUseCase;

public interface IIntegracao {
    void executa(Contexto contexto, IntegracaoEnum integracaoEnum);
    void executaIntegracoes(Contexto contexto, IntegracaoEnum[] integracoes) throws Exception;
    void executaIntegracoesPreExecucao(IUseCase useCaseBean, Contexto contexto) throws Exception;
    void executaIntegracoesPosExecucao(IUseCase useCaseBean, Contexto contexto) throws Exception;
}
