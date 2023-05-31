import java.util.Scanner;

public class App {

    private static String jmenoRezervujiciho = "";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("-------- Rezervacni System Restaurace --------");
            System.out.println("Jsme velmi exkluzivní restaurace tudíž můžete mít jen 1 rezrevaci :)");
            System.out.println("1. Zadat rezervaci");
            System.out.println("2. Zrusit rezervaci");
            System.out.println("3. Konec");

            System.out.print("Zvolte moznost: ");
            int volba = sc.nextInt();

            switch (volba) {
                case 1:
                    rezervovatStul(sc);
                    break;
                case 2:
                    zrusitRezervaci(sc);
                    break;
                case 3:
                    System.out.println("Dekujeme za pouziti rezervacniho systemu!");
                    return;
                default:
                    System.out.println("Neplatna volba. Zvolte prosim platnou moznost.");
                    break;
            }
        }
    }

    private static void rezervovatStul(Scanner sc) {
        System.out.print("Zadejte jmeno rezervujiciho: ");
        jmenoRezervujiciho = sc.next();
// Do datumu může napsat co chce ale přemýšlím nad fixem aby to měl omezené na jenom některé hodnoty:)
        int[] info = new int[5];
        System.out.print("Zadejte den rezervace: ");
        info[0] = sc.nextInt();
        System.out.print("Zadejte mesic rezervace: ");
        info[1] = sc.nextInt();
        System.out.print("Zadejte rok rezervace: ");
        info[2] = sc.nextInt();
        System.out.print("Zadejte hodinu rezervace: ");
        info[3] = sc.nextInt();
        System.out.print("Zadejte minutu rezervace: ");
        info[4] = sc.nextInt();

        System.out.println("Vyberte si co dále:");
        System.out.println("1. Zobrazit info o rezervaci");
        System.out.println("2. Zrusit rezervaci");
        System.out.println("3. Konec");
        int volba = sc.nextInt();

        switch (volba) {
            case 1:
                zobrazitInfoORezervaci(info);
                break;
            case 2:
                zrusitRezervaci(sc);
                break;
            case 3:
                System.out.println("Dekujeme za pouziti rezervacniho systemu!");
                break;
            default:
                System.out.println("Neplatna volba. Zvolte prosim platnou moznost.");
                break;
        }
    }

    private static void zobrazitInfoORezervaci(int[] info) {
        System.out.println("Rezervace pro " + jmenoRezervujiciho + ":");
        System.out.println("Datum rezervace: " + info[0] + "." + info[1] + "." + info[2]);
        System.out.println("Cas rezervace: " + info[3] + ":" + info[4]);
    }

    private static void zrusitRezervaci(Scanner sc) {
        if (!jmenoRezervujiciho.isEmpty()) {
            System.out.println("Rezervace pro " + jmenoRezervujiciho + " byla uspesne zrusena.");
            jmenoRezervujiciho = "";
        } else {
            System.out.println("Neexistuje zadna rezervace k zruseni.");
        }
    }
}