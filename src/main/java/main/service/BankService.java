package main.service;

import main.model.Bank;
import main.repository.BanksRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class BankService {

    @Autowired
    BanksRepository banksRepository;

    public long save(Bank bank ) {
       return banksRepository.save(bank).getRegistrationAccountNumber();
    }


}
