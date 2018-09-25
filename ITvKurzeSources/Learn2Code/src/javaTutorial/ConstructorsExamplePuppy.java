package javaTutorial;

/*
There are three steps when creating an object from a class −

    Declaration − A variable declaration with a variable name with an object type.

    Instantiation − The 'new' keyword is used to create the object.

    Initialization − The 'new' keyword is followed by a call to a constructor. This call initializes the new object.
 */

public class ConstructorsExamplePuppy {

    public ConstructorsExamplePuppy() {
    }
    // This constructor has no parameter.

    public ConstructorsExamplePuppy(String name) {
        // This constructor has one parameter, name.
        System.out.println("Passed Name is :" + name );
    }
    public static void main(String []args) {
        // Following statement would create an object myPuppy
        ConstructorsExamplePuppy myPuppy = new ConstructorsExamplePuppy( "tommy" );
    }
}

