package one.digitalinovation.personapi.entities;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import one.digitalinovation.personapi.enums.PhoneType;

import javax.persistence.*;


@Entity
@Data // inserir getter e setters
@Builder // builder projeto
@AllArgsConstructor // inserir construtores
@NoArgsConstructor // inserir construtores
public class Phone {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false) // dado obrigatório
    private PhoneType type;

    @Column(nullable = false) // dado obrigatório
    private String number;

}
