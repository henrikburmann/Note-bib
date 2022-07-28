package burmann.notearkiv.backend.model.DTO;

import java.sql.Date;
import java.util.List;


public class SheetMusicDTO {
    private String description;
    private int formatId;
    private String arrTitle;
    private String musicalForm;
    private String voicesDescription;
    private boolean originalArr;
    private Date arrangedDate;
    private Date pubDate;
    private String mainKey;
    private String publisher;
    private int musicalWorkId;
    private List<String> pictures;


    public SheetMusicDTO(String description, int formatId, String arrTitle, String musicalForm, String voicesDescription, boolean originalArr, Date arrangedDate, Date pubDate, String mainKey, String publisher, int musicalWorkId, List<String> pictures) {
        this.description = description;
        this.formatId = formatId;
        this.arrTitle = arrTitle;
        this.musicalForm = musicalForm;
        this.voicesDescription = voicesDescription;
        this.originalArr = originalArr;
        this.arrangedDate = arrangedDate;
        this.pubDate = pubDate;
        this.mainKey = mainKey;
        this.publisher = publisher;
        this.musicalWorkId = musicalWorkId;
        this.pictures = pictures;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getFormatId() {
        return this.formatId;
    }

    public void setFormatId(int formatId) {
        this.formatId = formatId;
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

    public int getMusicalWorkId() {
        return this.musicalWorkId;
    }

    public void setMusicalWorkId(int musicalWorkId) {
        this.musicalWorkId = musicalWorkId;
    }

    public List<String> getPictures() {
        return this.pictures;
    }

    public void setPictures(List<String> pictures) {
        this.pictures = pictures;
    }
   

}
