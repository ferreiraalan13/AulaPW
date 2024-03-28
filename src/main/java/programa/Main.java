package programa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import AulaPW.Produto;

import java.util.Scanner;



public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Digite o codigo de barras:");
            Integer codigoBarra = scanner.nextInt();

            scanner.nextLine(); 

            System.out.println("Nome do produto:");
            String nomeProduto = scanner.nextLine();

            System.out.println("Marca do produto:");
            String marca = scanner.nextLine();

            System.out.println("Quantidade do produto");
            Integer qtd = scanner.nextInt();

            System.out.println("Data de cadastro:");
            String data = scanner.nextLine();

            
            String data2 = scanner.nextLine();
            
            try {
            	Produto p1 = new Produto (codigoBarra, nomeProduto, marca, qtd, data2);
    			EntityManagerFactory emf = Persistence.createEntityManagerFactory("exemplo-jpa");
    			EntityManager em = emf.createEntityManager();
    			em.getTransaction().begin();
    			em.persist(p1);
    			em.getTransaction().commit();
    			em.close();
    			emf.close();
            }catch (Exception e){
            	System.out.println("Erro ao cadastrar tente novamente");
            }
            
            
			
            	
            System.out.println("Deseja cadastrar outro produto? s / n");
            resposta = scanner.nextLine();
            if (resposta.equals("s")) {
                continuar = true;
            } else {
                System.out.println("Programa finalizado com sucesso!");
                break;
            }
        }

        scanner.close();
    }
}