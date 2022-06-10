package santaTask.Entities;

import santaTask.Command.Command;

public class Santa {
	
	private static Santa instance;

	private Command command;

    public void setCommand(Command command){
        this.command = command;
    }
	
	public static Santa getInstance() {
		
		if(instance == null) {
			instance = new Santa();
		}
		
		return instance;
	}
	
	public void postMessage(String toyType) {
		if(this.command==null){
            System.out.println("no command set");
            return;
        }
        this.command.execute(toyType);
	}
}
