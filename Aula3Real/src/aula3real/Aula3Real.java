/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3real;

/**
 *
 * @author Turma A
 */
public class Aula3Real {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        char original='A';
        int code = (int) original;
        char recovered =(char)code;
        char reco =(char)code;
        System.out.println("Codigo "+code);
        char letter1='c';
        letter1++;
        System.out.println("letter"+letter1);
        char c = 'c';
        System.out.println(c>'a');  
        
        
        final int numberOfLetters= 'z'-'a'+1;
        
        final char[] letters = new char [numberOfLetters];
        
        for (int i=0;i != letters.length;i++){
            letters[i]=(char)('a'+i);
        }
        
        System.out.println( letters);
    
    int number =3;
    increment(number);
     System.out.println("Increment "+number);
     
     int [] numbers ={1,2,3,4};
     incrementFirstOf(numbers);
        
     
}
    public static void increment(int v){
        v++;
             System.out.println("Increment "+v);
        int x=0;
    }
    
    public static void incrementFirstOf(final int[] values){
        values[0]++;
        System.out.println("IncrementFirstOf"+values);
    } 
    
}

