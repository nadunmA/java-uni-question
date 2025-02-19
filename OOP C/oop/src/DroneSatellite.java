public class DroneSatellite implements ISatellite{

    private String name;

    public DroneSatellite(String name){

        this.name = name;

    }

    @Override
    public void activate(){

        System.out.println(name + "satellite activiate");

    }

    @Override
    public void deactivate(){

        System.out.println(name + "satellite deactivate");

    }


}
