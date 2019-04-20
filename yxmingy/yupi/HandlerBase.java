package yxmingy.yupi;
/* 所有Handler之父 */

import cn.nukkit.Player;

public abstract class HandlerBase{
  protected String[] title;
  public HandlerBase()
  {
    title = null;
  }
  public HandlerBase(String title)
  {
    this.title = new String[1];
    this.title[0] = title;
  }
  public HandlerBase(String[] title)
  {
    this.title = title;
  }
  abstract public void handle(String data,Player player);
}
 
