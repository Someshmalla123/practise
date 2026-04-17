import java.util.Scanner;
public class Practise {
    public static void main(String[] args) {
       /*  String name = args[0];
        System.out.println(name);
         String name1 = args[1];
        System.out.println(name1);
        System.out.println(args[0]);
        System.out.println(Integer.parseInt(args[1]));
        int num1 = Integer.parseInt(args[2]);
        System.out.println(num1);
      int num2 = Integer.parseInt(args[3]);
        System.out.println(num2);*/
       
      /*   int day = Integer.parseInt(args[0]);
        String time = args[1];*/
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day number (1-7): ");
        int day = sc.nextInt();
        sc.nextLine(); // Consume the newline character after reading the integer
        System.out.println("Enter time of day (Morning/Afternoon/Night): ");
        String time = sc.nextLine();


        switch (day) {
            case 1 : System.out.println("Sunday"); break;
            case 2 : System.out.println("Monday"); break;
            case 3 : System.out.println("Tuesday"); break;
            case 4 : System.out.println("Wednesday"); break;
            case 5 : System.out.println("Thursday"); break;
            case 6 : System.out.println("Friday"); break;
            case 7 : System.out.println("Saturday"); break;
            default : {
                System.out.println("Invalid day number");
                break;
            }
        }

        // Single time switch (no repetition)
        switch (time) {
            case "Morning" :
                System.out.println("Good Morning");
                break;
            case "Afternoon": 
                System.out.println("Good Afternoon");
                break;
            case "Night" : 
                System.out.println("Party time!");
                break;
            default  : 
            System.out.println("Invalid time of day");
        }
    }
}