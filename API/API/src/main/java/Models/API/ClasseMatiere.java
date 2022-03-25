package Models.API;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Data
@Entity
@NoArgsConstructor
public class ClasseMatiere {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;;

    @JsonIgnore
    @ManyToOne
    private Classe classe_id;
    @ManyToOne
    private Matiere matiere_id;

    public ClasseMatiere(long id ){
        this.id = id;

    }
}

