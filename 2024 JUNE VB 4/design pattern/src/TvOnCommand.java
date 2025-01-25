public class TvOnCommand implements Command{

    private Television television;

    public TvOnCommand(Television television){
        this.television = television;
    }

    public void execute(){
        television.turnOn();
    }

    
    
}
