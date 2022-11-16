public class FuncEM extends FuncBasico{
    public FuncEM(String nome, int codFuncional, String escola) {
        super(nome, codFuncional, escola);
        setSalario(super.getSalario() * 1.5);
    }
    public FuncEM(String nome, int codFuncional,String cargo ,String escola) {
        super(nome, codFuncional,cargo,escola);
        setSalario(super.getSalario() * 1.5);
    }
}
