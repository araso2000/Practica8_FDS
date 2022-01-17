package strategy;

public class Ordenador {
 
    Ordenar orden;
    
    public void setOrden(Ordenar orr){
        this.orden=orr;
    
    }
    
    public int[] result(int arr[]){
        return orden.ordenar(arr);
    }
    
    public void printArray(int arr[]){
        int n = arr.length;
        for (int i=0; i<n; ++i){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
