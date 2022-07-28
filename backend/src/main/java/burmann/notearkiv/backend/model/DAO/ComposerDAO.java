package burmann.notearkiv.backend.model.DAO;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "composers")
public class ComposerDAO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "composer_id")
    private int composerId;
    @Column(name = "name")
    private String name;


    public int getComposerId() {
        return this.composerId;
    }

    public void setComposerId(int composerId) {
        this.composerId = composerId;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
