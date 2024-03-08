
// Client code
public class Main {
    public static void main(String[] args) {
        // Basic helmet with basic accessories
        Helmet basicHelmet = new BasicHelmet(new BasicHelmetAccessories());
        basicHelmet.accessories.addAccessory("Chin Strap");
        System.out.println(basicHelmet.assemble());

        System.out.println();

        // Premium helmet with premium accessories
        Helmet premiumHelmet = new PremiumHelmet(new PremiumHelmetAccessories());
        premiumHelmet.accessories.addAccessory("Chin Strap");
        premiumHelmet.accessories.addAccessory("Visor");
        premiumHelmet.accessories.addAccessory("Bluetooth Communication System");
        System.out.println(premiumHelmet.assemble());
    }
}


