//C++ default Access Specifier ->Private
//public:
// Public ->Implicit  DEfault within Directory/Package
//Explicit
class Addition {
    private  int number1, number2, sum;

    public void init(int x, int y) {
        number1 = x;
        number2 = y;

    }

    public void add() {
        sum = number1 + number2;
        print();

    }

    public void print() {
        System.out.println(number1+""+sum);

    }
    //static -> Static 
    //static -> Non Static ->Object
  

}

class MainClass {
    public static void main(String args[]) {
        int x=Integer.parseInt(args[0]);
        int y=Integer.parseInt(args[1]);
        //Object->new
        //ad ->number1,number2,sum ->Instance
        //ad1->number1,number2,sum
        //init,add,print
        Addition ad=new Addition();
        //Addition ad1=new Addition();
        ad.init(x,y);
        ad.add();
       // ad.print();





    }
}