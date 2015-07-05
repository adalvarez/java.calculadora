
package calculadora;
import java.util.LinkedList;

import java.util.Scanner;

public class metodos{
    
    public LinkedList processMain (){
        LinkedList salida = new LinkedList();
        
        int opUno= 0; int opDos = 0;
        boolean condUnoN = false; boolean condDosN = false;
        float opUnoF = 0; float opDosF = 0;
        boolean condUnoF = false; boolean condDosF = false;
        
        Scanner operandoUno = new Scanner(System.in);
        Scanner operandoDos = new Scanner(System.in);
        try{
            System.out.print("Ingresa el operando 1 > ");
            opUno = operandoUno.nextInt();
            condUnoN = true;
        }catch(Exception e){
            try{
                opUnoF = operandoUno.nextFloat();
                condUnoF = true;
            }catch(Exception f){
                System.out.println("\n\t[error]: Se ha ingresado un operando incorrecto, debe ser un numero entero o flotante.\n");
                processMain();
            }
        }
        try{
            System.out.print("Ingresa el operando 2 > ");
            opDos = operandoDos.nextInt();
            condDosN = true;
        }catch(Exception e){
            try{
                opDosF = operandoDos.nextFloat();
                condDosF = true;
            }catch(Exception f){
                System.out.println("\n\t[error]: Se ha ingresado un operando incorrecto, debe ser un numero entero o flotante.\n");
                processMain();
            }
        }
        salida.add(opUno); salida.add(opDos); salida.add(condUnoN); salida.add(condDosN);
        salida.add(opUnoF); salida.add(opDosF); salida.add(condUnoF); salida.add(condDosF);
        return salida;
    }
    
    
    ////////////////////////////////////////////
    public void suma(){
        System.out.println("\n[suma]");
        LinkedList salida = processMain();
        // Casting de variables que proceden del LinkedList
        Integer opUno = (Integer)salida.get(0); Integer opDos = (Integer)salida.get(1);
        Boolean condUnoN = (Boolean)salida.get(2); Boolean condDosN = (Boolean)salida.get(3);
        Float opUnoF = (Float)salida.get(4); Float opDosF = (Float)salida.get(5);
        Boolean condUnoF = (Boolean)salida.get(6); Boolean condDosF = (Boolean)salida.get(7);
        
        operaciones operacion = new operaciones();
        
        if (condUnoN && condDosN){ // ambos son enteros y están listo para realizar la operación
            System.out.println("El resultado es: " + operacion.sumaEntero(opUno, opDos));
        }else if(condUnoN && condDosF){
            float tempOpUno = (float)opUno;
            System.out.println("El resultado es: " + operacion.sumaFloat(tempOpUno, opDosF));
        }else if(condUnoF && condDosN){
            float tempOpDos = (float)opDos;
            System.out.println("El resultado es: " + operacion.sumaFloat(opUnoF, tempOpDos));
        }else{ // ambos son flotantes
            System.out.println("El resultado es: " + operacion.sumaFloat(opUnoF, opDosF));
        }
    }
    
    ////////////////////////////////////////////
    public void resta(){
        System.out.println("\n[resta]");
        LinkedList salida = processMain();
        // Casting de variables que proceden del LinkedList
        Integer opUno = (Integer)salida.get(0); Integer opDos = (Integer)salida.get(1);
        Boolean condUnoN = (Boolean)salida.get(2); Boolean condDosN = (Boolean)salida.get(3);
        Float opUnoF = (Float)salida.get(4); Float opDosF = (Float)salida.get(5);
        Boolean condUnoF = (Boolean)salida.get(6); Boolean condDosF = (Boolean)salida.get(7);
        
        operaciones operacion = new operaciones();
        
        if (condUnoN && condDosN){ // ambos son enteros y están listo para realizar la operación
            System.out.println("El resultado es: " + operacion.restaEntero(opUno, opDos));
        }else if(condUnoN && condDosF){
            float tempOpUno = (float)opUno;
            System.out.println("El resultado es: " + operacion.restaFloat(tempOpUno, opDosF));
        }else if(condUnoF && condDosN){
            float tempOpDos = (float)opDos;
            System.out.println("El resultado es: " + operacion.restaFloat(opUnoF, tempOpDos));
        }else{ // ambos son flotantes
            System.out.println("El resultado es: " + operacion.restaFloat(opUnoF, opDosF));
        }
    }
    
