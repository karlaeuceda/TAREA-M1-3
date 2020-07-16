
public class Triangulo extends Figuras{
    
    private final double base;
    private final double altura;
    private double area;

    public Triangulo(double b, double h) {
        
        super("TRIANGULO");
        base=b;
        altura=h;
    }
    
    public void setarea(){
        
        this.area=base*altura/2;
    }
        
    public void dibujar(){
        
    super.Dibujar();
    System.out.println("DIBUJO");
    for(int i=0; i<base;i++){
            for(int j=0; j<altura; j++)
               System.out.println("*");
            System.out.println();
        }
    }
}   

