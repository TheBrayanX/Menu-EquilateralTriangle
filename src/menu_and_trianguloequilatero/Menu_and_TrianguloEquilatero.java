
package menu_and_trianguloequilatero;

import java.util.Scanner;

public class Menu_and_TrianguloEquilatero {

    Scanner leer = new Scanner(System.in);
    int lado1, lado2, lado3;
    
    public void Digitar(){
        System.out.print("Por favor dígita el lado 1: \n");
        lado1 = leer.nextInt();
        System.out.print("Por favor dígita el lado 2: \n");
        lado2 = leer.nextInt();
        System.out.print("Por favor dígita el lado 3: \n");
        lado3 = leer.nextInt();
    }
    
    public void cualEsMayor(){
        System.out.print("El mayor es: \n");
        if(lado1>lado2 && lado1>lado3){
            System.out.print(lado1);
        } else {
            if (lado2>lado3){
                System.out.print(lado2);
            } else {
                System.out.print(lado3);
            }
        }
    }
    
    public void equilatero(){
        if (lado1==lado2 && lado1==lado3){
            System.out.print("\n Es un triangulo equilatero \n");
        } else {
            System.out.print("\n No es un triangulo equilatero \n ");
        }
    }
    
    public static void main(String[] args) {
        Menu_and_TrianguloEquilatero Equilatero;
        Equilatero=new Menu_and_TrianguloEquilatero();
        Equilatero.Digitar();
        Equilatero.cualEsMayor();
        Equilatero.equilatero();
    }
    
}
