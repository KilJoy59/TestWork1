package main.repository;

import main.model.Reports;
import org.springframework.data.repository.CrudRepository;

public interface ReportsRepository extends CrudRepository<Reports,Long> {
    
}
