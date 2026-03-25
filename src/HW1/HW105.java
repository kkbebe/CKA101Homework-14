package HW1;

public class HW105 {
    public static void main(String[] args) {
        int cash = 1_500_000;
        for(int i =0; i < 10; i++) { 
            cash *= 1.02;
            
        }
        System.out.printf("total cash : %d", cash);
    }
}
