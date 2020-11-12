public class Tortilla{

    private String puntoCoccion;

    private int numeroHuevos;

    private boolean llevaCebolla;

    public Tortilla(String puntoDeCoccion, int numeroDeHuevos){
        puntoCoccion = puntoDeCoccion;
        numeroHuevos = numeroDeHuevos;
        llevaCebolla = false;
    }

    public void a�adirMasHuevos(int a�adirHuevos){
       numeroHuevos = a�adirHuevos + numeroHuevos;
    }

    public void setPuntoDeCoccion(String coccion){
        puntoCoccion = coccion;
    }

    public void A�adirOQuitarCebolla(){
        if(llevaCebolla == true){
            llevaCebolla = false;
        }
        else{
            llevaCebolla = true;
        }
        
    }
    
    public void imprimirEstadoTortilla(){
        if(llevaCebolla == true){
            System.out.println("Hay " + numeroHuevos + " huevos, el punto de cocci�n es " +
            puntoCoccion + ". Lleva cebolla?: S�");
        }
        else{
            System.out.println("Hay " + numeroHuevos + " huevos, el punto de cocci�n es " +
            puntoCoccion + ". Lleva cebolla?: No");
        }
        
    }
}