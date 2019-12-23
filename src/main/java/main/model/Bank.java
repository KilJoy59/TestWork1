package main.model;

import org.springframework.context.annotation.Primary;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Bank {

    @Id
    private long registrationAccountNumber;

    private String organizationName;

    public long getRegistrationAccountNumber() {
        return registrationAccountNumber;
    }

    public void setRegistrationAccountNumber(long registrationAccountNumber) {
        this.registrationAccountNumber = registrationAccountNumber;
    }

    public String getOrganizationName() {
        return organizationName;
    }

    public void setOrganizationName(String organizationName) {
        this.organizationName = organizationName;
    }
}
