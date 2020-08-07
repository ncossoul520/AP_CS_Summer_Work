public class Set6Prog4 {
    public static void run() {
        VotingMachine machine = new VotingMachine();
        machine.addCandidate("jill"); // Add several candidates
        machine.addCandidate("bill");
        machine.addCandidate("phil");
        machine.addCandidate("gill");

        machine.castVote("jill");
        machine.castVote("waldo"); // this line does nothing since waldo is not a candidate
        machine.castVote("jill");
        machine.castVote("gill");
//        machine.castVote("gill"); // test for DRAW
//        machine.castVote("gill"); // test for another winner

        int jill = machine.getTotalVotesFor("jill"); // this should return the total number of votes for "gill"
        String winner = machine.getWinner(); // returns "jill" who got the most votes

        machine.display();
        System.out.println("votes for Jill: " + jill);
        System.out.println("winner: " + winner);
    }
}
