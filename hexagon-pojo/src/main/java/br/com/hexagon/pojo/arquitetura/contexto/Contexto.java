package br.com.hexagon.pojo.arquitetura.contexto;

import br.com.hexagon.pojo.arquitetura.requisicao.Requisicao;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Contexto<REQUISICAO extends Requisicao> {
    private REQUISICAO requisicao;
}
