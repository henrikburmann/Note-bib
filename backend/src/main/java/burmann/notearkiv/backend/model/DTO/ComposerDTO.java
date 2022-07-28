package burmann.notearkiv.backend.model.DTO;

public class ComposerDTO {
    private String name;

    public ComposerDTO(String name){
        this.name = name;
    }
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
