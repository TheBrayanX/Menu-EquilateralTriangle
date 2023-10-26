
package menu_and_trianguloequilatero;

import java.util.Scanner;

public class Menu_Calculator {
    double suma,resta,multi,divi;
    double num1, num2, var;
    int one = 1, two = 2, three = 3, four = 4, five = 5;
    Scanner leer=new Scanner(System.in);
    
    public void read(){
        System.out.print("BIENVENIDO A MI MENU DE CALCULADORA \n\n");
        System.out.print("Escribe un valor A: \n");
        num1 = leer.nextInt();
        System.out.print("Escribe un valor B: \n");
        num2 = leer.nextInt();
        System.out.print("Por favor escribe la opcion que necesites tal cual en minuscula....\n");
        System.out.print("1: Suma - 2: Resta - 3: Multiplicacion - 4: Dividir - 5: Salir\n");
        var = leer.nextInt();
    }
    
    public void suma(){
        if (var == 1) {
            suma = num1 + num2;
            System.out.print("El valor de la suma es: \n\n"+suma);
        }
        if (var == 2) {
            resta = num1 - num2;
            System.out.print("El valor de la resta es: \n\n"+resta);
        }
        if (var == 3){
            multi = num1 * num2;
            System.out.print("El valor de la multiplicacion es: \n\n"+multi);
        }
        if (var == 4){
            divi = num1 / num2;
            System.out.print("El valor de la división es: \n\n"+divi);
        }
        if(var == 5){
            System.out.print("Importante: Has cerrado la calculadora.\n");
        }
    }
    
    public static void main(String[] args){
        Menu_Calculator menu;
        menu=new Menu_Calculator();
        menu.read();
        menu.suma();
    }
}
