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
public class ArrayUtilities {

    static String toString(int[] array) {
        String str = "";
        for(int i = 0;i<array.length;i++){
            if(i+1==array.length){
                str+=array[i];
            }
            else{
                str+=array[i]+",";
            }
        }
        return str;
        
    }

    static int maximumOf(int[] array) {
        int contador=array[0];
        for (int i=0;i<array.length;i++){
            if(contador<array[i]){
                contador=array[i];
            }
        }
        return contador;
    }

    static int minimumOf(int[] array) {
        int contador=array[0];
        for (int i=0;i<array.length;i++){
            if(contador>array[i]){
                contador=array[i];
            }
        }
        return contador;
    }
    
    
    
    
}
