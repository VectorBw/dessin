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
    //���캯��1  
    public DrawListener(Graphics g1){  
        g=g1;  
    }  
    //���캯��2  
      
    public DrawListener(Graphics g2, ButtonGroup bg2) {  
        g=g2;  
        bg=bg2;  
    }  
  
        //���캯��3  
    public DrawListener(Graphics g2, ButtonGroup bg2, Dessin db1) {  
        g=g2;  
        bg=bg2;  
        db=db1;  
    }  
  
        //��ȡ��갴�µ�����  
    public void mousePressed(MouseEvent e) {  
        x1=e.getX();  
        y1=e.getY();  
          
          
        //�ж�ѡ�����������е��Ǹ���ť��ѡ�У�ǰ���Ѿ�����ÿ����ť�������ˣ�  
        ButtonModel bm=bg.getSelection();//�õ���ť���б�ѡ�еİ�ť  
        command=bm.getActionCommand();//�õ�ѡ�а�ť������  
        color=db.c;//���û�����ɫ  
          
        g.setColor(color);  
    }  
           
    public void mouseReleased(MouseEvent e) {  
        //��ȡ����ͷŵ�����  
        x2=e.getX();  
        y2=e.getY();  
        //���ѡ�е��ǻ���ֱ�ߵİ�ť����ô������갴�µ��������ͷŵ����߻���ֱ�ߣ�����ȷ��һ��ֱ�ߣ�  
        if("pic10".equals(command))  
        {  
            g.drawLine(x1, y1, x2, y2);  
        }//ͬ��ѡ�е��Ǿ��ΰ�ť����ô���ƾ��Σ������л��ƾ��εľ������������Ļ������½������ϽǷ�����ƾ��λ�������⣬�ο������ѵ������  
        else if("pic12".equals(command)){  
            g.drawRect(Math.min(x2, x1),Math.min(y2, y1), Math.abs(x2-x1),Math.abs(y1-y2));  
        }//������Բ  
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