    ////////////////////////////////////////////
    public void multiplicacion(){
        System.out.println("\n[multiplicacion]");
        LinkedList salida = processMain();
        // Casting de variables que proceden del LinkedList
        Integer opUno = (Integer)salida.get(0); Integer opDos = (Integer)salida.get(1);
        Boolean condUnoN = (Boolean)salida.get(2); Boolean condDosN = (Boolean)salida.get(3);
        Float opUnoF = (Float)salida.get(4); Float opDosF = (Float)salida.get(5);
        Boolean condUnoF = (Boolean)salida.get(6); Boolean condDosF = (Boolean)salida.get(7);
        
        operaciones operacion = new operaciones();
        
        if (condUnoN && condDosN){ // ambos son enteros y están listo para realizar la operación
            System.out.println("El resultado es: " + operacion.multiEntero(opUno, opDos));
        }else if(condUnoN && condDosF){
            float tempOpUno = (float)opUno;
            System.out.println("El resultado es: " + operacion.multiFloat(tempOpUno, opDosF));
        }else if(condUnoF && condDosN){
            float tempOpDos = (float)opDos;
            System.out.println("El resultado es: " + operacion.multiFloat(opUnoF, tempOpDos));
        }else{ // ambos son flotantes
            System.out.println("El resultado es: " + operacion.multiFloat(opUnoF, opDosF));
        }
    }
    
    ////////////////////////////////////////////
    public void division(){
        System.out.println("\n[division]");
        LinkedList salida = processMain();
        // Casting de variables que proceden del LinkedList
        Integer opUno = (Integer)salida.get(0); Integer opDos = (Integer)salida.get(1);
        Boolean condUnoN = (Boolean)salida.get(2); Boolean condDosN = (Boolean)salida.get(3);
        Float opUnoF = (Float)salida.get(4); Float opDosF = (Float)salida.get(5);
        Boolean condUnoF = (Boolean)salida.get(6); Boolean condDosF = (Boolean)salida.get(7);
        
        operaciones operacion = new operaciones();
        
        if (condUnoN && condDosN){ // ambos son enteros y están listo para realizar la operación
            System.out.println("El resultado es: " + operacion.divisionEntero(opUno, opDos));
        }else if(condUnoN && condDosF){
            float tempOpUno = (float)opUno;
            System.out.println("El resultado es: " + operacion.divisionFloat(tempOpUno, opDosF));
        }else if(condUnoF && condDosN){
            float tempOpDos = (float)opDos;
            System.out.println("El resultado es: " + operacion.divisionFloat(opUnoF, tempOpDos));
        }else{ // ambos son flotantes
            System.out.println("El resultado es: " + operacion.divisionFloat(opUnoF, opDosF));
        }
    }

    ////////////////////////////////////////////
    public void modulo(){
        System.out.println("\n[modulo]");
        LinkedList salida = processMain();
        // Casting de variables que proceden del LinkedList
        Integer opUno = (Integer)salida.get(0); Integer opDos = (Integer)salida.get(1);
        Boolean condUnoN = (Boolean)salida.get(2); Boolean condDosN = (Boolean)salida.get(3);
        Float opUnoF = (Float)salida.get(4); Float opDosF = (Float)salida.get(5);
        Boolean condUnoF = (Boolean)salida.get(6); Boolean condDosF = (Boolean)salida.get(7);
        
        operaciones operacion = new operaciones();
        
        if (condUnoN && condDosN){ // ambos son enteros y están listo para realizar la operación
            System.out.println("El resultado es: " + operacion.moduloEntero(opUno, opDos));
        }else if(condUnoN && condDosF){
            float tempOpUno = (float)opUno;
            System.out.println("El resultado es: " + operacion.moduloFloat(tempOpUno, opDosF));
        }else if(condUnoF && condDosN){
            float tempOpDos = (float)opDos;
            System.out.println("El resultado es: " + operacion.moduloFloat(opUnoF, tempOpDos));
        }else{ // ambos son flotantes
            System.out.println("El resultado es: " + operacion.moduloFloat(opUnoF, opDosF));
        }
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public LinkedList processSpecificTwoOps (){
        LinkedList salida = new LinkedList();
        
        double opUno= 0; double opDos = 0;
        
        Scanner operandoUno = new Scanner(System.in);
        Scanner operandoDos = new Scanner(System.in);
        try{
            System.out.print("Ingresa la base > ");
            opUno = operandoUno.nextDouble();
        }catch(Exception e){
            System.out.println("\n\t[error]: Se ha ingresado un operando incorrecto, debe ser un numero entero o flotante.\n");
            processSpecificTwoOps();
        }
        try{
            System.out.print("Ingresa el exponente > ");
            opDos = operandoDos.nextDouble();
        }catch(Exception e){
            System.out.println("\n\t[error]: Se ha ingresado un operando incorrecto, debe ser un numero entero o flotante.\n");
            processSpecificTwoOps();
        }
        salida.add(opUno); salida.add(opDos);
        return salida;
    }
    
    public void potenciaG(){
        System.out.println("\n[potencia_generica]");
        LinkedList salida = processSpecificTwoOps();
        // Casting
        Double opUno = (Double)salida.get(0); Double opDos = (Double)salida.get(1);
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.potenciaGenerica(opUno, opDos));
    }

