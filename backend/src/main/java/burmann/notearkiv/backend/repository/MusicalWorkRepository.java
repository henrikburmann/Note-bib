package burmann.notearkiv.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import burmann.notearkiv.backend.model.DAO.MusicalWorkDAO;

@Repository
public interface MusicalWorkRepository extends JpaRepository<MusicalWorkDAO, Integer> {
    @Query(value = "Select * FROM musical_works m WHERE m.title LIKE :title% ORDER BY m.title ASC", nativeQuery = true)
    List<MusicalWorkDAO> findMusicalWorksStartingWithString(@Param("title") String title);
}
