package yxmingy.yupi;
/* 所有Handler之父 */

import cn.nukkit.Player;
import yxmingy.yupi.HandlerBase;

abstract public class HandlerBase{
  protected String title = null;
  public HandlerBase(String title)
  {
    this.title = title;
  }
  abstract void handle(String data,Player player);
}
