package org.day02.problemstatement.collectinos.votingsystem;

public class Main {

    public static void main(String[] args) {
        VotingSystem votingSystem = new VotingSystem();

        // Casting votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Display results in sorted order
        votingSystem.displaySortedResults();

        // Display results in insertion order
        votingSystem.displayVoteOrder();
    }
}
