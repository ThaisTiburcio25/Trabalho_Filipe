
package fantasia.Strategy;


public class CreditoEDebito implements ModoDePagamento {

    @Override
    public void pagar() {
       System.out.println("Pagamento em cartao de credito");
    }
    
}
