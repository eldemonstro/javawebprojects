/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.eldemonstro.db;

import io.github.eldemonstro.util.ConexaoDB;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import io.github.eldemonstro.bean.Usuario;

/**
 *
 * @author ProfAlexandre
 */
public class UsuarioDao {

    private final Connection c;
    
    public UsuarioDao() throws SQLException, ClassNotFoundException{
        this.c = new ConexaoDB().getConnection();
    }
    
    /*
    public Usuario busca(Usuario usu) throws SQLException{
        String sql = "select * from usuarios WHERE id = ?";
        
        // seta os valores
        try ( // prepared statement para inserção
             PreparedStatement stmt = this.c.prepareStatement(sql)) {
            // seta os valores
            stmt.setInt(1,usu.getId());
            // executa
            ResultSet rs = stmt.executeQuery();
            
            while (rs.next()) {
                // criando o objeto Usuario
                usu.setId(rs.getInt(1));
                usu.setNome(rs.getString(2));
                usu.setLogin(rs.getString(3));
                usu.setSenha(rs.getString(4));
                usu.setStatus(rs.getString(5));
                usu.setTipo(rs.getString(6));
                // adiciona o usu à lista de usus
            }
        }
        return usu;
    }
    
    public List<Usuario> lista(Usuario usuEnt) throws SQLException{
         // usus: array armazena a lista de registros
        List<Usuario> usus = new ArrayList<Usuario>();
        
        String sql = "select * from usuarios where nome like ?";
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,"%" + usuEnt.getNome() + "%");
        
        ResultSet rs = stmt.executeQuery();
        
        while (rs.next()) {      
            // criando o objeto Usuario
            Usuario usu = new Usuario();
            usu.setId(rs.getInt(1));
            usu.setNome(rs.getString(2));
            usu.setLogin(rs.getString(3));
            usu.setSenha(rs.getString(4));
            usu.setStatus(rs.getString(5));
            usu.setTipo(rs.getString(6));
            // adiciona o usu à lista de usus
            usus.add(usu);
        }
        
        rs.close();
        stmt.close();
        return usus;
        
    }
    
    public Usuario inseri(Usuario usu) throws SQLException{
        String sql = "insert into usuarios" + " (nome, login, senha, status, tipo)" + " values (?,?,?,?,?)";
    
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,usu.getNome());
        stmt.setString(2,usu.getLogin());
        stmt.setString(3,usu.getSenha());
        stmt.setString(4,usu.getStatus());
        stmt.setString(5,usu.getTipo());
        // executa
        stmt.execute();
        stmt.close();
        return usu;
    }
    
    public Usuario exclui(Usuario usu) throws SQLException{
        String sql = "delete from usuarios WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setInt(1,usu.getId());
        // executa
        stmt.execute();
        stmt.close();
        c.close();
        return usu;
    }
    
    public Usuario altera(Usuario usu) throws SQLException{
        String sql = "UPDATE usuarios SET nome = ?, login = ?, senha = ?, status = ?, tipo = ? WHERE id = ?";
        // prepared statement para inserção
        PreparedStatement stmt = c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,usu.getNome());
        stmt.setString(2,usu.getLogin());
        stmt.setString(3,usu.getSenha());
        stmt.setString(4,usu.getStatus());
        stmt.setString(5,usu.getTipo());
        stmt.setInt(6,usu.getId());
        // executa
        stmt.execute();
        stmt.close();
        return usu;
    }
*/
    
    public Usuario validaLogin(Usuario usu) throws SQLException{
        String sql = "select * from usuarios WHERE login = ? AND senha = ?";
        // prepared statement para inserção
        PreparedStatement stmt = this.c.prepareStatement(sql);
        // seta os valores
        stmt.setString(1,usu.getLogin());
        stmt.setString(2,usu.getSenha());
        // executa
        ResultSet rs = stmt.executeQuery();

        while (rs.next()) {      
            // criando o objeto Usuario
            usu.setId(rs.getInt(1));
            usu.setLogin(rs.getString(2));
            usu.setSenha(rs.getString(3));
            usu.setStatus(rs.getString(4));
            usu.setTipo(rs.getString(5));
            usu.setNome(rs.getString(6));
            // adiciona o usu à lista de usus
        }
        
        stmt.close();
        return usu;
    }
    
}
