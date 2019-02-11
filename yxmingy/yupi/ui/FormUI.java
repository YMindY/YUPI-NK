package yxmingy.yupi.ui;

import java.util.*;


public class FormUI extends UIBase{

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
  private ArrayList<Map<String, Object>> buttons;
  
  public FormUI(String title)
  {
    super("form",title);
    data.put("buttons",buttons);
  }
  public void setContent(String text)
  {
    data.put("content",text);
  }
  public void setContent(Map<String, Object> elements)
  {
    data.put("content",elements);
  }
  public void addButton(String text)
  {
    Map<String,Object> button = new LinkedHashMap<>();
    button.put("text",text);
    buttons.add(button);
  }
  public void addButton(String text,String image_type,String image_data)
  {
    Map<String,Object> button = new LinkedHashMap<>(),
                       image = new LinkedHashMap<>();
    image.put("type",image_type);
    image.put("data",image_data);
    button.put("text",text);
    button.put("image",image);
    buttons.add(button);
  }
}
