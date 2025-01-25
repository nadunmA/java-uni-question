public class TvOffCommand implements Command{

    private Television television;

    public TvOffCommand(Television television){
        this.television = television;
    }

    public void execute(){
        television.turnOff();
    }

}
