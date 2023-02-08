import com.sun.source.tree.WhileLoopTree;
import org.w3c.dom.ls.LSOutput;

import java.util.Random;
import java.util.Scanner;

public class NGG {
    public static void main(String args[]) {
        int N1 =5,N,i;

        Scanner s = new Scanner(System.in);
        {
            Random r = new Random();
            int randomInt = r.nextInt(100);
            
             for (i=0;i<N1;i++){
                 System.out.println("Guess the number: ");
                  N= s.nextInt();
                 System.out.println("System generated no. is: "+randomInt);
                    if (N > randomInt && i!=N-1) {
                        System.out.println("Your guess is higher than system number,try again!");
                    }
                    else if (N < randomInt && i!=N-1) {
                        System.out.println("Your guess is lower than system number,try again!");
                    }
                    else if (N == randomInt) {
                        System.out.println("Congrats you won!!!");
                        break;
                    }
                }
            }
       }

   }




