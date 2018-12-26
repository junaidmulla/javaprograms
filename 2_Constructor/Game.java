//  Constructors are special types of methods that are responsible for 
//  creating and initializing an object of that class.

public class Game {
    int mScore;

    // Constructor
    Game() {
        // Initialization code goes here
        mScore = 0;
    }

    // Constructor by Starting Score Value.
    Game(int startingScore) {
        mScore = startingScore;
    }
}

/*
 * NOTE
 * 
 * 1 - A Default constructor is one that doesn't take any input parameters at
 * all!
 * 
 * 2 - It is optional. It's optional, which means if you don't create a default
 * constructor, Java will automatically assume there's one by default that
 * doesn't really do anything.
 * 
 * 3 - However, if the class has fields that need to be initialized before the
 * object can be used, then you should create one that does so.
 * 
 */

/*
 * Parameterized Constructors
 * 
 * A constructor can take input parameters Let's assume that some games start
 * with a positive score value and not just 0, that means we need another
 * constructor that takes an integer parameter as an input, and uses that to
 * initialize the score variable.
 * 
 */

/*
 * 
 * Why multiple constructors? You might be wondering why do we still need to
 * keep the default constructor now that we have another constructor that can
 * create a game object with any starting score value (including 0)?
 * 
 * Good point, however, it's considered a good practice to always include a
 * default constructor that initializes all the fields with values that
 * correspond to typical scenarios. Then you can add extra parameterized
 * constructors that allow for more customization when dealing with less common
 * cases.
 */