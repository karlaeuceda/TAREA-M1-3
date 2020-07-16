
public class CUADRADO extends Figuras{
    
    private final double lado;
    private double area;

    public CUADRADO(double l){
        
        super("Cuadrado");
        lado=l;
    }
    
    public void setarea(){
        this.area=lado*lado;
    }
    
    public void dibujar(){
        
        super.Dibujar();
        System.out.println("DIBUJO");
        for(int i=0; i<lado;i++){
            for(int j=0; j<lado; j++)
               System.out.println("*");
            System.out.println();
        }
    }
}
   
