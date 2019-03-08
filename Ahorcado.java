import java.util.*;
/**
 * Write a description of class Ahorcado here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Ahorcado
{

    /**
     * Constructor for objects of class Ahorcado
     */
    public Ahorcado()
    {
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void jugarAhorcado()
    {
        int vidas = 8;
        while(vidas > 0){
            String[] listaPalabras = {"hola", "listo", "tonto", "array", "random"};
            Random rand = new Random();
            int nAleatorio = rand.nextInt(listaPalabras.length);
            String palabra = listaPalabras[nAleatorio];
            boolean completo = false;
            boolean turnoAcertado = false;
            String[] palabraResuelta = new String[palabra.length()];
            for (int i = 0; i < palabraResuelta.length; i++){
                palabraResuelta[i] = "_";
            }
            for (int i = 0; i < palabraResuelta.length; i++){
                System.out.print(palabraResuelta[i] + ".");
            }
            System.out.println("");
            while (!completo && vidas > 0){
                turnoAcertado = false;
                Scanner sc = new Scanner(System.in);
                System.out.println("Introduce una letra: ");
                String letra = sc.next().toLowerCase();
                if (letra.length() > 1){
                    if (letra.equals(palabra)){
                        System.out.println("¡Has acertado!");
                        completo = true;
                    } else {
                        vidas--;
                        System.out.println("Error. Tu numero de vidas es: " + vidas);
                    }
                } else {
                    for (int i = 0; i < palabraResuelta.length; i++){
                        if (palabra.substring(i, i+1).equals(letra)){
                            palabraResuelta[i] = letra;
                            turnoAcertado = true;
                        }
                    }
                    if (!turnoAcertado) {
                        vidas--;
                    }
                    System.out.println("");
                    System.out.println("Tu numero de vidas es: " + vidas);
                    for (int i = 0; i < palabraResuelta.length; i++){
                        System.out.print(palabraResuelta[i] + ".");
                    }
                    System.out.println("");
                }
            }
        }
        if (vidas<=0){
            System.out.println("");
            System.out.println("------------------------------------");
            System.out.println("Te morihte");
        }
    }
}
