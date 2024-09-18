import java.util.Random;
import java.util.Scanner;

import javax.sql.rowset.spi.SyncFactoryException;
public class App {
    public static void main(String[] args) throws Exception {
        Random r = new Random();
        Scanner in = new Scanner(System.in);
        int rand = r.nextInt();
        int money = 5;
        int number1 = r.nextInt(10);
        int number2 = r.nextInt(10);
        int number3 = r.nextInt(10);
        int count = 0;
        String input;
        String playAgain;
        
        System.out.println("How much do want to spend? ");
        input = in.nextLine();
        
        System.out.println (number1 + " "  + number2 + " " + number3 );
        
        while (money > 0) 
        {
           money = money - 1;
            
        if (number1 == 7)
        {            
            count++;
        }
        if (number2 ==7)
        {
            count++;
        }
        if (number3 == 7)
        {
            count++;
        }          
            if (count ==1)
            {
                System.out.println("YOu won");
                money = money + 3;
            System.out.println(money);
        }
        
            if (count == 2)
                {
                System.out.println("You won");
                money = money + 5; 
                System.out.println(money);
                }
                
            if (count == 3)
        
                {
                System.out.println("You won"); 
                money = money + 10;
                System.out.println(money);
                }
           
            else if (count == 0)
            {System.out.println("You lost");
            System.out.println(money);}
            
            System.out.println("If you want to play again?");


            playAgain = in.nextLine();
            if (money == 0)
            {
                System.out.println("Game end");
                
                break;

            }
            if (playAgain.equalsIgnoreCase("N"))
                {
                    System.out.println("End game");    
                    break;
                }
            number1 = r.nextInt(10);
            number2 = r.nextInt(10);
            number3 = r.nextInt(10);
            count = 0;
            System.out.println (number1 + " "  + number2 + " " + number3 );
            
            
            
            
        

        }
        
       
    }
}
