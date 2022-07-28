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
@Table(name = "arrangements")
public class ArrangementDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "arrangement_id")
    private int arrangementId;
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
    @ManyToOne
    @JoinColumn(name = "musicalWorksId")
    private MusicalWorkDAO musicalWork;


    public int getArrangementId() {
        return this.arrangementId;
    }

    public void setArrangementId(int arrangementId) {
        this.arrangementId = arrangementId;
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


}
