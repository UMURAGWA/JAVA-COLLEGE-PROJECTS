public class simpleint {
    public double caclulateinterest(double principal, double rate, int years){
        return principal*rate*years;
    }
    
}
  class  Main{

    public static void main(String[] args){
        simpleint simple= new simpleint();
            double ami= simple.caclulateinterest(1000,8.2,4);
            System.out.println(ami); 
    }
}
