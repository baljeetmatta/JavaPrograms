//Complex -> real, img
//3 Complex
class Complex{
   private  int real,img;
    Complex(){

    }
    void setReal(int real)
    {
        this.real=real;
    }
    void setImg(int img)
    {
        this.img=img;
    }
    void display()
    {
        System.out.println(real+" "+img);

    }
    Complex (int real,int img)
    {
        this.real=real;
        this.img=img;
    }
    Complex(Complex x,Complex y)
    {
        this.real=x.real+y.real;
        this.img=x.img+y.img;


    }

}
class ComplexMain{
    public static void main(String args[])
    {
        //
        Complex c1=new Complex();
        c1.setReal(Integer.parseInt(args[0]));
         c1.setImg(Integer.parseInt(args[1]));

         Complex c2=new Complex(4,7);
         Complex c3=new Complex(c1,c2);
         c3.display();




    }
}