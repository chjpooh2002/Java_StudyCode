public class ch4_6 {
    public static void main(String[] args) {
        for(int i =1;i<5;i++)
        {
            for(int h = 0;h<4-i;h++)
                System.out.print(" ");
            for(int j=0;j<i;j++)
                System.out.print("*");
            System.out.print("\n");
        }
    }
    
}
