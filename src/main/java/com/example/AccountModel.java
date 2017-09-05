package com.example;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by user1 on 18-10-2016.
 */

@Entity
@Table(name = "accountinfo")
public class AccountModel implements Serializable
{
    private static final long serialVersionUID = -3009157732242241606L;

    @Id
    private int accountId;
    private int addressId;
    private int customerId;
    private int subscriptionId;
    private String imsi;
    private String icc;
    private String firstName;
    private String lastName;
    private Date startDate;
    private int status;

    protected AccountModel(){}

    public AccountModel(int accountId, int addressId, int customerId, int subscriptionId, String imsi, String icc, String firstName, String lastName, Date startDate, int status)
    {
        this.accountId = accountId;
        this.addressId = addressId;
        this.customerId = customerId;
        this.subscriptionId = subscriptionId;
        this.imsi = imsi;
        this.icc = icc;
        this.firstName = firstName;
        this.lastName = lastName;
        this.startDate = startDate;
        this.status = status;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getSubscriptionId() {
        return subscriptionId;
    }

    public void setSubscriptionId(int subscriptionId) {
        this.subscriptionId = subscriptionId;
    }

    public String getImsi() {
        return imsi;
    }

    public void setImsi(String imsi) {
        this.imsi = imsi;
    }

    public String getIcc() {
        return icc;
    }

    public void setIcc(String icc) {
        this.icc = icc;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString()
    {
        return String.format("Account [accountId : %d ----- firstName : '%s' ----- lastName : '%s']", getAccountId(), getFirstName(), getLastName());
    }
}
