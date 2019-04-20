package yxmingy.yupi;

import cn.nukkit.Player;
import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public abstract class GarishHandlerBase extends HandlerBase{
  public void handle(String data,Player player)
  {
    GsonBuilder builder = new GsonBuilder();
    Gson gson = builder.create();
    @SuppressWarnings("serial")
		Object[] pdata = gson.fromJson(data,new TypeToken<Object[]>() {
		}.getType());
		String[] sdata = new String[pdata.length];
		int i = 0;
		for(Object o : pdata){
		  sdata[i] = (String.valueOf(o));
		  i++;
    }
		handle(sdata,player);
  }
  abstract public void handle(String[] data,Player player);
}
