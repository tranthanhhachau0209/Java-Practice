public class Ex3 {
    public static int sumEvenNumbers(int n){
        int sum = 0;
        for (int i = 0; i <= n; i++){
            if ( i %2 == 0){
                sum = sum + i;
            }
        }
        return sum;
    }
    public static void main3(String[] arg){
        System.out.println(sumEvenNumbers(10));
        System.out.println(sumEvenNumbers(5));
    }
}
