// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class student{
    String name;
    int age;
    
    void getName(){
    System.out.println(name);   
    }
}
class Main {
    public static void main(String[] args) {
        System.out.println("Try programiz.pro");
        
        //UDT
        //int a=4;
        student a=new student();
        a.name="pooja";
        a.age=18;
        System.out.println(a.name);
        System.out.println(a.age);
        a.getName();
    }
}
