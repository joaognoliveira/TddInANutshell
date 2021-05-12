import java.util.Arrays;
import java.util.List;

public class Jankenpon {

    public class Match {
        String[] match = {"Rock,Paper", "Rock,Scissors",
                            "Paper,Scissors", "Paper,Rock",
                            "Scissors,Paper", "Scissors,Rock"},                 
                 outcome = {"Paper", "Rock",
                            "Scissors", "Paper",
                            "Scissors", "Rock"};
        List<String> matches_list = Arrays.asList(match);
        List<String> outcomes_list = Arrays.asList(outcome);
    }

    public String match(String player, String adversary){
        Match match = new Match();
        String currentMatch = player + "," + adversary;
        if (match.matches_list.contains(currentMatch)){
            return match.outcomes_list.get(match.matches_list.indexOf(currentMatch));
        }
        else return "Draw";
    }
}
