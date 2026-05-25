import java.util.HashSet;

public class SetDemo {
    public static void main1(String[] args){
        HashSet<String> myset = new HashSet<>();
        myset.add("Tom");
        myset.add("Anna");
        myset.add("Thomas");
        myset.add("Harry");
        myset.add("Tom");
        myset.add("Harry");
        // tinh chat set khong cho phep phan tu trung lap

        System.out.println(myset);
        System.out.println("Size: " + myset.size());
        // dem so luong phan tu trong mang
        System.out.println("Duyet phan tu");
        for (int i = 0; i < myset.size(); i++) {
//        System.out.println("So thu tu ",);
        }
        for (String s: myset) {
            System.out.println(s);
        }

    }
}
