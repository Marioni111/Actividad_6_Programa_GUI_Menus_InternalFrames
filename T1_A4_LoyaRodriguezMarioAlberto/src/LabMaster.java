import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;

import javax.swing.*;
import javax.swing.border.Border;

public class LabMaster extends JFrame{
	
	public LabMaster() {
		crearComponentes();
	}
	
	public void crearComponentes() {
		
		getContentPane().setLayout(new BorderLayout());
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(995, 660);
		setLocationRelativeTo(null);
		setVisible(true);
		
		//---------------------------------------- INTERNAL FRAME ----------------------------------
		
		JDesktopPane panelVentana = new JDesktopPane();
		JInternalFrame internalFrame = new JInternalFrame();
		internalFrame.setDefaultCloseOperation(HIDE_ON_CLOSE);
		internalFrame.setLayout(null);
		internalFrame.setSize(980, 660);
		internalFrame.setTitle("Lab Master - Test Booking");
		internalFrame.setClosable(true);
		internalFrame.setIconifiable(true);
		internalFrame.setMaximizable(true);
		internalFrame.setResizable(true);
		internalFrame.setVisible(true);
		
		//-------------------------------------- MENU PRINCIPAL ----------------------------------
		
		JMenuBar menu = new JMenuBar();
			JMenu menuMasters = new JMenu("Masters");
			menu.add(menuMasters);
			JMenu menuBooking = new JMenu("Booking");
			menu.add(menuBooking);
			JMenu menuTestPerform = new JMenu("Test Perform");
			menu.add(menuTestPerform);
			JMenu menuPrinting = new JMenu("Printing");
			menu.add(menuPrinting);
			JMenu menuTransaction = new JMenu("Transaction");
			menu.add(menuTransaction);
			JMenu menuLabReports = new JMenu("Lab Reports");
			menu.add(menuLabReports);
			JMenu menuSettings = new JMenu("Settings");
			menu.add(menuSettings);
			JMenu menuUtilities = new JMenu("Utilities");
			menu.add(menuUtilities);
			JMenu menuWindow = new JMenu("Window");
			menu.add(menuWindow);
			JMenu menuHelp = new JMenu("Help");
			menu.add(menuHelp);			
		//internalFrame.setJMenuBar(menu);
		setJMenuBar(menu);
			
		//--------------------------------------- FIN DE MENU -------------------------------------
		
		//----------------------------------- BARRA DE HERRAMIENTAS -------------------------------
		
		JToolBar toolBar = new JToolBar();
			toolBar.add(new JButton("Add", new ImageIcon("Iconos/add.png")));
			toolBar.add(new JButton("Edit", new ImageIcon("Iconos/edit.png")));
			toolBar.add(new JButton("Back", new ImageIcon("Iconos/back.png")));
			toolBar.add(new JButton("Next", new ImageIcon("Iconos/next.png")));
			toolBar.add(new JButton("List", new ImageIcon("Iconos/list.png")));
			toolBar.add(new JButton("Save", new ImageIcon("Iconos/save.png")));
			toolBar.add(new JButton("Print", new ImageIcon("Iconos/print.png")));
			toolBar.add(new JButton("lost", new ImageIcon("Iconos/lost.png")));
			toolBar.add(new JButton("Cancel", new ImageIcon("Iconos/cancel.png")));
			toolBar.add(new JButton("Settings", new ImageIcon("Iconos/settings.png")));
			toolBar.add(new JButton("Delete", new ImageIcon("Iconos/delete.png")));
			toolBar.add(new JButton("Slip", new ImageIcon("Iconos/slip.png")));
			toolBar.add(new JButton("Exit", new ImageIcon("Iconos/exit.png")));
		//internalFrame.add(toolBar, BorderLayout.PAGE_START);
		add(toolBar, BorderLayout.PAGE_START);
			
		//---------------------------------- FIN BARRA DE HERRAMIENTAS -----------------------------
		
		//------------------------------------------ PANEL 1 ---------------------------------------
		Font f1 = new Font("Arial", Font.ITALIC, 12);
		JPanel panel1 = new JPanel();
			panel1.setBackground(new Color(176, 226, 255));
			panel1.setLayout(null);
			panel1.setPreferredSize(new Dimension(970, 190));
			panel1.setBounds(0, 0, 975, 190);
			
			JLabel label1 = new JLabel("Patient ID");
			label1.setFont(f1);
			label1.setBounds(10, 10, 70, 20);
			panel1.add(label1);
			
			JTextField textField = new JTextField(10);
			textField.setFont(f1);
			textField.setBounds(85, 10, 100, 20);
			panel1.add(textField);
			
			JLabel label2 = new JLabel("Name");
			label2.setFont(f1);
			label2.setBounds(10, 40, 50, 20);
			panel1.add(label2);
			
			JComboBox<String> combo = new JComboBox<String>();
			combo.addItem("MR.");
			combo.addItem("MRS.");
			combo.setFont(f1);
			combo.setBounds(85, 40, 75, 20);
			panel1.add(combo);
			
			JTextField textField2 = new JTextField(20);
			textField2.setFont(f1);
			textField2.setBounds(170, 40, 216, 20);
			panel1.add(textField2);
			
			JLabel label3 = new JLabel("Gender");
			label3.setFont(f1);
			label3.setBounds(10, 70, 80, 20);
			panel1.add(label3);
			
			JComboBox<String> combo2 = new JComboBox<String>();
			combo2.addItem("MALE");
			combo2.addItem("FEMALE");
			combo2.setFont(f1);
			combo2.setBounds(85, 70, 75, 20);
			panel1.add(combo2);
			
			JLabel label4 = new JLabel("Age");
			label4.setFont(f1);
			label4.setBounds(170, 70, 30, 20);
			panel1.add(label4);
			
			JTextField textField3 = new JTextField(3);
			textField3.setFont(f1);
			textField3.setText("0");
			textField3.setBounds(195, 70, 30, 20);
			panel1.add(textField3);
			
			JLabel label5 = new JLabel("Months");
			label5.setFont(f1);
			label5.setBounds(235, 70, 70, 20);
			panel1.add(label5);
			
			JTextField textField4 = new JTextField(3);
			textField4.setFont(f1);
			textField4.setText("0");
			textField4.setBounds(280, 70, 30, 20);
			panel1.add(textField4);
			
			JLabel label6 = new JLabel("Days");
			label6.setFont(f1);
			label6.setBounds(320, 70, 50, 20);
			panel1.add(label6);
			
			JTextField textField5 = new JTextField(3);
			textField5.setFont(f1);
			textField5.setText("0");
			textField5.setBounds(355, 70, 30, 20);
			panel1.add(textField5);
			
			JLabel label7 = new JLabel("Referred By:");
			label7.setFont(f1);
			label7.setBounds(10, 100, 80, 20);
			panel1.add(label7);
			
			JTextField textField6 = new JTextField(8);
			textField6.setFont(f1);
			textField6.setBounds(85, 100, 100, 20);
			panel1.add(textField6);
			
			JButton btn = new JButton(new ImageIcon("Iconos/icono.png"));
			btn.setBounds(185, 103, 16, 14);
			panel1.add(btn);
			
			JTextField textField7 = new JTextField(12);
			textField7.setFont(f1);
			textField7.setBounds(223, 100, 162, 20);
			panel1.add(textField7);
			
			JLabel label8 = new JLabel("Date");
			label8.setFont(f1);
			label8.setBounds(250, 10, 30, 20);
			panel1.add(label8);
			
			JComboBox<String> combo3 = new JComboBox<String>();
			combo3.addItem("dd/mm/aaaa");
			combo3.setFont(f1);
			combo3.setBounds(320, 10, 100, 20);
			panel1.add(combo3);
			
			JLabel label9 = new JLabel("*Time (hh:mm)");
			label9.setFont(f1);
			label9.setBounds(430, 10, 90, 20);
			panel1.add(label9);
			
			JTextField textField8 = new JTextField(2);
			textField8.setText("00");
			textField8.setFont(f1);
			textField8.setBounds(520, 10, 22, 20);
			panel1.add(textField8);
			
			JLabel label10 = new JLabel(":");
			label10.setFont(new Font("Arial", Font.BOLD, 12));
			label10.setBounds(545, 10, 10, 20);
			panel1.add(label10);
			
			JTextField textField9 = new JTextField(2);
			textField9.setText("00");
			textField9.setFont(f1);
			textField9.setBounds(550, 10, 22, 20);
			panel1.add(textField9);
			
			JLabel label11 = new JLabel("Lab No.");
			label11.setFont(f1);
			label11.setBounds(590, 10, 50, 20);
			panel1.add(label11);
			
			JTextField textField10 = new JTextField(10);
			textField10.setFont(f1);
			textField10.setBounds(640, 10, 100, 20);
			panel1.add(textField10);
			
			JLabel label12 = new JLabel("Sample By");
			label12.setFont(f1);
			label12.setBounds(400, 70, 60, 20);
			label12.setFont(f1);
			
			panel1.add(label12);
			
			JTextField textField11 = new JTextField(8);
			textField11.setFont(f1);
			textField11.setBounds(470, 70, 100, 20);
			panel1.add(textField11);
			
			JButton btn2 = new JButton(new ImageIcon("Iconos/icono.png"));
			btn2.setBounds(571, 73, 16, 14);
			panel1.add(btn2);
			
			JLabel label13 = new JLabel("Panel Code");
			label13.setFont(f1);
			label13.setBounds(400, 100, 80, 20);
			panel1.add(label13);
			
			JTextField textField12 = new JTextField(8);
			textField12.setFont(f1);
			textField12.setBounds(470, 100, 100, 20);
			panel1.add(textField12);
			
			JButton btn3 = new JButton(new ImageIcon("Iconos/icono.png"));
			btn3.setBounds(571, 103, 16, 14);
			panel1.add(btn3);
			
			JLabel label14 = new JLabel("Panel ID");
			label14.setFont(f1);
			label14.setBounds(400, 130, 80, 20);
			panel1.add(label14);
			
			JTextField textField13 = new JTextField(8);
			textField13.setFont(f1);
			textField13.setBounds(470, 130, 100, 20);
			panel1.add(textField13);
			
			JLabel label15 = new JLabel("e-mail");
			label15.setFont(f1);
			label15.setBounds(400, 160, 80, 20);
			panel1.add(label15);
			
			JTextField textField14 = new JTextField(8);
			textField14.setFont(f1);
			textField14.setBounds(470, 160, 100, 20);
			panel1.add(textField14);
			
		internalFrame.add(panel1);
		//add(panel1);
		//------------------------------------- FIN PANEL 1 ---------------------------------------
		
		//--------------------------------------- PANEL 2 -----------------------------------------
		JPanel panel2 = new JPanel();
			panel2.setBackground(new Color(176, 196, 222));
			panel2.setPreferredSize(new Dimension(640, 250));
			panel2.setLayout(null);
			panel2.setBounds(0, 190, 640, 250);
			
			String columnas[] = {"Text ID", "Text Name", "Rate", "Diec %", "Discount Acount",
								"Tax(%)", "Tax Amt."};
			String datos[][] = {{"", "", "", "", "", "", ""}};
			
			JTable table = new JTable(datos, columnas);
			JScrollPane scroll = new JScrollPane(table);
			scroll.setBounds(5, 5, 630, 40);
			panel2.add(scroll);
			
		internalFrame.add(panel2);
//		add(panel2);
		//-------------------------------------- FIN PANEL 2 ---------------------------------------
		
		//---------------------------------------- PANEL 3 -----------------------------------------
		Font f2 = new Font("Arial", Font.BOLD, 12);
		JPanel panel3 = new JPanel();
			panel3.setBackground(new Color(0, 191, 255));
			panel3.setPreferredSize(new Dimension(325, 260));
			panel3.setLayout(null);
			panel3.setBounds(640, 190, 335, 250);
			
			JLabel label20 = new JLabel("Total Tests");
			label20.setFont(f2);
			label20.setBounds(10, 10, 100, 20);
			panel3.add(label20);
			
			JProgressBar progressBar = new JProgressBar();
			progressBar.setMaximum(100);
			progressBar.setMinimum(0);
			progressBar.setValue(100);
			progressBar.setForeground(new Color(50, 205, 50));
			progressBar.setBounds(110, 10, 100, 15);
			panel3.add(progressBar);
			
			JLabel label21 = new JLabel("Test Amt.");
			label21.setFont(f2);
			label21.setBounds(10, 30, 100, 20);
			panel3.add(label21);
			
			JProgressBar progressBar2 = new JProgressBar();
			progressBar2.setMaximum(100);
			progressBar2.setMinimum(0);
			progressBar2.setValue(100);
			progressBar2.setForeground(new Color(50, 205, 50));
			progressBar2.setBounds(110, 30, 100, 15);
			panel3.add(progressBar2);
			
			JLabel label22 = new JLabel("Concession");
			label22.setFont(f2);
			label22.setBounds(10, 50, 100, 20);
			panel3.add(label22);
			
			JProgressBar progressBar3 = new JProgressBar();
			progressBar3.setMaximum(100);
			progressBar3.setMinimum(0);
			progressBar3.setValue(100);
			progressBar3.setForeground(new Color(50, 205, 50));
			progressBar3.setBounds(110, 50, 100, 15);
			panel3.add(progressBar3);
			
			JLabel label23 = new JLabel("Home Colection");
			label23.setFont(f2);
			label23.setBounds(10, 70, 120, 20);
			panel3.add(label23);
			
			JProgressBar progressBar4 = new JProgressBar();
			progressBar4.setMaximum(100);
			progressBar4.setMinimum(0);
			progressBar4.setValue(100);
			progressBar4.setForeground(new Color(50, 205, 50));
			progressBar4.setBounds(110, 70, 100, 15);
			panel3.add(progressBar4);
			
			JLabel label24 = new JLabel("Tax Amt.");
			label24.setFont(f2);
			label24.setBounds(10, 90, 120, 20);
			panel3.add(label24);
			
			JProgressBar progressBar5 = new JProgressBar();
			progressBar5.setMaximum(100);
			progressBar5.setMinimum(0);
			progressBar5.setValue(100);
			progressBar5.setForeground(new Color(50, 205, 50));
			progressBar5.setBounds(110, 90, 100, 15);
			panel3.add(progressBar5);
			
			JLabel label25 = new JLabel("Net Amt.");
			label25.setFont(f2);
			label25.setBounds(10, 110, 120, 20);
			panel3.add(label25);
			
			JProgressBar progressBar6 = new JProgressBar();
			progressBar6.setMaximum(100);
			progressBar6.setMinimum(0);
			progressBar6.setValue(100);
			progressBar6.setForeground(new Color(50, 205, 50));
			progressBar6.setBounds(110, 110, 100, 15);
			panel3.add(progressBar6);
			
			JLabel label26 = new JLabel("Balance");
			label26.setFont(f2);
			label26.setBounds(10, 130, 120, 20);
			panel3.add(label26);
			
			JProgressBar progressBar7 = new JProgressBar();
			progressBar7.setMaximum(100);
			progressBar7.setMinimum(0);
			progressBar7.setValue(100);
			progressBar7.setForeground(new Color(50, 205, 50));
			progressBar7.setBounds(110, 130, 100, 15);
			panel3.add(progressBar7);
			
		internalFrame.add(panel3);
		//add(panel3);
		
		//--------------------------------------- FIN PANEL 3 ---------------------------------------
		
		//----------------------------------------- PANEL 4 -----------------------------------------	
		JPanel panel4 = new JPanel();
			panel4.setBackground(new Color(176, 226, 255));
			panel4.setPreferredSize(new Dimension(970, 80));
			panel4.setLayout(null);
			panel4.setBounds(0, 440, 970, 80);
			
			JLabel label16 = new JLabel("Home Collection");
			label16.setFont(f1);
			label16.setBounds(5, 10, 120, 20);
			panel4.add(label16);
			
			JTextField textField15 = new JTextField(4);
			textField15.setText("0");
			textField15.setFont(f1);
			textField15.setBounds(102, 10, 60, 20);
			panel4.add(textField15);
			
			JLabel label17 = new JLabel("Paid");
			label17.setFont(f1);
			label17.setBounds(182, 10, 120, 20);
			panel4.add(label17);
			
			JTextField textField16 = new JTextField(5);
			textField16.setText("0");
			textField16.setFont(f1);
			textField16.setBounds(210, 10, 60, 20);
			panel4.add(textField16);
			
			JLabel label18 = new JLabel("Pay Type");
			label18.setFont(f1);
			label18.setBounds(285, 10, 120, 20);
			panel4.add(label18);
			
			JComboBox<String> combo4 = new JComboBox<String>();
			combo4.addItem("CASH");
			combo4.setFont(f1);
			combo4.setBounds(340, 10, 60, 20);
			panel4.add(combo4);
			
			JLabel label19 = new JLabel("Receipt No.");
			label19.setFont(f1);
			label19.setBounds(420, 10, 120, 20);
			panel4.add(label19);
			
			JTextField textField17 = new JTextField(8);
			textField17.setFont(f1);
			textField17.setBounds(485, 10, 60, 20);
			panel4.add(textField17);
			
		internalFrame.add(panel4);
		//add(panel4);
		
		//---------------------------------------- FIN PANEL 4 --------------------------------------
		
		panelVentana.add(internalFrame);
		add(panelVentana, BorderLayout.CENTER);
	}//Crear componentes
	
	public static void main(String[] args) {
		
		try {
			UIManager.setLookAndFeel("javax.swing.plaf.metal.MetalLookAndFeel");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		} catch (UnsupportedLookAndFeelException e) {
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				new LabMaster();
			}
		});
		
		new LabMaster();
	}
}