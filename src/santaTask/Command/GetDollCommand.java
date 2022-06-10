package santaTask.Command;

import santaTask.Entities.MagicBoard;

public class GetDollCommand implements Command {
    private MagicBoard magicBoard;

    public GetDollCommand(MagicBoard magicBoard) {
        this.magicBoard = magicBoard;
    }

    @Override
    public void execute(String dollType) {
        this.magicBoard.getDoll(dollType);
    }
}
