package burmann.notearkiv.backend.model.DTO;

public class FormatDTO {
    private String name;
    private String description;

    public FormatDTO() {
    }

    public FormatDTO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

}
