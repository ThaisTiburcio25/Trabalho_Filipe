
package fantasia.State;


public class Fantasia {
 
    private Estado estadoAtual;
    
    public void trocarEstado(Estado novoEstado){
        this.estadoAtual = novoEstado;
    }
    
    public void alugada(){
        estadoAtual.alugada();
    }
    public void disponivel(){
        estadoAtual.disponivel();
    }
    
}