package oop;

public class Person {

    //    thuoc tinh (attributes)
//    Encapsulation: đóng gói
//    1. [hidden dât] ko muốn bên ngoài truy cập thuộc tính của Class này
//    2. Bên ngoài truy cập thông qua phương thức public (get, set)

    String name;
    int age;
    String address;

    public String getName(){
        return this.name;
    }
//    phương thức getter
//    public int getAge{
//        return this.age;
    }

//    public String getAddress(){
//        return this.address;
//    }
//phương thức setter
//    public void setName(String name){
//    }

//    @override
//    public String toString
//}
