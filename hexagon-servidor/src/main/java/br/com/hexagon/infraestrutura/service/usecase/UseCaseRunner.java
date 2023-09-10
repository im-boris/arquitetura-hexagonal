package br.com.hexagon.infraestrutura.service.usecase;

import br.com.hexagon.adapters.arquitetura.usecase.IUseCaseRunner;
import br.com.hexagon.infraestrutura.arquitetura.UseCaseMapper;
import br.com.hexagon.adapters.arquitetura.integracao.IIntegracao;
import br.com.hexagon.pojo.arquitetura.contexto.Contexto;
import br.com.hexagon.pojo.arquitetura.requisicao.Requisicao;
import br.com.hexagon.adapters.arquitetura.usecase.IUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UseCaseRunner implements IUseCaseRunner {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private IIntegracao integracaoService;


    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public <C extends Contexto> C run(Requisicao requisicao) throws Exception {

        UseCaseMapper useCase = getUseCase(requisicao);
        IUseCase beanUseCase = getUseCaseBean(useCase);
        Contexto contextoUseCase = useCase.getContexto();
        contextoUseCase.setRequisicao(requisicao);
        disparaFluxo(beanUseCase, contextoUseCase);

        return (C)contextoUseCase;

    }

    private UseCaseMapper getUseCase(Requisicao requisicao) {
        return UseCaseMapper.findById(requisicao.getCodigoRequisicao());
    }

    private IUseCase getUseCaseBean(UseCaseMapper useCase) {
        return applicationContext.getBean(useCase.getUseCase().getClass());
    }

    private void disparaFluxo(IUseCase useCase, Contexto contexto) throws Exception {

        useCase.preExecuta(contexto);
        integracaoService.executaIntegracoesPreExecucao(useCase, contexto);

        useCase.execucao(contexto);

        integracaoService.executaIntegracoesPosExecucao(useCase, contexto);
        useCase.posExecuta(contexto);

    }

}
