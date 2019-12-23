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
    private String secondAccountNumber;

    @ManyToOne
    @JoinColumn(name = "registrationAccountNumber")
    private long registrationAccountNumber;

    public CompositeKeyForReport() {
    }

    public CompositeKeyForReport(String secondAccountNumber, long registrationAccountNumber) {
        this.secondAccountNumber = secondAccountNumber;
        this.registrationAccountNumber = registrationAccountNumber;
    }

    public String getSecondAccountNumber() {
        return secondAccountNumber;
    }

    public void setSecondAccountNumber(String secondAccountNumber) {
        this.secondAccountNumber = secondAccountNumber;
    }

    public long getRegistrationAccountNumber() {
        return registrationAccountNumber;
    }

    public void setRegistrationAccountNumber(long registrationAccountNumber) {
        this.registrationAccountNumber = registrationAccountNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKeyForReport that = (CompositeKeyForReport) o;
        return registrationAccountNumber == that.registrationAccountNumber &&
                secondAccountNumber.equals(that.secondAccountNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondAccountNumber, registrationAccountNumber);
    }
}
