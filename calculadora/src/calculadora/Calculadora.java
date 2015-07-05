
package calculadora;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        ejecucion();
    }
    
    public static void ejecucion(){
        String menu = "[menu]\nBienvenido, Elige una opción:\n\t1. Suma\n\t2. Resta\n\t3. Multiplicación"
               + "\n\t4. División\n\t5. Módulo\n\t6. Potencias"
               + "\n\t7. Valor absoluto\n\t8. Redondeo"
               + "\n\t9. Trigonometría\n\t10. Logaritmos"
               + "\n\t11. Constantes Especiales"
               + "\n\t12. Factorial\n\t13. Raices\n\t14.Salir";
        System.out.println(menu);
        System.out.print("Elige una opcion > ");
        Scanner eleccion = new Scanner(System.in);
        metodos llamada = new metodos();
        switch (eleccion.nextLine()){
            case "1": llamada.suma();break;
            case "2": llamada.resta();break;
            case "3": llamada.multiplicacion();break;
            case "4": llamada.division();break;
            case "5": llamada.modulo();break;
            case "6": 
                String potenciaS = "\nElige una opción:\n\t1.Potencia genérica x^y\n\t2.Potencia Cuadrada\n\t3.Potencia Cúbica";
                System.out.println(potenciaS);
                System.out.print("Elige una opcion > ");
                Scanner potenciaEleccion = new Scanner(System.in);
                switch(potenciaEleccion.nextLine()){
                    case "1": llamada.potenciaG(); break;
                    case "2": llamada.potenciaCua(); break;
                    case "3": llamada.potenciaCub(); break;
                    default: System.out.println("[error]: El valor ingresado no es correcto");
                }
                break;
            case "7": llamada.valorAbs();break;
            case "8": llamada.redondear();break;
            case "9": 
                String trigoS = "\nElige una opción:\n\t1.Seno\n\t2.Coseno\n\t3.Tangente\n\t4.ArcSeno\n\t5.ArcCoseno\n\t6.ArcTangente";
                System.out.println(trigoS);
                System.out.print("Elige una opcion > ");
                Scanner trigoEleccion = new Scanner(System.in);
                switch(trigoEleccion.nextLine()){
                    case "1": llamada.senoT(); break;
                    case "2": llamada.cosenoT(); break;
                    case "3": llamada.tangenteT(); break;
                    case "4": llamada.arcSenoT(); break;
                    case "5": llamada.arcCosenoT(); break;
                    case "6": llamada.arcTangenteT(); break;
                    default: System.out.println("[error]: El valor ingresado no es correcto");
                }
                break;
            case "10": 
                String logS = "\nElige una opción:\n\t1.Logartimo natural\n\t2.Logaritmo base 10";
                System.out.println(logS);
                System.out.print("Elige una opcion > ");
                Scanner logEleccion = new Scanner(System.in);
                switch(logEleccion.nextLine()){
                    case "1": llamada.logaritmoNatural(); break;
                    case "2": llamada.logaritmoBase10(); break;
                    default: System.out.println("[error]: El valor ingresado no es correcto");
                }
                break;
            case "11": 
                String constanteS = "\nElige una opción:\n\t1.Constante E\n\t2.Constante PI";
                System.out.println(constanteS);
                System.out.print("Elige una opcion > ");
                Scanner constanteEleccion = new Scanner(System.in);
                switch(constanteEleccion.nextLine()){
                    case "1": llamada.constanteE(); break;
                    case "2": llamada.constantePI(); break;
                    default: System.out.println("[error]: El valor ingresado no es correcto");
                }
                break;
            case "12": llamada.factorial();break;
            case "13": 
                String raizS = "\nElige una opción:\n\t1.Raiz genérica (x)^1/y\n\t2.Raiz Cuadrada\n\t3.Raiz Cúbica";
                System.out.println(raizS);
                System.out.print("Elige una opcion > ");
                Scanner raizEleccion = new Scanner(System.in);
                switch(raizEleccion.nextLine()){
                    case "1": llamada.raizG(); break;
                    case "2": llamada.raizCua(); break;
                    case "3": llamada.raizCub(); break;
                    default: System.out.println("[error]: El valor ingresado no es correcto");
                }
                break;
            case "14":
                System.exit(0);
            default: System.out.println("[error]: El valor ingresado no es correcto");
        }
        System.out.println("\n[tarea_terminada]\n");
        ejecucion();
    }
    
}
