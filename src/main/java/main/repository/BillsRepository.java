package main.repository;

import main.model.Bill;
import org.springframework.data.repository.CrudRepository;

public interface BillsRepository extends CrudRepository<Bill, Long> {
}
