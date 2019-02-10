package yxmingy.yupi;
import cn.nukkit.plugin.PluginBase;

import cn.nukkit.event.*;


public class Main extends PluginBase implements Listener{
	public void onEnable() {
		getLogger().notice("YUPI is Enabled! Author: xMing.");
		getServer().getPluginManager().registerEvents(this, this);
	}
	public void onDisable() {
		getLogger().warning("YUPI is Turned Off!");
	}
}
