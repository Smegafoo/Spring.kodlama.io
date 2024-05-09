package kodlama.io.devs.kodlama.io.dataAcces.concretes;

import kodlama.io.devs.kodlama.io.dataAcces.abstracts.PLRepository;
import kodlama.io.devs.kodlama.io.entities.concretes.ProgrammingLanguage;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class InMemoryPLRepository  implements PLRepository  {

    List<ProgrammingLanguage> programmingLanguageList;

    public InMemoryPLRepository() {
        programmingLanguageList=new ArrayList<>();
        programmingLanguageList.add(new ProgrammingLanguage(1,"Java"));
        programmingLanguageList.add(new ProgrammingLanguage(2,"C"));
        programmingLanguageList.add(new ProgrammingLanguage(3,"C++"));
        programmingLanguageList.add(new ProgrammingLanguage(4,"C#"));
        programmingLanguageList.add(new ProgrammingLanguage(5,"Python"));
    }
    @Override
    public List<ProgrammingLanguage> getAll(){
        return programmingLanguageList;
    }

    @Override
        public List<ProgrammingLanguage> listById(int i) throws Exception{
        for(ProgrammingLanguage pl1:this.programmingLanguageList){
            if(pl1.getId()==i){
                return (List<ProgrammingLanguage>) pl1;
             }
         }
        throw new Exception("There are no Language that have this ID");
        }

        @Override
        public void update(ProgrammingLanguage programmingLanguage)  {
        for(ProgrammingLanguage pl2:programmingLanguageList){
            if(pl2.getId()==programmingLanguage.getId()){
                pl2.setName(programmingLanguage.getName());
            }
        }
        }

        @Override
        public void add(ProgrammingLanguage programmingLanguage){
        programmingLanguageList.add(programmingLanguage);
        }

        @Override
    public void delete(ProgrammingLanguage programmingLanguage){
        for(ProgrammingLanguage pl3:programmingLanguageList){
            if(pl3.getId()==programmingLanguage.getId()){
                programmingLanguageList.remove(programmingLanguage);
            }
        }
        }

    }



