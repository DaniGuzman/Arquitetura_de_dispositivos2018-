/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

/**
 *
 * @author Turma A
 */
public class NumericalUtilities {

    public static int powerOf(int base, int expoente) {
      int resultado =1;
        for(int a=0;a<expoente;a++){
          resultado*=base;
      }
        return resultado;
    }

    public static int sumOfNaturalNumbersUpto(int valor) {
        int result=0;
        for (int valorFor = 0; valorFor<=valor;valorFor++){
            result+=valorFor;
        }
        return result;
    }

    public static int sumOfNaturalNumbersUpto(int valor1, int valor2) {
        int result=0;
      for(int valor=valor1; valor <= valor2; valor++){
          result+=valor;
      }
        return result;
    }

    static int sumOfNaturalNumbersBetween(int numero1, int numero2) {
        int result=0;
        for(int valor=numero1;valor<=numero2;valor++){
            if (valor%2 == 0)
            result+=valor;
           
        }
        return result;
    }

    static int sumOfNumberOfDivisor(int numero) {
        int result=0;
        for(int contador=1 ;contador<=numero;contador++){
            if(numero%contador == 0){
                result+=1;
            }
    }
        return result;
    }

    static boolean sumOfNumberOfPrimos(int numero) {
        if(sumOfNumberOfDivisor(numero)==2){
            return true;
        }
        else{
            return false;
        }
    }
    
    
    
    
}
