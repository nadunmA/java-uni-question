public class Test {

    public static void main(String[] args) {
        
        HeatMissileSystem heatMissile = HeatMissileSystem.getInstance();
        RocketMissileSystem rocketMissile = RocketMissileSystem.getInstance();

        MissileController controller = MissileController.getInstance();

        controller.setOperation(new LaunchMissile(heatMissile), new BlastMissile(heatMissile));
        controller.performLaunching("Colombo");
        controller.performBlasting("MH370");

        controller.setOperation(new LaunchMissile(rocketMissile), new BlastMissile(rocketMissile));
        controller.performLaunching("Kandy");
        controller.performBlasting("MH4200");

    }

}
