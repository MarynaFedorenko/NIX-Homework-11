package nix;

import nix.data.ForwardLinkedListImpl;
import nix.data.NumbersInStrings;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        System.out.println("____________Task 1______________");
        List<String> strings = new ArrayList<>();
        strings.add("Повсе1дневная 2прак3тика");
        strings.add("пока4зывает, что дальнейшее");
        strings.add("развитие различных5 форм 6деятельности");
        strings.add("играет7 важную р8оль");
        strings.add("в формировани9и позиций");
        NumbersInStrings.task(strings);
        System.out.println();


        System.out.println("____________Task 2______________");
        ForwardLinkedListImpl list = new ForwardLinkedListImpl();
        list.insert(list, "Hello World!");
        list.insert(list, "My name is Maryna.");
        list.insert(list, "I love Java.");
        list.insert(list, "I live in Kharkiv.");
        list.insert(list, "The end!.");
        list.printList(list);
    }
}
