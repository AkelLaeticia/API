package Models.API;
import lombok.*;
import javax.persistence.*;
import java.util.*;


@Entity
@Data
@Setter
@Getter
@Table(name = "classe")
@NoArgsConstructor
public class Classe {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;


    private String libelle;
    private int effectif;
    public Classe(Long id, String libelle, int effectif) {
        this.id = id;
        this.effectif = effectif;
        this.libelle = libelle;
    }

    @OneToMany(mappedBy = "classe_id" , cascade = CascadeType.REMOVE)
    private Set<ClasseMatiere > classematiere;

    @Override
    public String toString() {
        return "Classe{" +
                ", libelle='" + libelle + '\'' +
                ", effectif=" + effectif +
                '}';
    }


}
