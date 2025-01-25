public class ScoundOnCommand implements Command{

    private ScoundSystem scoundSystem;

    public ScoundOnCommand(ScoundSystem scoundSystem){
        this.scoundSystem = scoundSystem;
    }

    public void execute(){
        scoundSystem.turnOn();
    }

}
