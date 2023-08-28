package controllers;

import calculation.Calculation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import repository.CalculationRepository;
import service.CalculationService;

@RestController
@RequestMapping("/calculation")
public class CalculationController {

    @Autowired
    private CalculationService calculationService;

    public CalculationController (CalculationService calculationService){
        this.calculationService = calculationService;
    }

    @GetMapping
    public ResponseEntity<Iterable<Calculation>> index() {

        return new ResponseEntity<>(calculationService.index(), HttpStatus.OK);
    }

    public ResponseEntity <Calculation> show (@PathVariable Long id){
        return new ResponseEntity<>(calculationService.show(id),HttpStatus.OK);}
}
