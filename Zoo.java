import java.util.Scanner;

public class Zoo {


    public static int Menu(){
        Scanner keybord = new Scanner(System.in);

        System.out.println("Zone 1 (Animal land)");
        System.out.println("Zone 2 (PoulTry)");
        System.out.println("Zone 3 (Reptile)");
        System.out.println("Zone 4 (Aquztic animal)");
        
        System.out.print("Choose... ");
        int choose = keybord.nextInt();

        System.out.println("===========================");
        return choose;
    }


    public static void Logo(){
        System.out.println("===========================");
        System.out.println("       Zoo Management      ");
        System.out.println("===========================");
    }

    public static void main(String[] args) {
        Logo();
        switch (Menu()) {
            case 1:
                System.out.println("Kuy");
                break;
        
            default:
                break;
        }
    }
}