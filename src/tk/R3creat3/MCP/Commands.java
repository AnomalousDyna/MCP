package tk.R3creat3.MCP;

import com.sk89q.minecraft.util.commands.Command;
import com.sk89q.minecraft.util.commands.CommandContext;
import org.bukkit.command.CommandSender;

public class Commands {
    MCP plugin;

    public Commands(MCP pl) {
        plugin = pl;
    }

    @Command(aliases = {"test", "testing"},
            desc = "Testing",
            max = 0,
            min = 0)
    public void testing(CommandContext args, CommandSender sender) {
        for (String s : MCP.getInstance().getMoves().keySet()) {
            sender.sendMessage(MCP.getInstance().getMoves().get(s).getMoveName() + " power: " + MCP.getInstance().getMoves().get(s).getPower() );
        }
    }
}
