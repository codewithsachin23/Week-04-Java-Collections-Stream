package org.day02.problemstatement.collectinos.insurancepolicymanagementsystem2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ParseException {
        PolicyManagementSystem system = new PolicyManagementSystem();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        // Sample policies
        Policy policy1 = new Policy("P001", "John Doe", sdf.parse("2025-03-01"), "Health", 5000);
        Policy policy2 = new Policy("P002", "Jane Smith", sdf.parse("2025-02-25"), "Auto", 3000);
        Policy policy3 = new Policy("P003", "Alice Brown", sdf.parse("2025-01-15"), "Home", 7000);

        // Add policies
        system.addPolicy(policy1);
        system.addPolicy(policy2);
        system.addPolicy(policy3);

        // Display all policies
        System.out.println("All Policies (HashMap):");
        system.displayPolicies(system.hashMap);

        System.out.println("\nPolicies Expiring in 30 Days:");
        List<Policy> expiring = system.getExpiringPolicies();
        expiring.forEach(System.out::println);

        System.out.println("\nPolicies for 'John Doe':");
        List<Policy> johnPolicies = system.getPoliciesByHolder("John Doe");
        johnPolicies.forEach(System.out::println);

        // Remove expired policies
        system.removeExpiredPolicies();
        System.out.println("\nAfter Removing Expired Policies (TreeMap):");
        system.displayTreeMapPolicies();
    }
}
