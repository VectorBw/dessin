package groupF;
import java.awt.Color;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
  
import javax.swing.JButton;  
  
//��ť�����࣬ʵ��ActionListenerde�ӿ�  
public class ButtonListener implements ActionListener{  
      
      
    public Dessin db;  
  
    //���캯��  
    public ButtonListener(Dessin db1) {  
        db=db1;  
    }  
  
    //��������ʵ��  
    public void actionPerformed(ActionEvent e) {  
          
         //�õ���ѡ�а�ť�Ķ���  
        JButton bt =(JButton)e.getSource();  
        //�õ���ѡ�а�ť�ı�����ɫ  
        Color c= bt.getBackground();  
        //�ѱ�����ɫ���Ƹ�DrawBorder�е���ɫ����  
        db.c=c;
        //��������еİ�ť��ɫ���ó�ѡ�а�ť�ı�����ɫ  
        db.bt.setBackground(c);
          
    }  
  
}  