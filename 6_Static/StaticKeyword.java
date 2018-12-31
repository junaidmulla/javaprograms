class StaticKeyword {
    static int number = 10;
    int randomNumber;

    public StaticKeyword(int r) {
        this.randomNumber = r;
    }

    public int getNumber() {
        return number;
    }

    public void incNumber() {
        number++;
        // Note : Non static member functiona can access static member variables.
    }

    public static void setRandomNumber() {
        // randomNumber++;
        // Note : Static member functions can only have static member variables.

    }

}