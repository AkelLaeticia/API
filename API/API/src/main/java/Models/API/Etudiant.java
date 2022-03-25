package Models.API;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.sql.Date;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
public class Etudiant {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String nom;
    private String prenom;
    private Date date_de_naissance;
    private String Matricle;

    @JsonIgnore
    @OneToMany(mappedBy = "etudiant_id" ,cascade= CascadeType.REMOVE)
    private Set<Note> note;
    @JsonIgnore
    @ManyToOne
    private Classe classe_id;

    public Etudiant( long id , String nom , String prenom , Date date_de_naissance){
        this.id= id;
        this.nom = nom;
        this.prenom = prenom;
        this.date_de_naissance= date_de_naissance;
    }
}
