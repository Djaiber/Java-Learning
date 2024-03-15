// Implementor interface

interface AccesoriosCasco {
    void agregarAccesorio(String accesorio);
    String agregarAccesorios();
}

// Concrete Implementor 1
class AccesoriosCascoBasico implements AccesoriosCasco {
    private String accesorios = "";

    @Override
    public void agregarAccesorio(String accesorio) {
        accesorios += accesorio + "\n";
    }

    @Override
    public String agregarAccesorios() {
        return "Accesorios Básicos del Casco:\n" + accesorios;
    }
}

// Concrete Implementor 2
class AccesoriosCascoPremium implements AccesoriosCasco {
    private String accesorios = "";

    @Override
    public void agregarAccesorio(String accesorio) {
        accesorios += accesorio + "\n";
    }

    @Override
    public String agregarAccesorios() {
        return "Accesorios Premium del Casco:\n" + accesorios;
    }
}

// Abstraction
abstract class Casco {
    protected AccesoriosCasco accesorios;

    public Casco(AccesoriosCasco accesorios) {
        this.accesorios = accesorios;
    }

    public abstract String ensamblar();
}

// Refined Abstraction 1
class CascoBasico extends Casco {
    public CascoBasico(AccesoriosCasco accesorios) {
        super(accesorios);
    }

    @Override
    public String ensamblar() {
        return accesorios.agregarAccesorios();
    }
}

// Refined Abstraction 2
class CascoPremium extends Casco {
    public CascoPremium(AccesoriosCasco accesorios) {
        super(accesorios);
    }

    @Override
    public String ensamblar() {
        return accesorios.agregarAccesorios();
    }
// Refined Abstraction 3
class CascoStandard extends Casco {
    public CascoStandard(AccesoriosCasco accesorios) {
        super(accesorios);
    }

    @Override
    public String ensamblar() {
        return accesorios.agregarAccesorios();
    }
    }
}
