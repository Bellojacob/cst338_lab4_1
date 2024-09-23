import java.util.ArrayList;

public class Toy {

    private int number;

    private String name;



    public Toy(int number, String name) {

        this.number = number;

        this.name = name;

    }




    public static void main(String[] args) {

        ArrayList<Toy> list = new ArrayList<Toy>();


        Toy tom100 = new Toy(100, "Tom");

        Toy tom200 = new Toy(200, "Tom");



        list.add(tom100);

        list.add(tom200);



        Toy tom100_2 = new Toy(100, "Tom");

        list.add(tom100_2);

        if (list.contains(tom100_2)){

            System.out.println("Found");

        } else {

            System.out.println("Not found");

        }

    }

}