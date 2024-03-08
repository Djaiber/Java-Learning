
// Implementor interface
interface HelmetAccessories {
    void addAccessory(String accessory);
    String addAccessories();
}

// Concrete Implementor 1
class BasicHelmetAccessories implements HelmetAccessories {
    private String accessories = "";

    @Override
    public void addAccessory(String accessory) {
        accessories += accessory + "\n";
    }

    @Override
    public String addAccessories() {
        return "Basic Helmet Accessories:\n" + accessories;
    }
}

// Concrete Implementor 2
class PremiumHelmetAccessories implements HelmetAccessories {
    private String accessories = "";

    @Override
    public void addAccessory(String accessory) {
        accessories += accessory + "\n";
    }

    @Override
    public String addAccessories() {
        return "Premium Helmet Accessories:\n" + accessories;
    }
}

// Abstraction
abstract class Helmet {
    protected HelmetAccessories accessories;

    public Helmet(HelmetAccessories accessories) {
        this.accessories = accessories;
    }

    public abstract String assemble();
}

// Refined Abstraction 1
class BasicHelmet extends Helmet {
    public BasicHelmet(HelmetAccessories accessories) {
        super(accessories);
    }

    @Override
    public String assemble() {
        return accessories.addAccessories();
    }
}

// Refined Abstraction 2
class PremiumHelmet extends Helmet {
    public PremiumHelmet(HelmetAccessories accessories) {
        super(accessories);
    }

    @Override
    public String assemble() {
        return accessories.addAccessories();
    }
}

