package 类与对象;

public class Object02 {
    public static void main(String[] args) {
        Car car = new Car();
    }
}

class Car {
    String name;//属性,成员变量,字段 field
    double price;
    String color;
    String[] master;//属性可以是基本数据类型,也可以是引用类型(对象,数组)
}
