
package paquete1;
import paquete1.Clase1;

//hija de la clase 1, accedemos a los metodos protegidos de forma directa con el SUPER
public class Clase2 extends Clase1{
    //CONSTRUCTORES
    public Clase2(){
        super(); //Constructor vacio de la clase padre
        
        //Modificamos directamente el atributo protegido de la clase padre
        this.atributoPublico = "Modificando el atributo privado"; //Accedo al atributo publico de la clase padre
        System.out.println("Atributo privado dentro de hija: "+this.atributoPublico);
        
        //Accediendo con this al metodo protegido de la padre
        this.metodoProtegido();
    }
}
