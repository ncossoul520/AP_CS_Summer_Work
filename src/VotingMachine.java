import java.util.ArrayList;

public class VotingMachine {
    private ArrayList<Integer> votes;
    private int counter = 0;

    public VotingMachine(int numCandidates) {
        if (numCandidates < 1) {
            System.out.println("Error: the number of candidates must be > 0");
        } else {
            votes = new ArrayList<>();
            for (int candidate = 0; candidate < numCandidates; candidate++) {
                votes.add(candidate, 0);
            }
        }
    }

    public void castVote(int candidate) {
        if (candidate >= 0 && candidate < votes.size() ) {
            votes.set(candidate, votes.get(candidate) + 1);
            counter++;
        }
    }

    public int getTotalVotesFor(int candidate) {
        if (candidate >= 0 && candidate < votes.size() ) {
            return votes.get(candidate);
        } else {
            System.out.println("Warning: there is no candidate #" + candidate);
            return 0;
        }
    }

    // display the percent of all the votes each candidate received
    public void display() {
        for (int candidate = 0; candidate < votes.size(); candidate++) {
            votes.get(candidate);
            System.out.println("Candidate " + candidate + " got " + 100*votes.get(candidate) / counter + "%");
        }
    }
}
