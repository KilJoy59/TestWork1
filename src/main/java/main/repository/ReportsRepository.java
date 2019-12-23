package main.repository;

import main.model.Report;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReportsRepository extends CrudRepository<Report,Long> {
    
}
