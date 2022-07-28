package burmann.notearkiv.backend.model.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "musical_works")
public class MusicalWorkDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "musical_works_id")
    private int musicalWorksId;
    
    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "composer_id")
    private ComposerDAO composer;

    public int getMusicalWorksId() {
        return this.musicalWorksId;
    }

    public void setMusicalWorksId(int musicalWorksId) {
        this.musicalWorksId = musicalWorksId;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ComposerDAO getComposer() {
        return this.composer;
    }

    public void setComposer(ComposerDAO composer) {
        this.composer = composer;
    }

}
