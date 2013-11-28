package tk.R3creat3.MCP.move;

import tk.R3creat3.MCP.Type;
import tk.R3creat3.MCP.object.*;

public class Tackle extends Move implements IMove {
    public Tackle() {
        super.initiate("Tackle", Type.NORMAL, 50, 100);
    }
}
