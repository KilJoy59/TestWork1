package main.repository;

import main.model.Bill;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BillsRepository extends CrudRepository<Bill, Long> {
}
