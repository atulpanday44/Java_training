
/*class Student{
    String name;
    int age;
    String address;
    double marks;
    String email;
    Student(){
        System.out.println("default constructor called");
    }
    Student(String name,int age,String email){
        this.name=name;
        this.age=age;
        this.email=email;
    }
    Student(String name,int age){
        this.name=name;
        this.age=age;
    }
}

public class Main{
    public static void main(String[]args){
        Student std=new Student("atul",22);
        System.out.println(std.name+std.age);
        Student std1=new Student("atul",22,"svgsvsvhjb@gmail.com");
        System.out.println(std1.name+std1.age+std1.email);
    }

}
 */
 /*class A{
    public void fun()
    {
             //  String name;
              // int age;
        System.out.println("in the child class");
    }
    public static void fun1()
    {
        System.out.println("in the parent class");
    }
}
 class B extends A{
     public void fun()
     {
         System.out.println("in the parent class");
     }
     public static void fun1()
     {
         System.out.println("in the parent class");
     }


 }
 public class Main{
     public static void main(String[]args){
         B obj1=new B();
         obj1.fun();

         A obj2=new A();
         obj2.fun();

         A obj3=new A();
         obj3.fun();

         B obj4=new B();
         obj4.fun();
     }

 }


public class A{
    abstract void fun();
    public void fun2(){
        System.out.println("fun2 mathod");
    }
}
public class B extends A{
    void fun(){
        obj.fun();
        obj1.fun2();

    }
}
public class Main{
public static void main(String[]args){

}
  */
abstract class Shape{
    String color;
    abstract area();


}




