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
@Table(name = "musical_works_titles")
public class MusicalWorkTitleDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "musical_works_titles_id")
    private int musicalWorksTitlesId;
    @Column(name = "main_title")
    private boolean mainTitle;
    @Column(name = "title")
    private String title;
    
    @ManyToOne
    @JoinColumn(name = "musical_works_id")
    private MusicalWorkDAO musicalWork;


    public int getMusicalWorksTitlesId() {
        return this.musicalWorksTitlesId;
    }

    public void setMusicalWorksTitlesId(int musicalWorksTitlesId) {
        this.musicalWorksTitlesId = musicalWorksTitlesId;
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

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }


    public MusicalWorkDAO getMusicalWork() {
        return this.musicalWork;
    }

    public void setMusicalWork(MusicalWorkDAO musicalWork) {
        this.musicalWork = musicalWork;
    }

}
