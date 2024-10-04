
package model;

import com.mysql.cj.xdevapi.Result;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class UsuarioDAO {
  public static boolean login(Usuario u) throws SQLException {
    try {
        conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        String sql = "SELECT * FROM usuario WHERE login=? AND senha=?";
        PreparedStatement query = conexao.getConexao().prepareStatement(sql);
        query.setString(1, u.getLogin());
        query.setString(2, u.getSenha());

        ResultSet rs = query.executeQuery();

        if (rs.next()) {
            JOptionPane.showMessageDialog(null, "Bem-vindo(a) ao Sistema Gerenciador de Oficinas");
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Tente novamente");
            return false;
        }
    } catch (SQLException se) {
        System.out.println(se);
        return false;
    }
}

    
}
