package yxmingy.yupi;

import cn.nukkit.Player;
import cn.nukkit.event.EventHandler;
import cn.nukkit.event.Listener;
import cn.nukkit.event.server.DataPacketReceiveEvent;
import cn.nukkit.network.protocol.ModalFormResponsePacket;


abstract public class ResponserBase implements Listener{
	
	abstract protected void response(int id,String index,Player player);
	
	@EventHandler
  public void onServerReceivePacket(DataPacketReceiveEvent event)
  {
    String index;
		Player player = event.getPlayer();
		ModalFormResponsePacket ui;
		if(!(event.getPacket() instanceof ModalFormResponsePacket)) return;
		//if(!(player instanceof Player)) return; /* wtfk? 我傻了? */
    ui = (ModalFormResponsePacket)event.getPacket();///???
    index = ui.data.trim();
    //if(index.equals("null")) return;
    response(ui.formId,index,player);
  }
}
