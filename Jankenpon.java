public class Jankenpon {

    public String match(String player, String adversary){
        if (player== "Rock" && adversary == "Paper"){
            return "Paper";
        }
        else if (player== "Rock" && adversary == "Scissors"){
            return "Rock";
        }
        else if (player== "Paper" && adversary == "Scissors"){
            return "Scissors";
        }
        else if (player== "Paper" && adversary == "Rock"){
            return "Paper";
        }
        else if (player== "Scissors" && adversary == "Paper"){
            return "Scissors";
        }
        else if (player== "Scissors" && adversary == "Rock"){
            return "Rock";
        }
        else if (player == adversary){
            return "Draw";
        }
        else {
            return "Error";
        }
    }
}
