public class App {
    public static void main(String[] args) throws Exception {
        
        int[]arr={12, 11, 13, 5, 6};

        System.out.println("arreglo original:");
        for(int num : arr ){
            System.out.println(num+" ");
        }
        System.out.println();
        System.out.println("=========================");
        insertionSort(arr);

        System.out.println("Arreglo ordenado");
        for(int num : arr){
            System.out.println(num+"");
        }
    }
    public static void insertionSort (int[] arr){

   // esta linea calcula  la longitud del arrreglo que se va a ordenar
    int n = arr.length;

    // Este bucle itera sobre el arreglo desde el segundo elemento hasta el ultimo
    for(int i = 1; i<n ; i++){
        
        //Guardamos el valor del elemento actual en una variable temporal llamda Key
        int key = arr[i];
       
        //inicializamos J como el indice del elemento anterior al actual
        int j=i-1;

    //Este bucle while se eejecuta mientras j  sea mayor o igual a 0 y el 
    //elemento en la posicionj aea mayor qye el valor key
        while(j >=0 && arr[j]> key){
            
            //mueve el elemento en la posicion j una posicion hacia adelante
            arr[j+1]=arr[j];
          
            // se decrementa J  para comparar con el elemento anterior
            j--;
        }
        // coloca el valor de key en la posicion adecuada  despues de salir del bucle while
        arr[j+1]= key ;
    }
    }


    
}