package main.repository;

import main.model.Report;
import org.springframework.data.repository.CrudRepository;

public interface ReportsRepository extends CrudRepository<Report,Long> {
    
}
