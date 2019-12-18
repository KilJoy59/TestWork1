package main.model;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class CompositeKeyForReports implements Serializable {

    @ManyToOne
    @JoinColumn(name = "secondAccountNumber")
    private Bills bills;

    @ManyToOne
    @JoinColumn(name = "registrationAccountNumber")
    private Banks banks;

    public CompositeKeyForReports() {
    }

    public CompositeKeyForReports(Bills bills, Banks banks) {
        this.bills = bills;
        this.banks = banks;
    }

    public Bills getBills() {
        return bills;
    }

    public void setBills(Bills bills) {
        this.bills = bills;
    }

    public Banks getBanks() {
        return banks;
    }

    public void setBanks(Banks banks) {
        this.banks = banks;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKeyForReports that = (CompositeKeyForReports) o;
        return bills.equals(that.bills) &&
                banks.equals(that.banks);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bills, banks);
    }
}
