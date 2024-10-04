
package model;


import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;




public class CarroDAO {
    
    public static boolean cadastrar(Carroinfo c) throws SQLException {

        try {

            conexaoJDBC conexao = new conexaoJDBC();
            conexao.conectar();

            String sql = "INSERT INTO carro(cliente_cpf, marca, modelo, ano, combustivel, cambio, placa, carroceria, cor) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, c.getCliente_cpf());
            query.setString(2, c.getMarca());
            query.setString(3, c.getModelo());
            query.setString(4, c.getAnofab());
            query.setString(5, c.getCombustivel());
            query.setString(6, c.getCambio());
            query.setString(7, c.getPlaca());
            query.setString(8, c.getCarroceria());
            query.setString(9, c.getCor());

            query.execute();

            conexao.desconectar();
            return true;

        } catch (SQLException se) {
            System.out.println(se);
            return false;
        }

    }
      
    public static boolean verificarPlaca(Carrodef cd) throws SQLException{
        try{
         conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();
        
        String sql = "SELECT COUNT(*) FROM carro WHERE placa = ?";
        PreparedStatement query = conexao.getConexao().prepareStatement(sql);
        query.setString(1, cd.getCarro_placa());
        
        ResultSet rs = query.executeQuery();
        
        rs.next();
        
        int count = rs.getInt(1);
        
        rs.close();
        
        if(count == 0){
        JOptionPane.showMessageDialog(null, "Veículo não existente no nosso sistema");
        return false;
        }
        }catch(SQLException se){
            
        }
        return false;
        
    }
    
   public static boolean verificarPlaca2(Carroinfo ci) {
    try {
        conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();
        
        String sql = "SELECT COUNT(*) FROM carro WHERE placa = ?";
        PreparedStatement query = conexao.getConexao().prepareStatement(sql);
        query.setString(1, ci.getPlaca());
        
        ResultSet rs = query.executeQuery();
        
        rs.next();
        
        int count = rs.getInt(1);
        
        rs.close();
        conexao.desconectar(); // Fechar a conexão após o uso
        
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Veículo não existente no nosso sistema");
            return false;
        } else {
            return true; // Retornar true se a placa for encontrada
        }
    } catch (SQLException se) {
        // Lidar com a exceção SQL
        se.printStackTrace(); // Melhor do que apenas suprimir a exceção
        return false;
    }
}
    
    
   public static boolean defeito(Carrodef cd) throws SQLException {
       
    try{
         conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();
        
        String sql = "SELECT COUNT(*) FROM carro WHERE placa = ?";
        PreparedStatement query = conexao.getConexao().prepareStatement(sql);
        query.setString(1, cd.getCarro_placa());
        
        ResultSet rs = query.executeQuery();
        
        rs.next();
        
        int count = rs.getInt(1);
        
        rs.close();
        
        if(count == 0){
        JOptionPane.showMessageDialog(null, "Veículo não existente no nosso sistema");
        return false;
        }
            
            
            
            String sql2 = "INSERT INTO defeito(carro_placa, entrada, descricao, status) VALUES(?,?,?,?)";
              PreparedStatement query2 = conexao.getConexao().prepareStatement(sql2);
              query2.setString(1, cd.getCarro_placa());
              query2.setString(2, cd.getEntrada().toString());
              query2.setString(3, cd.getDesc());
              query2.setString(4, cd.getStatus());
              
              query2.execute();
              
            JOptionPane.showMessageDialog(null, "Defeito registrado");
              
              conexao.desconectar();
              return true;
        
    }catch(SQLException se){
        System.out.println(se);
    }
        return false;
       
}

    public static List<Carrodef> listarHistorico(Carrodef cd) throws SQLException {
        List<Carrodef> listaH = new ArrayList<Carrodef>();

        try {

            verificarPlaca(cd);
            
            conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        
            String sql = "select entrada, descricao, saida from defeito where carro_placa = ? AND saida IS NOT NULL";
        
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            consulta.setString(1, cd.getCarro_placa());
            
            
            
            ResultSet resposta = consulta.executeQuery();
            
            while (resposta.next()) {
                
    Carrodef novoCarro = new Carrodef(); // Criar um novo objeto Carrodef em cada iteração
    novoCarro.setEntrada(resposta.getString("entrada"));
    novoCarro.setDesc(resposta.getString("descricao"));
    novoCarro.setSaida(resposta.getString("saida"));

    listaH.add(novoCarro); // Adicionar o novo objeto à lista
}
            conexao.desconectar();
           
        } catch (SQLException se) {

        }
        return listaH;

    }
    
     public static List<Carroinfo> listarCarro(Carroinfo ci) throws SQLException {
        List<Carroinfo> listaM = new ArrayList<Carroinfo>();

        try {

            verificarPlaca2(ci);
            
            conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        
            String sql = "select * from carro where placa = ?";
        
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            consulta.setString(1, ci.getPlaca());
            
            
            
            ResultSet resposta = consulta.executeQuery();
            
            while (resposta.next()) {
                

                ci.setMarca(resposta.getString("marca"));
                ci.setModelo(resposta.getString("modelo"));
                ci.setAnofab(resposta.getString("ano"));
                ci.setCombustivel(resposta.getString("combustivel"));
                ci.setCambio(resposta.getString("cambio"));
                ci.setCarroceria(resposta.getString("carroceria"));
                ci.setCor(resposta.getString("cor"));
                

                listaM.add(ci);
            }
            conexao.desconectar();
           
        } catch (SQLException se) {

        }
        return listaM;

    }
  
     
   public static boolean Finalizar(Carrodef cd) throws SQLException {

        try {

            //verificarPlaca(cd);
            
            conexaoJDBC conexao = new conexaoJDBC();
            conexao.conectar();

            String sql = "update defeito set status = ?, Saida = ? where carro_placa = ?;";
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, cd.getStatus());
            query.setString(2, cd.getSaida());
            query.setString(3, cd.getCarro_placa());
            
            query.execute();

            conexao.desconectar();
            return true;

        } catch (SQLException se) {
            System.out.println(se);
            return false;
        }

    }
  
   
