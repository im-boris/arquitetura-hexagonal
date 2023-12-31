package br.com.hexagon.infraestrutura.service.integracao;

import br.com.hexagon.adapters.arquitetura.integracao.IIntegracao;
import br.com.hexagon.pojo.arquitetura.contexto.Contexto;
import br.com.hexagon.pojo.arquitetura.integracao.DefinicaoIntegracao;
import br.com.hexagon.pojo.arquitetura.integracao.IntegracaoEnum;
import br.com.hexagon.adapters.arquitetura.integracao.IntegracaoFluxo;
import br.com.hexagon.adapters.arquitetura.usecase.IUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import java.util.Objects;

@Service
public class IntegracaoService implements IIntegracao {

    @Autowired
    private ApplicationContext context;


    @Override
    public void executa(IntegracaoEnum integracaoEnum, Contexto contexto) {
        IntegracaoFluxo integracao = (IntegracaoFluxo) context.getBean(integracaoEnum.getNome());
        integracao.executa(contexto);
    }

    @Override
    public void executaIntegracoes(Contexto contexto, IntegracaoEnum[] integracoes) throws Exception {
        if(Objects.nonNull(integracoes)) {
            for (IntegracaoEnum i : integracoes) {
                String nome = i.getNome();
                IntegracaoFluxo integracao = (IntegracaoFluxo) context.getBean(nome);
                integracao.executa(contexto);
            }
        }
    }

    public void executaIntegracoesPreExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception {
        if(useCaseBean.executaIntegracoesPreExecucao(contexto))
            executaIntegracoes(contexto, this.getAnnotation(useCaseBean).preExecucao());
    }

    public void executaIntegracoesPosExecucao(Contexto contexto, IUseCase useCaseBean) throws Exception {
        if(useCaseBean.executaIntegracoesPosExecucao(contexto))
            executaIntegracoes(contexto, this.getAnnotation(useCaseBean).posExecucao());
    }

    private DefinicaoIntegracao getAnnotation(IUseCase useCase) {
        if (!useCase.getClass().isAnnotationPresent(DefinicaoIntegracao.class))
            throw new RuntimeException("Annotation não presente");

        return useCase.getClass().getAnnotation(DefinicaoIntegracao.class);
    }

}
