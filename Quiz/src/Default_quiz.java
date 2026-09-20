import java.util.*;
public class Default_quiz
{
    public Default_quiz()
    {

    }

    public void Quiz_choice()
    {
        Scanner scan = new Scanner(System.in);
        System.out.println("Which quiz would you like to play?\n1) General Knowledge\n2) Science\n3) History\n4)Exit");
        int choice = scan.nextInt();
        if(choice == 1)
        {
            General_knowledge();
        }
    }

    public void DisplayQuestions(HashMap<String, String> questions)
    {
        String[] questionArray = questions.keySet().toArray(new String[0]);
        for(int i = 0; i < questions.size(); i++)
        {
            System.out.println(questionArray[i]);
            System.out.println(questions.get(questionArray[i]));
        }
    }

    public void General_knowledge()
    {
        System.out.println("General Knowledge Quiz");
        int score = 0;
        HashMap<String, String> questions = new HashMap<>();
        questions.put("What is the capital of France?", "1) Paris\n2) London\n3) Berlin\n4) Madrid");
        questions.put("What is the largest ocean in the world?", "1) Atlantic Ocean\n2) Indian Ocean\n3) Arctic Ocean\n4) Pacific Ocean");
        questions.put("What is the largest desert in the world?", "1) Sahara Desert\n2) Arabian Desert\n3) Antarctica Desert\n4) Gobi Desert");
        DisplayQuestions(questions);
    }
}
