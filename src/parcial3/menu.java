
package parcial3;

import java.util.Scanner;

public class menu {
    int menu;
    public void opciones(){
          Scanner tec=new Scanner(System.in);
    int numero1, numero2, r;
    double v1, v2, div;
   
        
        System.out.println("1 para sumar");
            System.out.println("2 para restar");
            System.out.println("3 para multiplicar");
            System.out.println("4 para dividir");
            System.out.println("5 para salir");
           
        
            System.out.println("Escribe un número del menú");
             menu=tec.nextInt();
            
            switch(menu){
                case 1:
                    System.out.println("Ingresa dos números");
                    numero1=tec.nextInt();
                    numero2=tec.nextInt();
                    r=numero1+numero2;
                    System.out.println("La suma es: "+r);
                    break;
                case 2:
                    System.out.println("Ingresa dos números");
                    numero1=tec.nextInt();
                    numero2=tec.nextInt();
                    r=numero1-numero2;
                    System.out.println("La diferencia es: "+r);
                    break;
                case 3:
                    System.out.println("Ingresa dos números");
                    numero1=tec.nextInt();
                    numero2=tec.nextInt();
                    r=numero1*numero2;
                    System.out.println("El producto es: "+r);
                    break;
                case 4:
                    System.out.println("Ingresa dos números");
                    v1=tec.nextDouble();
                    v2=tec.nextDouble();
                    div=v1/v2;
                    System.out.println("El cociente es: "+div);
                    break;
                case 5:
                    System.out.println("Adios");
                    break;
                
                                  
            }
            System.out.println();
            while(menu<5){
                opciones();
            }
   
    }
    
}
