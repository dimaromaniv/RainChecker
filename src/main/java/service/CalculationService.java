package service;

import calculation.Calculation;
import org.springframework.stereotype.Service;
import repository.CalculationRepository;

@Service
public class CalculationService {
    private CalculationRepository calculationRepository;

    public CalculationService(CalculationRepository calculationRepository) {
        this.calculationRepository = calculationRepository;
    }

    public Iterable<Calculation> index() {
        return calculationRepository.findAll();
    }

    public Calculation show(Long id) {
        return calculationRepository.findById(id).get();
    }


}
