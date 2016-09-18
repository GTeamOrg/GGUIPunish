package me.gteamorg.guipunishments;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class GUIP_Main extends JavaPlugin {
	
	@Override
	public void onEnable(){
		getLogger().info("GGUIPunish is not enabled");
	}
	
	@Override
	public void onDisable(){
		
	}
	
	public boolean onCommands(CommandSender sender, Command cmd, String label, String[] args){
		
		if (cmd.getName().equalsIgnoreCase("Hello") && sender instanceof Player){
			
			Player player = (Player) sender;
			
			player.sendMessage("Hello, " + player.getName() + "!");
			
			return true;
			
		}
		
		return false;
		
	}
}
