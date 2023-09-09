package br.com.hexagon.pojo.arquitetura.integracao;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface DefinicaoIntegracao {
    IntegracaoEnum[] preExecucao();
    IntegracaoEnum[] posExecucao();
}
