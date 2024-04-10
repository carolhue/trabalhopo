package projetopoo;

import javax.swing.JOptionPane;
import trabalho.UsuarioDAO;
import trabalho.UsuarioDAO;

public class usuarioController {
    private UsuarioDAO usuarioDAO;
           
    public usuarioController() {
        usuarioDAO = new UsuarioDAO();
    }
   
    public boolean autenticar (String email, String senha) {
        if (usuarioDAO.autenticar(email, senha)){
            return true;
        }else {
            JOptionPane.showMessageDialog(null,
                        "Usuario ou senha incorreta");
            return false;
        }
    }
}

