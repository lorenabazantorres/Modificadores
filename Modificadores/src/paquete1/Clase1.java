
package paquete1;

//DEFAULT : La clase no puede ser llamada fuera de su propio paquete,
//tenemos que mover la clase 2 al mismo paquete
 class Clase1 {
    //es publico, no necesitamos get
    private String atributoPublico;
     String atributoProtegido;
    
    //METODOS
    private void metodoPublico() {  
    }
    private void metodoProtegido() {  
    }
    
    //CONSTRUCTORES
    //Vacio
    private Clase1(){
        System.out.println("Constructor privado vacio protegido");
    }
    //Argumento
    private  Clase1(String arg){
        System.out.println("Constructor privado con un argumento"+arg);
    }
}
