package model;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


public class conexaoJDBC {
    
    private Connection conexao;
    
    public Connection getConexao() {
        return conexao;
    }
    
    public void conectar() throws SQLException{
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
<<<<<<< HEAD
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/PI5","root","24071195");
=======
            conexao = DriverManager.getConnection("jdbc:mysql://127.0.0.1/pi5","root","24071195");
>>>>>>> 5d9527a (update 1.0.1)
            
        }catch(ClassNotFoundException e){
            
            System.out.println(e);
            
        }
    }
    
     public void desconectar() {
        try {
            if(conexao != null && !conexao.isClosed()) {
                conexao.close();
                System.out.println("DESCONECTADO COM SUCESSO!");
            }
        } catch (SQLException e) {
            System.out.println("Erro ao desconectar");
        }
    }
}
