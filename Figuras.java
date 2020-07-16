
public class Figuras {
    protected String nombre;
    protected double area;
    
    public Figuras(String n){
        nombre=n;
    }
    
    public String getnombre(){
        return nombre;
    }
    
    public double getarea()
    {
        return area;
    }
    
    public void Dibujar(){
        System.out.println("NOMBRE:"+this.getnombre());
        System.out.println("AREA:"+this.getarea());
    }
}
