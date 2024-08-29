package aula2.receitas_culinarias;

public class Receitas {
    String nome;
    String[] ingredientes;
    String modoDePreparo;
    int tempoDePreparo;
    int quantidade;

    public Receitas(String nome, String[] ingredientes, String modoDePreparo, int tempoDePreparo, int quantidade) {
        this.nome = nome;
        this.ingredientes = ingredientes;
        this.modoDePreparo = modoDePreparo;
        this.tempoDePreparo = tempoDePreparo;
        this.quantidade = quantidade;
    }

    void mostrarReceita() {
        StringBuilder ingredientesSTR = new StringBuilder();
        for(String ingrediente : ingredientes) {
            ingredientesSTR.append(ingrediente).append(", ");
        }
        if(ingredientesSTR.length() > 0){
            ingredientesSTR.setLength(ingredientesSTR.length() - 2);
        }
        System.out.printf("""
                |------------------------------------------------------------------------
                |                       RECEITA DE %s       
                |------------------------------------------------------------------------      
                | Nome: %s                   
                | Ingredientes: %s            
                * Modo de Preparo: %s        
                | Tempo de preparo: %d       
                | Quantidade: %d             
                -------------------------------------------------------------------------                    
                %n""",nome.toUpperCase(),
                nome,
                ingredientesSTR.toString(),
                modoDePreparo,
                tempoDePreparo,
                quantidade
        ).toString();
    }

}
