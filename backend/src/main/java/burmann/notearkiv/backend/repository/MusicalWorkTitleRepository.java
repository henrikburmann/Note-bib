package burmann.notearkiv.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import burmann.notearkiv.backend.model.DAO.MusicalWorkTitleDAO;

@Repository
public interface MusicalWorkTitleRepository extends JpaRepository<MusicalWorkTitleDAO, Integer>{
    public List<MusicalWorkTitleDAO> findAllFromMusicalWorkDAOByMainTitleIsTrue();
}
