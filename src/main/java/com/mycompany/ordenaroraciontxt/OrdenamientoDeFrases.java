/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ordenaroraciontxt;

//import static com.mycompany.ordenaroraciontxt.LeerArchivoTxt.FraseEnDesorden;
/**
 *
 * @author aleja
 */
public class OrdenamientoDeFrases {
    public void Ordenamiento(String FraseEnDesorden){  
        String aux="";
        String arr[] = FraseEnDesorden.split(" ");
        String FraseOrdenada="Hola mi nombre es Alejandro y me apellido Cruz";
        String arr2[] = FraseOrdenada.split(" ");
        String arr3[] = FraseEnDesorden.split(" ");
   
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr.length; j++){
                if(arr[i].equals(arr2[j])){
                    arr3[j]=arr2[j];
                }
            }
        }

        for(int i=0; i<arr.length; i++){
            aux=aux+arr3[i];
            aux=aux+"-";
        }
        System.out.println(aux);
    }
}
