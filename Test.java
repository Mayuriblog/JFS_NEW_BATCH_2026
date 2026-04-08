import java.util.regex.*;

public class Test {
    public static void main(String[] args) {
        String regex = "[a-f[m-t]]";
        String input = "apple monkey tiger zebra";

        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(input);
		System.out.print(m.group());

       // while (m.find()) {
            //System.out.print(m.group() + " " +" \n");
       // }
    }
}