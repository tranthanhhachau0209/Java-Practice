package oop;

//public class ClassDemo{
//    public static void main (String[] args) {
//        Person p = new Person();
//        Truy cập thuộc tính của đối tượng person
//        Sau khi đóng gói = access modifier: private
//        lỗi khi gọi p.name --> ko truy cập đc thuộc tính của đối tượng p
//        fix = cách truy cập qua phương thức public p.getName()
//        System.out.println(p.getName()); //gan gia tri mac dinh --> null
//        System.out.println(p.getAge); //gan gia tri mac dinh --> 0
//        System.out.println(p.getAddress()); //gan gia tri mac dinh --> null
//
//        ở ngoài truy cập được khi không phải private
//        p.name = "Mee";
//        p.age = 20;
//        p.address = "Street A";
//        p.setName("Mee");
//        p.setAge(20);
//        p.setAddress("Street A");
//
//        System.out.println("Sau khi gan gia tri cho p");
//        System.out.println(p.getName());
//        System.out.println(p.getAge());
//        System.out.println(p.getAddress());
//
//        Person p2 = new Person();
//        p2.name = "Long";
//        p2.age = "30";
//        p2.address = "Street B";
//
//        System.out.println("Sau khi gan gia tri cho p2: ");
//        System.out.println(p2.name); //gan gia tri mac dinh --> null
//        System.out.println(p2.age); //gan gia tri mac dinh --> 0
//        System.out.println(p2.address);
//
//
//        Student s = new Student();
//        s.setName("Min");
//        s.setAge(3);
//        s.setAddress(" Hai Ba Trung street");
//        System.out.println("Sau khi gan gan gia tri cho Student s: ");
//        System.out.println(s.getName());
//        System.out.println(s.getAge());
//        System.out.println(s.getAddress());
//
//        System.out.println("In ra object Student s: ");
//        System.out.println(s);
// ko muon in ra noi dung cua function cua cha --: in ra cua student --> override ( ghi de phuong thuc ke thua cua cha)
//        s.whoAmI(); //I am a student
//
//        Student s3 = new Student();
//        s3.setId("A100");
//        Person p3 = new Person();
//
//    }
//}