public static List<Carrodef> listarDescricao(Carrodef cd) throws SQLException {
        List<Carrodef> listaDD = new ArrayList<Carrodef>();

        try {

            
            
            conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        
            String sql = "select descricao from defeito where carro_placa = ? and saida is null";
        
            PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);

            consulta.setString(1, cd.getCarro_placa());
            
            
            
            ResultSet resposta = consulta.executeQuery();
            
            while (resposta.next()) {
                
   
    cd.setDesc(resposta.getString("descricao"));
                
  
   

    listaDD.add(cd); 
}
            conexao.desconectar();
           
        } catch (SQLException se) {

        }
        return listaDD;

    }

public static boolean excluirDefeito(Carroinfo c) throws SQLException {

        try {

            verificarPlaca2(c);
            
            conexaoJDBC conexao = new conexaoJDBC();
            conexao.conectar();

            String sql = "delete from defeito where carro_placa = ?";
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            
            query.setString(1, c.getPlaca());
           
            query.execute();

            
            conexao.desconectar();
            return true;

        } catch (SQLException se) {
            System.out.println(se);
            return false;
        }

    }

public static boolean excluir(Carroinfo c) throws SQLException {

        try {

            conexaoJDBC conexao = new conexaoJDBC();
            conexao.conectar();

            String sql = "delete from carro where placa = ?";
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            
            query.setString(1, c.getPlaca());
           
            query.execute();

            conexao.desconectar();
            return true;

        } catch (SQLException se) {
            System.out.println(se);
            return false;
        }

    }

 public static List<Pendencias> listarPendencias() throws SQLException {
    List<Pendencias> listaP = new ArrayList<Pendencias>();

    try {
        conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        String sql = "SELECT c.placa, c.modelo, d.descricao, d.saida FROM carro c INNER JOIN defeito d ON c.placa = d.carro_placa WHERE d.saida IS NULL;";

        PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
        ResultSet resposta = consulta.executeQuery();

        while (resposta.next()) {
            Pendencias pp = new Pendencias();
            pp.setPlaca(resposta.getString("placa"));
            pp.setModelo(resposta.getString("modelo"));
            pp.setDescricao(resposta.getString("descricao"));
            listaP.add(pp); 
        }
        
        conexao.desconectar();
    } catch (SQLException se) {
        // Tratamento de exceção, se necessário
    }
    
    return listaP;
}

}
    

