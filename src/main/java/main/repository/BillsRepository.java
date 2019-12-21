package main.repository;

import main.model.Bills;
import org.springframework.data.repository.CrudRepository;

public interface BillsRepository extends CrudRepository<Bills, Long> {
}
