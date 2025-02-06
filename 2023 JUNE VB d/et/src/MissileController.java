public class MissileController {

    private static MissileController instance;

    private MissileOperation operation1;
    private MissileOperation operation2;

    private MissileController() {
    }

    public static MissileController getInstance() {
        if (instance == null) {
            instance = new MissileController();
            System.out.println("Initialization Missile Controll");
        }
        return instance;
    }

    public void setOperation(MissileOperation launch, MissileOperation blast){
        this.operation1 = launch;
        this.operation2 = blast;
    }

    public void performLaunching(String start) {

        operation1.initiateOperation(start);

    }

    public void performBlasting(String end) {

        operation2.initiateOperation(end);

    }

}
