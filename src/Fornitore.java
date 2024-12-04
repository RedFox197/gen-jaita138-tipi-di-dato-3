import java.util.Scanner;

public class Fornitore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Inserisci il nome: ");
            String nome = scanner.nextLine();

            System.out.println("Inserisci la categoria: ");
            for (CategoriaFornitore value : CategoriaFornitore.values()) {
                System.out.printf("%s) %s\n", value.ordinal(), value);
            }
            CategoriaFornitore categoriaFornitore =
                    CategoriaFornitore.values()[scanner.nextInt()];
            scanner.nextLine();

            System.out.println("Inserisci la P.IVA: ");
            String pIva = scanner.nextLine();

            System.out.println("Inserisci il luogo: ");
            String luogo = scanner.nextLine();

            System.out.println("Inserisci il numero di telefono: ");
            String telefono = scanner.nextLine();

            System.out.println("Inserisci l'email: ");
            String email = scanner.nextLine();

            System.out.println("Inserisci la lingua principale: ");
            String linguaPrincipale = scanner.nextLine();

            System.out.println("Inserisci l'IBAN: ");
            String iban = scanner.nextLine();

            System.out.println("Inserisci nome referente: ");
            String nomeReferente = scanner.nextLine();

            System.out.println("Inserisci note: ");
            String note = scanner.nextLine();

            System.out.println("RIEPILOGO DATI");
            System.out.printf(
                    "Nome: %s\nCategoria: %s\nP.IVA: %s\nLuogo: %s\nTelefono: %s\nEmail: %s\nLingua Principale: %s\nIBAN: %s\nNome Referente: %s\nNote: %s\n\n",
                    nome, categoriaFornitore, pIva, luogo, telefono, email, linguaPrincipale, iban, nomeReferente, note
            );

            System.out.println("Vuoi continuare ad inserire dati? ('s' per confermare, altro per uscire)");
            if (!scanner.nextLine().equalsIgnoreCase("s"))
                break;
        }

        scanner.close();
    }
}
