
package fantasia.State;

public class EstadoFantasia implements Estado {

    @Override
    public void alugada() {
         System.out.println("A fantasia esta alugada para esta data");
    }

    @Override
    public void disponivel() {
         System.out.println("A fantasia esta disponivel para esta data");
        
    }
    
}
