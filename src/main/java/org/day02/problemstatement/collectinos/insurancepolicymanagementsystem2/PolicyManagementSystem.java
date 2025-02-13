package org.day02.problemstatement.collectinos.insurancepolicymanagementsystem2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class PolicyManagementSystem {
     Map<String, Policy> hashMap;
    private Map<String, Policy> linkedHashMap;
    private TreeMap<Date, Policy> treeMap;

    public PolicyManagementSystem() {
        this.hashMap = new HashMap<>();
        this.linkedHashMap = new LinkedHashMap<>();
        this.treeMap = new TreeMap<>();
    }

    // Add a policy to all data structures
    public void addPolicy(Policy policy) {
        hashMap.put(policy.getPolicyNumber(), policy);
        linkedHashMap.put(policy.getPolicyNumber(), policy);
        treeMap.put(policy.getExpiryDate(), policy);
    }

    // Retrieve a policy by its number
    public Policy getPolicyByNumber(String policyNumber) {
        return hashMap.get(policyNumber);
    }

    // List all policies expiring within the next 30 days
    public List<Policy> getExpiringPolicies() {
        List<Policy> expiringPolicies = new ArrayList<>();
        Date currentDate = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(currentDate);
        calendar.add(Calendar.DAY_OF_YEAR, 30);
        Date next30Days = calendar.getTime();

        for (Date expiryDate : treeMap.keySet()) {
            if (expiryDate.after(currentDate) && expiryDate.before(next30Days)) {
                expiringPolicies.add(treeMap.get(expiryDate));
            }
        }
        return expiringPolicies;
    }

    // List all policies for a specific policyholder
    public List<Policy> getPoliciesByHolder(String policyholderName) {
        List<Policy> policies = new ArrayList<>();
        for (Policy policy : hashMap.values()) {
            if (policy.getPolicyholderName().equalsIgnoreCase(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    // Remove expired policies
    public void removeExpiredPolicies() {
        Date currentDate = new Date();
        Iterator<Map.Entry<Date, Policy>> iterator = treeMap.entrySet().iterator();

        while (iterator.hasNext()) {
            Map.Entry<Date, Policy> entry = iterator.next();
            if (entry.getKey().before(currentDate)) {
                String policyNumber = entry.getValue().getPolicyNumber();
                iterator.remove();
                hashMap.remove(policyNumber);
                linkedHashMap.remove(policyNumber);
            }
        }
    }

    // Display all policies
    public void displayPolicies(Map<String, Policy> map) {
        for (Policy policy : map.values()) {
            System.out.println(policy);
        }
    }

    public void displayTreeMapPolicies() {
        for (Policy policy : treeMap.values()) {
            System.out.println(policy);
        }
    }

}
