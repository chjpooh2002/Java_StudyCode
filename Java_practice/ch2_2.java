import java.util.Scanner;

public class ch2_2 {
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        System.out.print("첫번째 수: ");
        String strnum1 = a.nextLine();
        System.out.print("두번째 수: ");
        String strnum2 = a.nextLine();
        int num1 = Integer.parseInt(strnum1);
        int num2 = Integer.parseInt(strnum2);
        int result = num1 + num2;
        System.out.println("덧셈 결과: "+result);
    }
}
