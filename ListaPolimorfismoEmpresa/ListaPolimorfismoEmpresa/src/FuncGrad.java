public class FuncGrad extends FuncEM{
    private String universidade;

    public FuncGrad(String nome, int codFuncional, String escola, String universidade) {
        super(nome, codFuncional, escola);
        this.universidade = universidade;
        setSalario(super.getSalario()*2);
    }
    public FuncGrad(String nome, int codFuncional,String cargo ,String escola,String universidade) {
        super(nome, codFuncional,cargo,escola);
        this.universidade = universidade;
        setSalario(super.getSalario()*2);
    }


    public String getUniversidade() {
        return universidade;
    }

    public void setUniversidade(String universidade) {
        this.universidade = universidade;
    }
}
