package br.com.hexagon.infraestrutura.service.usecase;

import br.com.hexagon.infraestrutura.arquitetura.UseCaseMapper;
import br.com.hexagon.pojo.contexto.Contexto;
import br.com.hexagon.pojo.requisicao.Requisicao;
import br.com.hexagon.usecases.IUseCase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class UseCaseRunner implements IUseCaseRunner {

    @Autowired
    private ApplicationContext context;

//    @Autowired
//    private IIntegracao integracaoService;

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public <C extends Contexto> C run(Requisicao requisicao) throws Exception {

        UseCaseMapper useCase = getUseCase(requisicao);
        Contexto contexto = useCase.getContexto();
        contexto.setRequisicao(requisicao);
        IUseCase useCaseBean = getUseCaseBean(useCase);
        disparaFluxo(useCaseBean, contexto);

        return (C)contexto;

    }

    private UseCaseMapper getUseCase(Requisicao requisicao) {
        return UseCaseMapper.findById(requisicao.getCodigoRequisicao());
    }

    private IUseCase getUseCaseBean(UseCaseMapper useCase) {
        return context.getBean(useCase.getUseCase().getClass());
    }

    private void disparaFluxo(IUseCase useCase, Contexto contexto) throws Exception{

        useCase.preExecuta(contexto);
//        executaIntegracoesPreExecucao(useCase, contexto);

        useCase.execucao(contexto);

//        executaIntegracoesPosExecucao(useCase, contexto);
        useCase.posExecuta(contexto);

    }
//
//    private void executaIntegracoesPreExecucao(IMediator mediatorBean, Contexto contexto) throws Exception {
//        if(mediatorBean.executaIntegracoesPreExecucao(contexto))
//            integracaoService.executaIntegracoes(contexto, integracaoService.getAnnotation(mediatorBean).preExecucao());
//    }
//
//    private void executaIntegracoesPosExecucao(IMediator mediatorBean, Contexto contexto) throws Exception {
//        if(mediatorBean.executaIntegracoesPosExecucao(contexto))
//            integracaoService.executaIntegracoes(contexto, integracaoService.getAnnotation(mediatorBean).posExecucao());
//    }
}
