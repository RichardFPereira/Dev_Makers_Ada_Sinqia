package br.com.ada.core.data.entities;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "DONO")
@Getter
@Setter
public class Dono {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;
    @OneToMany(mappedBy = "dono", cascade = CascadeType.ALL)
    private List<Gato> gatos;
}
