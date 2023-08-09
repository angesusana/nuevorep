/*

 */
package guia5eje1;


public class pruebaArreglo {

    
    public static void main(String[] args) {
       
       int vect[]={1,2,3,4,5,6};
       int mat[][]={{1,2,5},{9,8,5}};
        
        Arreglo.sumarLista( vect );
        System.out.println(Arreglo.buscarMayor(mat));
        System.out.println("Las vocales son: "+ Arreglo.cuentaVocales("mUrcIeloogo"));
       System.out.println("El caracter: m  esta "+ Arreglo.cuentaCaracter("marmota", 'm')+" veces");
      
    }
    
}
