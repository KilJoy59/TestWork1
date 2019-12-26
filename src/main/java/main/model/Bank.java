package main.model;

import javax.persistence.*;

@Entity
@Table(name = "bank")
public class Bank {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @Column(name = "registration_account_number")
    private long registrationAccountNumber;

    @Column(name = "organization_name")
    private String organizationName;

    public Bank() {
    }

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
