public class Pessoa {

    private String nome;
    private String email;


    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }


public String getNome() {

    return nome;

}

public String getEmail() {

    return email;

}

public void setNome(String nome) {

    this.nome = nome;
}

public void setEmail(String email) {

    this.nome = email;
}
    

public String toString(){

    return "Nome: " + this.nome + ", Email: " + this.email;
}
    


}
