import java.util.Scanner;



public class AsciiMorse {
    public static void main(String[] args) {
        String frase;
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca la frase");
        frase=sc.nextLine();
        String[] palabras = frase.split(" ");
        String texto = "";
        for (int i = 0; i<palabras.length;i++){

            char[] caracter = palabras[i].toCharArray();
            for (int j = 0; j < caracter.length; j++) {


                String codigoMorse = "";
                String letra= String.valueOf(caracter[j]);
                String mayus=letra.toUpperCase();
                
                switch (mayus) {
                    case "A": codigoMorse = ".-"; break;
                    case "B": codigoMorse = "-..."; break;
                    case "C": codigoMorse = "-.-."; break;
                    case "D": codigoMorse = "-.."; break;
                    case "E": codigoMorse = "."; break;
                    case "F": codigoMorse = "..-."; break;
                    case "G": codigoMorse = "--."; break;
                    case "H": codigoMorse = "...."; break;
                    case "I": codigoMorse = ".."; break;
                    case "J": codigoMorse = ".---"; break;
                    case "K": codigoMorse = "-.-"; break;
                    case "L": codigoMorse = ".-.."; break;
                    case "M": codigoMorse = "--"; break;
                    case "N": codigoMorse = "-."; break;
                    case "O": codigoMorse = "---"; break;
                    case "P": codigoMorse = ".--."; break;
                    case "Q": codigoMorse = "--.-"; break;
                    case "R": codigoMorse = ".-."; break;
                    case "S": codigoMorse = "..."; break;
                    case "T": codigoMorse = "-"; break;
                    case "U": codigoMorse = "..-"; break;
                    case "V": codigoMorse = "...-"; break;
                    case "W": codigoMorse = ".--"; break;
                    case "X": codigoMorse = "-..-"; break;
                    case "Y": codigoMorse = "-.--"; break;
                    case "Z": codigoMorse = "--.."; break;

                }
                texto=texto+codigoMorse+" ";



            }
            texto=texto+"/ ";
        }
        System.out.println(texto);
    }



}
