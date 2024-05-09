package kodlama.io.devs.kodlama.io.entities.concretes;

public class ProgrammingLanguage {
    private int ıd;
    private String name;

    public ProgrammingLanguage() {
    }

    public ProgrammingLanguage(int ıd, String name) {
        this.ıd = ıd;
        this.name = name;
    }

    public int getId() {
        return ıd;
    }

    public void setId(int ıd) {
        this.ıd = ıd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
