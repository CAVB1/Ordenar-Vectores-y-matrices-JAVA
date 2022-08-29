package parcial3;
import java.util.Scanner;
public class menoramayor {
    Scanner tec=new Scanner (System.in);
    public void ordenar(){
        
        int arreglo[], temporal;
        System.out.println("Escriba el número de espacios para el vector");
        int tamano=tec.nextInt();
        arreglo=new int[tamano];
        
        for(int i=0; i<arreglo.length; i++){
            System.out.println("Escriba un número para la posición "+i+" del vector");
            arreglo[i]=tec.nextInt();
        }
        
        for(int m=0; m<arreglo.length;m++){
            for(int h=0; h<arreglo.length; h++){
                if(arreglo[m]>arreglo[h]){
                    temporal=arreglo[m];
                    arreglo[m]=arreglo[h];
                    arreglo[h]=temporal;
                }
            }
        }
        
        System.out.println("A continuación, el vector ordenado de menor a mayor");
        for(int i=0; i<arreglo.length; i++){
            System.out.print(" ( "+arreglo[i]+" )");
        }     
    
        
    }
    
    public void ordenarmatrix(){
        int matrix[][], temp;
        
        System.out.println("Escribe dos númemros para las dimensiones de la matriz");
        int filas=tec.nextInt();
        int columnas=tec.nextInt();
        
        matrix= new int[filas][columnas];
        
        for(int i=0; i<filas; i++){
            for(int z=0; z<columnas; z++){
                System.out.println("Escriba un número para la posición "+i+z+" de la matriz");
                matrix[i][z]=tec.nextInt();
            }
        }
        
        
        for(int i=0; i<filas; i++){
            for(int z=0; z<columnas; z++){
                for(int m=0; m<filas; m++){
                    for(int n=0; n<columnas; n++){
                        
                       if(matrix[i][z]<matrix[m][n]){
                           temp=matrix[i][z];
                           matrix[i][z]=matrix[m][n];
                           matrix[m][n]=temp;
                       }
                
            }
        }
            }
        }
        
        
        System.out.println("Matriz ordenada de menor a mayor");
        for(int i=0; i<filas; i++){
            for(int z=0; z<columnas; z++){
                System.out.print("( "+matrix[i][z]+" )");
            }
        }
        
    }
    
}
