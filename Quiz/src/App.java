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
            System.out.println();
            Default_quiz quiz = new Default_quiz();
            quiz.Quiz_choice();
        }
        else if(choice == 2)
        {
            CustomQuiz cQuiz = new CustomQuiz();
            cQuiz.CreateQuiz();
            System.out.println("Do you want to play your quiz?\n1)Yes\n2)No");
            int ans = scan.nextInt();
            if(ans == 1)
            {
                System.out.println();
                cQuiz.playQuiz();
            }
            else {
                System.exit(0);           
            }

        }
        else if(choice == 3)
        {
            System.exit(0);
        }

        
    }
}
