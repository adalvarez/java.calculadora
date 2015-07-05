
package calculadora;

public class operaciones {
    
    // Operaciones principales
    public int sumaEntero ( int op1, int op2){ return (op1 + op2); }
    public int restaEntero ( int op1, int op2){ return (op1 - op2); }
    public int multiEntero ( int op1, int op2){ return (op1 * op2); }
    public int divisionEntero ( int op1, int op2){ return (op1 / op2); }
    public int moduloEntero ( int op1, int op2){ return (op1 % op2); }
    public float sumaFloat ( float op1, float op2){ return (op1 + op2); }
    public float restaFloat ( float op1, float op2){ return (op1 - op2); }
    public float multiFloat ( float op1, float op2){ return (op1 * op2); }
    public float divisionFloat ( float op1, float op2){ return (op1 / op2); }
    public float moduloFloat ( float op1, float op2){ return (op1 % op2); }
    
    // Operaciones avanzadas
    public double potenciaGenerica (double op1, double op2){ return Math.pow(op1, op2);} // x^y
    public double potenciaCuadrada (double op1){ return Math.pow(op1,2);} // x^2
    public double potenciaCubica (double op1){ return Math.pow(op1,3);} // x^3
    
    public double absoluto ( double op1){ return Math.abs(op1); }  // Valor absoluto de un double
    
    public double redondeo ( double op1){ return Math.round(op1);} // Redondeo
    
    public double coseno (double op1){ return Math.cos(op1);}
    public double seno (double op1){ return Math.sin(op1);}
    public double tangente (double op1){ return Math.tan(op1);}
    // identidades trigonométricas inversas
    public double cosenoInv (double op1){ return Math.acos(op1);}
    public double senoInv (double op1){ return Math.asin(op1);}
    public double tangenteInv (double op1){ return Math.atan(op1);}
    
    public double logNatural (double op1){ return Math.log(op1);} // Logaritmo natural (base e) de op1
    public double logBase10 (double op1){ return Math.log10(op1);} // Logaritmo (base 10) de op1
    
    public double constE (){ return Math.E;}  // Retorna el valor de la constante E
    public double constPI (){ return Math.PI;}  // Retorna el valor de la constante PI
    
    // Funcion factorial recursiva
    private int tempFactorial = 1;
    public int factorialRecursivo (int op1){
        if (op1 == 0 || op1 == 1){ return 1; }
        else{
            tempFactorial = op1 * factorialRecursivo(op1 -1 );
            return tempFactorial;
        }
    }
    
    // Raices --
    public double raziGenerica (double op1, double index)
    { // Raiz generica para cualesquiera dos números enteros
        return Math.pow(Math.E, Math.log(op1)/index);
        //return  Math.pow(op1, 1/index);
    } 
    public double raizCuadrada (double op1){ return Math.sqrt(op1);} // Raiz cuadrada
    public double raizCubica (double op1){ return Math.cbrt(op1);} // Raiz cubica
}
