package groupF;

import java.awt.Color;  
import java.awt.Graphics;  
import java.awt.event.MouseEvent;  
import java.awt.event.MouseListener;  
  
import javax.swing.ButtonGroup;  
import javax.swing.ButtonModel;  
  
public class DrawListener implements MouseListener{  
      
    public Graphics g;  
    public int x1,y1,x2,y2;  
    public ButtonGroup bg;  
    public String command;  
    public Color color;  
    public Dessin db;  
    //构造函数1  
    public DrawListener(Graphics g1){  
        g=g1;  
    }  
    //构造函数2  
      
    public DrawListener(Graphics g2, ButtonGroup bg2) {  
        g=g2;  
        bg=bg2;  
    }  
  
        //构造函数3  
    public DrawListener(Graphics g2, ButtonGroup bg2, Dessin db1) {  
        g=g2;  
        bg=bg2;  
        db=db1;  
    }  
  
        //获取鼠标按下的坐标  
    public void mousePressed(MouseEvent e) {  
        x1=e.getX();  
        y1=e.getY();  
          
          
        //判断选择的是左面板中的那个按钮被选中（前面已经设置每个按钮的名称了）  
        ButtonModel bm=bg.getSelection();//拿到按钮组中被选中的按钮  
        command=bm.getActionCommand();//拿到选中按钮的名字  
        color=db.c;//设置画笔颜色  
          
        g.setColor(color);  
    }  
           
    public void mouseReleased(MouseEvent e) {  
        //获取鼠标释放的坐标  
        x2=e.getX();  
        y2=e.getY();  
        //如果选中的是绘制直线的按钮，那么根据鼠标按下点的坐标和释放点的左边绘制直线（两点确定一条直线）  
        if("pic10".equals(command))  
        {  
            g.drawLine(x1, y1, x2, y2);  
        }//同理选中的是矩形按钮，那么绘制矩形（这里有绘制矩形的纠正，不纠正的话从右下角往左上角方向绘制矩形会出现问题，参看后面难点解析）  
        else if("pic12".equals(command)){  
            g.drawRect(Math.min(x2, x1),Math.min(y2, y1), Math.abs(x2-x1),Math.abs(y1-y2));  
        }//绘制椭圆  
        else if("pic14".equals(command)){  
            g.drawOval(Math.min(x2, x1),Math.min(y2, y1), Math.abs(x2-x1),Math.abs(y1-y2));  
        }  
          
    }  
  
    public void mouseClicked(MouseEvent e) {  
          
    }  
  
    public void mouseEntered(MouseEvent e) {  
          
    }  
  
    public void mouseExited(MouseEvent e) {  
          
    }  
  
      
  
}  