package burmann.notearkiv.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import burmann.notearkiv.backend.model.DAO.ComposerDAO;
import burmann.notearkiv.backend.model.DTO.ComposerDTO;
import burmann.notearkiv.backend.service.ComposerService;

@RestController
@CrossOrigin
public class ComposerController {
    private final ComposerService composerService;

    public ComposerController(ComposerService composerService){
        this.composerService = composerService;
    }

    @PostMapping("/composer")
    public void postNewComposer(@RequestParam String name){
        composerService.postNewComposer(composerService.convertComposerDAOToDTO(name));
    }

    @GetMapping("/composer")
    public List<ComposerDAO> getAllComposers(){
        return composerService.findAllComposers();
    }

    @GetMapping("/composer/{name}")
    public List<ComposerDAO> getComposersStartingWithName(@PathVariable String name){
        List<ComposerDAO> composers = composerService.searchForComposers(name);
        return composers;
    }
}
