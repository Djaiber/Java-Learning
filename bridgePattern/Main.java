public class Main {
    public static void main(String[] args) {
        // Casco básico con accesorios básicos
        Casco cascoBasico = new CascoBasico(new AccesoriosCascoBasico());
        cascoBasico.accesorios.agregarAccesorio("Correa de Mentón");
        System.out.println(cascoBasico.ensamblar());

        System.out.println();

        // Casco premium con accesorios premium
        Casco cascoPremium = new CascoPremium(new AccesoriosCascoPremium());
        cascoPremium.accesorios.agregarAccesorio("Correa de Mentón");
        cascoPremium.accesorios.agregarAccesorio("Visera");
        cascoPremium.accesorios.agregarAccesorio("Sistema de Comunicación Bluetooth");
        System.out.println(cascoPremium.ensamblar());
// opciones de menu 
/* 1. Pide tu casco 
 * 2. Mejora tu casco---  
 * 3.salir
 */


    }
}

