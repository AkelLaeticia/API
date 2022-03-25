package Models.API;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Matiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String libelle;
    private int coeff;

    @JsonIgnore
    @OneToMany(mappedBy = "matiere_id" , cascade = CascadeType.REMOVE)
    private Set<Note> note;

    @JsonIgnore
    @OneToMany(mappedBy = "matiere_id" , cascade = CascadeType.REMOVE)
    private Set<ClasseMatiere> classematiere;

    public Matiere( long id , String libelle, int coeff){
        this.id= id;
        this.coeff= coeff;
        this.libelle = libelle;
    }

}
