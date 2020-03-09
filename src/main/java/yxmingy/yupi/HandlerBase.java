package yxmingy.yupi;
/* 所有Handler之父 */

import cn.nukkit.Player;

public abstract class HandlerBase{
  /**
   * Used if you have a special need to save a data when send UI
   * 当你发送UI的时候，如果有把数据保存到回调时的需要，使用它
   */
  protected String[] data;
  public HandlerBase()
  {
    data = null;
  }
  public HandlerBase(String title)
  {
    this.data = new String[1];
    this.data[0] = title;
  }
  public HandlerBase(String[] title)
  {
    this.data = title;
  }

  /**
   * Note: when player submit a Form UI,
   *     this function will be called twice,
   *     One is valid data,The other is string "null\n"(The sign of closing UI)
   *                                                 ↑ Does it have a "\n"? I forgot..
   * @param data -- The number of the button which player clicked
   * @param player -- The player
   */
  abstract public void handle(String data,Player player);
}
 
