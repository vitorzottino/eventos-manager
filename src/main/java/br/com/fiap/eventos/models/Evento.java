package br.com.fiap.eventos.models;

//Evento - Produto

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = {"nome", "data", "url"})
@Entity
@Table(name = "tb_evento")
public class Evento
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
    private String nome;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "A data deve ter no mínimo 6 caracteres")
    private String data;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "A url deve ter no mínimo 3 caracteres")
    private String url;

    //Relacionamento
    @ManyToOne
    @JoinColumn(name = "cidade_id", nullable = false)//PK
    private Cidade cidade;
}
