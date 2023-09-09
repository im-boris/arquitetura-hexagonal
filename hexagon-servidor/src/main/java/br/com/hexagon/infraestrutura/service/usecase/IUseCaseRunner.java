package br.com.hexagon.infraestrutura.service.usecase;


import br.com.hexagon.pojo.arquitetura.contexto.Contexto;
import br.com.hexagon.pojo.arquitetura.requisicao.Requisicao;

public interface IUseCaseRunner {
    <C extends Contexto> C run(Requisicao requisicao) throws Exception;
}
