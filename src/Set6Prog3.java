public class Set6Prog3 {
    public static void run() {
        VotingMachine results = new VotingMachine(5);   // Create an object that will tally votes for 5 candidate
        results.castVote(0);                            // cast a vote for candidate 0
        results.castVote(0);                            // cast another vote for candidate 0
        results.castVote(4);                            // cast a vote for candidate 4
        results.castVote(5);                            // this does nothing because there is no candidate 5

        // you only have candidates 0 to 4 (be sure it doesn’t crash!)

        results.castVote(3);                            // cast another vote for candidate 3
        int total = results.getTotalVotesFor(3);        // this should return the total number of votes candidate 3 got
        results.display();                              // display the percent of all the votes each candidate received
    }
}