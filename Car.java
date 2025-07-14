class Car
{
   Car(){
        model=1;
    System.out.println("Default of Car called...");


   }
   Car(String color,int model)
   {
    this.color=color;
    this.model=model;
   }
   Car(String color)
   {
    this.color=color;
    this.model=10;
   }
   Car(Car car)
   {
    this.color=car.color;
    this.model=car.model;


   }
  private  String color="red";
  private  int model;//NO Garbge
    //GETTER ,SETTER
    public String getColor()
    {
        return color;
    }
    public void setColor(String color)
    {
        this.color=color;

    }
    public int getModel()
    {
        return this.model;

    }
    public void setModel(int model)
    {
        this.model=model;
    }
    public void init(String color,int model)
    {
        //Instance Variable Hiding
        //Local Variable -> Instance Match
        //this->Reference ->Current caller object
        this.color=color;
        this.model=model;

    }

}
class MainCar
{
    public static void main(String args[])
    {
        Car c=new Car();
       System.out.println( c.getModel());
       System.out.println( c.getColor());
       //c.setModel(20);
       //System.out.println( c.getModel());
       //Car c1=new Car();
       //c1.init("blue",20 );
        Car c1=new Car("blue",20);
        System.out.println(c1.getColor());
        Car c2=new Car("blue");

        //Car c3=new Car(c1.getColor(),c1.getModel());
        Car c3=new Car(c1);
        System.out.println(c3.getColor()+" "+c3.getModel());






       


    }
}
/*
 * 
 * int a=10; declration
 int a;//definition
 //Variable defintion
 //variable declartion
 //Function defintion
 //funciton declaration

 * class Car
 * {
 *      int color;
 *  void ini(){
 * color=10;
 * }
 * Car()
 * {
 * 
 * }
 * 
 * }
 * Car c;
 * c.ini();
 */
//Constructors
//Special Functions
// 1. Function with same name as that of class
// 2. they have no return type not even void- return the reference of newly created
// 3. not called, when an object is created
//1. Function without arguments - Default Constructor
//2 function with arguments Parameterized Constructor
//3. argument type is of class -copy constructor object to another object

