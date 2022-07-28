package burmann.notearkiv.backend.model.DTO;

public class MusicalWorkDTO {
    private String title;
    private int composerId;
    

    public MusicalWorkDTO(String title, int composerId) {
        this.title = title;
        this.composerId = composerId;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
    

    public int getComposerId() {
        return this.composerId;
    }

    public void setComposerId(int composerId) {
        this.composerId = composerId;
    }
    
}
