
    // adaptar las interfaces de accesorios premios a clases de casco basico
    interface AccesoriosEstandar {
        void agregarAccesorioEstandar(String accesorio);
        String agregarAccesoriosEstandar();
    }
    
    // Adapter class
    class AccesoriosCascoAdapter implements AccesoriosEstandar {
        private AccesoriosCasco accesoriosCasco;
    
        public AccesoriosCascoAdapter(AccesoriosCasco accesoriosCasco) {
            this.accesoriosCasco = accesoriosCasco;
        }
    
        @Override
        public void agregarAccesorioEstandar(String accesorio) {
            // Since the AccesoriosCasco interface doesn't have a method for adding standard accessories,
            // we will use the existing method for adding accessories.
            accesoriosCasco.agregarAccesorio(accesorio);
        }
    
        @Override
        public String agregarAccesoriosEstandar() {
            // Similarly, we will use the existing method for getting all accessories.
            return accesoriosCasco.agregarAccesorios();
        }
    }
