package nix.data;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class NumbersInStrings {
    private static void print(List<String> strings){
        System.out.print("Strings: ");
        for(int i=0; i<strings.size();i++) System.out.print("  "+strings.get(i));
        System.out.println();
    }

    public static void task(List<String> strings){
        print(strings);
        String numbers = "";
        List<String> result = strings.stream()
                .map(s->{
                    StringBuilder temp= new StringBuilder();
                    for(int i=0; i<s.length(); i++)
                        if(Character.isDigit(s.charAt(i)))
                            temp.append(s.charAt(i));
                    return temp.toString();})
                .collect(Collectors.toList());
        for(int i=0; i<result.size(); i++)
            numbers+=result.get(i);
        System.out.print("Result string: "+numbers);
        System.out.println();

    }

}
