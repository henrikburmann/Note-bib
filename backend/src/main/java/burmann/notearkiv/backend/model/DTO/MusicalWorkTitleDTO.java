package burmann.notearkiv.backend.model.DTO;

public class MusicalWorkTitleDTO {
    private String title;
    private boolean mainTitle;


    public MusicalWorkTitleDTO(String title, boolean mainTitle) {
        this.title = title;
        this.mainTitle = mainTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isMainTitle() {
        return this.mainTitle;
    }

    public boolean getMainTitle() {
        return this.mainTitle;
    }

    public void setMainTitle(boolean mainTitle) {
        this.mainTitle = mainTitle;
    }

}
