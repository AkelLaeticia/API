package Service.API;


import Models.API.ClasseMatiere;
import Repository.API.ClasseMatiereRepository;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Data
@Service
public class ClasseMatiereService {

    @Autowired
    private ClasseMatiereRepository classeMatiereRepository;

}
