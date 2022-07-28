package burmann.notearkiv.backend.service;

import org.springframework.stereotype.Service;

import burmann.notearkiv.backend.model.DAO.PictureDAO;
import burmann.notearkiv.backend.model.DAO.SheetMusicDAO;
import burmann.notearkiv.backend.model.DTO.SheetMusicDTO;
import burmann.notearkiv.backend.repository.MusicalWorkRepository;
import burmann.notearkiv.backend.repository.PictureRepository;
import burmann.notearkiv.backend.repository.SheetMusicRepository;

@Service
public class SheetMusicService {
    private final SheetMusicRepository sheetMusicRepository;
    private final MusicalWorkService musicalWorkService;
    private final FormatService formatService;
    private final PictureRepository pictureRepository;


    public SheetMusicService(SheetMusicRepository sheetMusicRepository, MusicalWorkService musicalWorkService, FormatService formatService, PictureRepository pictureRepository) {
        this.sheetMusicRepository = sheetMusicRepository;
        this.musicalWorkService = musicalWorkService;
        this.formatService = formatService;
        this.pictureRepository = pictureRepository;
    }

    public SheetMusicDAO convertSheetMusicDtoToDao(SheetMusicDTO sheetMusicDTO){
        SheetMusicDAO sheetMusicDAO = new SheetMusicDAO();
        sheetMusicDAO.setDescription(sheetMusicDTO.getDescription());
        sheetMusicDAO.setArrTitle(sheetMusicDTO.getArrTitle());
        sheetMusicDAO.setMusicalForm(sheetMusicDTO.getMusicalForm());
        sheetMusicDAO.setVoicesDescription(sheetMusicDTO.getVoicesDescription());
        sheetMusicDAO.setOriginalArr(sheetMusicDTO.getOriginalArr());
        sheetMusicDAO.setArrangedDate(sheetMusicDTO.getArrangedDate());
        sheetMusicDAO.setPubDate(sheetMusicDTO.getPubDate());
        sheetMusicDAO.setMainKey(sheetMusicDTO.getMainKey());
        sheetMusicDAO.setPublisher(sheetMusicDTO.getPublisher());
        sheetMusicDAO.setFormat(formatService.getFormatDAOById(sheetMusicDTO.getFormatId()));
        sheetMusicDAO.setMusicalWork(musicalWorkService.getMusicalWorkDAOById(sheetMusicDTO.getMusicalWorkId()));
        return sheetMusicDAO;
    }

    public void postNewSheetMusic(SheetMusicDTO sheetMusicDTO){
        SheetMusicDAO sheetMusicDAO = convertSheetMusicDtoToDao(sheetMusicDTO); if(sheetMusicDTO.getPictures().size() != 0){
            sheetMusicRepository.save(sheetMusicDAO);
            for(String p: sheetMusicDTO.getPictures()){
               PictureDAO pictureDAO = new PictureDAO();
               pictureDAO.setSheetMusic(sheetMusicDAO);
               pictureDAO.setUrl(p);
               pictureRepository.save(pictureDAO);
            }
        }
    }
}
