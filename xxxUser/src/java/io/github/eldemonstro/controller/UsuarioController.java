/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.eldemonstro.controller;

import io.github.eldemonstro.bean.Usuario;
import io.github.eldemonstro.db.UsuarioDao;
import java.sql.SQLException;

/**
 *
 * @author demon
 */
public class UsuarioController {
    public Usuario validaUsuario(Usuario usu) throws SQLException, ClassNotFoundException {
        UsuarioDao usuDao = new UsuarioDao();
        usu = usuDao.validaLogin(usu);
        return usu;
    }
    
    public Usuario inserirUsuario(Usuario usu) {
        usu.setId(1);
        return usu;
    }
}
