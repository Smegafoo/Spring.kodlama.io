package kodlama.io.devs.kodlama.io.webApi;

import kodlama.io.devs.kodlama.io.business.abstracts.PLService;
import kodlama.io.devs.kodlama.io.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/PL")
public class ProgrammingLanguageController {
    private PLService plService;
    @Autowired
    public ProgrammingLanguageController(PLService plService) {
        this.plService = plService;
    }

    @GetMapping("getAll")
    public List<ProgrammingLanguage> getAll(){
        return plService.getAll();
    }
    @GetMapping("listById")
    public List<ProgrammingLanguage> listById(int i)throws Exception{
        return plService.listById(i);
    }

    @GetMapping("update")
    public void update(ProgrammingLanguage programmingLanguage){
        plService.update(programmingLanguage);
    }
    @GetMapping("delete")
    public void delete(ProgrammingLanguage programmingLanguage){
        plService.delete(programmingLanguage);
    }
    @GetMapping("add")
    public void add(ProgrammingLanguage programmingLanguage){
        plService.add(programmingLanguage);
    }

}
