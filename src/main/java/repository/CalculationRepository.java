package repository;

import org.springframework.data.repository.CrudRepository;
import calculation.Calculation;

public interface CalculationRepository extends CrudRepository<Calculation,Long> {
}
