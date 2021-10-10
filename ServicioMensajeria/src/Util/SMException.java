/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Util;

public class SMException extends Exception {
      private String detalle;
      private String clase;
      /**
       * M�todo constructor que recoge la descripción del 
       * error que genero la excepción.
       * 
       * @param error
       *        cadena que contiene la descripción del error.
       */

      public SMException(String clase,String error) {
        super(error);
        this.clase = clase; 
        detalle = error;
      }

      public String toString() {
        return "["+clase+"] "+detalle;
      }
 }
