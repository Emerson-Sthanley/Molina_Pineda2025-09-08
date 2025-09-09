/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package MolinaPienda_08092025;

/**
 *
 * @author UFG
 */

import java.util.Scanner;
public class Main {
    
    
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //TAMAÑO DEL ARREGLO
        int cantidad_elementos = 5;
        //CREACIÓN E INSTANCIÓN DEL ARREGLO DE NÚMEROS DESORDENADOS
        int [] numeros_desordenados = new int[cantidad_elementos];
        
        //CREACIÓN E INSTANCIA DE ARREGLO DE NÚMEROS ORDENADOS
        int [] numeros_ordenados = new int [cantidad_elementos];
        
        //CREACIÓN E INSTANCIA DEL ONJETO SCANNER
        Scanner scanner = new Scanner(System.in);
        
        //NOTIFICACIÓN DEL USUARIO PARA INDECARLE QUE DEBE INGRESAR VALORES ENTEROS
        System.out.println("Por favor ingrese "+ cantidad_elementos+ " numeros enteros de manera desordenada");
        
        //SE RECORRE EL ARREGLO D
        for(int i = 0; i<numeros_desordenados.length; i++){
            
            System.out.print("Digite el elementos: "+(i+1)+ " : ");
            
            numeros_desordenados[i] = scanner.nextInt();
        }
       
        //IMPRIME UNA SALIDA AL USUARIO PARA MOSTRAR LO QEU HA DIGITADO
        System.out.println("Usted digito los siguiente números: ");
        
        //SE RECORRE EL ARREGLO DE VALORES DIGITADOS
        for(int j = 0; j<numeros_desordenados.length; j++){
            
            //SE IMPRIME LOS NÚMEROS DIGITADOS POR EL USUARIO
            //ALMACENA EN EL ARREGLO DE NÚMEROS DESORDENADOS
            System.out.print(numeros_desordenados[j]+" ");
        }
        //REALIZAMOS UN SALTO DE LINEA
        System.out.println();
        
        //INVOCAMOS LA FÚNCIÓN PARA ORDENAR EL ARREGLO
        numeros_ordenados = ordenar(numeros_desordenados);
        
        //IMPRIMIMOS LA SALIDA AÑ USURAIO
        System.out.print("Los ordenaados son: ");
        
        //SE RECORRE EL ARREGLO PARA ONTENER CADA VALOR
        //DEL ARREGLO ORDENDADO
        for(int k =0; k<numeros_ordenados.length; k++){
            
           //SE IMPRIME EL VALOR DE CADA ELEMENTO
            System.out.println(numeros_ordenados[k]+"");
        }
        
        
    }
    
    //FUNCIÓN PARA ORDENAR UN ARREGLO UNIDIMENCIONAL
    public static int[] ordenar(int [] arreglo){
        
        //SE RECORRE EL ARREGLO PARA EVALUAR CADA POSICIÓN
        for(int i=0; i<arreglo.length - 1 ; i++){
        
            
             System.out.println(arreglo[i]);

             //SE HACE UN SEGUNDO RECORRIDO PARA PODER COMPARAR
             //LA POSICIÓN ACTUAL CON LA POSICIÓN SIGUIENTE
            for(int j = 0; j<arreglo.length - 1; j++){
                
               //SE EVALUA EL VALOR DE CADA ELEMENTO 
               //EN EL ARREGLO
                if(arreglo [j]> arreglo[j+1]){
                    
                // SI ES MAYOR, SE CREA UNA VARIABLE PARA ALMACENAR EL VALOR
               //DEL ELEMENTO MAYOR
                    int mayor = arreglo[j];
                    
                    
                    //SE CAMBIA LA POSICIÓN DEL ELEMENTO ACTUAL
                    arreglo[j] = arreglo[j+1];
                    
                    //SE INTERCAMBIA LA POSICIÓN DEL SIGUIENTE ELEMENTO
                    //ASIGNANDO EL VALOR MAYOR
                    arreglo[j+1] = mayor;
                    
                }
                
            }
            
        }
        //System.out.println();
        
        return arreglo;
    }
    
    
    
}
