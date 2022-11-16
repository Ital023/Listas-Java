public class FuncBasico extends Funcionario{
    private String escola;

    public FuncBasico(String nome, int codFuncional, String escola) {
        super(nome, codFuncional);
        this.escola = escola;
        this.setSalario(super.getSalario() * 1.1);
    }

    public FuncBasico(String nome, int codFuncional, String cargo, String escola) {
        super(nome,codFuncional,cargo);
        this.escola = escola;
        this.setSalario(super.getSalario() * 1.1);
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String toString() {
        return "FuncBasico{" +
                "escola='" + escola + '\'' +
                "} " + super.toString();
    }
}
