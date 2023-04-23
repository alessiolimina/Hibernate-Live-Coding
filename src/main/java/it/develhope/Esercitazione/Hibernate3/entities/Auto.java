package it.develhope.Esercitazione.Hibernate3.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Check;

@Entity
@Table
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Auto {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(nullable = false, unique = true)
    private String targa;
    @Column(nullable = false)
    private String marchio;
    @Column(nullable = false)
    private String modello;
    @Check(constraints = "cilindrata > 0 AND cilindrata <= 5000")
    private int cilindrata;


}
