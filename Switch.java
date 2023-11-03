public class Switch {
    public static void main(String[] args) {
        int player_position = 10; // You can set the choice to any value (1, 2, 3, or 4) to see the corresponding case in action.

        switch (player_position) {
            case 1:
                System.out.println("GOALKEEPER");
                break;
            case 8,6:
                System.out.println("MIDFIELDER");
                break;
            case 10:
                System.out.println("PLAYMAKER");
                break;
            case 9,11,7:
                System.out.println("ATTACKER");
                break;
            default:
                System.out.println("DEFENDER");
                break;
        }
    }
}
