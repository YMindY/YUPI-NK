package yxmingy.yupi;

import cn.nukkit.network.protocol.ModalFormRequestPacket;

import java.util.HashMap;
import com.google.gson.GsonBuilder;

import cn.nukkit.Player;

public class UISender {
	public static void sendUI(int formid, HashMap<String, String> formdata,Player player)
	{
		ModalFormRequestPacket ui = new ModalFormRequestPacket();
    ui.formId = formid;
    ui.data = new GsonBuilder().setPrettyPrinting().create().toJson(formdata);
    player.dataPacket(ui);
	}
}
