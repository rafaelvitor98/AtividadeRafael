
package atividaderafael;

import java.util.Scanner;


public class AtividadeRafael {

    public static void main(String[] args) {
        
         Scanner input = new Scanner(System.in);
         
         int objeto;
         int i;
         
         objeto[] objeto = new objeto[5];
         

         opcao = input.nextInt();
         
         
         if(opcao == 1){
             
             
             for(int i=0; i<5; i++){
                 
                 
                  System.out.println("1. Cadastrar Valor");
        System.out.println("2. Buscar Menor");
        System.out.println("3. Buscar Maior");
        System.out.println("4. LEr Media");
        System.out.println("5. Sair:");
    }

    public static void cadastrar(){
        System.out.println("Você entrou no método Cadastrar Valor.");
    }
    
    public static void menor(){
        System.out.println("Você entrou no método Buscar Menor.");
    }
    
    public static void maior(){
        System.out.println("Você entrou no método Buscar Maior.");
    }
    
    public static void media(){
        System.out.println("Você entrou no método Ler Media.");
    }
    
     public static void sair(){
        System.out.println("Você entrou no método Sair.");
    }
    
    public static void main(String[] args) {
        int opcao;
        Scanner entrada = new Scanner(System.in);
        
        do{
            menu();
            opcao = entrada.nextInt();
            
            switch(opcao){
            case 1:
                cadastrar();
                break;
                
            case 2:
                menor();
                break;
                
            case 3:
                maior();
                break;
                
            case 4:
                media();
                break;
                
            case 5:
                sair();
                break;
            
            default:
                System.out.println("Opção inválida.");
            }
        } while(opcao != 0);
    }
                 
                 
                 
             System.out.println(Cadastros de Valores" +(i+1)+"----");
             
             System.out.println("Valor 1:"); float valor1 = input.nextFloat();
         }
          
         }
 
}

