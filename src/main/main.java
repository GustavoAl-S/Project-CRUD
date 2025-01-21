package main;
import java.util.Scanner;

import model.Usuario;
import service.UsuarioService;

public class main {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        UsuarioService usuarioService = new UsuarioService();

        //Criando usuario
        System.out.println("Digite seu nome: ");
        String nome = sc.nextLine();
        System.out.println("Digite seu email: ");
        String email = sc.nextLine();

        Usuario usuario1 = new Usuario(1, email, nome);
        System.out.println();

        System.out.println("Digite seu nome: ");
        String nome2 = sc.nextLine();
        System.out.println("Digite seu email: ");
        String email2 = sc.nextLine();
        
        Usuario usuario2 = new Usuario(2, email2, nome2);

        //Adicionando o usuario a List
        System.out.println();
        usuarioService.adicionarUsuarios(usuario1);
        usuarioService.adicionarUsuarios(usuario2); 

        //Listando os dados cadastrados
        usuarioService.imprimirUsuarios();

        //Atualizando usuario
        System.out.println("Digite o ID do usuario que deseja atualizar: ");
        int id = sc.nextInt();
        usuarioService.atualizarUsuario(id);

        //Listando os usuarios apos atualizaçao
        usuarioService.imprimirUsuarios();

        // Excluindo usuarios
        System.out.println("Digite o ID do usuario que deseja excluir: ");
        int idExcluir = sc.nextInt();
        usuarioService.excluirUsuario(idExcluir);
        System.out.println();

        //Listando os usuarios depois de excluir um Usuario
        usuarioService.imprimirUsuarios();
        
    }
}
