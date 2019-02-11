package yxmingy.yupi.ui;

import cn.nukkit.Player;
import java.util.*;
import yxmingy.yupi.*;

abstract public class UIBase {
  /*[
      "type"=>{form/modal/...}
      "title"=>(string)
      "content"=>(string/element)
    ]
  */
  protected LinkedHashMap<String, Object> data;
  
  public UIBase(String type,String title)
  {
    data.put("type",type);
    data.put("title",title);
  }
  
  public void send(Player player)
  {
    UISender.sendUI(
      Utils.buildId((String)data.get("title")),
      data,
      player
    );
  }
}
