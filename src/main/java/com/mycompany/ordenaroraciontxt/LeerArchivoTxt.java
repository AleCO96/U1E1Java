/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenaroraciontxt;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author aleja
 */
public class LeerArchivoTxt {
    OrdenamientoDeFrases ordenar=new OrdenamientoDeFrases();
    //static String FraseEnDesorden;
    public void LecturaDeArchivo() throws FileNotFoundException,IOException{
        File archivo=new File ("C:\\Users\\aleja\\Documents\\Frase Desordenada.txt");
        FileReader read= new FileReader(archivo);        
        BufferedReader BR= new BufferedReader(read);
        String linea;
        linea=BR.readLine();
        System.out.println("Hola estas en Lectura");
        //linea=FraseEnDesorden;
        ordenar.Ordenamiento(linea);
        while((linea=BR.readLine())!=null)
           System.out.println(linea);
    }
    public void ErroresTryCatch(){
        try{
            LecturaDeArchivo();
            }catch(FileNotFoundException ex1){
                    System.out.println("No se encontro el archivo");
            }catch(IOException ex2){
                    System.out.println("No se pudo recorrer el archivo");
            }
    }
}
