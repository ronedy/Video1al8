/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.

Creando mi primer programa en JAVA

 */
package primerospasoskev;

/**
 *
 * @author Kevin Ronedy Moscoso Espino && Glezz Gonzales
 * 31/07/2018
 */
public class PrimerosPasosKev { //esta sera la primera clase

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //No he creado la clase variables por el simple hecho de
        //que aqui ya tengo el metodo main
        
        System.out.print("Hola kevin, pronto seras un programador de java");
        
        //Video 4:  Estructuras principales Tipo de variables
        //Video 5: Estructuras principales II
        //Video 6: Estructuras principales III: Creacion de variables
        
        int edad=18; //declaracion e inicialización en la misma linea
        
        /*La siguiente instruccion imprime en la consola (System.out) el mensaje
        o valor de la variable edad
        */
        
        System.out.println(edad);
        
        
        //Video 7:// minute 7
        //Operadores en Java: //Aritmeticos y lógicos, incremento y decremento
        
         double a=5;
    double b = 7;
   
    double c = b+a;
    c = b-a;
    c = b*a;
    c = b/a;
    
    c++; //operador incremento
    c--;
   // c+=1;
    
    System.out.println(c);
    
    
    //Video 8::Continuacion del video 7, declaracion de constantes
    //Convertir de centimetros a pulgadas
   final double apulgadas=2.54;
   
  
   
   
   double cm = 6;
   
   double resultado = cm/apulgadas;
   
    System.out.println("En " + cm + " cm hay " + resultado + " pulgadas");
    
    //errores en compilación y en tiempo de ejecución
    
     //iniciar varias variables en la misma lina
  // int operador1, operado2, resultado;
  // operador1=8;
  //operador2=7;
  //resultado = operador1 + operador2;
  //System.out.println(resultado);
        
  //El objeto Math sirve para hacer operaciones matematicas
        
        
    }
    
}
