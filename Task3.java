import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in);){
            System.out.println("������� ����� �������");
            int[] ar = new int[Integer.parseInt(sc.nextLine())];
            System.out.println("������� �������� ������� (������ ����� �����)");
            StringBuilder s = new StringBuilder();
            for (int i = 0; i < ar.length; i++) {
                ar[i] = Integer.parseInt(sc.nextLine());
                if(ar[i]%3==0) {
                    s.append(ar[i]+" ");
                }
            }
            System.out.println(s);
        } catch (Exception e) {
            System.out.println("������� ������� �����");
            e.printStackTrace();
        }
    }
}
