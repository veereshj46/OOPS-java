// direct intilization using object
class Student{
    String name;
    int salary;
  
    void display(){
        System.out.println(name);

    
    }
    public static void main(String[] args){
        Student s1=new Student();
        s1.name="veeresh";
        s1.salary=33333;
         
        s1.display();
    }
}

// direct intialization inside class
class student{
    int age=22;
    String name="veeresh";

    void show(){
        System.out.println(name);
        System.out.println(age);

    }
    public static void main (String[] args){
        student s3=new student();
        student s4=new student();
        
        s3.show();
        s4.show();
    }
}

// intilization using the constructor

class students{
    int marks;
    String name;

    students(String n,int a){
        name=n;
        marks=a;
    }
    void displays(){
        System.out.println(name);
        System.out.println(marks);


    }
    public static void main(String[] args){
        students s5=new students("veeresh",66);
        students s6=new students("Abhi",76);

        s5.displays();
        s6.displays();

    }

}