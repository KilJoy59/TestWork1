package main.service;

import main.model.Bill;
import main.repository.BillsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BillService {

    @Autowired
    private BillsRepository billsRepository;

    public Long save(Bill bill) {
        return billsRepository.save(bill).getSecondAccountNumber();
    }
}
