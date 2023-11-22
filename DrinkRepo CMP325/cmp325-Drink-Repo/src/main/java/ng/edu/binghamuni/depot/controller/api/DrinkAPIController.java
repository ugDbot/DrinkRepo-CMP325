package ng.edu.binghamuni.depot.controller.api;

import ng.edu.binghamuni.depot.repository.DrinkRepository;
import ng.edu.binghamuni.depot.services.DrinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import ng.edu.binghamuni.depot.Domain.Drink;

import java.util.List;

@Controller
public class DrinkAPIController {
    @Autowired
    DrinkRepository drinkRepository;

    @Autowired
    DrinkService drinkService;

    @RequestMapping("/drinks")
    @GetMapping("/drinks")
    public ResponseEntity<List<Drink>> getAlldrinks(){
        return ResponseEntity.ok().body(drinkService.getAllDrink());
    }
}
