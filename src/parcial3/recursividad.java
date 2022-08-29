
package parcial3;


public class recursividad {
    int a=1;
    public void rec1(){
        System.out.println("Hola "+a);
         if(a<10){
            a++;
            rec1();
        }
        System.out.println("Hola "+a);
     
    }
    
    public void saludo1(){
        System.out.println("Hola, ¿cómo estás?");
        
       
    }
    
    public void tabla(){
        System.out.println("2 * "+a+" ="+2*a);
        if (a<10){
            a++;
            tabla();
        }
    }
    
}
