package Models.API;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;


import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
public class Note {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id ;
    private double note;


    @JsonIgnore
    @ManyToOne
    private Matiere matiere_id;

    @JsonIgnore
    @ManyToOne
    private Etudiant etudiant_id;

    public Note(long id , double note){
        this.id = id;
        this.note = note;


    }
}
