package main.repository;

import main.model.Banks;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BanksRepository extends CrudRepository<Banks, Long> {
    
}
