package burmann.notearkiv.backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import burmann.notearkiv.backend.model.DAO.PictureDAO;

@Repository
public interface PictureRepository extends JpaRepository<PictureDAO, Integer> {

}
