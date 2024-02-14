public class TipoAbstratoDados {
    int dia, mes, ano;
    int largura, altura;
    int perimetro(){
        return (altura*2)+(largura*2);

    }
    int area(){
        return (largura * altura);
    }

    public static void main(String[] args) {
        TipoAbstratoDados newTDA = new TipoAbstratoDados();
        TipoAbstratoDados newTDA1 = new TipoAbstratoDados();
        newTDA.dia = 24;
        newTDA1.altura = 5;
        newTDA1.largura = 8;

        System.out.println(newTDA.dia);
        System.out.println(newTDA1.area());
        System.out.println(newTDA1.perimetro());

    }
    
}
