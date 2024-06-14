public class Game {

    int player1score = 0;
    int player2score = 0;
    String player1;
    String player2;
    String result;


    public static void main(String[] args){
        Game game = new Game();
        int rounds = 1;
        while(rounds < 11) {
            game.playRound();
        System.out.println(game.result);
        System.out.println(game.score());
        rounds +=1;
        };
    }

    void playRound() {
        this.player1 = randomChoice();
        this.player2 = randomChoice();
        this.result = winner(this.player1, this.player2);
    }

    static String randomChoice() {
        int choice = (int)Math.floor(Math.random()*5);
        switch (choice) {
            case 0:
            return "Rock";
            case 1:
            return "Paper";
            case 2:
            return "Scissors";
            case 3:
            return "Lizard";
            case 4:
            return "Spock";
            default:
            return "Something went wrong!";
        }
    }

    static String winner(String player1, String player2) {
        System.out.println("Player 1 chooses: " + player1);
        System.out.println("Player 2 chooses: " + player2);
        if (player1.equals("Rock") && (player2.equals("Scissors") || player2.equals("Lizard"))
                || player1.equals("Paper") && (player2.equals("Rock") || player2.equals("Spock"))
                || player1.equals("Scissors") && (player2.equals("Paper") || player2.equals("Lizard"))
                || player1.equals("Lizard") && (player2.equals("Spock") || player2.equals("Paper"))
                || player1.equals("Spock") && (player2.equals("Scissors") || player2.equals("Rock"))) {
            return "Player 1 Wins!";
        } else if (player2.equals("Rock") && (player1.equals("Scissors") || player1.equals("Lizard"))
                || player2.equals("Paper") && (player1.equals("Rock") || player1.equals("Spock"))
                || player2.equals("Scissors") && (player1.equals("Paper") || player1.equals("Lizard"))
                || player2.equals("Lizard") && (player1.equals("Spock") || player1.equals("Paper"))
                || player2.equals("Spock") && (player1.equals("Scissors") || player1.equals("Rock"))) {
            return "Player 2 Wins!";
        } else {
            return "It's a tie!";
        }
    }

    String score() {
        if (result.equals("Player 1 Wins!")) {
            player1score += 1;
        } else if (result.equals("Player 2 Wins!")) {
            player2score += 1;
        }
        return "Player 1 score: " + player1score + " Player 2 score: " + player2score;
    }


}