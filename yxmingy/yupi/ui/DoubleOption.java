package yxmingy.yupi.ui;


public class DoubleOption extends UIBase{
  
  public DoubleOption(String title)
  {
    super("modal",title);
    data.put("button1","是");
    data.put("button2","否");
  }
  public DoubleOption(String title,String button1,String button2)
  {
    super("modal",title);
    data.put("button1",button1);
    data.put("button2",button2);
  }
  public void setContent(String text)
  {
    data.put("content",text);
  }
  public void setButton1(String text)
  {
    data.put("button1",text);
  }
  public void setButton2(String text)
  {
    data.put("button2",text);
  }
}
