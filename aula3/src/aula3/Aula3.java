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
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here 
        int resultado = NumericalUtilities.powerOf(2,4);
        System.out.println("O seu resultado é:"+resultado);
        
        int somaNatural = NumericalUtilities.sumOfNaturalNumbersUpto(20);
        System.out.println("O seu resultado é:"+somaNatural);
        
        int somaBetween = NumericalUtilities.sumOfNaturalNumbersUpto(2,7);
        System.out.println("O seu resultado é:"+ somaBetween);
        
        int somaParesBetween = NumericalUtilities.sumOfNaturalNumbersBetween(2,7);
        System.out.println("O seu resultado é:"+ somaParesBetween);
        
        int numberOfDivisiors = NumericalUtilities.sumOfNumberOfDivisor(12);
        System.out.println("O seu resultado é:"+ numberOfDivisiors);
        
       boolean isPrime = NumericalUtilities.sumOfNumberOfPrimos(7);
        if(isPrime == true){
            System.out.println("O seu resultado é verdadeiro");
        }
        else{
            System.out.println("O seu resultado é falso.");
        }
        
        
        
        int[] array = {7,2,3,4,5,6,1};
        String str = ArrayUtilities.toString(array);
        System.out.println("String: " + str);
        
        int max = ArrayUtilities.maximumOf(array);
        System.out.println("String Max: " + max);
        
        int min = ArrayUtilities.minimumOf(array);
        System.out.println("String Min: " + min);
        
        int copy = ArrayUtilities.copyOf(array);
        System.out.println("Copy");
                
    }
   
    
    
    
}
