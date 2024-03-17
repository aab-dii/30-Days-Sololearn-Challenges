class App {

    public static void main(String[] args) {
        
        Player player1 = new Player(Difficulty.EASY);
        Player player2 = new Player(Difficulty.MEDIUM);
        Player player3 = new Player(Difficulty.HARD);
   }
}
enum Difficulty {
    EASY,
    MEDIUM,
    HARD
}

