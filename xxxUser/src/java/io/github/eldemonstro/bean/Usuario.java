/*
 * Aehoo
 */
package io.github.eldemonstro.bean;

/**
 *
 * @author demon
 */
public class Usuario {
    private String id;
    private String login;
    private String senha;
    private String status;
    private String tipo;

    public Usuario(String id, String login, String senha, String status, 
            String tipo) {
        this.id = id;
        this.login = login;
        this.senha = senha;
        this.status = status;
        this.tipo = tipo;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
}
