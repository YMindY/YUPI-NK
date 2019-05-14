package yxmingy.yupi.ui;

import cn.nukkit.Player;
import java.util.*;
import yxmingy.yupi.*;
import yxmingy.yupi.HandlerManager;

abstract public class UIBase {
  /*[
      "type"=>{form/modal/...}
      "title"=>(string)
      "content"=>(string/element)
    ]
  */
  protected LinkedHashMap<String, Object> data = new LinkedHashMap<>();
  
  public UIBase(String type,String title)
  {
    data.put("type",type);
    data.put("title",null==title ? "" : title);
  }
  
  public void send(Player player)
  {
    UISender.sendUI(
      Utils.buildId((String)data.get("title")),
      data,
      player
    );
  }
  
  public void setHandler(HandlerBase handler)
  {
    int id = Utils.buildId((String)data.get("title"));
    HandlerManager.addHandler(id,handler);
  }
}
