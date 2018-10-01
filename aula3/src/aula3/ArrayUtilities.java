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
        for (int i = 0; i < array.length; i++) {
            if (i + 1 == array.length) {
                str += array[i];
            } else {
                str += array[i] + ",";
            }
        }
        return str;

    }

    static int maximumOf(int[] array) {
        int contador = array[0];
        for (int i = 0; i < array.length; i++) {
            if (contador < array[i]) {
                contador = array[i];
            }
        }
        return contador;
    }

    static int minimumOf(int[] array) {
        int contador = array[0];
        for (int i = 0; i < array.length; i++) {
            if (contador > array[i]) {
                contador = array[i];
            }
        }
        return contador;
    }

    static int[] copyOf(int[] array) {
        int[] copy = new int[array.length];
        for (int i = 0; i > array.length; i++) {
            copy[i] = array[i];
        }
        return copy;

    }

    static boolean contains(int[] array, int i) {
        boolean contenha = false;
        for (int a = 0; a < array.length; a++) {
            if (array[a] == i) {
                contenha = true;
                break;
            } else {
                contenha = false;
            }
        }
        return contenha;
    }

    static boolean containsDuplicates(int[] array) {
        boolean contenhaDuplicado = false;
        for (int a = 0; a < array.length; a++) {
            for (int b = 1; b < array.length; b++) {
                if (a != b) {
                    if (array[b] == array[a]) {
                        contenhaDuplicado = true;
                        break;
                    }
                }
            }
        }
        return contenhaDuplicado;
    }

    static int indexOf(int[] array, int i) {
        int abc = 0;
        for (int a = 0; a < array.length; a++) {
            if (array[a] == i) {
                abc = a;
                break;
            } else {
                abc = -1;
            }
        }
        return abc; 
 
    }

    static int[] addOf(int value, int[] array) {
        int[] addarray = new int[array.length + 1];
        for (int a = 0; a < array.length; a++) {
            addarray[a] = array[a];
        }
        addarray[addarray.length - 1] = value;
        return addarray;
    }

    static int[] removeOf(int[] array, int value) {
        if(contains(array,value) != true){
            return array;
        }
        int count = 0;
        for(int i = 0; i< array.length;i++){
            count+=(value == array[i])?1:0;
        }
        int[]result = new int[array.length-count];
        
        int y = 0;
        for(int i = 0;i<result.length;i++){
            while(value == array[y]){
                y++;
            }
            result[i]= array[y];
            y++;
        }
        
        return result;
//        int j = 0;
//        int[] removearray = new int[array.length-1];
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] == numero) {
//                removearray[j] = array[i];
//                ++j;
//            }
//        }
//        return removearray;
    }

}
