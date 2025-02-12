package org.day02.problemstatement.collectinos.votingsystem;

import java.util.*;

public class VotingSystem {
    // HashMap to store votes (Candidate -> Votes)
    private Map<String, Integer> votesMap = new HashMap<>();

    // LinkedHashMap to maintain the order of votes
    private Map<String, Integer> voteOrder = new LinkedHashMap<>();

    // Method to cast a vote for a candidate
    public void castVote(String candidate) {
        // Update the HashMap for vote count
        votesMap.put(candidate, votesMap.getOrDefault(candidate, 0) + 1);

        voteOrder.put(candidate, votesMap.get(candidate));
    }

    // Method to display results sorted by candidate names using TreeMap
    public void displaySortedResults() {
        TreeMap<String, Integer> sortedResults = new TreeMap<>(votesMap);
        System.out.println("Results (Sorted by Candidate Names):");
        for (Map.Entry<String, Integer> entry : sortedResults.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + " -> Votes: " + entry.getValue());
        }
    }

    // Method to display results in the order votes were cast using LinkedHashMap
    public void displayVoteOrder() {
        System.out.println("Vote Order (Based on Insertion):");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println("Candidate: " + entry.getKey() + " -> Votes: " + entry.getValue());
        }
    }
}
