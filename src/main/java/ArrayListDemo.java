import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo {

    public static void main(String[] args) {
        boolean inputMore = true;
        ArrayList<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);


        System.out.println("Input an Entry: ");
        String inputItem = scanner.nextLine();
        myList.add(inputItem);


        while(inputMore) {
            System.out.println("More items? (y/n)");
            String answer = scanner.nextLine();


            if (answer.equals("y")) {
                System.out.println("Input an Entry: ");
                inputItem = scanner.nextLine();
                myList.add(inputItem);
            } else {
                inputMore = false;
            }
        }


        for (String i : myList) {
            System.out.println(i);
        }

    }


}

