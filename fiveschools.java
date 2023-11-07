public class fiveschools {
    public String excellent(String name, int num){
        return num+name;
    }
    
}
class Main{
    public static void main(String[] args){
        fiveschools display= new fiveschools();
        String screen= display.excellent(1,"KING DAVID",
                                            2,String="UR",
                                            3, "IPRC",
                                            4,  "St Ambroise",
                                            5,  "FAWE");
        System.out.println(screen);
    }
    System.out.println();
}
