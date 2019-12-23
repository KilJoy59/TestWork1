package main.model;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

@Entity
public class Report {

    @EmbeddedId
    private CompositeKeyForReport compositeKeyForReport;

    private long incomingBalancesRubles;

    private long incomingBalancesForeignCurrency;

    private long incomingBalancesTotal;

    private long debitTurnoverForReportingPeriodRubles;

    private long debitTurnoverForReportingPeriodForeignCurrency;

    private long debitTurnoverForReportingPeriodTotal;

    private long creditTurnoverForReportingPeriodRubles;

    private long creditTurnoverForReportingPeriodForeignCurrency;

    private long creditTurnoverForReportingPeriodTotal;

    private long outgoingBalancesRubles;

    private long outgoingBalancesForeignCurrency;

    private long outgoingBalancesTotal;

    public Report() { }

    public CompositeKeyForReport getCompositeKeyForReport() {
        return compositeKeyForReport;
    }

    public void setCompositeKeyForReport(CompositeKeyForReport compositeKeyForReport) {
        this.compositeKeyForReport = compositeKeyForReport;
    }

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
