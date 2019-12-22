package main.repository;

import main.model.Bank;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanksRepository extends CrudRepository<Bank, Long> {
    
}
