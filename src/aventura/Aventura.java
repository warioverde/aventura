/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aventura;

import java.util.Scanner;

/**
 *
 * @author tatan
 */
public class Aventura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int fue=0;
        int vit=0;
        int def=0;
        Scanner leer = new Scanner(System.in);
        int eleccionif=0;
        boolean var1=true;
        boolean var2=true;
        boolean var3=true;
        int eleccion;
        while(def <=0 || vit<=0 || fue <=0){
        System.out.println("ingrese fuerza , vitalidad y defensa del personaje");
        
        def=leer.nextInt();
        vit=leer.nextInt();
        fue=leer.nextInt();
                        }
        Personaje seba = new Personaje(fue,vit,def);
        while (var1 || var2 || var3){//se tienen que usar los 3 objetos y el juego acaba
            
            System.out.println("que quire hacer?");
            System.out.println("1.-ver estado");
            System.out.println("2.-caminar");
            eleccion=leer.nextInt();
            switch(eleccion){
                case 1:seba.mostrarEstado();
                break;
                case 2:
                    System.out.println("usted esta caminando ...");
            System.out.println("1.-Hospital");
            System.out.println("2.-Cueva");
            System.out.println("3.-Caverna");
            eleccion=(int)(Math.random()*3+1);
            if(eleccion==1 && var1==true){
                
                
                 Lugar hospital = new Lugar();
                 hospital.descripcion("has entrado en un feo hospital");
                 eleccionif=0;
                 while(eleccionif!=1 && eleccionif!=2){
                 System.out.println("has encontrado una pocion , deseas usarla?");    
                 System.out.println("1.-Si");
                 System.out.println("2.-No");
                 eleccionif=leer.nextInt();
                 }
                 if(eleccionif==2){
                     var1=true;
                     System.out.println("okey");
                 }else{
                     var1=false;
                     Pocion pocionn = new Pocion();
                     vit=2;
                     pocionn.setVit(vit);
                     seba.setVitalidad(pocionn.getVit());
                     
                 }
                 
                 
            }else {
                System.out.println("no hay niun objeto ");
            }
            if(eleccion == 2 && var2==true){
            
            Lugar sotano = new Lugar();
            sotano.descripcion("has entrado en un feo sotano");
                 eleccionif=0;
                 while(eleccionif!=1&&eleccionif!=2){
                 System.out.println("has encontrado una casco , deseas usarlo?");    
                 System.out.println("1.-Si");
                 System.out.println("2.-No");
                 eleccionif=leer.nextInt();
                 }
                 if(eleccionif==2){
                     var2=true;
                     System.out.println("okey");
                 }else{
                     var2=false;
                     Casco casco = new Casco();
                     def=2;
                     casco.setDef(def);
                     seba.setDefensa(casco.getDef());
                     
                 }
        }
             if(eleccion == 3 && var3 == true){
            Lugar cueva = new Lugar();
            cueva.descripcion("estas en una fea cueva");
                 eleccionif=0;   
                 while(eleccionif!=1 && eleccionif!=2){
            System.out.println("has encontrado un esteroide , deseas usarlo?");
                 System.out.println("1.-Si");
                 System.out.println("2.-No");
                 eleccionif=leer.nextInt();
                 }
                 if(eleccionif==2){
                     var3=true;
                     System.out.println("okey");
                 }else{
                     var3=false;
                     Esteroide esteroide = new Esteroide();
                     fue=2;
                     esteroide.setFuerza(fue);
                     seba.setFuerza(esteroide.getFuerza());
                     
                 }
        }
                    ;break;
            }
            
        }     

    } 
    
}
