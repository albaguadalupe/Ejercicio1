package ejemplo;

/**
 *
 * @author ALBA
 */
public class  book implements libro{
    public int id;
    public String titulo;
    public String descripcion;
    public String unidadesdisponibles;
    public String Informacion;
    
        public book (){
        this.id = id;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this. unidadesdisponibles= unidadesdisponibles;
        this.Informacion=Informacion;
    }
   public String getInformacion(){
        return Informacion;
        
}
      public void setInformacion(String Informacion){
        this.id = 152;
        this.titulo = "el llano en llamas";
        this.descripcion = "compilacion de cuentos escritos por Juan Rulfo";
        this. unidadesdisponibles= "150";
        System.out.println(""+this.titulo+"("+ this.descripcion+")"+""+this.unidadesdisponibles+"unidades disponibles"+this.id);  
    }
}
      
     

       