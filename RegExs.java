import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExs {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("sequence",Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher("A regular expression is a sequence of characters that forms a search pattern.");
        boolean matchFound=matcher.find();
        if(matchFound){
            System.out.println("Match found ...");
        }else{
            System.out.println("Match not found !!!");
        }
    }
}
