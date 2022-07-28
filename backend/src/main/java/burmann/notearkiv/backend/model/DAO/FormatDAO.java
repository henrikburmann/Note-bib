package burmann.notearkiv.backend.model.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formats")
public class FormatDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "format_id")
    private int formatId;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;


    public FormatDAO() {
    }

    public FormatDAO(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public int getFormatId() {
        return this.formatId;
    }

    public void setFormatId(int formatId) {
        this.formatId = formatId;
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
