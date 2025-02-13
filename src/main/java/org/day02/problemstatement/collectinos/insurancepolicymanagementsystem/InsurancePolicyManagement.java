package org.day02.problemstatement.collectinos.insurancepolicymanagementsystem;

import java.util.*;

public class InsurancePolicyManagement {
    private Set<Policy> hashSet = new HashSet<>();
    private Set<Policy> linkedHashSet = new LinkedHashSet<>();
    private Set<Policy> treeSet = new TreeSet<>();

    // Add Policy
    public void addPolicy(Policy policy) {
        hashSet.add(policy);
        linkedHashSet.add(policy);
        treeSet.add(policy);
    }

    // Display All Unique Policies
    public void displayAllPolicies() {
        System.out.println("All Policies (HashSet):");
        hashSet.forEach(System.out::println);

        System.out.println("All Policies (LinkedHashSet):");
        linkedHashSet.forEach(System.out::println);

        System.out.println("All Policies (TreeSet):");
        treeSet.forEach(System.out::println);
    }

    // Display Policies Expiring Soon
    public void displayExpiringSoon() {
        System.out.println("\nPolicies Expiring Soon (Within 30 Days):");
        Date now = new Date();
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DAY_OF_YEAR, 30);
        Date threshold = cal.getTime();

        treeSet.stream()
                .filter(policy -> policy.getExpiryDate().after(now) && policy.getExpiryDate().before(threshold))
                .forEach(System.out::println);
    }

    // Display Policies by Coverage Type
    public void displayByCoverageType(String coverageType) {
        System.out.println("Policies with Coverage Type: " + coverageType);
        hashSet.stream()
                .filter(policy -> policy.getCoverageType().equalsIgnoreCase(coverageType))
                .forEach(System.out::println);
    }

    // Find Duplicate Policies by Policy Number
    public void findDuplicatePolicies() {
        System.out.println("Duplicate Policies by Policy Number:");
        Set<String> seen = new HashSet<>();
        Set<Policy> duplicates = new HashSet<>();

        for (Policy policy : hashSet) {
            if (!seen.add(policy.getPolicyNumber())) {
                duplicates.add(policy);
            }
        }

        duplicates.forEach(System.out::println);
    }

    // Performance Comparison
    public void performanceComparison() {
        System.out.println("Performance Comparison:");

        long start, end;

        // Adding
        start = System.nanoTime();
        hashSet.addAll(hashSet);
        end = System.nanoTime();
        System.out.println("HashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.addAll(linkedHashSet);
        end = System.nanoTime();
        System.out.println("LinkedHashSet Add: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.addAll(treeSet);
        end = System.nanoTime();
        System.out.println("TreeSet Add: " + (end - start) + " ns");

        // Searching
        start = System.nanoTime();
        hashSet.contains(hashSet.iterator().next());
        end = System.nanoTime();
        System.out.println("HashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        linkedHashSet.contains(linkedHashSet.iterator().next());
        end = System.nanoTime();
        System.out.println("LinkedHashSet Search: " + (end - start) + " ns");

        start = System.nanoTime();
        treeSet.contains(treeSet.iterator().next());
        end = System.nanoTime();
        System.out.println("TreeSet Search: " + (end - start) + " ns");
    }
}