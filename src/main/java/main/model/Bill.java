package main.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

    @Id
    @Column(name ="Номер счета второго порядка по Плану счетов")
    private long secondAccountNumber;

    @Column(name = "NAME")
    private String accountName;

    public Bill(){}

    public long getSecondAccountNumber() {
        return secondAccountNumber;
    }

    public void setSecondAccountNumber(int secondAccountNumber) {
        this.secondAccountNumber = secondAccountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
