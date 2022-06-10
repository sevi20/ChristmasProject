package santaTask.Command;

import santaTask.Entities.MagicBoard;

public class GetBicycleCommand implements Command {
	private MagicBoard magicBoard;

	public GetBicycleCommand(MagicBoard magicBoard) {
		this.magicBoard = magicBoard;
	}

	@Override
	public void execute(String bicycleType) {
		this.magicBoard.getBicycle(bicycleType);;
	}
}
