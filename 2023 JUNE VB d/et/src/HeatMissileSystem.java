public class HeatMissileSystem implements MissileSystem {

    private static HeatMissileSystem instance;

    private HeatMissileSystem() {
    }

    public static HeatMissileSystem getInstance() {
        if (instance == null) {
            instance = new HeatMissileSystem();
            System.out.println("Inizitalize Heat Missile System. . .");
        }
        return instance;
    }

    @Override
    public void launch(String source) {

        System.out.print("Heat Missile launch from "+source);

    }

    @Override
    public void blast(String destination) {

        System.out.println(" and Heat Missile blast Flight "+destination);

    }

}
