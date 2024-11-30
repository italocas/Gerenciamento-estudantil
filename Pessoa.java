// Classe abstrata que representa uma pessoa
public abstract class Pessoa {
  // Atributos protegidos da classe Pessoa
  protected String nome; // Nome da pessoa
  protected int idade;   // Idade da pessoa

  // Construtor da classe Pessoa
  public Pessoa(String nome, int idade) {
      this.nome = nome; // Inicializa o nome da pessoa
      this.idade = idade; // Inicializa a idade da pessoa
  }

  // Método getter para obter o nome da pessoa
  public String getNome() {
      return nome; // Retorna o nome da pessoa
  }

  // Método setter para definir o nome da pessoa
  public void setNome(String nome) {
      this.nome = nome; // Atualiza o nome da pessoa
  }

  // Método getter para obter a idade da pessoa
  public int getIdade() {
      return idade; // Retorna a idade da pessoa
  }

  // Método setter para definir a idade da pessoa
  public void setIdade(int idade) {
      this.idade = idade; // Atualiza a idade da pessoa
  }

  // Método abstrato que deve ser implementado por subclasses para exibir dados
  public abstract void exibirDados();
}