package wordgame;

public class Word
{
    public String word;
    private String[] hint;
    
    public Word(String word, String[] hints)
    {
        this.word = word;
        hint = hints;
    }
    
    public String getHint(int hintNum)
    {
        if(hintNum > hint.length)
            return "You ran out of hints! Sorry!";
        else
            return hint[hintNum];
    }
}
