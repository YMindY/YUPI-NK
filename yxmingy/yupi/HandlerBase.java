package yxmingy.yupi;
/* 所有Handler之父 */

import cn.nukkit.Player;

public interface HandlerBase{
  void handle(String data,Player player);
}
