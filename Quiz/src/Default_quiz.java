import java.util.*;
public class Default_quiz
{
    public Default_quiz()
    {}

    public void Quiz_choice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which quiz would you like to play?\n1) Geography");
        int choice = scan.nextInt();
        if(choice == 1)
        {
            Geography();
        }
    }

    public void DisplayQuestion(Question q)
    {
        System.out.println(q.getName());
        for(int i = 0; i < q.getOptions().length;i++)
        {
            System.out.println(q.getOptions()[i]);
        }
    }

    public void Geography()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("General Knowledge Quiz");
        int score = 0;
        String[][] q = {{"1) Paris", "2) London", "3) Berllin", "4) Madrid"}, {"1) Atlantic Ocean", "2) Indian Ocean", "3) Arctic Ocean", "4) Pacific Ocean"}, {"1) Sahara Desert", "2) Arabian Desert", "3) Antarctica Desert", "4) Gobi Desert"}};
        Question q1 = new Question("What is the captial of France?" , q[0], 1);
        Question q2 = new Question("What is the largest Ocean in the world?", q[1], 4);
        Question q3 = new Question("What is the largest desert in the world?", q[2], 3);
        Question[] qArr = {q1,q2,q3};
        for(int i = 0; i < qArr.length;i++)
        {
            Question currentQuestion = qArr[i];
            DisplayQuestion(currentQuestion);
            int guess = scan.nextInt();
            System.out.println();
            if(guess == currentQuestion.getAnswer()) 
            {
                score++;
            }
        }

        System.out.println("You earned a score of " + score + "!");
        
    }  
}