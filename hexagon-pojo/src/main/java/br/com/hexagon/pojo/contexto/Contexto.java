package br.com.hexagon.pojo.contexto;

import br.com.hexagon.pojo.requisicao.Requisicao;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public abstract class Contexto<REQUISICAO extends Requisicao> {
    private REQUISICAO requisicao;
}
