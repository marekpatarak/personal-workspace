package javaTutorial;

public class BasicOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println("Premenna A: " + a);
        System.out.println("Premenna B: " + b);
        //Arithmetic operators
        //Addition
        System.out.println(a + b);
        //Substraction
        System.out.println(a - b);
        //multiplication
        System.out.println(a * b);
        //division
        System.out.println(b / a);
        //modulus zvysok po deleni
        System.out.println(a % b);
        //increment
        System.out.println(a++);
        //decrement
        System.out.println(b--);
        System.out.println();

        //Relational operators
        System.out.println("Equal to");
        System.out.println(a == b);
        System.out.println("Not equal to");
        System.out.println(a != b);
        System.out.println("A greater than B");
        System.out.println(a > b);
        System.out.println("A less than B");
        System.out.println(a < b);
        System.out.println("A greater than or equal to B");
        System.out.println(a >= b);
        System.out.println("A less than or equal to B");
        System.out.println(a <= b);
        System.out.println();

        //logical operators
        boolean c = true;
        boolean d = false;
        System.out.println("c = true");
        System.out.println("d = false");
        System.out.println("logical and");
        System.out.println(c && d);
        System.out.println("logical or");
        System.out.println(c || d);
        System.out.println("logical NOT");
        System.out.println(!(c&&d));

        //conditional operator, ternary operator
        //variable x = (expression) ? value if true : value if false
        int e, f;
        e = 10;
        f = (e == 1) ? 20: 30;
        System.out.println( "Value of f is : " +  f );

        f = (e == 10) ? 20: 30;
        System.out.println( "Value of f is : " + f);

        /*
        instanceof Operator

        This operator is used only for object reference variables. The operator checks whether the object is of a particular type
         (class type or interface type). instanceof operator is written as −
         ( Object reference variable ) instanceof  (class/interface type)

         If the object referred by the variable on the left side of the operator passes the IS-A check for the
         class/interface type on the right side, then the result will be true. Following is an example −
         */
        String name = "James";

        // following will return true since name is type of String
        boolean result = name instanceof String;
        System.out.println( result );

/*
Precedence of Java Operators

Operator precedence determines the grouping of terms in an expression. This affects how an expression is evaluated.
Certain operators have higher precedence than others; for example, the multiplication operator has higher precedence than the addition operator −

For example, x = 7 + 3 * 2; here x is assigned 13, not 20 because operator * has higher precedence than +,
so it first gets multiplied with 3 * 2 and then adds into 7.

Here, operators with the highest precedence appear at the top of the table, those with the lowest appear at the bottom.
Within an expression, higher precedence operators will be evaluated first.
 */
    }
}
