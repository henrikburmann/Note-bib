package burmann.notearkiv.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import burmann.notearkiv.backend.model.DAO.ComposerDAO;

@Repository
public interface ComposerRepository extends JpaRepository<ComposerDAO, Integer>{
    @Query(value = "Select * FROM composers c WHERE c.name LIKE :name% ORDER BY c.name ASC", nativeQuery = true)
    List<ComposerDAO> findComposersStartingWithString(@Param("name") String name);
}
