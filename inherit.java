// /*
//  * 
//  * 
//  * Inheritence - property throught which object of one class acquires the properties another
//  * class A ->object ->A
//  * class B ->object ->B
//  * class C ---A---- object->C->C/A
//  * Resuability
//  *                     Addition ->no1,no2,result, read, print, add
//  *                      Subtractions->no1,no2,result,read,print, sub
//  * 
//  * 
//  *                  Common->no1,no2,result,read,print --Base/Super
//  * 
//  *      Addition<---Common->add                 Subtraction<----Common->sub
//  *         Derived/Sub-Class
    
//     1. Single -> 1
//     2. Multiple ->more than 1
//     3. Multilevel - single
//     4. Hybrid -> more than one type of inheritence
//     5. Hirerachal -tree like structure->Single

//     A

//     B inherit A

//     C inherit B->C/B/A

//                    A

//             B        C     D

//         E


//         A

//         B inherit A    C

//         D inherit B, C

//         Single ->versions->Diamond problem->Multiple
//         extends

//  */
// // class A{
// //     void show()
// //     {
// //         System.out.println("A Called...");
// //     }
// // }
// // class B extends A{
// //     void print()
// //     {
// //         System.out.println("B Called..");

// //     }
// // }

// // class MainClass{
// //     public static void main(String arsgs[])
// //     {
// //         B b=new B();
// //         b.print();
// //         b.show();
// //     }
// // }
// //Private->Within class
// //protected- Within classes
// //1.Overriding - Redefining the function, in dervied class - Signature must match
// //Overloading -> Function with same name but difference in type of arguments or numbers

// class Common {
//     protected int no1, no2, result;

//     void read(int no1, int no2) {
//         this.no1 = no1;
//         this.no2 = no2;
//     }

//     void read(int no) {
//         this.no1 = this.no2 = no;

//     }

//     void print() {
//         System.out.println("Test called");
//         System.out.println(result);
//     }
// }

// class Addition extends Common {
//     void add() {
//         result = no1 + no2;

//     }

//     // OVERRIDING -- redefining the base class features in dervied class
//     void print() {
//         System.out.println("From Addition:" + result);
//         // super.print();
//         super.print();// base clas overriden
//         // read(20,0);

//     }
// }

// class MainClass {
//     public static void main(String arsgs[]) {
//         Addition ad = new Addition();
//         ad.read(20, 10);
//         ad.add();
//         ad.print();

//     }
// }
// // DIAMOND PROBLEM
// /*
//  * A
//  * 
//  * B extends A C extends A
//  * 
//  * 
//  * D extends B
//  */
// /* Constructor Calling Sequence */

// class Base {
//     Base() {
//         System.out.println("Default of Base ");
//     }

//     Base(int x) {
//         System.out.println("IP  of Base ");
//     }

//     Base(int x, int y) {
//         System.out.println("2P  of Base ");
//     }

// }

// class Derived extends Base {
//     Derived() {
//         System.out.println("Default of Derived ");
//     }

//     Derived(int x) {
//         System.out.println("IP  of Derived ");
//     }

//     Derived(int x, int y) {
//         super(x);

//         System.out.println("2P  of Derived ");
//     }

// }
// class MClass{
//     public static void main(String args[])
//     {
//         // Derived d=new Derived();//Default
//         // Derived d1=new Derived(2,3);
//         // Derived d2=new Derived(2);

//         Data d1=new Data();
//         //d1.print();
//         Data.print();


// //System.out.println(d1.c);
//     }
// }
// //Static - Global variable->classes->Global to class
// //D1->a,b->c=10
// //c=20
// //D2->a,b->c=10
// class Data{
//    private  int a,b;
//    static{//1
//     c=10;
//    }
//    Data()
//    {

//     //c=10;

//    }
//    private static int c;
//    //to access private static variable we define public static functions
//   static   void print()
//    {

//     //static->static
//     //static->Non-static object
//     System.out.println(c);
//    }
// }
// //Data d=new Data();
// //d->a,b
// //c


// //d1=>a,b
// //First Object or Class Initilize
// //java className -> Class Initilize->Static feature ->Memory

class Base
{
    void print()
    {
        System.out.println("Base");

    }
}
class Derived extends Base
{
    void print()
    {
        System.out.println("Dervied");

    }


}
class MClass{
    public static void main(String[] args) {
        //Dynamic Dispatch method -> Virtual Function
       // Derived d=new Derived();
        //Base d1=new Base();
        Base d=new Derived();
        d.print();
        
    }
}


