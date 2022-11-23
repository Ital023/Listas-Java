package Entities;

public class Login {
    private String usuario;
    private String senha;

    public Login(String usuario, String senha) {
        this.usuario = usuario;
        this.senha = senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean fazerLogin(String usuario,String senha){
        try{
            if(usuario.equals(this.usuario) && senha.equals(this.senha)){
                return true;
            }else{
                throw new DomainException("Usuario ou senha incorretos");
            }
        }catch (DomainException e){
            System.out.println(e);
            return false;
        }

    }
}
