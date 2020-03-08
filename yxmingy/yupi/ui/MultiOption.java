package yxmingy.yupi.ui;

import java.util.*;
import java.util.ArrayList;


public class MultiOption extends UIBase{

  /*Map button
  [
    "text"=>(String)
    "image"=>
    [
      type=>{path/url}
      data=>(String)
    ]
  ]
  */
  private ArrayList<Map<String, Object>> buttons = new ArrayList<>();;
  
  public MultiOption(String title)
  {
    super("form",title);
    data.put("content","");
    data.put("buttons",buttons);
  }
  public void setContent(String text)
  {
    data.put("content",text);
  }
  public void addButton(String text)
  {
    Map<String,Object> button = new LinkedHashMap<>();
    button.put("text",text);
    buttons.add(button);
  }
  public void addButton(String text,boolean use_local_image,String image_path)
  {
    Map<String,Object> button = new LinkedHashMap<>(),
                       image = new LinkedHashMap<>();
    image.put("type",use_local_image ? "path" : "url");
    image.put("data",image_path);
    button.put("text",text);
    button.put("image",image);
    buttons.add(button);
  }
}
