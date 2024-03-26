
   /* public class Override{
    public static void main(String[]args){
        System.out.println("hello world");

    }
    public void fun(String s,int k){
        System.out.println("inside fun");
    }
    public void fun(int a){
    }
    public void fun(String a){

    }
    }
    /*Mma {
        public void player(){
            char name;
            int age;
        }
        public void player(){
            String name;
            float age;
        }*/

   class Student{
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

   public class Overload{
       public static void main(String[]args){
           Student std=new Student("atul",22);
           System.out.println(std.name+std.age);
           Student std1=new Student("atul",22,"svgsvsvhjb@gmail.com");
           System.out.println(std1.name+std1.age+std1.email);
       }

   }
