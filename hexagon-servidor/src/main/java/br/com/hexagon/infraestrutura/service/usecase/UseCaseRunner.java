package br.com.hexagon.infraestrutura.service.usecase;

import br.com.hexagon.pojo.contexto.Contexto;
import br.com.hexagon.pojo.requisicao.Requisicao;

public interface UseCaseRunner {
    <C extends Contexto> C run(Requisicao requisicao) throws Exception;
}
