
import java.util.Scanner;

public class ch4_7 {
    public static void main(String[] args) {
        boolean  run = true;
        int balance = 0;
        Scanner a = new Scanner(System.in);
        while(run)
        {
            System.out.println("----------------------------------------");
            System.err.println("1.예금 | 2.출금 | 3.잔고 |4.종료");
            System.out.println("----------------------------------------");
            System.out.print("선택> ");
            int number = a.nextInt();
            switch(number)
            {
                case 1:
                    System.out.print("예금액>");
                    int plus = a.nextInt();
                    balance += plus;
                    break;
                case 2:
                    System.out.print("출금액>");
                    int minus = a.nextInt();
                    balance -= minus;
                    break;
                case 3:
                    System.out.println("잔고>"+balance);
                    break;
                case 4:
                    run = false;
            }
        }
        System.out.println("\n프로그램 종료");
        a.close();
    }
    
}
