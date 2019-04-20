package yxmingy.yupi;
/* 把数据发给相应Handler */

import cn.nukkit.Player;
import cn.nukkit.event.Listener;
import java.util.HashMap;
import java.lang.Integer;
import cn.nukkit.event.*;
import cn.nukkit.event.server.DataPacketReceiveEvent;
import cn.nukkit.network.protocol.ModalFormResponsePacket;

public class HandlerManager implements Listener{
  private static HashMap<Integer,HandlerBase> handlers = new HashMap<>();
  public static void addHandler(int id,HandlerBase handler)
  {
    handlers.put(id,handler);
  }
  @EventHandler
  public void onServerReceivePacket(DataPacketReceiveEvent event)
  {
    String data;
    ModalFormResponsePacket ui;
    Player player = event.getPlayer();
		if(!(event.getPacket() instanceof ModalFormResponsePacket)) return;
    ui = (ModalFormResponsePacket)event.getPacket();
    data = ui.data.trim();
    if(handlers.containsKey(ui.formId)){
      handlers.get(ui.formId).handle(data,player);
      handlers.remove(ui.formId);
    }
  }
}
