public class Funcao {
// sem retorno = tipo de dados com paramentro e sem parametro.
// com retorno = tipo de dados com paramentro e sem parametro.

    // Função sem retorno e sem parametro.
    void mensagem(){
        System.out.println("Função sem retorno e sem parametro");

    }
    // Função sem retorno e com parametro.
    void mensagemPar(String parametro){
        System.out.println("Veja " + parametro);

    }

    // Função com retorno e sem parametro.
    String mensagemRetorno(){
        return "Função com Retorno sem Parametro";
    }
    
    String mensagemRetornoPar(String parametro){
        return "Veja " +parametro;
    }
    // Teste simples de uma fução soma

    int soma(int num01, int num02){
        return num01 + num02;

    }

    public static void main(String[] args) {
        
        new Funcao().mensagem();
        new Funcao().mensagemPar("Essa Função sem retorno e com parametro");
        String x = new Funcao().mensagemRetorno();
        System.out.println(x);
        String p = new Funcao().mensagemRetornoPar("Função com Retorno e com Parametro");
        System.out.println(p);
        int n = new Funcao().soma(10, 15);
        System.out.println(n);

        }
    
}
