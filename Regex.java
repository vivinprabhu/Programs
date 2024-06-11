import java.util.*;
import java.util.regex.*;

class Solution {
    public String[] findWords(String[] words) {
        Pattern p1 = Pattern.compile("^[qwertyuiopQWERTYUIOP]*$"); // * - zero or more occurance(qqq is correct) , ^ - start from given characters
        Pattern p2 = Pattern.compile("^[asdfghjklASDFGHJKL]*$"); //$ end from given characters
        Pattern p3 = Pattern.compile("^[zxcvbnmZXCVBNM]*$");

        List<String> l = new ArrayList<>();
        
        for(String s : words)
        {
            if(p1.matcher(s).matches() || p2.matcher(s).matches() || p3.matcher(s).matches())
            {
                l.add(s);
            }
        }
        return l.toArray(new String[0]); 
    }
}