package kodlama.io.devs.kodlama.io.business.concretes;

import kodlama.io.devs.kodlama.io.business.abstracts.PLService;
import kodlama.io.devs.kodlama.io.dataAcces.abstracts.PLRepository;
import kodlama.io.devs.kodlama.io.entities.concretes.ProgrammingLanguage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PLManager implements PLService {
    private PLRepository plRepository;
    @Autowired
    public PLManager(PLRepository plRepository) {
        this.plRepository = plRepository;
    }
    @Override
    public List<ProgrammingLanguage> getAll(){
        return plRepository.getAll();
    }

    @Override
    public List<ProgrammingLanguage> listById(int i) throws Exception {
        return plRepository.listById(i);
    }

    @Override
    public void add(ProgrammingLanguage programmingLanguage) {
        plRepository.add(programmingLanguage);

    }

    @Override
    public void delete(ProgrammingLanguage programmingLanguage) {
        plRepository.delete(programmingLanguage);

    }

    @Override
    public void update(ProgrammingLanguage programmingLanguage) {
        plRepository.update(programmingLanguage);

    }
}
