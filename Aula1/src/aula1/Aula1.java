/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula1;

/**
 *
 * @author Turma A
 */
public class Aula1 {
    
    /**public static int PerimetroRectangulo (int altura,int largura)(
            return 0;
    );

    /**
     * @param args the command line arguments
     */
    
 
    public static void main(String[] args) {
        // TODO code application logic here
        int a = 1;
        int b=1;
        int c=1;
        
        
        
        System.out.print("Hello World"+"\n");
        
       double perimetro = CalcularPerimetro(2,2); 
       System.out.println("Perimetro ->"+" "+ perimetro);
       
       double volume = CalcularVolume(2,3,4);
       System.out.println("Volume ->"+" "+ volume);
       
       double Centigrados = CalcularCentigrados(5);
        System.out.println("Farenheit para Centigrados"+" "+Centigrados);
 
       double Tempo = CalcularTempo(a,b,c);
        System.out.println("Os seus valores são:"+" "+a+"H "+b+"Min "+c+"Segundos "+".\n E transformado em segundos é:"+" "+Tempo);
        
       int[] NomeArray = {1,2,3}; 
       
       int ValoresM = CalcularValores (NomeArray);
        System.out.println("O maximo é:"+ValoresM);
        
       int ValoresMinimo = CalcularValoresMinimo (NomeArray);
        System.out.println("O minimo é:"+ValoresMinimo);
        
        double MediaV = CalcularMedia (NomeArray);
        System.out.println("A sua media é:"+MediaV);
      
    }

    private static double CalcularPerimetro(int i, int i0) {
        return(i*2)+(i0*2);
    }
    private static double CalcularVolume(int i, int i0, int i1) {
        return(i*i0*i1);
    }
    private static double CalcularCentigrados(int i) {
        return((i-32)*5/9);
    }
    private static double CalcularTempo(int i, int i0, int i1) {
       return(i*3600)+(i0*60)+i1;
    }

    private static int CalcularValores(int[] NomeArray) {
        int maximo=NomeArray[0];
        for(int i=0;i<NomeArray.length;i++){
            if(maximo<NomeArray[i]){
                maximo=NomeArray[i];
            }
        }
        return maximo;
    }

    private static int CalcularValoresMinimo(int[] NomeArray) {
        int minimo=NomeArray[0];
        for (int i = 0; i > NomeArray.length; i++) {
            if(minimo>NomeArray[i]){
                minimo=NomeArray[i];
            }
        }
        return minimo;
    }

    private static double CalcularMedia(int[] NomeArray) {
        int soma=0;
        for (int i = 0; i < NomeArray.length; i++) {
           soma+=NomeArray[i];
        }
        int x = NomeArray.length;
        return soma/x;
    }
    

   
    
}
