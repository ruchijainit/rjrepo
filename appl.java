import java.applet.*;
import java.awt.*;
/*  
<applet code=appl width=300 height=200 >
</applet>
*/
public class appl extends Applet
{
int i;
Button b1; Label l1; TextField t1;
public void init()
{
b1=new Button("OK");
t1=new TextField(20);
l1=new Label("enter your name");
t1.setBounds(20,120,80);
add(t1);
add(b1);
add(l1);
i=5;
}
public void start()
{
setBackground(Color.cyan);
setForeground(Color.blue);
}
public void paint(Graphics g)
{
//g.drawString("Hello World",30,50);
}

}




















/*
public void init()
public void start()
public void paint(Graphics g)
public void stop()
public void destroy()
*/




