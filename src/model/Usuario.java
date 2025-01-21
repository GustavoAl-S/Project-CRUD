package model;

// PASTAS MODEL contem classes que representam o modelo dos dados
// Essas classes incluem apenas atributos, getters, setters e construtores.

public class Usuario {

    private int id;
    private String email;
    private String nome;

    
    public Usuario() {

    }
    
    public Usuario(int id, String email, String nome) {
        this.id = id;
        this.email = email;
        this.nome = nome;
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
}
