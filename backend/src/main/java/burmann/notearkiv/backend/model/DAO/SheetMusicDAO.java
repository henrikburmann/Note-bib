package burmann.notearkiv.backend.model.DAO;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "sheet_musics")
public class SheetMusicDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "sheet_music_id")
    private int sheetMusicId;
    @Column(name = "description")
    private String description;
    @ManyToOne
    @JoinColumn(name = "userId")
    private UserDAO user;
    @Column(name = "arr_title")
    private String arrTitle;
    @Column(name = "musical_form")
    private String musicalForm;
    @Column(name = "voices_description")
    private String voicesDescription;
    @Column(name = "original_arr")
    private boolean originalArr;
    @Column(name = "arranged_date")
    private Date arrangedDate;
    @Column(name = "pub_date")
    private Date pubDate;
    @Column(name = "main_key")
    private String mainKey;
    @Column(name = "publisher")
    private String publisher;
    @Column(name = "picture")
    private String picture;
    @ManyToOne
    @JoinColumn(name = "formatId")
    private FormatDAO format;
    @ManyToOne
    @JoinColumn(name = "musicalWorksId")
    private MusicalWorkDAO musicalWork;
    // @ManyToOne
    // @JoinColumn(name = "arrangementId")
    // private ArrangementDAO arrangement;

    public SheetMusicDAO() {
    }

    public int getSheetMusicId() {
        return this.sheetMusicId;
    }

    public void setSheetMusicId(int sheetMusicId) {
        this.sheetMusicId = sheetMusicId;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UserDAO getUser() {
        return this.user;
    }

    public void setUser(UserDAO user) {
        this.user = user;
    }

    public FormatDAO getFormat() {
        return this.format;
    }

    public void setFormat(FormatDAO format) {
        this.format = format;
    }

    public String getArrTitle() {
        return this.arrTitle;
    }

    public void setArrTitle(String arrTitle) {
        this.arrTitle = arrTitle;
    }

    public String getMusicalForm() {
        return this.musicalForm;
    }

    public void setMusicalForm(String musicalForm) {
        this.musicalForm = musicalForm;
    }

    public String getVoicesDescription() {
        return this.voicesDescription;
    }

    public void setVoicesDescription(String voicesDescription) {
        this.voicesDescription = voicesDescription;
    }

    public boolean isOriginalArr() {
        return this.originalArr;
    }

    public boolean getOriginalArr() {
        return this.originalArr;
    }

    public void setOriginalArr(boolean originalArr) {
        this.originalArr = originalArr;
    }

    public Date getArrangedDate() {
        return this.arrangedDate;
    }

    public void setArrangedDate(Date arrangedDate) {
        this.arrangedDate = arrangedDate;
    }

    public Date getPubDate() {
        return this.pubDate;
    }

    public void setPubDate(Date pubDate) {
        this.pubDate = pubDate;
    }

    public String getMainKey() {
        return this.mainKey;
    }

    public void setMainKey(String mainKey) {
        this.mainKey = mainKey;
    }

    public String getPublisher() {
        return this.publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public MusicalWorkDAO getMusicalWork() {
        return this.musicalWork;
    }

    public void setMusicalWork(MusicalWorkDAO musicalWork) {
        this.musicalWork = musicalWork;
    }

    public String getPicture() {
        return this.picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }


}
