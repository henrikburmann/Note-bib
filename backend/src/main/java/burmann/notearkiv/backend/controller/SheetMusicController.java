package burmann.notearkiv.backend.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import burmann.notearkiv.backend.model.DAO.PictureDAO;
import burmann.notearkiv.backend.model.DAO.SheetMusicDAO;
import burmann.notearkiv.backend.model.DTO.FormatDTO;
import burmann.notearkiv.backend.model.DTO.SheetMusicDTO;
import burmann.notearkiv.backend.service.FormatService;
import burmann.notearkiv.backend.service.SheetMusicService;

@RestController
@CrossOrigin
public class SheetMusicController {
    private final FormatService formatService;
    private final SheetMusicService sheetMusicService;


    public SheetMusicController(FormatService formatService, SheetMusicService sheetMusicService) {
        this.formatService = formatService;
        this.sheetMusicService = sheetMusicService;
    }

    //User må settes eftehvert
    @PostMapping("/sheet")
    public void postNewSheetMusic(@RequestBody SheetMusicDTO sheetMusicDTO){
        sheetMusicService.postNewSheetMusic(sheetMusicDTO);  
    }
}
