import java.util.Scanner;

public class ProvaElementoMultimediale {
    public static void main(String[] args) {
        Scanner scanner= new Scanner (System.in);
        //Creo l'array
        ElementoMultimediale[] elementiMultimediali = new ElementoMultimediale[5];
        //Creo un ciclo che mi permetta di scegliere la tipologia di file da inserire nell'array
        for (int i = 0; i < elementiMultimediali.length ; i++) {
            System.out.println("Crea un Elemento multimediale! Digita: 1 per creare un IMMAGINE , 2 per creare un AUDIO, 3 per creare un VIDEO");
            int scelta = scanner.nextInt();

            switch (scelta) {
                case 1: {
                    System.out.println("Titolo: ");
                    scanner.nextLine();
                    String titolo = scanner.nextLine();
                    System.out.println("Luminosità: ");
                    int luminosita = scanner.nextInt();
                    elementiMultimediali[i] = new Immagine(titolo, luminosita);
                    break;
                }
                case 2: {
                    System.out.println("Titolo: ");
                    scanner.nextLine();
                    String titolo = scanner.nextLine();
                    System.out.println("Durata: ");
                    double durata = scanner.nextDouble();
                    System.out.println("Volume: ");
                    int volume = scanner.nextInt();
                    elementiMultimediali[i] = new RegistrazioneAudio(titolo, durata, volume);
                    break;
                }
                case 3: {
                    System.out.println("Titolo: ");
                    scanner.nextLine();
                    String titolo = scanner.nextLine();
                    System.out.println("Durata: ");
                    double durata = scanner.nextDouble();
                    System.out.println("Volume: ");
                    int volume = scanner.nextInt();
                    System.out.println("Luminosità: ");
                    int luminosita = scanner.nextInt();
                    elementiMultimediali[i] = new Video(titolo, durata, volume, luminosita);
                    break;
                }
                default: {
                    System.out.println("Errore!!");
                }

            }
            //Stampo i dati dell'array man mano che vengono inseriti
            for (ElementoMultimediale elemento : elementiMultimediali) {
                if (elemento != null) {
                    System.out.println(elemento);
                }
            }
        }

        int numeroInserito;
        do {
            System.out.println("\nScegli un elemento dell'array digitando un numero da 1 a 5! Digita 0 per interrompere!");
            numeroInserito = scanner.nextInt();

            if (numeroInserito >= 1 && numeroInserito <= 5) {
                Object elemento = elementiMultimediali[numeroInserito - 1];

                if (elemento instanceof RegistrazioneAudio) {
                    ((RegistrazioneAudio) elemento).play();
                } else if (elemento instanceof Video) {
                    ((Video) elemento).play();
                } else if (elemento instanceof Immagine) {
                    ((Immagine) elemento).show();
                } else {
                    System.out.println("Tipo non riconosciuto.");
                }
            } else if (numeroInserito != 0) {
                System.out.println("Scelta non valida.");
            }

        } while (numeroInserito != 0);

    }
}
