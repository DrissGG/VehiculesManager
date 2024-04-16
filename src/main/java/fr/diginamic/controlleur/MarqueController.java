package fr.diginamic.controlleur;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import fr.diginamic.model.Marque;
import fr.diginamic.service.MarqueService;

@RestController
@RequestMapping("/marques")
public class MarqueController {
	@Autowired
    private MarqueService marqueService;

    @GetMapping
    public List<Marque> getAllMarques() {
        return marqueService.getAllMarques();
    }
}
