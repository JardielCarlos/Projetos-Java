public class Agenda {
    private Pessoa2[] pessoa;
    private int qtde;
    
    public Agenda(int qtde) {
        this.qtde = 0;
        this.pessoa = new Pessoa2[qtde];
    }

    public void add(Pessoa2 novaPessoa){
        if (qtde == pessoa.length){
            System.out.println("Agenda cheia!");
        }
        this.pessoa[this.qtde++] = novaPessoa;
        System.out.println("Pessoa adicionada na agenda!");
    }

    public String getPessoaMaisNova(){
        if (qtde > pessoa.length){
            System.out.println("Agenda cheia!");
        }
        Pessoa2 menor = this.pessoa[0];
        for(Pessoa2 newPessoa: this.pessoa){
            if(newPessoa.getIdade() < menor.getIdade()){
                menor = newPessoa;
            }
        }
        // System.out.println("a Pessoa mais nova é: " + menor.getNome());
        return menor.getNome();
        
    }

    
}
