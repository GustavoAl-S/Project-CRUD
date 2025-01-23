package service;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Usuario;

// Pastas model incluem o modelo de negocio
// Essa camada é responsavel por manipular os dados e aplicar as regras de negocio

public class UsuarioService{
    
    Scanner sc = new Scanner(System.in);

    private List<Usuario> usuarios = new ArrayList<>();

    public void adicionarUsuarios(Usuario usuario){
        usuarios.add(usuario);
        System.out.println("Usuario adicionado com sucesso. \n");
    }

    public List<Usuario> listarUsuarios(){
        return usuarios;
    }

    public void imprimirUsuarios(){

        if (listarUsuarios().isEmpty()) {

            System.out.println("\nNenhum usuário está cadastrado. \n");
        } else {
        
            System.out.println("\nUsuarios cadastrados: ");
            for (Usuario users : listarUsuarios()) {
                System.out.println("ID = " + users.getId());
                System.out.println("Nome = " + users.getNome());
                System.out.println("Email = " + users.getEmail() + "\n");
            }
        }
    }

    public void atualizarUsuario(int id){

        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == id) {

                System.out.println("Digite o novo nome: ");
                String novoNome = sc.nextLine();
                usuarios.get(i).setNome(novoNome);
                
                System.out.println("Digite o novo email: ");
                String novoEmail = sc.nextLine();
                usuarios.get(i).setEmail(novoEmail);
                System.out.println();

                System.out.println("Atualização realizada com sucesso.");
            }
        }
    }

    public void excluirUsuario(int id){

        //.size indica o tamanho do ArrayList
        for (int i = 0; i < usuarios.size(); i++) {
            // estou acessando a lista, e retornando o objeto armazenado na posiçao i
            // e tambem acessando o atributo com getId() e depois comparando com o parametro id para excluir
            if (usuarios.get(i).getId() == id) {
                usuarios.remove(i);
                System.out.println("Usuario excluido com sucesso.");
                break;
            }
        }
    }
}
