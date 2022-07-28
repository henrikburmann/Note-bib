package burmann.notearkiv.backend.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import burmann.notearkiv.backend.model.DAO.MusicalWorkDAO;
import burmann.notearkiv.backend.model.DTO.MusicalWorkDTO;
import burmann.notearkiv.backend.service.MusicalWorkService;

@RestController
@CrossOrigin
public class MusicalWorkController {
    private final MusicalWorkService musicalWorkService;


    public MusicalWorkController(MusicalWorkService musicalWorkService) {
        this.musicalWorkService = musicalWorkService;
    }

    @GetMapping("/musicalWork")
    public void getAllMusicalWorks(){
        musicalWorkService.getAllMainTitles();
    }

    @PostMapping("/musicalWork")
    public int postNewMusicalWork(@RequestBody MusicalWorkDTO musicalWorkDTO){
        return musicalWorkService.postNewMusicalWork(musicalWorkDTO);   
    }

    @GetMapping("/musicalWork/{title}")
    public List<MusicalWorkDAO> getMusicalWorksStartingWithTitle(@PathVariable String title){
        return musicalWorkService.getMusicalWorksWithTitle(title);
    }

    


    
}
