package com.example.otimizacao.teste2;

public class Usuario {
    private String login;
    private NivelAcesso nivel;

    public void setLogin(String login) {
        // Elemento novo: Validação. Não aceitamos nomes vazios.
        if (login != null && !login.isEmpty()) {
            this.login = login;
        }
    }

    public Usuario(String login, NivelAcesso nivel) {
        this.login = login;
        this.nivel = nivel;
    }

    public String getLogin() {
        return login;
    }

    public NivelAcesso getNivel() {
        return nivel;
    }

    public void setNivel(NivelAcesso nivel) {
        this.nivel = nivel;
    }
    
}
