package br.com.fiap.eventos.repository;

import br.com.fiap.eventos.models.Evento;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventoRepository extends JpaRepository<Evento, Long> {
}
