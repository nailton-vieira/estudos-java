import java.util.ArrayList;
import java.util.List;

public class Principal {

    public static void main(String[] args) {

        Pessoa funcionario = new Pessoa(null, null);

        funcionario.setNome("Marcos");
        funcionario.setEmail("teste");
            


           System.out.println(funcionario);


           List<Pessoa> listaPessoas = new ArrayList<Pessoa>();

           Pessoa listpessoa = new  Pessoa(null, null);
           listpessoa.setNome("nailton");
           listpessoa.setEmail("email1@com");

           listaPessoas.add(listpessoa);

           listpessoa = new  Pessoa(null, null);
           listpessoa.setNome("Lorena");
           listpessoa.setEmail("email2@com");

           listaPessoas.add(listpessoa);

           listpessoa = new  Pessoa(null, null);
           listpessoa.setNome("Rosy");
           listpessoa.setEmail("email3@com");

           listaPessoas.add(listpessoa);

           System.out.println(listaPessoas);

           
        
    }

}
