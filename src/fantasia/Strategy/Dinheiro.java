
package fantasia.Strategy;


public class Dinheiro implements ModoDePagamento {

    @Override
    public void pagar() {
        System.out.println("Pagamento em Dinheiro");
    }
    
    
}
