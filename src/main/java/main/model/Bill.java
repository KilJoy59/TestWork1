package main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bill {

    @Id
    private String secondAccountNumber;

    private String accountName;

    public String getSecondAccountNumber() {
        return secondAccountNumber;
    }

    public void setSecondAccountNumber(String secondAccountNumber) {
        this.secondAccountNumber = secondAccountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
