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

    this.email = email;
}


@Override
public String toString() {
    return "Pessoa [nome=" + nome + ", email=" + email + "]";
}

    
/*
import java.util.Date;
import java.util.Objects;

public class Pessoa {
    public Pessoa(String nome, String cpf, String apelido, Date     dataNascimento, int idade) {
        this.nome = nome;
        this.cpf = cpf;
        this.apelido = apelido;
        this.dataNascimento = dataNascimento;
        this.idade = idade;
    }
    private String nome;
    private String cpf;
    private String apelido;
    private Date dataNascimento;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getApelido() {
        return apelido;
    }

    public void setApelido(String apelido) {
        this.apelido = apelido;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return idade == pessoa.idade &&
                Objects.equals(nome, pessoa.nome) &&
                Objects.equals(cpf, pessoa.cpf) &&
                Objects.equals(apelido, pessoa.apelido) &&
                Objects.equals(dataNascimento, pessoa.dataNascimento);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, cpf, apelido, dataNascimento, idade);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", cpf='" + cpf + '\'' +
                ", apelido='" + apelido + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", idade=" + idade +
                '}';
    }
}
*/




}
