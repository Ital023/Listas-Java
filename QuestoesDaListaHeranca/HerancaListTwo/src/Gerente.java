public class Gerente extends Empregado{
    private String nomeGerencia;

    public Gerente(String nome, int idade, String sexo, double salario, String matricula) {
        super(nome, idade, sexo, salario, matricula);
    }

    public Gerente(String nome, int idade, String sexo, double salario, String matricula, String nomeGerencia) {
        super(nome, idade, sexo, salario, matricula);
        this.nomeGerencia = nomeGerencia;
    }

    public String getNomeGerencia() {
        return nomeGerencia;
    }

    public void setNomeGerencia(String nomeGerencia) {
        this.nomeGerencia = nomeGerencia;
    }

    @Override
    public String toString() {
        return "Gerente {Nome = "+
                getNome() + ", Idade = "+
                getIdade() + ", Matricula = "+
                getMatricula() + ", Nome da gerencia = "+
                nomeGerencia + ", Valor do Inss = "+
                valorInss() + "}";

    }
}
