package it.develhope.Esercitazione.Hibernate3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Concessionaria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(nullable = false)
    private String indirizzo;
    @OneToMany(fetch = FetchType.LAZY) //con FetchType.LAZY la lista di autoInVendita viene creata solo se effettivamente richiesto, solo se bisogna effettivamente accedervi
    private List<Auto> autoInVendita;
}
