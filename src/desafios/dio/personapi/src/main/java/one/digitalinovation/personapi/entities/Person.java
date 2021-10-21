package one.digitalinovation.personapi.entities;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;


@Entity
@Data // inserir getter e setters
@Builder // builder projeto
@AllArgsConstructor // inserir construtores
@NoArgsConstructor // inserir construtores
public class Person implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // gera id incremental automatico
    private Long id;

    @Column(nullable = true) // obrigatório pra ser obg coloca false ///
    private String firstName;

    @Column(nullable = true) // obrigatório coloca false
    private String lastName;

    @Column(nullable = true, unique = true) // obrigatório coloca false e unico
    private String cpf;

    private LocalDate birthDate;

    @OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE})
    private List<Phone> phones;
}
