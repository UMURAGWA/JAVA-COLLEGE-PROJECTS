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

// Class C extending D 
class C extends D {
    public void play() {
        System.out.println("Class C: Goalkeeper - Blocks shots and clears the ball.");
    }
}

// Class B extending C
class B extends C {
    void play1() {
        System.out.println("Class B: Midfielder- Control the ball and play making.");
    }
}

// Class A extending B 
class A extends B {
    public void play() {
        System.out.println("Class A: Forward - Scores goals and attacks opponents defense.");
    }
}

public class Inheritance1{
    public static void main(String[] args) {
        A playerA = new A();
        E playerB = new D(); 
        B playerC = new B();
        D playerD = new C();
        playerA.play(); // Calls the play method in class A
        playerB.play(); // Calls the play method in class D
        playerC.play1(); // Calls the play method in class B
        playerD.play(); // Calls the play method in class C
    }
}
