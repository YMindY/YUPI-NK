package yxmingy.yupi.ui;

import java.util.*;

public class GarishForm extends UIBase{

  private ArrayList<Map<String, String>> content;
  
  public GarishForm(String title)
  {
    super("costom_form",title);
    data.put("content",content);
  }
  public void addLabel(String text)
  {
    Map<String,String> content = new LinkedHashMap<>();
    content.put("type","label");
    content.put("text",text);
    addContent(content);
  }
  public void addToggle(String text,boolean _default)
  {
    Map<String,String> content = new LinkedHashMap<>();
    content.put("type","toggle");
    content.put("text",text);
    content.put("default",_default ? "true" : "false");
    addContent(content);
  }
  public void addContent(Map<String,String> content)
  {
    this.content.add(content);
  }
}
