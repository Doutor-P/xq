
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.sql.SQLException;
public class denglu{
    public static void main (String []args){
       AFrame f= new AFrame("校车管理系统");//展示主类，也就是程序入口
    }
}
class AFrame extends JFrame{
    JButton b1;
    JButton b2;
    JTextField t1; 
    JTextField t2;
 
    public AFrame(String title){
        super(title);//调用父类JFrame的构造函数，将指定的title作为窗口的标题。
        this.setLayout(null);//设置布局管理器为null，即使用自定义的布局方式。
        Panel p = new Panel();        
        b1 =new JButton("登陆");
        b2 =new JButton("取消");
    
        t1 =new JTextField(25);
        t1.setFont(new Font("宋体",Font.BOLD,25)); 
        t2 =new JPasswordField(25);
        t2.setFont(new Font("宋体",Font.BOLD,25));
 
        JLabel nameLabel = new JLabel("用户名");
        nameLabel.setFont(new Font("宋体",Font.BOLD,25));
        nameLabel.setHorizontalAlignment(JTextField.CENTER);
        JLabel pwdLabel = new JLabel("密码");
        pwdLabel.setFont(new Font("宋体",Font.BOLD,25));
        pwdLabel.setHorizontalAlignment(JTextField.CENTER);
        this.setBounds(300,300,1000,500);
        this.add(nameLabel);//将nameLabel标签添加到窗口中。
        this.add(t1);
        this.add(pwdLabel);
        this.add(t2);
        this.add(b1);
        this.add(b2);
 
        nameLabel.setBounds(100,100,200,50);
 //设置nameLabel标签在窗口中的位置和大小，参数依次为左上角的横坐标、纵坐标、宽度和高度。
        pwdLabel.setBounds(100,200,200,50);
        t1.setBounds(600,100,200,50);
        t2.setBounds(600,200,200,50);
        b1.setBounds(100,300,200,50);
        b2.setBounds(600,300,200,50);
        b1.addActionListener (new ResponseButton());
 
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"单击确定退出");
                System.exit(0);
            }
        });
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置窗口的默认关闭操作为退出程序。
        this.setVisible(true);
 
        getRootPane().setDefaultButton(b1);
        b1.addKeyListener (new KeyAdapter(){
        	public void keyPressed(KeyEvent e){
                if(e.getKeyCode() == KeyEvent.VK_ENTER)
				{
                    AFrame2 f1 = new AFrame2("校园校车管理系统-123456");
                
				}else{
                    System.out.print(t1.getText());
                    JOptionPane.showMessageDialog(null, "账号或者密码错误", "Error.mxy",JOptionPane.ERROR_MESSAGE); 
            
                }
            }
        });
    }   
    public class ResponseButton  implements ActionListener{
        public void actionPerformed(ActionEvent e){
                String str ="123";
                String m = "123";
                if(t1.getText().equals(str)&&t2.getText().equals(m) ){
                    AFrame2 f1 = new AFrame2("校园校车信息管理系统-123456"); 
                }else{
                    System.out.print(t1.getText());
                    JOptionPane.showMessageDialog(null, "账号或者密码错误", "Error.mxy",JOptionPane.ERROR_MESSAGE);             
                }
        }
    }
    class AFrame2 extends JFrame{
        public AFrame2(String title){
            super(title);
           JButton b3 =new JButton("用户信息录入");
           JButton b4 =new JButton("校车是否存在查询");
           JButton b5 =new JButton("修改");
           JButton b6 =new JButton("删除");
           JButton b7 =new JButton("用户派车管理");
            this.add(b3);
            this.add(b4);
            this.add(b5);
            this.add(b6);
            this.add(b7);
            b3.setBounds(100,80,160,100);          
            b4.setBounds(100,290,160,100);        
            b5.setBounds(300,80,160,100);         
            b6.setBounds(300,290,160,100);
            b7.setBounds(500,80,160,100);
            b3.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AFrame3 f2 = new AFrame3("校车管理系统-用户信息录入");
            }
        });
            b4.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                Queryframe f3 = new Queryframe();
            }
        });
            b5.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AFrame5 f4 = new AFrame5("校车信息管理系统-修改");
            }
        });
            b6.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                AFrame6 f5 = new AFrame6("校车信息管理系统-删除");
                
            }
        });
            b7.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    AFrame7 f5 = new AFrame7("用户派车管理");

                }
            });

            this.setLayout(null);
            this.setBounds(300,300,600,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }
    }
    class AFrame3 extends JFrame{
		private static final long serialVersionUID = 1L;
		public AFrame3(String title){
            super(title);
            this.setLayout(null);
            JLabel l1 = new JLabel("用户信息录入");
            l1.setForeground(Color.red);
            l1.setHorizontalAlignment(JTextField.CENTER);
            JButton x1=new JButton("车辆信息输入");
            JButton x2=new JButton("用户信息输入");
            JButton x3=new JButton("司机信息输入");
            this.add(x1);
            this.add(x2);
            this.add(x3);
            x1.setBounds(80,100,100,80);          
            x2.setBounds(200,100,100,80);        
            x3.setBounds(80,200,100,80); 
            x1.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    AFrame31 f6 = new AFrame31("车辆信息输入");
                }
            });
            x2.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    AFrame32 f7 = new AFrame32("用户信息输入");
                }
            });
            x3.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    AFrame33 f8 = new AFrame33("司机信息输入");
                }
            });
            this.setLayout(null);
            this.setBounds(300,300,600,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
		}
    }
    class AFrame31 extends JFrame{             
        public AFrame31(String title){
        	super(title);
          //构造函数AFrame3接收一个字符串参数title，表示窗口的标题。
            this.setLayout(null);
            JLabel m1 =new JLabel("校车信息：");
            m1.setHorizontalAlignment(JTextField.CENTER);
            JLabel busnumber =new JLabel("车牌号：");
            busnumber.setHorizontalAlignment(JTextField.CENTER);
            JLabel motorcycletype =new JLabel("车型：");
            motorcycletype.setHorizontalAlignment(JTextField.CENTER);
            JLabel seating =new JLabel("座位数：");
            seating.setHorizontalAlignment(JTextField.CENTER);
            JTextField t31 =new JTextField(25);
            t31.setFont(new Font("宋体",Font.BOLD,25));
            JTextField t41 =new JTextField(25);
            t41.setFont(new Font("宋体",Font.BOLD,25));
            JTextField t51 =new JTextField(25);
            t51.setFont(new Font("宋体",Font.BOLD,25));
            JButton b7 = new JButton("录入");
            JButton b8 = new JButton("取消");
            b8.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(null,"单击确定退出");
                System.exit(0);
                }
            });
            this.add(t31);
            this.add(t41);
            this.add(t51);
            this.add(busnumber);
            this.add(motorcycletype);
            this.add(seating);
            this.add(m1);
            this.add(b8);
            this.add(b7);                 
            t31.setBounds(180,40,180,50);
            t41.setBounds(180,100,180,50);
            t51.setBounds(180,160,180,50);
            busnumber.setBounds(0,40,180,50);
            motorcycletype.setBounds(0,100,180,50);
            seating.setBounds(0,160,180,50);
            m1.setBounds(0,0,360,40);
            b7.setBounds(50,360,100,50);
            b8.setBounds(220,360,100,50);             
            this.setBounds(900,300,400,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            b7.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {           
            		int busnumber= Integer.parseInt(t31.getText());
            		String motorcycletype = t41.getText();
            		int seating= Integer.parseInt(t51.getText());
            		connect sqlHelp = new connect();
            		try {            		
            			connect.addschoolmanage1(busnumber, motorcycletype, seating);            	
            		} catch (SQLException e1) {
            			e1.printStackTrace();
            		}
            	}
            });
			}
        }
    
    class AFrame32 extends JFrame{             
    	public AFrame32(String title){
    		super(title);                 
    		this.setLayout(null);
    		JLabel m2 =new JLabel("用户信息：");
    		m2.setHorizontalAlignment(JTextField.CENTER);
    		JLabel usernumber =new JLabel("用户编号：");
    		usernumber.setHorizontalAlignment(JTextField.CENTER);
    		JLabel username =new JLabel("姓名：");
    		username.setHorizontalAlignment(JTextField.CENTER);
    		JLabel collage =new JLabel("所在学院：");
    		collage.setHorizontalAlignment(JTextField.CENTER);
    		JLabel professional =new JLabel("所在专业：");
    		professional.setHorizontalAlignment(JTextField.CENTER);
    		JLabel contactnumber = new JLabel("联系电话：");
    		contactnumber.setHorizontalAlignment(JTextField.CENTER);
    		JTextField t32 =new JTextField(25);
    		t32.setFont(new Font("宋体",Font.BOLD,25));
    		JTextField t42 =new JTextField(25);
    		t42.setFont(new Font("宋体",Font.BOLD,25));
    		JTextField t52 =new JTextField(25);
    		t52.setFont(new Font("宋体",Font.BOLD,25));
    		JTextField t62 =new JTextField(25);
    		t62.setFont(new Font("宋体",Font.BOLD,25));
    		JTextField t72 =new JTextField(25);
    		t72.setFont(new Font("宋体",Font.BOLD,25));
    		JButton b7 = new JButton("录入");
    		JButton b8 = new JButton("取消");
    		b8.addActionListener(new ActionListener(){
    			public void actionPerformed(ActionEvent e){
    				JOptionPane.showMessageDialog(null,"单击确定退出");
    				System.exit(0);
        }
    });
    		this.add(t32);
    		this.add(t42);
            this.add(t52);
            this.add(t62);
            this.add(t72);
            this.add(usernumber);
            this.add(collage);
            this.add(username);
            this.add(professional);
            this.add(contactnumber);
            this.add(m2);
            this.add(b8);
            this.add(b7);
            t32.setBounds(180,40,180,50);
            t42.setBounds(180,100,180,50);
            t52.setBounds(180,160,180,50);
            t62.setBounds(180,220,180,50);
            t72.setBounds(180,280,180,50);
            usernumber.setBounds(0,40,180,50);
            collage.setBounds(0,100,180,50);
            username.setBounds(0,160,180,50);
            professional.setBounds(0,220,180,50);
            contactnumber.setBounds(0,280,180,50);
            m2.setBounds(0,0,360,40);
            b7.setBounds(50,360,100,50);
            b8.setBounds(220,360,100,50);             
            this.setBounds(900,300,400,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            b7.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            	    int usernumber= Integer.parseInt(t32.getText());
    		        String username = t42.getText();		
    		        String college = t52.getText();
    		        String professional = t62.getText();
    		        int contactnumber= Integer.parseInt(t72.getText());
    		        connect sqlHelp = new connect();
    		        try {
    		        	connect.addschoolmanage2(usernumber, username, college, professional,contactnumber);
    		        	} catch (SQLException e1) {    			
    		        		e1.printStackTrace();
    		        		}
    		        }
            	});
            }
    	}
    class AFrame33 extends JFrame{             
        public AFrame33(String title){
            super(title);
          //构造函数AFrame3接收一个字符串参数title，表示窗口的标题。
            this.setLayout(null);
            JLabel m3 =new JLabel("司机信息：");
            m3.setHorizontalAlignment(JTextField.CENTER);
            JLabel dnumber =new JLabel("驾驶员工号：");
            dnumber.setHorizontalAlignment(JTextField.CENTER);
            JLabel drivingname =new JLabel("姓名：");
            drivingname.setHorizontalAlignment(JTextField.CENTER);
            JLabel drivingyears =new JLabel("驾龄：");
            drivingyears.setHorizontalAlignment(JTextField.CENTER);
            JLabel drivingnumber =new JLabel("联系方式：");
            drivingnumber .setHorizontalAlignment(JTextField.CENTER);
            JTextField t33 =new JTextField(25);
            t33.setFont(new Font("宋体",Font.BOLD,25));
            JTextField t43 =new JTextField(25);
            t43.setFont(new Font("宋体",Font.BOLD,25));
            JTextField t53 =new JTextField(25);
            t53.setFont(new Font("宋体",Font.BOLD,25));
            JTextField t63 =new JTextField(25);
            t63.setFont(new Font("宋体",Font.BOLD,25));
            JButton b7 = new JButton("录入");
            JButton b8 = new JButton("取消");
            b8.addActionListener(new ActionListener(){
            	public void actionPerformed(ActionEvent e){
            		JOptionPane.showMessageDialog(null,"单击确定退出");
            		System.exit(0);
            		}
            	});
            this.add(t33);
            this.add(t43);
            this.add(t53);
            this.add(t63);
            this.add(dnumber);
            this.add(drivingname);
            this.add(drivingyears);
            this.add(drivingnumber );
            this.add(m3);
            this.add(b8);
            this.add(b7); 
            t33.setBounds(180,40,180,50);
            t43.setBounds(180,100,180,50);
            t53.setBounds(180,160,180,50);
            t63.setBounds(180,220,180,50);
            dnumber.setBounds(0,40,180,50);
            drivingname.setBounds(0,100,180,50);
            drivingyears.setBounds(0,160,180,50);
            drivingnumber.setBounds(0,220,180,50);
            m3.setBounds(0,0,360,40);
            b7.setBounds(50,360,100,50);
            b8.setBounds(220,360,100,50);             
            this.setBounds(900,300,400,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
            b7.addActionListener(new ActionListener() {
            	public void actionPerformed(ActionEvent e) {
            		int dnumber= Integer.parseInt(t33.getText());
            		String drivingname = t43.getText();
            		int drivingyears= Integer.parseInt(t53.getText());
            		int drivingnumber= Integer.parseInt(t63.getText());
            		connect sqlHelp = new connect();
            		try {
            			connect.addschoolmanage3(dnumber, drivingname, drivingyears, drivingnumber);
    		} catch (SQLException e1) {
    			e1.printStackTrace();
    			}
            		}
            	});
            }
        }
    //查询模块
    class AFrame5 extends JFrame{
    	JButton bx10;
        JTextField tx8;
        JLabel lx2;
        JLabel lx3;
        public AFrame5(String title){
        	JButton bx9 = new JButton("修改");
        	bx9.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent arg0) {
    				
    				int usernumber = Integer.parseInt(tx8.getText());
    
    				connect sqlHelp = new connect();
    				
    				try {
    					sqlHelp.changeschoolmanage(usernumber);
    				} catch (SQLException e) {
    					e.printStackTrace();
    				}
    					
    			}
    		});
        	bx10 = new JButton("取消");
            tx8 = new JTextField(25);
            tx8.setFont(new Font("宋体",Font.BOLD,25));
            lx2 = new JLabel("输入用户编号：");
            lx2.setHorizontalAlignment(JTextField.CENTER);
            lx3 = new JLabel("查询系统");
            lx3.setForeground(Color.gray);
            lx3.setHorizontalAlignment(JTextField.CENTER);
    
            this.add(bx9);
            this.add(bx10);
            this.add(tx8);
            this.add(lx2);
            this.add(lx3);
    
            bx9.setBounds(50,300,100,50);
            bx10.setBounds(200,300,100,50);
            tx8.setBounds(180,160,180,50);
            lx2.setBounds(0,160,180,50);
            lx3.setBounds(0,0,360,40);
 
            bx10.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"单击确定退出");
                    System.exit(0);
                }
            });
    
            this.setLayout(null);
            this.setBounds(900,300,400,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
        }     
    }
    class AFrame6 extends JFrame{//删除模块
    	JButton bm10;
        JTextField tm8;
        JLabel lm2;
        JLabel lm3;
        public AFrame6(String title){
        	JButton bm9 = new JButton("删除");
        	bm9.addActionListener(new ActionListener() {
    			public void actionPerformed(ActionEvent arg0) {
    				
    				int usernumber = Integer.parseInt(tm8.getText());
    
    				connect sqlHelp = new connect();
    				
    				try {
    					sqlHelp.deleteschoolmanage(usernumber);
    				} catch (SQLException e) {
    					e.printStackTrace();
    				}
    					
    			}
    		});
            bm10 = new JButton("取消");
            tm8 = new JTextField(25);
            tm8.setFont(new Font("宋体",Font.BOLD,25));
            lm2 = new JLabel("输入用户编号：");
            lm2.setHorizontalAlignment(JTextField.CENTER);
            lm3 = new JLabel("删除用户编号系统");
            lm3.setForeground(Color.gray);
            lm3.setHorizontalAlignment(JTextField.CENTER);
    
            this.add(bm9);
            this.add(bm10);
            this.add(tm8);
            this.add(lm2);
            this.add(lm3);
    
            bm9.setBounds(50,300,100,50);
            bm10.setBounds(200,300,100,50);
            tm8.setBounds(180,160,180,50);
            lm2.setBounds(0,160,180,50);
            lm3.setBounds(0,0,360,40);
 
            bm10.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"单击确定退出");
                    System.exit(0);
                }
            });
            this.setLayout(null);
            this.setBounds(900,300,400,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);
    
    }
   }
    class AFrame7 extends JFrame{//删除模块
        JButton bm10;
        JTextField tm8;
        JLabel lm2;
        JLabel lm3;
        public AFrame7(String title){
            JButton bm11 = new JButton("派车");
            bm11.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent arg0) {

                    int busnumber = Integer.parseInt(tm8.getText());

                    connect sqlHelp = new connect();

                    try {
                        sqlHelp.deleteusermanage(busnumber);
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }

                }
            });
            bm10 = new JButton("取消");
            tm8 = new JTextField(25);
            tm8.setFont(new Font("宋体",Font.BOLD,25));
            lm2 = new JLabel("输入车辆编号：");
            lm2.setHorizontalAlignment(JTextField.CENTER);
            lm3 = new JLabel("派车管理");
            lm3.setForeground(Color.gray);
            lm3.setHorizontalAlignment(JTextField.CENTER);

            this.add(bm11);
            this.add(bm10);
            this.add(tm8);
            this.add(lm2);
            this.add(lm3);

            bm11.setBounds(50,300,100,50);
            bm10.setBounds(200,300,100,50);
            tm8.setBounds(180,160,180,50);
            lm2.setBounds(0,160,180,50);
            lm3.setBounds(0,0,360,40);

            bm10.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    JOptionPane.showMessageDialog(null,"单击确定退出");
                    System.exit(0);
                }
            });
            this.setLayout(null);
            this.setBounds(900,300,400,500);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setVisible(true);

        }
    }
}