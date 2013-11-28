package tk.R3creat3.MCP.move;

import tk.R3creat3.MCP.Type;
import tk.R3creat3.MCP.object.IMove;
import tk.R3creat3.MCP.object.Move;

public class WaterGun extends Move implements IMove {
    public WaterGun() {
        super.initiate("Water Gun", Type.WATER, 20, 100);
    }
}
