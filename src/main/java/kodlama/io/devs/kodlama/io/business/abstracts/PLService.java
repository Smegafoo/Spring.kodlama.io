package kodlama.io.devs.kodlama.io.business.abstracts;

import kodlama.io.devs.kodlama.io.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Service;

import java.util.List;

public interface PLService {
    public List<ProgrammingLanguage> getAll();
    public List<ProgrammingLanguage> listById(int i) throws Exception;
    public void add(ProgrammingLanguage programmingLanguage);
    public void delete(ProgrammingLanguage programmingLanguage);
    public void update(ProgrammingLanguage programmingLanguage);
}
