import java.util.Scanner;


public class Main {
    // Méthode pour effectuer l'addition
    public static int addition(int a, int b) {
        return a + b;
    }
    public static int soustraction(int a,int b){
        return a-b;
    }
    public static int multiplication(int a,int b){
        return a * b;
    }
    public static int division(int a,int b) {
        if (b == 0) {
           throw new  ArithmeticException("impossible");
        } else {
            return a / b;

        }

    }
    public static int pow(int a,int b){
        return Math.pow(a,b);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Instanciation correcte du Scanner
        int a, b;

        System.out.println("Entrez la valeur de a:");
        a = scanner.nextInt();

        System.out.println("Entrez la valeur de b:");
        b = scanner.nextInt();

        // Demander à l'utilisateur de choisir une opération
        System.out.println("Choisissez une opération :");
        System.out.println("1: Addition");
        System.out.println("2:soustraction");
        System.out.println("3:multiplication");
        System.out.println("4:division");
        System.out.println("5:power");
        int choix = scanner.nextInt();
        int resultat;

        switch (choix) {
            case 1:
                resultat = addition(a, b);
                System.out.println("L'addition de a et b est : " + resultat);
                break;
            case 2:
                resultat = soustraction(a,b);
                System.out.println("la soustraction de a et b:"+ resultat);
                break;
            case 3:
                resultat=multiplication(a,b);
                System.out.println("la multiplication de a et b est:"+resultat);
                break;
            case 4:
                resultat=division(a,b);
                System.out.println("la division de a et b est :"+resultat);
                break;
            case 5:
                resultat=pow(a,b);
                System.out.println("la puissance de par b est:"+resultat);
                break;
            default:
                System.out.println("Choix invalide.");
        }

        // Fermer le Scanner
        scanner.close(); // Correction :
    }}

