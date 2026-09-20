import java.util.*;
public class App 
{
    public static void main(String[] args) throws Exception 
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("1) Play default quiz\n2) Create a custom quiz\n3) Exit");
        int choice = scan.nextInt();
        if(choice == 1)
        {
            Default_quiz quiz = new Default_quiz();
            quiz.Quiz_choice();
        }

        
    }
}
