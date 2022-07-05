public class Exemplar {
  private int codigo;
  private boolean cativa; 
  private boolean emprestada;
  private Livro livro;

  public Exemplar(int codigo, boolean cativa, boolean emprestada, Livro livro){
    this.codigo = codigo;
    this.cativa = cativa;
    this.emprestada = emprestada;
    this.livro = livro;
  }

  public int getCodigo() {
      return codigo;
  }

  public void setCodigo(int codigo) {
      this.codigo = codigo;
  }

  public boolean isCativa() {
      return cativa;
  }

  public void setCativa(boolean cativa) {
      this.cativa = cativa;
  }

  public boolean isEmprestada() {
      return emprestada;
  }

  public void setEmprestada(boolean emprestada) {
      this.emprestada = emprestada;
  }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

}
