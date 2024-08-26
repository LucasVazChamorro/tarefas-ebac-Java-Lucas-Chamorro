public class AlunoPrincipal {
    public static void main(String[] args) {
       Aluno aluno1 = new Aluno();
       aluno1.setNome("Lucas Chamorro");
       aluno1.setEndereco("Avenida Taquarituba");
       aluno1.setIdade(30);
       aluno1.setCurso("Full stack Java");

       aluno1.cadastro();
       aluno1.fazerTrabalhos();
       aluno1.estudar();

    }
}
