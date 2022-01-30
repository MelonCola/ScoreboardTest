package net.iceblaze.ScoreboardTest;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class ScoreboardTest extends JavaPlugin {

    public void onEnable(){
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if(command.getName().equalsIgnoreCase("toggleSB")) {
            if(sender instanceof Player) {
                Player p = (Player) sender;
                if(p.getScoreboard() == Bukkit.getScoreboardManager().getMainScoreboard()) {
                    p.setScoreboard(Bukkit.getScoreboardManager().getNewScoreboard());
                    p.sendMessage(ChatColor.BLUE + "Now on a custom scoreboard");
                } else {
                    p.setScoreboard(Bukkit.getScoreboardManager().getMainScoreboard());
                    p.sendMessage(ChatColor.BLUE + "Now on the default scoreboard");
                }
            }
        }
        return true;
    }
}
