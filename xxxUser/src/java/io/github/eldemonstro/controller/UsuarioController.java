/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.eldemonstro.controller;

import io.github.eldemonstro.bean.Usuario;

/**
 *
 * @author demon
 */
public class UsuarioController {
    public Usuario validaUsuario(Usuario usu) {
        usu.setId("1");
        usu.setStatus("ATIVO");
        usu.setTipo("ADM");
        return usu;
    }
    
    public Usuario insereUsuario(Usuario usu){
        usu.setId("1");
        return usu;
    }
}
