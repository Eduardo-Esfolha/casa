
package personagem;

import java.util.Scanner;


public class inventario extends atributo {
    
    Scanner teclado =  new Scanner (System.in);
   
    private boolean espada ;
    private boolean pocao;
    private boolean armadura;
    private boolean ervasmedicinais;
    private boolean energeticos;
    
    public void inicio(){
        System.out.println("ola!!!!!!!!!"
                + "\nsua missão hoje é deixar seu mago com 10 de magia e 10 de defesa");

        System.out.println("\n\naperte a tecla 'enter' para começar ");
        String resposta = teclado.nextLine();

        System.out.println("voce quer seleciona qual classe?"
                + " mago(1)"
                + "arqueiro(2)"
                + "guerreiro(3)");
        String resposta2 = teclado.nextLine();
        
    }
    
    
    
    public void mago(){
        
    }
    
    public void arqueiro(){
        System.out.println("PENSE MELHORRRRRRR!!!!!");
        
    }
    
    
    
    
    
}
