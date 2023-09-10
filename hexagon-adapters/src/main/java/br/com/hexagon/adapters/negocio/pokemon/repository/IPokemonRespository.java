package br.com.hexagon.adapters.negocio.pokemon.repository;

import br.com.hexagon.entidade.Pokemon;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPokemonRespository extends JpaRepository<Pokemon,Long> {}
