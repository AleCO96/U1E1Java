/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenaroraciontxt;

import java.io.IOException;

/**
 *
 * @author aleja
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        LeerArchivoTxt leer = new LeerArchivoTxt();
        leer.LecturaDeArchivo();
    }
    
}
