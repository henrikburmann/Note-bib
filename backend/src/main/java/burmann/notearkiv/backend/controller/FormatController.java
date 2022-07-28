package burmann.notearkiv.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import burmann.notearkiv.backend.model.DAO.FormatDAO;
import burmann.notearkiv.backend.model.DTO.FormatDTO;
import burmann.notearkiv.backend.service.FormatService;

@RestController
@CrossOrigin
public class FormatController {
    
    private final FormatService formatService;
    public FormatController(FormatService formatService){
        this.formatService = formatService;
    }

    @GetMapping("/format")
    public List<FormatDAO> getAllFormats(){
        return formatService.getAllFormats();
    }

    @PostMapping("/format")
    public void postNewFormat(@RequestBody FormatDTO formatDTO){
        formatService.postFormat(formatDTO);
    }

}
