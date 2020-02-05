
package package1;

/**
 * @author FrapoDeveloper
 */
public class Programmer {
    public static void main(String []args){
        Developer dev1 = new Developer("Fran Espino");  //Estado inicial del objeto
        dev1.setDatos(20,"Senior");
        dev1.setInformation();
        System.out.println(dev1.getDatos());
        Developer dev2 = new Developer("Jimmy Morales");  //Estado inicial del objeto
        dev2.setDatos(18,"Junior");
        dev2.setInformation();
        System.out.println(dev2.getDatos());

    }  
}

class Developer{
    
    private int edad;
    private final String nombre;
    public static int id=0;     
    /*Al momento de crear un objeto los atributos y metodos de la clase hacen una copia 
        exacta de todos los miembros que no sean estaticos, este atributo pasa a ser 
        directamente de la clase y no del objeto, todos los objetos comparten este atributo
        Nota: Los Atributos estaticos no se instancias ya que solo pertenece a la clase.
            Sirve para cambiar alguna informacion de un metodo o atributo  y queremos que
            se le apliquen cambios a todos  los objetos creados.  */
    private String nivel;
    private String area;
    
    //el metodo constructor sirve para dar un estado inicial a nuestras instancias de la clase(objetos).
    
    public Developer(String nombre){
        this.nombre =nombre;
        area = "Desarrollador";
        id += 1;
             
    }
    
    //metodo setter (establece informacion) para un atributo private, este método se utiliza para respetar la encapsulación
    public void setDatos(int edad, String nivel){
        this.edad = edad;
        this.nivel=nivel;
    }
    
    public String getDatos(){
        return "\n\nId: "+id+" \nInformacion del programador(a) \nArea: "+area+"\nNombre: " + 
                nombre+"\nEdad: "+edad +"\nNivel del desarrolador(a): "+nivel;
    }

    public void setInformation(){
        
      Object vDevs[] = new Object[3];
      //para asignar el valor de un array de tipo Object hay que usar cassting.
        vDevs[0] = nombre;
        vDevs[1]=edad;
        vDevs[2]=nivel;
        int n=1;
        System.out.println("\n\n---Metodo de Informacion---");
        for(Object dato: vDevs){
            
            if(dato instanceof String){
                       System.out.println(n+" TypeDat[String] -> "+dato);
            }else if(dato instanceof Integer){
                      System.out.println(n+" TypeDat[int] -> "+dato);
            }
            
            n+=1;
        }
        
    }
    
}