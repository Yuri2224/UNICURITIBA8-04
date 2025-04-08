
/*
 * Autor: Yuri Moreira
 * Data 08.04.2025
 * Propósito: criar uma calculadora simples 
 * com operações basicas em java
 */

 import java.util.Scanner;

 public class aula80425 {
 
     public static void main(String[] args) {
         //declaração de variavel
         Scanner leia = new Scanner(System.in);
         int op, n1, n2, resultado;
         
         //entrada de dados
         System.out.println("Calculadora simples");
         op = 0;
         for(; op !=5 ;) {
             
             switch(op) {
             case 1:                                             //soma
                 System.out.println("\nOPERAÇÃO DE SOMA!");
                 System.out.println("informe o primeiro valor:");
                 n1 = leia.nextInt();
                 System.out.println("informe o valor do divisor");
                 n2 = leia.nextInt();
                 System.out.println("o resultado soma é: " + resultado);
                 if(n2 !=0) {
                     resultado = n1 + n2;
                 }
                 else
                 {
                     System.out.println("divisão por zero impossivel!")
                 }
                 break;
             case 2:                                             //substração
                 System.out.println("\nOPERAÇÃO DE SUBSTRAÇÃO!");
                 break;
             case 3:                                             //multiplicação
                 System.out.println("\nOPERAÇÃO DE MULTIPLICAÇÃO!");
                 break;
             case 4:                                             //divisão
                 System.out.println("\nOPERAÇÃO DE DIVISÃO!");
                 break;
             case 5:                                             //encerra o programa
                 
                 break;
             default:          //CASO O CONTRARIO
                 System.out.println("\nOpção inválida!");
                 System.out.println("Repita a operação!");
             
         }
         System.out.println("\n[1] - SOMAR ");
         System.out.println("[2] - SUBTRAIR");
         System.out.println("[3] - MULTIPLICAR");
         System.out.println("[4] - DIVIDIR");
         System.out.println("[5] - SAIR");
         System.out.println("\nESCOLHA A OPERAÇÃO:");
         op = leia.nextInt();
         
         }
         
         
         //saida dos dados processados
         
         
         
         //saida dos dados processados
         System.out.println("\nPrograma ENCERRADO!");
         System.out.println("OBRIGADO PELA PREFERENCIA!");
         System.out.println("TENHA UM BOM DESCANSO!");
         //Fechamento da leitura do teclado
         leia.close();
  
 
     }
 
 }
 