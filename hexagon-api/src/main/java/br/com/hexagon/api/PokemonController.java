package br.com.hexagon.api;

import br.com.hexagon.pojo.pokemon.RequisicaoCadastraPokemonDTO;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/pokemon")
public interface PokemonController {

    @RequestMapping(method = RequestMethod.POST)
    void cadastra(RequisicaoCadastraPokemonDTO requisicao) throws Exception;

}
