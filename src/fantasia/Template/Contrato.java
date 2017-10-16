
package fantasia.Template;


public abstract class Contrato {
    
     public void gerarContrato()
	{       
                exportarDados();
                imprimirDados();
                
}
public abstract void exportarDados();
     
public void imprimirDados()
{
       System.out.println("Imprimindo os dados");
   

 }

    
}
