package org.day02.problemstatement.collectinos.insurancepolicymanagementsystem2;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Policy {
    private String policyNumber;
    private String policyholderName;
    private Date expiryDate;
    private String coverageType;
    private double premiumAmount;

    // Constructor
    public Policy(String policyNumber, String policyholderName, Date expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = expiryDate;
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    // Getters
    public String getPolicyNumber() {
        return policyNumber;
    }

    public String getPolicyholderName() {
        return policyholderName;
    }

    public Date getExpiryDate() {
        return expiryDate;
    }

    public String getCoverageType() {
        return coverageType;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return "PolicyNumber: " + policyNumber +
                ", Holder: " + policyholderName +
                ", ExpiryDate: " + sdf.format(expiryDate) +
                ", CoverageType: " + coverageType +
                ", Premium: " + premiumAmount;
    }
}
