package br.com.fiap.eventos.repository;

import br.com.fiap.eventos.models.Cidade;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CidadeRepository extends JpaRepository<Cidade, Long> {
}
