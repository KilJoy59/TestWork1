package main.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Report {

    @EmbeddedId
    private CompositeKeyForReport compositeKeyForReport;

    @Column(name = "Входящие остатки «в рублях», тыс. руб")
    private long incomingBalancesRubles;

    @Column(name = "Входящие остатки «ин. вал., драг. металлы», тыс. руб")
    private long incomingBalancesForeignCurrency;

    @Column(name = "Входящие остатки «итого», тыс. руб.; счета Депо – в штуках")
    private long incomingBalancesTotal;

    @Column(name = "Обороты за отчетный период по дебету (активу) «в рублях», тыс. руб")
    private long debitTurnoverForReportingPeriodRubles;

    @Column(name = "Обороты за отчетный период по дебету (активу) «ин. вал., драг. металлы», тыс. руб")
    private long debitTurnoverForReportingPeriodForeignCurrency;

    @Column(name = "Обороты за отчетный период по дебету (активу) «итого», тыс. руб.; счета Депо – в штуках")
    private long debitTurnoverForReportingPeriodTotal;

    @Column(name = "Обороты за отчетный период по кредиту (пассиву) «в рублях», тыс. руб.")
    private long creditTurnoverForReportingPeriodRubles;

    @Column(name = "Обороты за отчетный период по кредиту (пассиву) «ин. вал., драг. металлы», тыс. руб.")
    private long creditTurnoverForReportingPeriodForeignCurrency;

    @Column(name = "Обороты за отчетный период по кредиту (пассиву) «итого», тыс. руб.;")
    private long creditTurnoverForReportingPeriodTotal;

    @Column(name = "Исходящие остатки «в рублях», тыс. руб.")
    private long outgoingBalancesRubles;

    @Column(name = "Исходящие остатки «ин. вал., драг. металлы», тыс. руб.")
    private long outgoingBalancesForeignCurrency;

    @Column(name = "Исходящие остатки «итого», тыс. руб.;")
    private long outgoingBalancesTotal;

    public Report() { }

    public long getIncomingBalancesRubles() {
        return incomingBalancesRubles;
    }

    public void setIncomingBalancesRubles(long incomingBalancesRubles) {
        this.incomingBalancesRubles = incomingBalancesRubles;
    }

    public long getIncomingBalancesForeignCurrency() {
        return incomingBalancesForeignCurrency;
    }

    public void setIncomingBalancesForeignCurrency(long incomingBalancesForeignCurrency) {
        this.incomingBalancesForeignCurrency = incomingBalancesForeignCurrency;
    }

    public long getIncomingBalancesTotal() {
        return incomingBalancesTotal;
    }

    public void setIncomingBalancesTotal(long incomingBalancesTotal) {
        this.incomingBalancesTotal = incomingBalancesTotal;
    }

    public long getDebitTurnoverForReportingPeriodRubles() {
        return debitTurnoverForReportingPeriodRubles;
    }

    public void setDebitTurnoverForReportingPeriodRubles(long debitTurnoverForReportingPeriodRubles) {
        this.debitTurnoverForReportingPeriodRubles = debitTurnoverForReportingPeriodRubles;
    }

    public long getDebitTurnoverForReportingPeriodForeignCurrency() {
        return debitTurnoverForReportingPeriodForeignCurrency;
    }

    public void setDebitTurnoverForReportingPeriodForeignCurrency(long debitTurnoverForReportingPeriodForeignCurrency) {
        this.debitTurnoverForReportingPeriodForeignCurrency = debitTurnoverForReportingPeriodForeignCurrency;
    }

    public long getDebitTurnoverForReportingPeriodTotal() {
        return debitTurnoverForReportingPeriodTotal;
    }

    public void setDebitTurnoverForReportingPeriodTotal(long debitTurnoverForReportingPeriodTotal) {
        this.debitTurnoverForReportingPeriodTotal = debitTurnoverForReportingPeriodTotal;
    }

    public long getCreditTurnoverForReportingPeriodRubles() {
        return creditTurnoverForReportingPeriodRubles;
    }

    public void setCreditTurnoverForReportingPeriodRubles(long creditTurnoverForReportingPeriodRubles) {
        this.creditTurnoverForReportingPeriodRubles = creditTurnoverForReportingPeriodRubles;
    }

    public long getCreditTurnoverForReportingPeriodForeignCurrency() {
        return creditTurnoverForReportingPeriodForeignCurrency;
    }

    public void setCreditTurnoverForReportingPeriodForeignCurrency(long creditTurnoverForReportingPeriodForeignCurrency) {
        this.creditTurnoverForReportingPeriodForeignCurrency = creditTurnoverForReportingPeriodForeignCurrency;
    }

    public long getCreditTurnoverForReportingPeriodTotal() {
        return creditTurnoverForReportingPeriodTotal;
    }

    public void setCreditTurnoverForReportingPeriodTotal(long creditTurnoverForReportingPeriodTotal) {
        this.creditTurnoverForReportingPeriodTotal = creditTurnoverForReportingPeriodTotal;
    }

    public long getOutgoingBalancesRubles() {
        return outgoingBalancesRubles;
    }

    public void setOutgoingBalancesRubles(long outgoingBalancesRubles) {
        this.outgoingBalancesRubles = outgoingBalancesRubles;
    }

    public long getOutgoingBalancesForeignCurrency() {
        return outgoingBalancesForeignCurrency;
    }

    public void setOutgoingBalancesForeignCurrency(long outgoingBalancesForeignCurrency) {
        this.outgoingBalancesForeignCurrency = outgoingBalancesForeignCurrency;
    }

    public long getOutgoingBalancesTotal() {
        return outgoingBalancesTotal;
    }

    public void setOutgoingBalancesTotal(long outgoingBalancesTotal) {
        this.outgoingBalancesTotal = outgoingBalancesTotal;
    }
}
