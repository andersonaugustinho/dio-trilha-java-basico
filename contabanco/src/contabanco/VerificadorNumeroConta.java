package contabanco;

import java.util.Scanner;

public class VerificadorNumeroConta {

	public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in); 
        

        try {
        	verificarNumeroConta(scanner.next());
        	System.out.println("Numero de conta valido.");
		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
			System.out.println("Digite exatamente 8 digitos.");
		}  finally {
            scanner.close();
        }

	}
           


           


             

// 
             
       
    

// Declaração do método verificarNumeroConta, que verifica se o número de conta tem exatamente 8 dígitos:
    private static void verificarNumeroConta(String numeroConta) { 

// TODO: Verifique se o número da conta tem exatamente 8 dígitos:
   
// TODO: Implemente uma exceção do tipo IllegalArgumentException, caso o número de conta não tenha 8 dígitos:
        if(numeroConta.length() != 8) {
        	throw new IllegalArgumentException("Numero de conta invalido.");
    	
    	
        }
    }
	
}
