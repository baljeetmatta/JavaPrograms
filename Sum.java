/*
 * java Sum 34 29
 */
class Sum{
    public static void main(String args[])
    {
        //System.out.println(args[0]);
        //System.out.println(args[1]);
        //Wrapper Classes - Set of classes
        //Unboxing
        // TypeCasting -  Converion from one datatype to another data type
        //args[0]-String---- int
        //Object--->Datatype
        //Unboxing
        //Integer ->int
        //Float ->float
        int no=Integer.parseInt(args[0]);
        //Conversion 16.3->int 1
        //as it is 67->67
        //"a"->int
        //"62.3"->int
        int no1=Integer.parseInt(args[1]);
        int sum=no+no1;
        System.out.println(sum);

        
        
    }
}