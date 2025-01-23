package main;

import java.util.Scanner;

import model.Usuario;
import service.UsuarioService;

public class app {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        UsuarioService usuarioService = new UsuarioService();
        Usuario usuarios = new Usuario();

        int id = 1;
        int resposta; 

        do {

            System.out.println(" 1- ADD USER \n 2-LIST USERS \n 3-UPDATE USER  \n 4-DELETE USER \n 5-OUT: ");
            resposta = sc.nextInt();
            sc.nextLine();

            
            switch (resposta) {
                case 1:

                    System.out.println("Digite seu nome: ");
                    usuarios.setNome(sc.nextLine());

                    System.out.println("Digite seu email: ");
                    usuarios.setEmail(sc.nextLine());
                    System.out.println();

                    Usuario usuario = new Usuario(id, usuarios.getEmail(), usuarios.getNome());

                    usuarioService.adicionarUsuarios(usuario);

                    id++;
                    
                    break;
            
                case 2:
                    
                    usuarioService.imprimirUsuarios();
            
                    break;
                
                case 3:

                    System.out.println();
                    System.out.println("Digite o ID do usuario que deseja atualizar: ");
                    usuarios.setId(sc.nextInt());
                    usuarioService.atualizarUsuario(usuarios.getId());
                    System.out.println();
                    break;
                
                case 4:

                    System.out.println();
                    System.out.println("Digite o ID do usuario que deseja excluir: ");
                    usuarios.setId(sc.nextInt());
                    usuarioService.excluirUsuario(usuarios.getId());
                    System.out.println();
                    break;
            
                case 5:

                    System.out.println("Saindo do sistema...");
                    break;
                default:
                    break;
            }

        }while (resposta != 5);
    }   
}

