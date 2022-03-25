package Controller.API;

import Models.API.Classe;
import Service.API.ClasseService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.*;


import java.util.Optional;
@Data
@RestController
public class ClasseController {

    @Autowired
    private ClasseService classeService;

    @GetMapping("/Produits")
    public String listeProduits() {
        return "Un exemple de produit";
    }

    @GetMapping("/classe")
    public Iterable<Classe> getClasse() {
        return classeService.getClasse();
    }
    /*@GetMapping("/classe/{id}" )
    public Optional<Classe>getClasseById( @PathVariable Long id){
     return classeService.getClasseById(id);*/
    @GetMapping("/classe/{id}")
    public  Classe getClasseId(@PathVariable Long id){
        Classe classe = new Classe(id , "CM2", 10);
        return classe;
    }
    @PostMapping(value = "/classe")
    public Classe saveClasse(@RequestBody Classe classe) {
        return classeService.saveClasse(classe);
    }








}
