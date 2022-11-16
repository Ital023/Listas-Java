public class Funcionario {
    private String nome;
    private int codFuncional;
    private double salario;
    private String cargo;

    public Funcionario(String nome, int codFuncional, String cargo) {
        this.nome = nome;
        this.codFuncional = codFuncional;
        this.salario = 1000;
        this.cargo = cargo;
    }

    public Funcionario(String nome, int codFuncional) {
        this.nome = nome;
        this.codFuncional = codFuncional;
        this.salario = 1000;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCodFuncional() {
        return codFuncional;
    }

    public void setCodFuncional(int codFuncional) {
        this.codFuncional = codFuncional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, int codFuncional, double salario, String cargo) {
        this.nome = nome;
        this.codFuncional = codFuncional;
        this.salario = salario;
        this.cargo = cargo;
    }

}
