public class Funcionario {
    private int codigo, idade;
    private String cpf, endereco, telefone, nome;
    private double salario;

    public Funcionario(int codigo, int idade, String cpf, String endereco, String telefone, double salario, String nome){
        this.codigo = codigo;
        this.idade = idade;
        this.cpf= cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.salario = salario;
        this.nome = nome;
    }

    public int getCodigo(){
        return codigo;
    }
    
    public void setCodigo(int codigo){
        this.codigo = codigo;
    }

    public int getIdade(){
        return idade;
    }

    public void setIdade(int idade){
        this.idade  = idade;
    }

    public String getCpf(){
        return cpf;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    
    public double calculaSalarioLiquido(){
        return salario - (salario * 11)/100;
    }
    
    public String toString(){
        return "Nome: " + nome + "\nIdade: " + idade + "\nCPF: " + cpf + "\nEndereco: " + endereco + "\nTelefone: " + telefone + "\nSalário: " + calculaSalarioLiquido() + "\nCodigo: "+ codigo;
    }

    

}
