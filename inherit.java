/*
 * 
 * 
 * Inheritence - property throught which object of one class acquires the properties another
 * class A ->object ->A
 * class B ->object ->B
 * class C ---A---- object->C->C/A
 * Resuability
 *                     Addition ->no1,no2,result, read, print, add
 *                      Subtractions->no1,no2,result,read,print, sub
 * 
 * 
 *                  Common->no1,no2,result,read,print --Base/Super
 * 
 *      Addition<---Common->add                 Subtraction<----Common->sub
 *         Derived/Sub-Class
    
    1. Single -> 1
    2. Multiple ->more than 1
    3. Multilevel - single
    4. Hybrid -> more than one type of inheritence
    5. Hirerachal -tree like structure->Single

    A

    B inherit A

    C inherit B->C/B/A

                   A

            B        C     D

        E


        A

        B inherit A    C

        D inherit B, C

        Single ->versions->Diamond problem->Multiple
        extends

 */                   
// class A{
//     void show()
//     {
//         System.out.println("A Called...");
//     }
// }
// class B extends A{
//     void print()
//     {
//         System.out.println("B Called..");

//     }
// }

// class MainClass{
//     public static void main(String arsgs[])
//     {
//         B b=new B();
//         b.print();
//         b.show();
//     }
// }
//Private->Within class
//protected- Within classes
//1.Overriding - Redefining the function, in dervied class - Signature must match
//Overloading -> Function with same name but difference in type of arguments or numbers

class Common{
    protected int no1,no2,result;
    void read(int no1,int no2)
    {
        this.no1=no1;
        this.no2=no2;
    }
    void read(int no)
    {
        this.no1=this.no2=no;

    }
    void print()
    {
        System.out.println("Test called");
        System.out.println(result);
    }
}
class Addition extends Common
{
    void add()
    {
        result=no1+no2;
        
    }
    void print()
    {
        System.out.println("From Addition:"+result);
        //super.print();
        super.print();


    }
}

class MainClass{
    public static void main(String arsgs[])
    {
        Addition ad=new Addition();
        ad.read(20,10);
        ad.add();
        ad.print();

       
    }
}
