package socialmedias;

import socialmedias.RedeSocial;

import java.util.ArrayList;

public class Usuario {
    private String nome;
    private String email;
    private ArrayList<RedeSocial> redeSociais;

    public Usuario(String nome, String email, ArrayList<RedeSocial> redeSociais) {
        this.nome = nome;
        this.email = email;
        this.redeSociais = redeSociais;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public ArrayList<RedeSocial> getRedeSociais() {
        return redeSociais;
    }
}
