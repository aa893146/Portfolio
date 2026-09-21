import java.util.*;
public class CustomQuiz 
{
    private ArrayList<Question> questions = new ArrayList<Question>();

    public CustomQuiz() {}

    public void DisplayQuestion(Question q)
    {
        System.out.println(q.getName());
        for(int i = 0; i < q.getOptions().length;i++)
        {
            System.out.println(q.getOptions()[i]);
        }
    }

    public void CreateQuiz()
    {
        Question q1 = new Question();
        Question q2 = new Question();
        Question q3 = new Question();
        Question q4 = new Question();
        Question q5 = new Question();
        Question q6 = new Question();
        Question q7 = new Question();
        Question q8 = new Question();
        Question q9 = new Question();
        Question q10 = new Question();
        Question[] qArr = {q1,q2,q3,q4,q5,q6,q7,q8,q9,q10};

        Scanner scan = new Scanner(System.in);
        System.out.println("How many questions in your quiz? (Max 10)");
        int questionsNumber = scan.nextInt();
        System.out.println("How many options would you like your question to have?");
        int optionNumber = scan.nextInt();
        scan.nextLine();

        for(int i = 0;i < questionsNumber;i++)
        {
            System.out.println("What is the question?");
            String name = scan.nextLine();
            String[] options = new String[optionNumber];
            for(int j = 1; j < optionNumber + 1;j++)
            {
                System.out.println("What is option #" + j);
                String option = scan.nextLine();
                options[j - 1] = (String.valueOf(j) + ") " + option);
            }
            System.out.println("Which of the options is the correct one (Type the number)");
            int answer = scan.nextInt();
            scan.nextLine();
            qArr[i].setName(name);
            qArr[i].setOptions(options);
            qArr[i].setAnswer(answer);
            questions.add(qArr[i]);
        }
    }

    public void playQuiz()
    {
        Scanner scan = new Scanner(System.in);
        int score = 0;
        for(int i = 0; i < questions.size();i++)
        {
            Question currentQuestion = questions.get(i);
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
