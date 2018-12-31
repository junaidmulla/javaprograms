class Main {
    public static void main(String[] args) {
        StaticKeyword s = new StaticKeyword(100);

        // Static Variables can be accessed using objects.
        // Objects do not maintain a seperate copy of static variables
        // Values of static variables can be changed. They are not like constants
        System.out.println(s.number);
        System.out.println(s.randomNumber);

        // static variable should be accessed in static way
        // i.e by using
        // ClassName.StaticVariable;
        System.out.println("Static Variable number: " + StaticKeyword.number);

        StaticKeyword s1 = new StaticKeyword(200);
        System.out.println(s1.number);
        System.out.println(s1.randomNumber);

        // Incorrect way of incrementing static variable and printing it.
        s.number++;
        System.out.println(s.number);

        // CORRECT WAY...
        StaticKeyword.number++;
        System.out.println(StaticKeyword.number);

        System.out.println("Static Variable Number: " + StaticKeyword.number);

        // Call to a function which return integer value.
        int value = s1.getNumber();
        System.out.println(value);

        s1.incNumber();
        System.out.println("Static Variable Number after calling incNumber(): " + StaticKeyword.number);
    }
}