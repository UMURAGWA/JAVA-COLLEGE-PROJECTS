// Interface for class grandGrandpa
interface grandGrandpa {
    void family();
}

// Class grandPa implementing the grandGrandpa interface
class grandPa implements grandGrandpa {
    public void family() {
        System.out.println("Grandpa: He was called MUZIGURA");
    }
}

// Class dad extending grandPa 
class dad extends grandPa {
    public void family() {
        System.out.println("Dad: He is H Jonathan");
    }
}

// Class Son extending Dad
class son extends dad {
    void sfamily() {
        System.out.println("Son: He is called I Hertier.");
    }
}

// Class Child extending Son
class child extends son {
    public void family() {
        System.out.println("Child: He is called UMURAGWA.");
    }
}

public class Inheritanceex2 {
    public static void main(String[] args) {
        child famA = new child();
        grandPa famB = new grandPa(); 
        son famC = new son();
        grandPa famD = new dad();
        famA.family(); // Calls the family method in class child
        famB.family(); // Calls the family method in class grandPa
        famC.sfamily(); // Calls the sfamily method in class son
        famD.family(); // Calls the family method in class dad
    }
}

