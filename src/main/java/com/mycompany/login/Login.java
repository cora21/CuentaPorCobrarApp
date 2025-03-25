package com.mycompany.login;

import com.mycompany.login.gui.PrincipalLogin;
import com.mycompany.login.persistencia.Conexion;


public class Login {

    public static void main(String[] args) {
       // TEST DE CONEXIÓN
    if (Conexion.getConnection() != null) {
    System.out.println("✅ Conexión lista para usar.");
    } else {
        System.out.println("❌ No se pudo conectar.");
    }
    
    // Abrir login
    PrincipalLogin princ = new PrincipalLogin();
    princ.setVisible(true);
       

    
}
    
}