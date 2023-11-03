public class ifelse {
    public static void main(String[] args) {
        int age = 20;

        if (age < 18) 
        {
            System.out.println("Child");
        } else if (age >= 18 && age < 21) {
            System.out.println("Not to be married");
        } else if (age >= 21 && age < 35) {
            System.out.println("Youth");}
        else if (age >= 35 && age < 55) {
            System.out.println("Working elder");}
        else if (age >= 55 && age < 65) {
            System.out.println("Soon to be retired");
        } else {
            System.out.println("Retired Elder");
        }
    }
}

