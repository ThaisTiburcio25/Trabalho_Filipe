
package fantasia.Strategy;


public class Cliente {
    private ModoDePagamento modoDePagamento;
    
    public void pagar(){
        modoDePagamento.pagar();
        
        }
    
    public void setModoDePagamento(ModoDePagamento modoNovo){
        this.modoDePagamento = modoNovo;
    }
}
