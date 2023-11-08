// Interface for class E
interface E {
    void play();
}

// Class D implementing the E interface
class D implements E {
    public void play() {
        System.out.println("Class D: General player - Runs, passes, and tackles.");
    }
}

// Class C extending D and implementing the E interface
class C extends D {
    public void play() {
        System.out.println("Class C: Goalkeeper - Blocks shots and clears the ball.");
    }
}

// Class B extending C
class B extends C {
    void specificMethodB() {
        System.out.println("Class B: Additional specific method.");
    }
}

// Class A extending B and implementing the E interface
class A extends B implements E {
    public void play() {
        System.out.println("Class A: Forward - Scores goals and attacks opponents' defense.");
    }
}

public class Inheritance1{
    public static void main(String[] args) {
        A playerA = new A();
        E playerB = new D(); // You can create another player of the same type
        D playerC = new A();
        D playerD = new C();
        playerA.play(); // Calls the play method in class A
        playerB.play(); // Calls the play method in class D
        playerC.play(); // Calls the play method in class A
        playerD.play(); // Calls the play method in class A
    }
}
