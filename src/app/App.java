package app;


import java.util.Scanner;
/**
 * Leia um valor inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste de dois inteiros X e Y. Você deve apresentar a soma de todos os ímpares existentes entre X e Y.

Entrada
A primeira linha de entrada é um inteiro N que é a quantidade de casos de teste que vem a seguir. Cada caso de teste consiste em uma linha contendo dois inteiros X e Y.

Saída
Imprima a soma de todos valores ímpares entre X e Y.
 */

public class App {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
       
        int x,y;
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
       int total=0;
        x =sc.nextInt();
        y =sc.nextInt();
        if(x> y){
            for(int j = x-1; j> y;j--){
                if(j%2 !=0){
                    total+=j;
                }
            }
        } else if (x<y){
            for (int j = x +1;j< y; j++){
                if(j%2!=0){
                    total +=j;
                }
            }
        }else{
            total=0;
        }
        
        System.out.print(total+"\n");
        

     sc.close();
     }
  }
}