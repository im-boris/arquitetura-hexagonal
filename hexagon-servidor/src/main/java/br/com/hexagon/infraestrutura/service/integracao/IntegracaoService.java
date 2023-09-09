//package br.com.hexagon.infraestrutura.service.integracao;
//
//import br.com.hexagon.pojo.contexto.Contexto;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.ApplicationContext;
//import org.springframework.stereotype.Service;
//
//import java.util.Objects;
//
//@Service
//public class IntegracaoService implements IIntegracao {
//
//    @Autowired
//    private ApplicationContext context;
//
//    @Override
//    public void executa(Contexto contexto, Class<?> clazz) {
//        Integracao integracao = (Integracao) context.getBean(clazz);
//        integracao.setContexto(contexto);
//        integracao.executa();
//    }
//
//    @Override
//    public void executa(Contexto contexto, IntegracaoEnum integracaoEnum) {
//        Integracao integracao = (Integracao) context.getBean(integracaoEnum.getNome());
//        integracao.setContexto(contexto);
//        integracao.executa();
//    }
//
//    @Override
//    public void executaIntegracoes(Contexto contexto, IntegracaoEnum[] integracoes) throws Exception {
//        if(Objects.nonNull(integracoes)) {
//            for (IntegracaoEnum i : integracoes) {
//                String nome = i.getNome();
//                Integracao integracao = (Integracao) context.getBean(nome);
//                integracao.setContexto(contexto);
//                integracao.executa();
//            }
//        }
//    }
//
//    @Override
//    public DefinicaoIntegracao getAnnotation(IMediator mediator) {
//        if (!mediator.getClass().isAnnotationPresent(DefinicaoIntegracao.class))
//            throw new RuntimeException("Annotation não presente");
//
//        return mediator.getClass().getAnnotation(DefinicaoIntegracao.class);
//    }
//
//}
