 package burmann.notearkiv.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import burmann.notearkiv.backend.model.DAO.FormatDAO;
import burmann.notearkiv.backend.model.DTO.FormatDTO;
import burmann.notearkiv.backend.repository.FormatRepository;
@Service
public class FormatService {
    private final FormatRepository formatRepository;


    public FormatService(FormatRepository formatRepository) {
        this.formatRepository = formatRepository;
    }

    public void postFormat(FormatDTO formatDTO){
        FormatDAO formatDAO = new FormatDAO(formatDTO.getName(), formatDTO.getDescription());
        formatRepository.save(formatDAO);
    }

    public List<FormatDAO> getAllFormats(){
        return formatRepository.findAllFromFormatDAO();
    }

    public FormatDAO getFormatDAOById(int id){
        return formatRepository.getReferenceById(id);
    }

}
