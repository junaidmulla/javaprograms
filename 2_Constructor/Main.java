class Main {
    public static void main(String[] args) {
        Game tetris = new Game();
        System.out.println(tetris.mScore);

        Game darts = new Game(501);
        System.out.println(darts.mScore);
    }
}