class Fibbonaci
{
    public static void main(String args[])
    {
        // //1 2
        // //1 0 2 3 5 8
        // //a b c
        // //a b
        // //5
        // //factorial 
        // //int =4 bytes -32768 to +32767
        // //7
        // // 16 bits 1 Sign 15bits -2power(15). to +2(15)-1

        // //max no 
        // int a=0;
        // int b=1;
        //  int terms=Integer.parseInt(args[0]);
        //   if(terms<=0)
        //   return;


        // System.out.print(b);
        // int i=1,c;
       
        // while(i<=terms-1)
        // { 
        //     c=a+b;
        //     System.out.print(" "+c);//1
        //     a=b;//a=1
        //     b=c;//b=1
        //     i++;

        // }
        //int, float,char
        //Class->object
        //C++ String one; //compile time
        // String *one=new String();//run time
        //dynamic 

        /// String one; C++ Object, Java ->Reference ->null
        //Numbers+number==add
        //String+number==concat
        //String+String==concat
        // String one="Hello";//dynamic object
        // String two=new String("Hello");
        // String three ="Hello";
        // String four=new String("Hello");
        //Immutable
        //one="Demo";
        //int a=10;

        //a=20;
        //int arr[]=new int[5];
        //arr.length
        String data=new String("This is a string");
        int len=data.length();
        System.out.println(len);
        data= data.toLowerCase();
        System.out.println(data);
        //
       //String ndata= data.substring(1,data.length());
       //System.out.println(ndata);
        //data.equals("hello"); boolean
       // data.equalsIgnoreCase("hello")
   // data.startsWith("He")
   //data.endsWith("lo")
   /*int pos= data.indexOf("s");
   System.out.println(pos);
    pos= data.indexOf("s",pos+1);
    System.out.println(pos);
    */
    //int pos= data.indexOf("x");//0 based index, -1
    //System.out.println(pos);
    //
   
    int pos=0;
    while(pos!=-1)
    {
        pos=data.indexOf("s",pos);
        if(pos==-1)
        break;

        System.out.println(pos);
        pos++;


    }
    
    
    String test="Sachin";
    int result=test.compareToIgnoreCase("SaCHIN");
    System.out.println(result);









    


    }
}