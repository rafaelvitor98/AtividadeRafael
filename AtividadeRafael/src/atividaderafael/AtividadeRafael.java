
package atividaderafael;

import java.util.Scanner;


public class AtividadeRafael {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
         int objeto;
         int i;
         
         objeto[] objeto = new objeto[5];
         
         System.out.println("1. Cadastrar Valor");
         
         
         
                 
         System.out.println("2. Buscar Maior");
         
         
         
         System.out.println("3. Buscar Menor");
         
         
         
         System.out.println("4. Ler Media");   
         
         
         
         
         System.out.println("5. sair");
         
         
         
         System.out.println("Digite a opcao desejada");
         
         opcao = input.nextInt();
         
         
         if(opcao == 1){
             
             
             for(int i=0; i<5; i++){
                 
             System.out.println("_____Cadastros de Valores____" +(i+1)+"____");
             
             System.out.println("Valor 1: "); float valor1 = input.nextFloat();
         }
          
         }
    }

    private static class objeto {

        public objeto() {
        }
    }
}

