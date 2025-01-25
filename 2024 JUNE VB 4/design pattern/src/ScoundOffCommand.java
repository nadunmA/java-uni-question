public class ScoundOffCommand implements Command{

    private ScoundSystem scoundSystem;

    public ScoundOffCommand(ScoundSystem scoundSystem){
        this.scoundSystem = scoundSystem;
    }

    public void execute(){
        scoundSystem.turnOff();
    }

}
