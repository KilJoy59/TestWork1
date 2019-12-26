package main.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompositeKeyForReport implements Serializable {

    @ManyToOne
    @JoinColumn(name = "secondAccountNumber")
    private Bill bill;

    @ManyToOne
    @JoinColumn(name = "registrationAccountNumber")
    private Bank bank;

    public CompositeKeyForReport() {
    }

    public CompositeKeyForReport(Bill bill, Bank bank) {
        this.bill = bill;
        this.bank = bank;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKeyForReport that = (CompositeKeyForReport) o;
        return Objects.equals(bill, that.bill) &&
                Objects.equals(bank, that.bank);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bill, bank);
    }
}
