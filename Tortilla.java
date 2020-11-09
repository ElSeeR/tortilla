public class Tortilla{

    private String puntoCoccion;
    
    private int numeroHuevos;
    
    private boolean llevaCebolla;
    
    
    public Tortilla(){
       
    }
    
    public int añadirHuevos(int numeroDeHuevos){
        numeroHuevos = numeroDeHuevos;
        return numeroHuevos;
    }
    
    public void puntoDeCoccion(String puntoCoccion){
        
    }
    
    public void llevaCebolla(boolean tieneCebolla){
        llevaCebolla = tieneCebolla;
            if(tieneCebolla == true){
                System.out.println("Ahora hay cebolla en la tortilla");
            }
            
            else{
                System.out.println("Vaya... con cebolla esta mejor, pero bueno, tu tortilla no llevará cebolla");
            }
    }
}