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
    private SecondOrderAccountNumbers secondOrderAccountNumbers;

    @ManyToOne
    @JoinColumn(name = "registrationAccountNumber")
    private RegistrationNumbers registrationNumbers;

    public CompositeKeyForReports() {
    }

    public CompositeKeyForReports(SecondOrderAccountNumbers secondOrderAccountNumbers, RegistrationNumbers registrationNumbers) {
        this.secondOrderAccountNumbers = secondOrderAccountNumbers;
        this.registrationNumbers = registrationNumbers;
    }

    public SecondOrderAccountNumbers getSecondOrderAccountNumbers() {
        return secondOrderAccountNumbers;
    }

    public void setSecondOrderAccountNumbers(SecondOrderAccountNumbers secondOrderAccountNumbers) {
        this.secondOrderAccountNumbers = secondOrderAccountNumbers;
    }

    public RegistrationNumbers getRegistrationNumbers() {
        return registrationNumbers;
    }

    public void setRegistrationNumbers(RegistrationNumbers registrationNumbers) {
        this.registrationNumbers = registrationNumbers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompositeKeyForReports that = (CompositeKeyForReports) o;
        return secondOrderAccountNumbers.equals(that.secondOrderAccountNumbers) &&
                registrationNumbers.equals(that.registrationNumbers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(secondOrderAccountNumbers, registrationNumbers);
    }
}
