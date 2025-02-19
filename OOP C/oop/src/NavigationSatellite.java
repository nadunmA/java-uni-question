public class NavigationSatellite implements ISatellite{

    private String name;

    public NavigationSatellite(String name){

        this.name = name;

    }

    @Override
    public void activate(){

        System.out.println(name + "satellite activiate");

    }

    @Override
    public void deactivate(){

        System.out.println(name + "satellite deactiviate");

    }

}
