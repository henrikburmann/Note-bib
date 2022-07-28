package burmann.notearkiv.backend.service;


import java.util.List;

import org.springframework.stereotype.Service;

import burmann.notearkiv.backend.model.DAO.MusicalWorkDAO;
import burmann.notearkiv.backend.model.DAO.MusicalWorkTitleDAO;
import burmann.notearkiv.backend.model.DTO.MusicalWorkDTO;
import burmann.notearkiv.backend.model.DTO.MusicalWorkTitleDTO;
import burmann.notearkiv.backend.repository.MusicalWorkRepository;
import burmann.notearkiv.backend.repository.MusicalWorkTitleRepository;

@Service
public class MusicalWorkService {
    private final MusicalWorkRepository musicalWorkRepository;
    private final ComposerService composerService;
    private final MusicalWorkTitleRepository titleRepository;


    public MusicalWorkService(MusicalWorkRepository musicalWorkRepository, ComposerService composersService, MusicalWorkTitleRepository titleRepository) {
        this.musicalWorkRepository = musicalWorkRepository;
        this.composerService = composersService;
        this.titleRepository = titleRepository;
    }

    public MusicalWorkDAO getMusicalWorkDAOById(int id){
        return musicalWorkRepository.getReferenceById(id);
    }

    public List<MusicalWorkTitleDAO> getAllMainTitles(){
        return titleRepository.findAllFromMusicalWorkDAOByMainTitleIsTrue();
    }

    public List<MusicalWorkDAO> getMusicalWorksWithTitle(String title){
        return musicalWorkRepository.findMusicalWorksStartingWithString(title);
    }

    public int postNewMusicalWork(MusicalWorkDTO musicalWorkDTO){
        MusicalWorkDAO musicalWorkDAO = new MusicalWorkDAO();
        musicalWorkDAO.setTitle(musicalWorkDTO.getTitle());
        musicalWorkDAO.setComposer(composerService.getComposerDAOById(musicalWorkDTO.getComposerId()));
        musicalWorkRepository.save(musicalWorkDAO);
        return musicalWorkDAO.getMusicalWorksId();
        // for(MusicalWorkTitleDTO title: musicalWorkDTO.getTitles()){
        //     MusicalWorkTitleDAO musicalWorkTitleDAO = new MusicalWorkTitleDAO();
        //     musicalWorkTitleDAO.setMainTitle(title.getMainTitle());
        //     musicalWorkTitleDAO.setTitle(title.getTitle());
        //     musicalWorkTitleDAO.setMusicalWork(musicalWorkDAO);
        //     titleRepository.save(musicalWorkTitleDAO);
        // }
    }
}
