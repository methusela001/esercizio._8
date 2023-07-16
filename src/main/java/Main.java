
public class Main {
   // Boolean Operators
    //     Try to solve on paper the following boolean algebra operations:
    public static void main(String[] args) {
    //Then compare your solutions with a Java program that tests the validity of your assumptions.

        //  [A]: 2 <= 2 && !true
            boolean A = 2 <= 2 && !true;
        //  [B]: !false && 3 > 2
            boolean B = !false && 3 > 2;// il !false pone la condizione true
        //  [C]: considering that t=false and f=true: !(!t || f)
            boolean t = false;
            boolean f = true;
            boolean C = !(!t || f);
       //   [D]: 6 > 6 ^ !(true && true)
            boolean D = 6 > 6 ^ !(true && true);

            System.out.println(" First question is "  + A);
            System.out.println(" Second question is " + B);
            System.out.println(" Third question is " + C);
            System.out.println(" Fourth question is " + D);
        }
    }
