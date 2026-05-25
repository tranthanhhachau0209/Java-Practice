import java.util.Random;

public class ForDemo {
    public static void main(String[] args) {
        //      for (int i = 0; i < 5; i++) {
        //          System.out.println("hello" + i );
        //      }
        //  }

        //      Random A = new Random();
        //      int randomValue = rand.nextInt(1,10);

//        int i = 1;
//        int a  = 4;
//        a *= 2;
//        int a = 5;
//        a /= 2;
//        int x = 3;
//        int y = 5;
//        System.out.println("x+y=" + (x + y));
//        System.out.println("x-y=" + (x- y));
//      x += y;
//      System.out.println("x += y ==> x= " +x);
//        System.out.println(i++);
//        System.out.println("x == y ==>" + (x == y));
//        System.out.println("x != y) ==>" + (x != y));
//        System.out.println("x > y ==>" + (x > y));
//        System.out.println("x < y ==>" + (x < y));
//        System.out.println("x <= y ==>" + (x<=y));
//        int a = true;
//        int b = false;
//        String ten = " Long";
//        int tuoi = 34;
//        String intro =
//        System.out.printf("chong em ten la %s, nam nay %d", ten, tuoi);
//        System.out.printf("chong em ten la %s, nam nay %d", ten, tuoi);


        int x = 3;
        int y = 6;
        String result = (x > y) ? "x greater than y" : "x les than or equal y";
        System.out.println(result);

        int a = 5;
        int b = 9;
        a++;
        b++;
        System.out.println("a++ ==>" + a);
        System.out.println("b++ ==>" + b);

        b= a++;
        System.out.print("expression: b = a++");
        System.out.print("b =" +b);
        System.out.print("a= " + a);


    }
}
