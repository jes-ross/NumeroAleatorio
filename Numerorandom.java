/*
 * Jesús Rosales Santana
 * 15-03-2023
 * Crear un número random y preguntar al usuario que número cree que es.
 */
import java.util.random;//Librería para crear el número random.
import java.util.Random;
import java.util.Scanner;//Librería para recoger las respuestas del usuario.

public class Numerorandom {
    public static void main(String[] args) {
        Random num = new Random();//Creamos metodo random
        int number = num.nextInt(11);//Ponemos 11 pues siempre se excluye el último numero, por lo que es 10.
        Scanner user = new Scanner(System.in);//Metodo input para preguntar respuesta al usuario
        System.out.println("Dime un número entre 1 y 10");
        int userAnswer = user.nextInt();//Lee el número del usuario. 
        System.out.println("Tu número es el " + userAnswer);
        if(userAnswer == number){
            System.out.println("Has acertado, el número era " + number);
        
        }else{
            System.out.println("Te has equivocado, el número era " + number);
        }
    }
    
}