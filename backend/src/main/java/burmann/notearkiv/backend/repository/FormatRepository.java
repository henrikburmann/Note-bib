package burmann.notearkiv.backend.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import burmann.notearkiv.backend.model.DAO.FormatDAO;

@Repository
public interface FormatRepository extends JpaRepository<FormatDAO, Integer>{
    FormatDAO findFormatDAOByFormatId(int formatId);
    @Query(value = "SELECT * FROM formats ORDER BY name", nativeQuery = true)
    List<FormatDAO> findAllFromFormatDAO();
}
