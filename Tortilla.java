public class Tortilla{

    private String puntoCoccion;

    private int numeroHuevos;

    private boolean llevaCebolla;

    public Tortilla(String puntoDeCoccion, int numeroDeHuevos){
        puntoCoccion = puntoDeCoccion;
        numeroHuevos = numeroDeHuevos;
        llevaCebolla = false;
    }
    
    public String getPuntoDeCoccion(){
        return puntoCoccion;
    }
    
    public int getNumeroHuevos(){
        return numeroHuevos;
    }
    
    public boolean getLlevaCebolla(){
        return llevaCebolla;
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
    
    public String mostrarEstadoTortilla(){
        if(llevaCebolla == true){
           return "Hay " + numeroHuevos + " huevos, el punto de cocci�n es " +
            puntoCoccion + ". Lleva cebolla?: S�";
        }
        else{
            return "Hay " + numeroHuevos + " huevos, el punto de cocci�n es " +
            puntoCoccion + ". Lleva cebolla?: No";
        }
    }
}