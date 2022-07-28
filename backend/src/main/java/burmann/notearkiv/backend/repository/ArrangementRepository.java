package burmann.notearkiv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import burmann.notearkiv.backend.model.DAO.ArrangementDAO;

@Repository
public interface ArrangementRepository extends JpaRepository<ArrangementDAO, Integer>{
    
}
