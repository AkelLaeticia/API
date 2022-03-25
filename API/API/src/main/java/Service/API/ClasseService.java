package Service.API;



import Models.API.Classe;
import Repository.API.ClasseRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@Data
@Service
public class ClasseService {
    @Autowired
    private ClasseRepository classeRepository;
    // read all classe
    public Iterable<Classe> getClasse(){
        return classeRepository.findAll();
    }
    //read classe by id
    public Optional < Classe>  getClasseById(final long id){
        return classeRepository.findById(id);
    }
    //delete classe by id
    public void deleteClasse( final Long id ){
        classeRepository.deleteById(id);
    }
    // create classe
    public Classe saveClasse(Classe classe){
        Classe saveClasse = classeRepository.save(classe);
       return saveClasse;
    }
    //upload classe

}
