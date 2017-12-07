package groupF;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.BevelBorder;


public class Dessin extends JFrame{
	//声明颜色属性，并赋默认值  
    public Color c=Color.RED;  
    //按钮属性，便于其他类访问  
    public JButton  bt ;
	//设置窗体结构
	public void initFrame(){
		this.setSize(600,500);
		this.setTitle("Dessine moi un mouton");
		this.setDefaultCloseOperation(3);
		this.setLocationRelativeTo(null);
		//主面板
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());
		this.add(panel);
		
		JPanel panelcenter = new JPanel();
		panelcenter.setBackground(Color.white);
		panel.add(panelcenter);
		
		//左侧
		JPanel panelleft = new JPanel();
		panelleft.setPreferredSize(new Dimension(80,0));
		panelleft.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		panelleft.setBackground(new Color(235,233,238));
		panel.add(panelleft,BorderLayout.WEST);
	/*	//面板中添加按钮
		JButton line = new JButton();
		JButton polygone = new JButton();
		JButton cercle = new JButton();
		JButton ellipse = new JButton();
		
		//设置字体
		Font f=new Font("Arial",Font.BOLD,10);
		line.setFont(f);
		polygone.setFont(f);
		cercle.setFont(f);
		ellipse.setFont(f);
		//设置大小
		line.setPreferredSize(new Dimension(80,20));
		polygone.setPreferredSize(new Dimension(80,20));
		cercle.setPreferredSize(new Dimension(80,20));
		ellipse.setPreferredSize(new Dimension(80,20));
		//设置名字
		line.setText("LINE");
		polygone.setText("polygone");
		cercle.setText("cercle");
		ellipse.setText("ellipse");
		//添加按钮
		panelleft.add(line);
		panelleft.add(polygone);
		panelleft.add(cercle);
		panelleft.add(ellipse);*/
		
		  ButtonGroup bg = new ButtonGroup();  
	        for(int i=0;i<4;i++){  
	            JRadioButton jrb = new JRadioButton();  
	            //设置默认选中的按钮  
	            if(i==10){  
	                jrb.setSelected(true);  
	            }  
	            jrb.setActionCommand("pic"+i);
	            //设置按钮名称  
	            
	            bg.add(jrb);  
	            panelleft.add(jrb);  
	        } 
		
		//主面板添加下方面板
		JPanel paneldown =new JPanel();
		paneldown.setPreferredSize(new Dimension(0,60));
		paneldown.setLayout(null);
		paneldown.setBackground(Color.gray);
		panel.add(paneldown, BorderLayout.SOUTH);

		//下方面板添加子面板
		JPanel paneldownchild = new JPanel();
		paneldownchild.setBackground(Color.cyan);
		paneldownchild.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		paneldownchild.setBounds(10,10,280,40);
		paneldown.add(paneldownchild);

		//按钮特效
		BevelBorder bb = new BevelBorder(0, Color.gray,Color.white);
		BevelBorder bb1 = new BevelBorder(1, Color.gray,Color.white);

		
		//下方子面板paneldownchild中的左面板

		JPanel left = new JPanel();
		left.setBackground(Color.white);
		left.setLayout(null);
		left.setBorder(bb);
		left.setPreferredSize(new Dimension(40,40));

		//left面板中的两个按钮

		JButton bt = new JButton();
		bt.setBounds(5, 5, 20, 20);
		bt.setBorder(bb1);
		bt.setBackground(Color.black);

		JButton bt1 = new JButton();
		bt1.setBorder(bb1);
		bt1.setBounds(15,15,20,20);
		left.add(bt);
		left.add(bt1);

		//paneldownchild中的右面板
		JPanel right = new JPanel();
		right.setBackground(Color.BLUE);
		right.setLayout(new FlowLayout(FlowLayout.LEFT,0,0));
		right.setPreferredSize(new Dimension(240,40));

		//添加左右面板

		paneldownchild.add(left);
		paneldownchild.add(right);
		

		//添加监听
		ButtonListener bl =new ButtonListener(this);
		
		//颜色数组，用来设置按钮的背景颜色  
        Color []colors = {new Color(0,56,67),new Color(89,3,14),new Color(189,3,14)  
                ,new Color(89,93,14),new Color(89,113,14),new Color(89,73,14)  
                ,new Color(89,3,14),new Color(89,3,14),new Color(29,83,14)  
                ,new Color(89,3,184),new Color(189,233,14),new Color(89,253,14)  
                ,new Color(89,93,14),new Color(89,89,94),new Color(1,3,14)  
                ,new Color(9,83,94),new Color(89,178,147),new Color(9,33,164)  
                ,new Color(34,23,14),new Color(89,173,154),new Color(8,193,194)  
                ,new Color(9,253,76),new Color(89,240,104),new Color(199,73,4)}; 

		//循环添加右面板中的颜色按钮
		for(int i=0;i<24;i++){
		JButton bt3 = new JButton();
		   bt3.setBackground(colors[i]);//设置按钮颜色
		   bt3.setPreferredSize(new Dimension(20,20));//设置按钮的大小
		   bt3.setBorder(bb);
		   bt3.addActionListener(bl);
		right.add(bt3);
		}
		this.setVisible(true);
		 //画笔必须在setVisible后才能拿  
        Graphics g=panelcenter.getGraphics();  
          
        //传递画笔，按钮组管理对象，以及this对象  
        DrawListener dl =new DrawListener(g,bg,this);  
          
        //添加普通鼠标监听器  
        panelcenter.addMouseListener(dl);  
          


		}
	

		
		
	}
	


