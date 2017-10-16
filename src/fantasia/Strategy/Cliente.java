
package fantasia.Strategy;


public class Cliente {
    private ModoDePagamento modoDePagemanto;
    
    public void pagar(){
        modoDePagemanto.pagar();
        
        }
    
    public void setModoDePagamento(ModoDePagamento modoNovo){
        this.modoDePagemanto = modoNovo;
    }
}
