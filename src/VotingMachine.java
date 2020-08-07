import java.util.ArrayList;

public class VotingMachine {
    private ArrayList<Integer> votes;
    private ArrayList<String> names;
    private int num_votes = 0;
    private int num_candidates = 0;


    ////////////////////////////////////////////
    // Prog 3
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
            num_votes++;
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
            System.out.println("Candidate " + candidate + " got " + 100*votes.get(candidate) / num_votes + "%");
        }
    }


    ////////////////////////////////////////////
    // Prog 4

    public VotingMachine() {
        votes = new ArrayList<>();
        names = new ArrayList<>();
    }


    public void addCandidate(String name) {
        names.add(num_candidates, name);
        votes.add(num_candidates, 0);
        num_candidates++;
    }

    public void castVote(String name) {
        int index = names.indexOf( name );
        if (index != -1) { // found
            votes.set(index, votes.get(index) + 1);
            num_votes++;
        }
    }

    public int getTotalVotesFor(String name) {
        int index = names.indexOf( name );
        if (index != -1) {
            return votes.get(index);
        } else {
            System.out.println("Warning: there is no candidate " + name);
            return 0;
        }
    }

    public String getWinner() {
        int winner_votes = 0;
        int winner_index = -1;
        boolean is_draw = false;
        for (int i = 0; i < votes.size(); i++) {
            if ( votes.get(i) > winner_votes ) {
                winner_votes = votes.get(i);
                winner_index = i;
                is_draw = false;
            } else if ( votes.get(i) == winner_votes ){
                is_draw = true;
            }
        }
        if (is_draw) {
            return "DRAW";
        } else {
            return names.get(winner_index);
        }
    }
}
