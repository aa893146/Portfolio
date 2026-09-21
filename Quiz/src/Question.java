public class Question
{
    public String name;
    public String[] options;
    public int answer;

    public Question(String name, String[] options, int answer)
    {
        this.name = name;
        this.options = options;
        this.answer = answer;
    }

    public Question()
    {

    }

    public String getName()
    {
        return name;
    }

    public int getAnswer()
    {
        return answer;
    }

    public String[] getOptions()
    {
        return options;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public void setOptions(String[] options)
    {
        this.options = options;
    }

    public void setAnswer(int answer)
    {
        this.answer = answer;
    }
}