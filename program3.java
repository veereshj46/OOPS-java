//creating an object
class student{
    int marks;
    String name;
    int rollno;

    void displayName(){
        System.out.println("The student name is ="+ name);

    }

    void displayMarks(){
        System.out.println("The student marks is ="+ marks);


    }
    void displayRollno(){
        System.out.println("The student roll number is ="+ rollno);

    }

    public static void main (String[] arg){
        student s1=new student();
        student s2=new student();
        student s3=new student();

        s1.name="veeresh";
        s1.marks=23;
        s1.rollno=55;
        
        s2.name="abhi";
        s2.marks=22;
        s2.rollno=57;

        s3.name="ram";
        s3.marks=33;
        s3.rollno=35;


        s1.displayName();
        s2.displayName();
        s2.displayName();
        

        s1.displayMarks();
        s2.displayMarks();
        s3.displayMarks();
        

        s1.displayRollno();
        s2.displayRollno();
        s3.displayRollno();



    }

}

// another method
class Student{
    String name;
    int marks;
    int rollno;
    //constructor
    Student(String n, int m, int ro ){
        name=n;
        marks=m;
        rollno=ro;
    }
    void displayName(){
        System.out.println("The student name is ="+ name);

    }

    void displayMarks(){
        System.out.println("The student marks is ="+ marks);


    }
    void displayRollno(){
        System.out.println("The student roll number is ="+ rollno);

    }

    public static void main(String[] args){
        Student s1= new Student("veeresh",23,33);
        Student s2=new Student("abhi",53,63);
        Student s3=new Student("ram",13,73);

        s1.displayName();
        s2.displayName();
        s2.displayName();

        s1.displayMarks();
        s2.displayMarks();
        s3.displayMarks();

        s1.displayRollno();
        s2.displayRollno();
        s3.displayRollno();



    }


}