public class Tortilla{

    private String puntoCoccion;

    private int numeroHuevos;

    private boolean llevaCebolla;

    public Tortilla(String getPuntoDeCoccion, int getNumeroDeHuevos){
        puntoCoccion = getPuntoDeCoccion;
        numeroHuevos = getNumeroDeHuevos;
        llevaCebolla = false;
    }

    public void añadirMasHuevos(int añadirHuevos){
       numeroHuevos = añadirHuevos + numeroHuevos;
    }

    public void setPuntoDeCoccion(String coccion){
        puntoCoccion = coccion;
    }

    public void AñadirOQuitarCebolla(){
        if(llevaCebolla == true){
            llevaCebolla = false;
        }
        else{
            llevaCebolla = true;
        }
        
    }
    
    public void imprimirEstadoTortilla(){
        if(llevaCebolla == true){
            System.out.println("Hay " + numeroHuevos + " huevos, el punto de cocción es " +
            puntoCoccion + ". Lleva cebolla?: Sí");
        }
        else{
            System.out.println("Hay " + numeroHuevos + " huevos, el punto de cocción es " +
            puntoCoccion + ". Lleva cebolla?: No");
        }
        
    }
    
    public String mostrarEstadoTortilla(){
        if(llevaCebolla == true){
           return "Hay " + numeroHuevos + " huevos, el punto de cocción es " +
            puntoCoccion + ". Lleva cebolla?: Sí";
        }
        else{
            return "Hay " + numeroHuevos + " huevos, el punto de cocción es " +
            puntoCoccion + ". Lleva cebolla?: No";
        }
    }
}