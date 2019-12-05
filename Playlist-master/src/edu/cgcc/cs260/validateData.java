package edu.cgcc.cs260;
            import java.util.ArrayList;
            import java.util.List;
            import java.util.Scanner;
            import java.util.regex.Matcher;
            import java.util.regex.Pattern;

public class validateData {
    public validateData(String){
        int length = 0;
        enforceAlphanum enforce = new enforceAlphanum();
        if(length <= 16 && enforce;)

    }

    private void enforceAlphanum(){
        List<String> names = new ArrayList<String>();
        String regex;
        //Gives a range of characters that can be part of a string
        regex = "^[a-zA-Z0-9]+$";
        //Make a new object to compare a string against
        Pattern pattern = Pattern.compile(regex);

        for (String name : names){
            //Make an object to compare to regex
            Matcher matcher = pattern.matcher(name);
            //print a boolean for if the name falls under the conditions
            System.out.println(matcher.matches());
        }
    }
}

