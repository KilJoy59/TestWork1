package main.model;

import javax.persistence.*;

@Entity
@Table(name = "bill")
public class Bill {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "second_account_number")
    private long secondAccountNumber;

    @Column(name = "account_name")
    private String accountName;

    public Bill() {
    }

    public Long getSecondAccountNumber() {
        return secondAccountNumber;
    }

    public void setSecondAccountNumber(Long secondAccountNumber) {
        this.secondAccountNumber = secondAccountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }
}
