import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//traducir codigo morse a ascii
public class Main {
    private static final Map<String, Character> traductor = new HashMap<>();

    static {
        traductor.put(".-", 'A');
        traductor.put("-...", 'B');
        traductor.put("-.-.", 'C');
        traductor.put("-..", 'D');
        traductor.put(".", 'E');
        traductor.put("..-.", 'F');
        traductor.put("--.", 'G');
        traductor.put("....", 'H');
        traductor.put("..", 'I');
        traductor.put(".---", 'J');
        traductor.put("-.-", 'K');
        traductor.put(".-..", 'L');
        traductor.put("--", 'M');
        traductor.put("-.", 'N');
        traductor.put("---", 'O');
        traductor.put(".--.", 'P');
        traductor.put("--.-", 'Q');
        traductor.put(".-.", 'R');
        traductor.put("...", 'S');
        traductor.put("-", 'T');
        traductor.put("..-", 'U');
        traductor.put("...-", 'V');
        traductor.put(".--", 'W');
        traductor.put("-..-", 'X');
        traductor.put("-.--", 'Y');
        traductor.put("--..", 'Z');
        traductor.put("/", ' ');  // Espacio
    }

    public static String morseToAscii(String morseCode) {
        String resultado = "";
        String[] letrasMorse = morseCode.trim().split(" ");

        for (String letras: letrasMorse) {
            String[] morseCharacters = letras.split("/");
            for (String morseChar : morseCharacters) {
                Character asciiChar = traductor.get(morseChar);
                if (asciiChar != null) {
                    resultado += asciiChar;
                }
            }
            resultado += " ";
        }
        return resultado.trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el codigo en morse: ");
        String frase = scanner.nextLine();

        String asciiOutput = morseToAscii(frase);
        System.out.println("Texto ASCII: " + asciiOutput);
    }
}
