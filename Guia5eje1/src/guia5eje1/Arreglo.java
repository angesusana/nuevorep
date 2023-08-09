/* Método buscarMayor que reciba por parámetro un arreglo bidimensional e
//irregular de enteros y retorne el entero más grande que se encuentra en el arreglo.
  */
package guia5eje1;


public class Arreglo {
      
    int[][] mat={{1,2,5},{9,8,5}};

       public static void sumarLista(int vec[]){
       double sum=0;
       
        for (int i :vec) {
            sum+=i;
                 }
        System.out.println("La suma de los elementos del vector es "+sum+ "\n El promedio es "+sum/vec.length);}
   
    
    public static int buscarMayor(int [][] mat){
        int may=0;
        for (int[] i :mat) {
           for (int j : i) {
               if (j>may) {
                   may=j;  }
                } }
        return may;    }    
  
   public static int cuentaVocales(String pal){
    int cont=0;
    char vect[]= new char [pal.length()];
       for (int i = 0; i < pal.length(); i++) {
           vect[i]= pal.toLowerCase().charAt(i);
           if (vect[i]=='a'|| vect[i]=='e'|| vect[i]=='i'|| vect[i]=='o'|| vect[i]=='u'){
          cont++; }     }
       return cont;}
   //d) Mé/todo cuentaCaracter que reciba por parámetro un String y un carácter, luego
//retorne la cantidad de veces que se repite en la cadena el carácter recibido.
 public static int cuentaCaracter(String pal, char a){
    int cont=0;
    char vect[]= new char [pal.length()];
       for (int i = 0; i < pal.length(); i++) {
           vect[i]= pal.toLowerCase().charAt(i);
           if (vect[i]== a){
            cont++; }     }
       return cont;}

}