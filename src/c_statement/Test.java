package c_statement;
public class Test {
    public static void main(String[] args) {
        int sum = 0;
        
        for(int i=1; i<=9; i++) {
            for(int j=1; j<=9; j++) {
                int mul = i*j;
                sum += mul;
                System.out.println(i + " x " + j + " = " + mul);
            }
        }
        
        System.out.println("\n1 부터 9 단까지 값의 합 : " + sum);
    }
}


