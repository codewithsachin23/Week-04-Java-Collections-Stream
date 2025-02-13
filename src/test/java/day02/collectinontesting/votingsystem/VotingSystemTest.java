package day02.collectinontesting.votingsystem;
import org.day02.problemstatement.collectinos.votingsystem.VotingSystem;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class VotingSystemTest {

    @Test
    void testVotingSystem() {
        // Create an instance of VotingSystem
        VotingSystem votingSystem = new VotingSystem();

        // Cast votes
        votingSystem.castVote("Alice");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");
        votingSystem.castVote("Charlie");
        votingSystem.castVote("Bob");
        votingSystem.castVote("Alice");

        // Capture the output of displaySortedResults
        ByteArrayOutputStream sortedResultsOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(sortedResultsOutput));
        votingSystem.displaySortedResults();

        String expectedSortedOutput =
                "Results (Sorted by Candidate Names):\n" +
                        "Candidate: Alice -> Votes: 3\n" +
                        "Candidate: Bob -> Votes: 2\n" +
                        "Candidate: Charlie -> Votes: 1\n";

        assertTrue(sortedResultsOutput.toString().contains(expectedSortedOutput.trim()));

        // Capture the output of displayVoteOrder
        ByteArrayOutputStream voteOrderOutput = new ByteArrayOutputStream();
        System.setOut(new PrintStream(voteOrderOutput));
        votingSystem.displayVoteOrder();

        String expectedVoteOrderOutput =
                "Vote Order (Based on Insertion):\n" +
                        "Candidate: Alice -> Votes: 3\n" +
                        "Candidate: Bob -> Votes: 2\n" +
                        "Candidate: Charlie -> Votes: 1\n";

        assertTrue(voteOrderOutput.toString().contains(expectedVoteOrderOutput.trim()));
    }
}
