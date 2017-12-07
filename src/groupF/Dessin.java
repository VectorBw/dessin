package groupF;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;


public class Dessin extends JFrame{
	//������ɫ���ԣ�����Ĭ��ֵ  
    public Color c=Color.RED;  
    //��ť���ԣ��������������  
    public JButton  bt ;
	//���ô���ṹ
	public void initFrame(){
		this.setSize(600,500);
		this.setTitle("Dessine moi un mouton");
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null);
		//�����
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		this.add(panel);
		
		JPanel panelcenter = new JPanel();
		panelcenter.setBackground(Color.white);
		panel.add(panelcenter);
		
		//���
		JPanel panelleft = new JPanel();
		panelleft.setPreferredSize(new Dimension(80,0));
		panelleft.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		panelleft.setBackground(new Color(235,233,238));
		panel.add(panelleft,BorderLayout.WEST);
	/*	//�������Ӱ�ť
		JButton line = new JButton();
		JButton polygone = new JButton();
		JButton cercle = new JButton();
		JButton ellipse = new JButton();
		
		//��������
		Font f=new Font("Arial",Font.BOLD,10);
		line.setFont(f);
		polygone.setFont(f);
		cercle.setFont(f);
		ellipse.setFont(f);
		//���ô�С
		line.setPreferredSize(new Dimension(80,20));
		polygone.setPreferredSize(new Dimension(80,20));
		cercle.setPreferredSize(new Dimension(80,20));
		ellipse.setPreferredSize(new Dimension(80,20));
		//��������
		line.setText("LINE");
		polygone.setText("polygone");
		cercle.setText("cercle");
		ellipse.setText("ellipse");
		//��Ӱ�ť
		panelleft.add(line);
		panelleft.add(polygone);
		panelleft.add(cercle);
		panelleft.add(ellipse);*/
		
		  ButtonGroup bg = new ButtonGroup();  
	        for(int i=0;i<4;i++){  
	            JRadioButton jrb = new JRadioButton();  
	            //����Ĭ��ѡ�еİ�ť  
	            if(i==10){  
	                jrb.setSelected(true);  
	            }  
	            jrb.setActionCommand("pic"+i);
	            //���ð�ť����  
	            
	            bg.add(jrb);  
	            panelleft.add(jrb);  
	        } 
		
		//���������·����
		JPanel paneldown =new JPanel();
		paneldown.setPreferredSize(new Dimension(0,60));
		paneldown.setLayout(null);
		paneldown.setBackground(Color.gray);
		panel.add(paneldown, BorderLayout.SOUTH);

		//�·������������
		JPanel paneldownchild = new JPanel();
		paneldownchild.setBackground(Color.cyan);
		paneldownchild.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		paneldownchild.setBounds(10,10,280,40);
		paneldown.add(paneldownchild);

		//��ť��Ч
		BevelBorder bb = new BevelBorder(0, Color.gray,Color.white);
		BevelBorder bb1 = new BevelBorder(1, Color.gray,Color.white);

		
		//�·������paneldownchild�е������

		JPanel left = new JPanel();
		left.setBackground(Color.white);
		left.setLayout(null);
		left.setBorder(bb);
		left.setPreferredSize(new Dimension(40,40));

		//left����е�������ť

		JButton bt = new JButton();
		bt.setBounds(5, 5, 20, 20);
		bt.setBorder(bb1);
		bt.setBackground(Color.black);

		JButton bt1 = new JButton();
		bt1.setBorder(bb1);
		bt1.setBounds(15,15,20,20);
		left.add(bt);
		left.add(bt1);

		//paneldownchild�е������
		JPanel right = new JPanel();
		right.setBackground(Color.BLUE);
		right.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		right.setPreferredSize(new Dimension(240,40));

		//����������

		paneldownchild.add(left);
		paneldownchild.add(right);
		

		//��Ӽ���
		ButtonListener bl =new ButtonListener(this);
		
		//��ɫ���飬�������ð�ť�ı�����ɫ  
        Color []colors = {new Color(0,56,67),new Color(89,3,14),new Color(189,3,14)  
                ,new Color(89,93,14),new Color(89,113,14),new Color(89,73,14)  
                ,new Color(89,3,14),new Color(89,3,14),new Color(29,83,14)  
                ,new Color(89,3,184),new Color(189,233,14),new Color(89,253,14)  
                ,new Color(89,93,14),new Color(89,89,94),new Color(1,3,14)  
                ,new Color(9,83,94),new Color(89,178,147),new Color(9,33,164)  
                ,new Color(34,23,14),new Color(89,173,154),new Color(8,193,194)  
                ,new Color(9,253,76),new Color(89,240,104),new Color(199,73,4)}; 

		//ѭ�����������е���ɫ��ť
		for(int i=0;i<24;i++){
		JButton bt3 = new JButton();
		   bt3.setBackground(colors[i]);//���ð�ť��ɫ
		   bt3.setPreferredSize(new Dimension(20,20));//���ð�ť�Ĵ�С
		   bt3.setBorder(bb);
		   bt3.addActionListener(bl);
		right.add(bt3);
		}
		this.setVisible(true);
		 //���ʱ�����setVisible�������  
        Graphics g=panelcenter.getGraphics();  
          
        //���ݻ��ʣ���ť���������Լ�this����  
        DrawListener dl =new DrawListener(g,bg,this);  
          
        //�����ͨ��������  
        panelcenter.addMouseListener(dl);  
          


		}
	

		
		
	}
	