    public void raizG(){
        System.out.println("\n[raiz_generica]");
        LinkedList salida = processSpecificTwoOps();
        // Casting
        Double opUno = (Double)salida.get(0); Double opDos = (Double)salida.get(1);
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.raziGenerica(opUno, opDos));
    }
    

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public double processSpecificOneOp (){
        double opUno= 0;
        Scanner operandoUno = new Scanner(System.in);
        try{
            System.out.print("Ingresa la base > ");
            opUno = operandoUno.nextDouble();
        }catch(Exception e){
            System.out.println("\n\t[error]: Se ha ingresado un operando incorrecto, debe ser un numero entero o flotante.\n");
            processSpecificOneOp();
        }
        return opUno;
    }
    
    ////////////
    public void potenciaCua(){
        System.out.println("\n[potencia_cuadrada]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.potenciaCuadrada(opUno));
    }
    
    ////////////
    public void potenciaCub(){
        System.out.println("\n[potencia_cubica]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.potenciaCubica(opUno));
    }
    
    ////////////
    public void valorAbs(){
        System.out.println("\n[valor_absoluto]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.absoluto(opUno));
    }
        
    ////////////
    public void redondear(){
        System.out.println("\n[redondeo]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.redondeo(opUno));
    }
    
    ////////////
    public void senoT (){
        System.out.println("\n[seno]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.seno(opUno));
    }
    
    ////////////
    public void cosenoT (){
        System.out.println("\n[coseno]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.coseno(opUno));
    }
    
    ////////////
    public void tangenteT (){
        System.out.println("\n[tangente]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.tangente(opUno));
    }
    
    ////////////
    public void arcSenoT (){
        System.out.println("\n[arcseno]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.senoInv(opUno));
    }
    
    ////////////
    public void arcCosenoT (){
        System.out.println("\n[arccoseno]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.cosenoInv(opUno));
    }
    
    ////////////
    public void arcTangenteT (){
        System.out.println("\n[arctangente]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.tangenteInv(opUno));
    }
    
    ////////////
    public void logaritmoNatural (){
        System.out.println("\n[logaritmo_natual]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.logNatural(opUno));
    }

    ////////////
    public void logaritmoBase10 (){
        System.out.println("\n[logaritmo_base_10]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.logBase10(opUno));
    }
    
    ////////////
    public void raizCua (){
        System.out.println("\n[logaritmo_base_10]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.raizCuadrada(opUno));
    }

    ////////////
    public void raizCub (){
        System.out.println("\n[logaritmo_base_10]");
        double opUno = processSpecificOneOp();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.raizCubica(opUno));
    }
    
    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public int processSpecificOneOpInt (){
        int opUno= 0;
        Scanner operandoUno = new Scanner(System.in);
        try{
            System.out.print("Ingresa la base > ");
            opUno = operandoUno.nextInt();
        }catch(Exception e){
            System.out.println("\n\t[error]: Se ha ingresado un operando incorrecto, debe ser un numero entero.\n");
            processSpecificOneOp();
        }
        return opUno;
    }

    ////////////
    public void factorial (){
        System.out.println("\n[factorial]");
        int opUno = processSpecificOneOpInt();
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.factorialRecursivo(opUno));
    }
    

    //////////////////////////////////////////////////////////////////////////////////////////////////////////////
    public void constanteE (){
        System.out.println("\n[constante_e]");
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.constE());
    }
    
    ////////////
    public void constantePI (){
        System.out.println("\n[constante_pi]");
        operaciones operacion = new operaciones();        
        System.out.println("El resultado es: " + operacion.constPI());
    }
    
}
