package fantasia;

import fantasia.Composite.Kit;
import fantasia.Composite.ProdutoFantasia;
import fantasia.Composite.Simples;
import fantasia.State.EstadoFantasia;
import fantasia.State.Fantasia;
import fantasia.Strategy.Cliente;
import fantasia.Strategy.Dinheiro;
import fantasia.Template.Contrato;
import fantasia.Template.ContratoHTML;

public class Projeto_Fantasia {

    public static void main(String[] args) {
       //STATE 
       Fantasia fantasia = new Fantasia();
       fantasia.trocarEstado(new EstadoFantasia());
       fantasia.disponivel();
       //STRATEGY 
       Cliente cliente = new Cliente();
         cliente.setModoDePagamento(new Dinheiro());
         cliente.pagar();
         
        //COMPOSITE
        ProdutoFantasia Vestido = new Simples ("A Fantasia contem Vestido de Princesa",100);
        ProdutoFantasia Coroa = new Simples ("Coroa",25);        
        ProdutoFantasia Luvas = new Simples ("Luvas",20);       
        ProdutoFantasia KitPrincesaLuxo = new Kit (Vestido,Coroa);        
        ProdutoFantasia KitPrincesa = new Kit(Coroa, Luvas);
        
        
        System.out.println(KitPrincesaLuxo.getDescricao());
        System.err.println("Total: " +KitPrincesaLuxo.getPreco());
        
         //TEMPLATE
         
        Contrato contrato = new ContratoHTML();
        contrato.gerarContrato();
       

    }
    
}
