package burmann.notearkiv.backend.service;

import java.util.List;

import org.springframework.stereotype.Service;

import burmann.notearkiv.backend.model.DAO.ComposerDAO;
import burmann.notearkiv.backend.model.DTO.ComposerDTO;
import burmann.notearkiv.backend.repository.ComposerRepository;

@Service
public class ComposerService {
    private final ComposerRepository composerRepository;

    public ComposerService(ComposerRepository composerRepository){
        this.composerRepository = composerRepository;
    }

    public void postNewComposer(ComposerDAO composerDAO){
        composerRepository.save(composerDAO);
    }

    public ComposerDAO getComposerDAOById(int id){
        return composerRepository.getReferenceById(id);
    }

    public ComposerDAO convertComposerDAOToDTO(String name){
        ComposerDAO composerDAO = new ComposerDAO();
        composerDAO.setName(name);
        return composerDAO;
    }

    public List<ComposerDAO> findAllComposers(){
        return composerRepository.findAll();
    }

    public List<ComposerDAO> searchForComposers(String name){
        return composerRepository.findComposersStartingWithString(name);
    }
}
