package yxmingy.yupi.ui;

import yxmingy.yupi.GarishHandlerBase;

import java.util.*;
import java.util.ArrayList;

public class GarishForm extends UIBase{

  private ArrayList<Map<String, Object>> content = new ArrayList<>();
  
  public GarishForm(String title)
  {
    super("custom_form",title);
    data.put("content",content);
  }
  public void setHandler(GarishHandlerBase handler)
  {
    super.setHandler(handler);
  }
  /* 文字 */
  public void addLabel(String text)
  {
    Map<String,Object> content = new LinkedHashMap<>();
    content.put("type","label");
    content.put("text",text);
    addContent(content);
  }
  /* 单选项 */
  public void addToggle(String text)
  {
    Map<String,Object> content = new LinkedHashMap<>();
    content.put("type","toggle");
    content.put("text",text);
    addContent(content);
  }
  public void addToggle(String text,boolean _default)
  {
    Map<String,Object> content = new LinkedHashMap<>();
    content.put("type","toggle");
    content.put("text",text);
    content.put("default",_default);
    addContent(content);
  }
  /* 滑块 */
  public void addSlider(String text,int min,int max,int step)
  {
    Map<String,Object> content = new LinkedHashMap<>();
    content.put("type","slider");
    content.put("text",text);
    content.put("min",min);
    content.put("max",max);
    content.put("step",step);
    addContent(content);
  }
  /* 下拉菜单 */
  public void addDropdown(String text,String[] options)
  {
    Map<String,Object> content = new LinkedHashMap<>();
    content.put("type","dropdown");
    content.put("text",text);
    content.put("options",options);
    content.put("default",null);
    addContent(content);
  }
  /* 输入框 */
  public void addInput(String text,String placeholder)
  {
    Map<String,Object> content = new LinkedHashMap<>();
    content.put("type","input");
    content.put("text",text);
    content.put("placeholder",placeholder);
    content.put("default",null);
    addContent(content);
  }
  private void addContent(Map<String,Object> content)
  {
    this.content.add(content);
  }
}
