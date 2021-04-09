import java.util.ArrayList;
import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*System.out.println("Enter the name:");
        String Name = input.nextLine();
        System.out.println("no is "+Name);
        Class citizen = new Class(Name);
        citizen.getName();
        final int no3 ;
        ArrayList<Integer> no = new ArrayList<>();
        Integer no1;
        no.add(1);
        no.add(2);
        no.add(3);
        no.add(4);
        no.add(5);
        no.add(7);

        /*for (Integer i : no) {
            System.out.println(no.get(i-1));
        }
        no.set(2,4);
        for (Integer i : no) {
            System.out.println(i);
        }*/
        //ArrayList<Class> test = new ArrayList<>("name", 6 );
       // System.out.println(test.getName.get(1));
        Class citizen = new Class("5", 4);
        System.out.println(citizen.no4);
        ArrayList<String> Names = new ArrayList<>();
        Names.add("Lahore");
        Names.add("Islamabad");
        Names.add("Karachi");
        Names.add("Faisalabad");
        Names.add("Multan");
        for (String i : Names) {
            System.out.println(i);
        }
        int[][] x = {{3, 1, 4}, {1, 5, 9}};
        int[] y = {2, 6, 7};
        y = x[1];
        y[1] = 1;
        System.out.println(x[0][1] + x[1][1]);


    }

    private static Object test(int i) {
        return null;
    }
}