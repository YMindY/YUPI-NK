package yxmingy.yupi;

import cn.nukkit.network.protocol.ModalFormRequestPacket;

import java.util.Map;
import com.google.gson.GsonBuilder;

import cn.nukkit.Player;

public class UISender {
	public static void sendUI(int formid, Map<String, Object> formdata,Player player)
	{
		ModalFormRequestPacket ui = new ModalFormRequestPacket();
    ui.formId = formid;
    ui.data = new GsonBuilder().setPrettyPrinting().create().toJson(formdata);
    player.dataPacket(ui);
	}
}
