package main.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class SecondOrderAccountNumbers {

    @Id
    private long secondAccountNumber;

    private String accountName;

    public SecondOrderAccountNumbers(){}

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
