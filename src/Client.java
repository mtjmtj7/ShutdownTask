import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;

public class Client extends JFrame {

	private JPanel contentPane;
	public JPanel panel;
	public JPanel panel_1;
	public JButton button;
	public JTextField hours;
	public JLabel label;
	public JTextField minutes;
	public JLabel label_1;
	public JTextField seconds;
	public JLabel label_2;
	public JButton button_1;
	int allTime=0;
	public JLabel label_3;
	public JLabel startLable;
	public JLabel lblTips;
	public JLabel lastTime;
	public JLabel label_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Client frame = new Client();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Client() {
		setTitle("\u5B9A\u65F6\u5173\u673A");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(500, 200, 698, 523);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		panel = new JPanel();
		panel.setBorder(new TitledBorder(null, "\u8BBE\u7F6E\u65F6\u95F4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel.setBounds(58, 69, 572, 133);
		contentPane.add(panel);
		panel.setLayout(null);
		
		hours = new JTextField();
		hours.setBounds(26, 52, 86, 33);
		panel.add(hours);
		hours.setColumns(10);
		
		label = new JLabel("\u5C0F\u65F6");
		label.setBounds(122, 52, 58, 33);
		panel.add(label);
		
		minutes = new JTextField();
		minutes.setBounds(190, 52, 93, 33);
		panel.add(minutes);
		minutes.setColumns(10);
		
		label_1 = new JLabel("\u5206\u949F");
		label_1.setBounds(293, 52, 86, 33);
		panel.add(label_1);
		
		seconds = new JTextField();
		seconds.setBounds(363, 52, 93, 33);
		panel.add(seconds);
		seconds.setColumns(10);
		
		label_2 = new JLabel("\u79D2");
		label_2.setBounds(466, 52, 70, 33);
		panel.add(label_2);
		
		panel_1 = new JPanel();
		panel_1.setBorder(new TitledBorder(null, "\u5269\u4F59\u65F6\u95F4", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		panel_1.setBounds(58, 327, 572, 133);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		label_3 = new JLabel("\u5F00\u59CB\u65F6\u95F4");
		label_3.setForeground(Color.BLACK);
		label_3.setBounds(36, 33, 99, 28);
		panel_1.add(label_3);
		
		startLable = new JLabel("");
		startLable.setFont(new Font("宋体", Font.PLAIN, 14));
		startLable.setBounds(130, 29, 212, 32);
		panel_1.add(startLable);
		
		lastTime = new JLabel("");
		lastTime.setForeground(new Color(255, 0, 0));
		lastTime.setFont(new Font("微软雅黑", Font.PLAIN, 24));
		lastTime.setBounds(197, 71, 145, 52);
		panel_1.add(lastTime);
		
		label_4 = new JLabel("\u5269\u4F59");
		label_4.setFont(new Font("微软雅黑", Font.PLAIN, 20));
		label_4.setBounds(122, 71, 65, 52);
		panel_1.add(label_4);
		
		button = new JButton("\u5F00\u59CB\u8BA1\u5212");
		button.addActionListener(new ButtonActionListener());
		button.setBounds(107, 235, 134, 36);
		contentPane.add(button);
		
		button_1 = new JButton("\u53D6\u6D88\u5173\u673A");
		button_1.addActionListener(new Button_1ActionListener());
		button_1.setBounds(329, 235, 134, 36);
		contentPane.add(button_1);
		
		lblTips = new JLabel("Tips\uFF1A\u5173\u95ED\u7A0B\u5E8F\u540E\u91CD\u65B0\u6253\u5F00\u4E5F\u80FD\u53D6\u6D88\u54E6~");
		lblTips.setForeground(Color.GRAY);
		lblTips.setFont(new Font("微软雅黑", Font.PLAIN, 11));
		lblTips.setBounds(329, 268, 225, 36);
		contentPane.add(lblTips);
		
		panel_2 = new JPanel();
		panel_2.setBorder(new TitledBorder(null, "\u8B66\u544A", TitledBorder.LEADING, TitledBorder.TOP, null, Color.RED));
		panel_2.setBounds(58, 10, 572, 49);
		contentPane.add(panel_2);
		panel_2.setLayout(null);
		
		label_5 = new JLabel("\u4E0D\u586B\u53C2\u6570\u7ACB\u9A6C\u5173\u673A\u4E86\uFF01\uFF01\uFF01\uFF01\uFF01");
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setFont(new Font("Microsoft YaHei UI", Font.PLAIN, 16));
		label_5.setForeground(Color.RED);
		label_5.setBounds(21, 10, 519, 39);
		panel_2.add(label_5);
		try {
		 javax.swing.UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");            
		 }catch(Exception e){  
		     e.printStackTrace();  
		 } 
	}
	private class ButtonActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			int hour_number = 0;
			int minute_number = 0;
			int second_number = 0;
			try {
				hour_number = Integer.parseInt(hours.getText());
			} catch (NumberFormatException e2) {
				hour_number = 0;
			}
			try {
				minute_number = Integer.parseInt(minutes.getText());
			} catch (NumberFormatException e2) {
				minute_number = 0;
			}
			try {
				second_number = Integer.parseInt(seconds.getText());
			} catch (NumberFormatException e2) {
				second_number = 0;
			}
			allTime = hour_number * 3600 + minute_number * 60 + second_number;
			String command = "cmd /c shutdown -s -t "+allTime;
			new ProcessThread(command).start();
		}
	}
	private class Button_1ActionListener implements ActionListener {
		public void actionPerformed(ActionEvent e) {
			new ProcessStopThread().start();
		}
	}
	TimeThread timeThread;
	public JPanel panel_2;
	public JLabel label_5;
	//开始线程
	class ProcessThread extends Thread{
		private String command;
		
		public ProcessThread(String cmd) {
			this.command = cmd;
		}
		
		@Override
		public void run() {
			BufferedReader br = null;
			try {
				timeThread = new TimeThread();
				timeThread.start();
				Process pro = Runtime.getRuntime().exec(command);
				br = new BufferedReader(new InputStreamReader(pro.getInputStream()));
				String line = null;
				StringBuilder sb = new StringBuilder();
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				System.out.println(sb.toString());
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	//结束线程
	class ProcessStopThread extends Thread{
		
		@Override
		public void run() {
			BufferedReader br = null;
			try {
				String command = "cmd /c shutdown -a";
				Process pro = Runtime.getRuntime().exec(command);
				br = new BufferedReader(new InputStreamReader(pro.getInputStream()));
				String line = null;
				StringBuilder sb = new StringBuilder();
				while ((line = br.readLine()) != null) {
					sb.append(line + "\n");
				}
				System.out.println(sb.toString());
				//停止计时器
				timeThread.stopThread();
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}
	//计时线程
	class TimeThread extends Thread{
		boolean flag=true;
		public void stopThread() {
			this.flag = false;
		}
		@Override
		public void run() {
			//当前时间
			SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Date start = new Date();
			String startTime = sf.format(start);
			startLable.setText(startTime);
			
			while(allTime != 0 && flag) {
				allTime--;
				try {
					Thread.sleep(1000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				lastTime.setText(String.valueOf(allTime));
			}
		}
	}
}
