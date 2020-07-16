
public class Circulo extends Figuras{
    
    private final double radio;
    private double area;
    private final double pi=3.14;
    
    public Circulo(double r) {
        
        super("CIRCULO");
        radio=r;
    }
    
    public void setarea(){
        
        this.area=pi*radio;
    }
    
    public void dibujar(){
        
    super.Dibujar();
    System.out.println("DIBUJO");
    for(int i=0; i<radio;i++){
            for(int j=0; j<radio; j++)
               System.out.println("*");
            System.out.println();
        }
    }
}
