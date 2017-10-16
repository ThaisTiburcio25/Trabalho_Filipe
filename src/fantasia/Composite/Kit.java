package fantasia.Composite;


public class Kit implements ProdutoFantasia{
    
    private ProdutoFantasia acessorio1;
    private ProdutoFantasia acessorio2;

    public Kit(ProdutoFantasia acessorio1, ProdutoFantasia acessorio2) {
        this.acessorio1 = acessorio1;
        this.acessorio2 = acessorio2;
    }
       
    public float getPreco(){        
      
        return acessorio1.getPreco() + acessorio2.getPreco();
    }

    @Override
    public String getDescricao() {
        return acessorio1.getDescricao()+" e "+acessorio2.getDescricao();
    }
    
}
