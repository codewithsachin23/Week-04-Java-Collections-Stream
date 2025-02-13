package org.day02.problemstatement.collectinos.insurancepolicymanagementsystem;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Main {
    public static void main(String[] args) throws ParseException {
        InsurancePolicyManagement system = new InsurancePolicyManagement();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Sample Policies
        system.addPolicy(new Policy("P001", "Alice", sdf.parse("2025-03-15"), "Health", 1200));
        system.addPolicy(new Policy("P002", "Bob", sdf.parse("2025-02-20"), "Auto", 800));
        system.addPolicy(new Policy("P003", "Charlie", sdf.parse("2025-03-05"), "Home", 1500));
        system.addPolicy(new Policy("P001", "Alice", sdf.parse("2025-03-15"), "Health", 1200)); // Duplicate

        // Display All Policies
        system.displayAllPolicies();

        // Display Policies Expiring Soon
        system.displayExpiringSoon();

        // Display Policies by Coverage Type
        system.displayByCoverageType("Health");

        // Find Duplicate Policies
        system.findDuplicatePolicies();

        // Performance Comparison
        system.performanceComparison();
    }
}
