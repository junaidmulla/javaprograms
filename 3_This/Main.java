class Main {
    public static void main(String[] args) {
        Position pos = new Position();
        // calling default constructor -- initializing object with default values

        System.out.println("~~~Object pos~~~");
        System.out.println("Row : " + pos.row);
        System.out.println("Column : " + pos.row);

        Position para = new Position(4, 3);
        // calling parameterized constructor -- initializing object with parameterized
        // values

        System.out.println("~~~Object para~~~");
        System.out.println("Row : " + para.row);
        System.out.println("Column : " + para.column);

    }
}

// OUTPUT

// ~~~Object pos~~~
// Row:0
// Column:0

// ~~~Object
// para~~~
// Row:4
// Column:3