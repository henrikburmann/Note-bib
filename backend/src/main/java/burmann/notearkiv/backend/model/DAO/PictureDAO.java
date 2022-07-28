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
@Table(name = "picutres")
public class PictureDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "picture_id")
    private int pictureId;
    @Column(name = "url")
    private String url;
    @ManyToOne
    @JoinColumn(name = "sheetMusicId")
    private SheetMusicDAO sheetMusic;


    public int getPictureId() {
        return this.pictureId;
    }

    public void setPictureId(int pictureId) {
        this.pictureId = pictureId;
    }

    public String getUrl() {
        return this.url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public SheetMusicDAO getSheetMusic() {
        return this.sheetMusic;
    }

    public void setSheetMusic(SheetMusicDAO sheetMusic) {
        this.sheetMusic = sheetMusic;
    }

}
