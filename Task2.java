import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("¬ведите им€");
        try(Scanner sc = new Scanner(System.in)) {
            String s = sc.nextLine();
            if (s.equals("¬€чеслав")) {
                System.out.println("ѕривет, ¬€чеслав");
            } else {
                System.out.println("Ќет такого имени");
            }
        }
    }
}
