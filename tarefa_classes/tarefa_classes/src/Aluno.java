public class Aluno {
    private String nome;
    private int idade;
    private String endereco;
    private String curso;

    public void setNome(String nome) {
        this.nome = nome;
    }


    public void setIdade(int idade) {
        this.idade = idade;
    }


    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }

    // Os métodos são simples.

    public void cadastro(){
        System.out.printf("******************************\nDados do aluno:\n" +
                "Nome: %s\n" +
                "Idade: %d\n" +
                "Endereço: %s\n" +
                "Curso: %s\n******************************\n\n", nome, idade, endereco, curso);
    }

    public void fazerTrabalhos() {
        System.out.println("Trabalhos estão sendo feitos");
    }

    public void estudar() {
        System.out.printf("O %s está estudando.", nome);
    }
}