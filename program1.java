class student{
    int age;
    String name;

    void display(){
        System.out.println(name);
    }
     void data(){
        System.out.println(age);
     }

    public static void main (String[] args){
        student s1=new student();
         s1.name="veeresh";
         s1.age=19;
         s1.name="abhi";


         s1.display();
         s1.data();

         s1.name="abhi";
    }
}

class car{
    int price;
    int model;
    int fuelcapacity;
    String name;
    int mileage;

    void display(){
        System.out.println("The car name is"+ name);
        System.out.println("The car fuel capacity is"+ fuelcapacity);

        
    }
    void data(){
        System.out.println("The car model is"+ model);
        System.out.println("The car mileage is" +mileage);



    }
    public static void main (String[] arg){
        car c1=new car();
        car c2=new car();
        car c3=new car();

        c1.name="audi";
        c1.model=2021;
        c1.fuelcapacity=15;
        c1.price=2200000;

        
        c2.name="BMW";
        c2.model=2024;
        c2.fuelcapacity=16;
        c2.price=22340000;

        c1.display();
        c1.data();

        c2.display();
        c2.data();
    }

}

class house{
    int room;
    int floor;
    String owner;
    int price;

    void display(){
        System.out.println("owner name="+ owner+"floor="+floor+ "price="+ price +"rooms="+ room);
    }

    public static void main(String[] args){

          house h1=new house();
          house h2=new house();

          h1.room=4;
          h1.floor=2;
          h1.price=120000;
          h1.owner="abhi";

          
          h2.room=5;
          h2.floor=1;
          h2.price=130000;
          h2.owner="Ram";

          h1.display();
          h2.display();
          
          
    }
}