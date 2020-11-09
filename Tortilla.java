public class Tortilla{

    private String puntoCoccion;

    private int numeroHuevos;

    private boolean llevaCebolla;

    public Tortilla(String puntoDeCoccion, int numeroDeHuevos){
        puntoCoccion = puntoDeCoccion;
        numeroDeHuevos = numeroHuevos;
        llevaCebolla = false;
    }

    public void añadirHuevos(int huevos){
        numeroHuevos = huevos;
        numeroHuevos = numeroHuevos + huevos;
    }

    public void setPuntoDeCoccion(String coccion){
        puntoCoccion = coccion;
    }

    public void llevaCebolla (boolean tieneCebolla){
        llevaCebolla = tieneCebolla;
        if(tieneCebolla == true){
            System.out.println("Ahora hay cebolla en la tortilla");
        }

        else{
            System.out.println("Vaya... con cebolla esta mejor, pero bueno, tu tortilla no llevará cebolla");
        }
    }
    
    public void imprimirEstadoTortilla(){
        System.out.println("Hay " + numeroHuevos + " huevos, el punto de cocción es " +
        puntoCoccion + ". Lleva cebolla?: " + llevaCebolla);
    }
}