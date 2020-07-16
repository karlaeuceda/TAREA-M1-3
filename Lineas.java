
public class Lineas extends Figuras{
    
    private final double largo;
    
    public Lineas(double l){
        
        super("Cuadrado");
        largo=l;
    }
    
    public void dibujar(){
        
        super.Dibujar();
        System.out.println("DIBUJO");
        for(int i=0; i<largo;i++){
            for(int j=0; j<largo; j++)
               System.out.println("*");
            System.out.println();
        }
    }

    void setarea() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
}
