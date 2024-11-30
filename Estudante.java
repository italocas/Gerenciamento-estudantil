// Classe que representa um estudante, que é uma especialização da classe Pessoa
public class Estudante extends Pessoa {
  // Atributo específico da classe Estudante
  private String matricula; // Matrícula do estudante

  // Construtor da classe Estudante
  public Estudante(String nome, int idade, String matricula) {
      super(nome, idade); // Chama o construtor da classe pai (Pessoa) para inicializar nome e idade
      this.matricula = matricula; // Inicializa a matrícula do estudante
  }

  // Método getter para obter a matrícula do estudante
  public String getMatricula() {
      return matricula; // Retorna a matrícula do estudante
  }

  // Método sobrescrito para exibir os dados do estudante
  @Override
  public void exibirDados() {
      // Exibe informações do estudante no console
      System.out.println("Estudante: " + nome + ", Idade: " + idade + ", Matrícula: " + matricula);
  }
}