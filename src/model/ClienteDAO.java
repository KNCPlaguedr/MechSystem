
package model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
<<<<<<< HEAD
import static model.CarroDAO.verificarPlaca;
=======

>>>>>>> 5d9527a (update 1.0.1)

public class ClienteDAO {
    
    public static boolean cadastrar(Clienteinfo c) throws SQLException {
        
        try{
            
            conexaoJDBC conexao = new conexaoJDBC();
            conexao.conectar();
            
            String sql = "INSERT INTO cliente(nome, sobrenome, cep, rua, numero, estado, cidade, cpf, telefone) VALUES(?,?,?,?,?,?,?,?,?)";
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, c.getNome());
            query.setString(2, c.getSobrenome());
            query.setString(3, c.getCep());
            query.setString(4, c.getRua());
            query.setString(5, c.getNumero());
            query.setString(6, c.getEstado());
            query.setString(7, c.getCidade());
            query.setString(8, c.getCpf());
            query.setString(9, c.getTelefone());
            
            query.execute();
            
            conexao.desconectar();
            return true;
             
        }catch(SQLException se){
            System.out.println(se);
            return false;
        }
        
        
    }
    
    
    public static boolean adicionar(ClienteInfoNovoVeiculo c) throws SQLException{
        
        try{
            conexaoJDBC conexao = new conexaoJDBC();
            conexao.conectar();
            
            String sql = "SELECT * FROM cliente WHERE nome=? AND sobrenome=? AND cpf=?";
            PreparedStatement query = conexao.getConexao().prepareStatement(sql);
            query.setString(1, c.getNome());
            query.setString(2, c.getSobrenome());
            query.setString(3, c.getCpf());
            
            ResultSet rs = query.executeQuery();
            
            if(rs.next()){
                return true;
            }else{
                JOptionPane.showMessageDialog(null, "Usuário não encontrado");
                return false;
            }
            
            
        }catch(SQLException e){
            
        }
        return false;
        
        
    }
    
    
     public static boolean verificarPlaca3(listarDono ci) {
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
    
    
     public static List<listarDono> listarDono(listarDono ci) throws SQLException {
    List<listarDono> listaD = new ArrayList<listarDono>();

    try {
        
        verificarPlaca3(ci);
        
        conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        String sql = "SELECT cliente.nome, cliente.telefone, cliente.cep FROM cliente INNER JOIN carro ON cliente.cpf = carro.cliente_cpf WHERE carro.placa = ?";
        PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
        consulta.setString(1, ci.getPlaca());

        ResultSet resposta = consulta.executeQuery();

        while (resposta.next()) {
            listarDono novoDono = new listarDono(); // Cria um novo objeto para cada linha
            novoDono.setNome(resposta.getString("nome"));
            novoDono.setTelefone(resposta.getString("telefone"));
            novoDono.setCep(resposta.getString("cep"));

            listaD.add(novoDono); // Adiciona o novo objeto à lista
        }
        conexao.desconectar();
    } catch (SQLException se) {
        // Tratamento de exceção
    }
    return listaD;
}

     public static List<Clienteinfo> listarCliente() throws SQLException {
    List<Clienteinfo> listaC = new ArrayList<Clienteinfo>();

    try {
       
        conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        String sql = "select * from cliente";
        PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
        
        ResultSet resposta = consulta.executeQuery();

        while (resposta.next()) {
            Clienteinfo c = new Clienteinfo(); // Cria um novo objeto para cada linha
            c.setNome(resposta.getString("nome"));
            c.setSobrenome(resposta.getString("sobrenome"));
            c.setCep(resposta.getString("cep"));
            c.setRua(resposta.getString("rua"));
            c.setNumero(resposta.getString("numero"));
            c.setEstado(resposta.getString("estado"));
            c.setCidade(resposta.getString("cidade"));
            c.setCpf(resposta.getString("cpf"));
            c.setTelefone(resposta.getString("telefone"));
            

            listaC.add(c); // Adiciona o novo objeto à lista
        }
        conexao.desconectar();
    } catch (SQLException se) {
        // Tratamento de exceção
    }
    return listaC;
}

     public static Clienteinfo buscarPorCPF(String CPF){
        Clienteinfo ci = new Clienteinfo();
        
       try {
       
        conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();

        String sql = "select * from cliente where cpf = ?";
        PreparedStatement consulta = conexao.getConexao().prepareStatement(sql);
        consulta.setString(1, CPF);
        
        
        ResultSet resposta = consulta.executeQuery();

        if (resposta.next()) {
          
            ci.setNome(resposta.getString("nome"));
            ci.setSobrenome(resposta.getString("sobrenome"));
            ci.setCep(resposta.getString("cep"));
            ci.setRua(resposta.getString("rua"));
            ci.setNumero(resposta.getString("numero"));
            ci.setEstado(resposta.getString("estado"));
            ci.setCidade(resposta.getString("cidade"));
            ci.setCpf(resposta.getString("cpf"));
            ci.setTelefone(resposta.getString("telefone"));
            

             
        }
        conexao.desconectar();
        
    } catch (SQLException se) {
       
    }
    return ci;
    }
     
     private static String cpfAntigo(){
         String cpfinho;
         Idcpfcliente id = new Idcpfcliente();
         cpfinho = id.getCpf();
         
        return cpfinho;
     }
     
     private static String cpf = cpfAntigo();
     
     
    public static boolean atualizar(Clienteinfo c, String cpfAntigo) throws SQLException {
    try {
        conexaoJDBC conexao = new conexaoJDBC();
        conexao.conectar();
        
        String sql = "UPDATE cliente SET nome = ?, sobrenome = ?, cep = ?, rua = ?, numero = ?, estado = ?, cidade = ?, cpf = ?, telefone = ? WHERE cpf = ?;";
        PreparedStatement query = conexao.getConexao().prepareStatement(sql);
        
        query.setString(1, c.getNome());
        query.setString(2, c.getSobrenome());
        query.setString(3, c.getCep());
        query.setString(4, c.getRua());
        query.setString(5, c.getNumero());
        query.setString(6, c.getEstado());
        query.setString(7, c.getCidade());
        query.setString(8, c.getCpf());
        query.setString(9, c.getTelefone());
        query.setString(10, cpfAntigo); // Aqui você deve usar o cpfAntigo passado como parâmetro
        
        query.executeUpdate(); // Use executeUpdate() para operações de atualização
        
        conexao.desconectar();
        return true;
    } catch(SQLException se) {
        System.out.println(se);
        return false;
    }
}
     
     
}
