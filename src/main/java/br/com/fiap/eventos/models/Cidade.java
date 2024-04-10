package br.com.fiap.eventos.models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

//Cidade - Categoria
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(exclude = ("nome"))

@Entity
@Table(name = "tb_cidade")
public class Cidade
{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
    private String nome;

    @NotBlank(message = "Campo requerido")
    @Size(min = 3, message = "O estado deve ter no mínimo 3 caracteres")
    private String estado;

    //Relacionamento
    @OneToMany(mappedBy = "cidade")
    private List<Evento> eventos = new ArrayList<>();
}
