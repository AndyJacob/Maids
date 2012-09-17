import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Frame;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.FlowLayout;
import javax.swing.JLabel;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.RowSpec;
import java.awt.Font;
import javax.swing.JTabbedPane;
import javax.swing.border.BevelBorder;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Dialog.ModalExclusionType;
import java.awt.Window.Type;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import javax.swing.border.TitledBorder;
import javax.swing.JList;
import javax.swing.AbstractListModel;
import javax.swing.border.EtchedBorder;
import javax.swing.plaf.metal.MetalIconFactory;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class SalatGUI extends JFrame {
	private Kød_array k;
	private Frugt_array f;
	private Grønt_array g;
	private Korn_array ko;
	private Syltet_array s;
	private Tørret_array t;
	private int personer;
	private ingredient_array i_array;
	private JPanel contentPane;
	private JPanel buttom_panel1;
	private JButton random_button;
	private JPanel dropdown_panel;
	private JComboBox catagory_combo_1;
	private JComboBox ingredient_combo_1;
	private JComboBox catagory_combo_2;
	private JComboBox catagory_combo_3;
	private JComboBox catagory_combo_4;
	private JComboBox catagory_combo_5;
	private JComboBox catagory_combo_6;
	private JComboBox catagory_combo_7;
	private JComboBox catagory_combo_8;
	private JComboBox ingredient_combo_2;
	private JComboBox ingredient_combo_3;
	private JComboBox ingredient_combo_4;
	private JComboBox ingredient_combo_5;
	private JComboBox ingredient_combo_6;
	private JComboBox ingredient_combo_7;
	private JComboBox ingredient_combo_8;
	private JPanel panel_7;
	private JCheckBox carrots_fixed;
	private JLabel lblNewLabel;
	private JPanel person_panel;
	private JTextField personer_;
	private JButton calc_button;
	private JPanel panel;
	private JTextField gram_1;
	private JLabel lblG;
	private JPanel panel_1;
	private JTextField gram_2;
	private JLabel label;
	private JPanel panel_2;
	private JTextField gram_3;
	private JLabel label_1;
	private JPanel panel_3;
	private JTextField gram_4;
	private JLabel label_2;
	private JPanel panel_4;
	private JTextField gram_5;
	private JLabel label_3;
	private JPanel panel_5;
	private JTextField gram_6;
	private JLabel label_4;
	private JPanel panel_6;
	private JTextField gram_7;
	private JLabel label_5;
	private JPanel panel_8;
	private JTextField gram_8;
	private JLabel label_6;
	private JPanel warning_panel;
	private JLabel warning_salat;
	private JButton btnGemDagensSalat;
	String cat_1;
	String cat_2;
	String cat_3;
	String cat_4;
	String cat_5;
	String cat_6;
	String cat_7;
	String cat_8;
	private JPanel statistic_panel;
	private JPanel statistic_panel_inner1;
	private JList list;
	private ArrayList gemtListe_1;
	private ArrayList gemtListe_2;
	private ArrayList gemtListe_3;
	private ArrayList gemtListe_4;
	private ArrayList gemtListe_5;
	private ArrayList gemtListe_6;
	private ArrayList gemtListe_7;
	private ArrayList gemtListe_8;
	private ArrayList gemtListe_9;
	private ArrayList gemtListe_10;
	private ArrayList gemtListe_11;
	private ArrayList gemtListe_12;
	private ArrayList gemtListe_13;
	private ArrayList gemtListe_14;
	private JButton btnCheck;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SalatGUI frame = new SalatGUI();
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
	public SalatGUI() {
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent arg0) {
				try {
					SaveArray();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		});
		setResizable(false);
		personer = 1;
		k = new Kød_array();
		f = new Frugt_array();
		g = new Grønt_array();
		ko = new Korn_array();
		s = new Syltet_array();
		t = new Tørret_array();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 750, 393);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel udregn_salat = new JPanel();
		tabbedPane.addTab("Udregn salat", null, udregn_salat, null);
		udregn_salat.setLayout(new BorderLayout(0, 0));

		statistic_panel = new JPanel();
		udregn_salat.add(statistic_panel, BorderLayout.EAST);
		statistic_panel.setLayout(new BorderLayout(0, 0));

		statistic_panel_inner1 = new JPanel();
		statistic_panel_inner1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		statistic_panel.add(statistic_panel_inner1);

		gemtListe_1 = new ArrayList();
		gemtListe_2 = new ArrayList();
		gemtListe_3 = new ArrayList();
		gemtListe_4 = new ArrayList();
		gemtListe_5 = new ArrayList();
		gemtListe_6 = new ArrayList();
		gemtListe_7 = new ArrayList();
		gemtListe_8 = new ArrayList();
		gemtListe_9 = new ArrayList();
		gemtListe_10 = new ArrayList();
		gemtListe_11 = new ArrayList();
		gemtListe_12 = new ArrayList();
		gemtListe_13 = new ArrayList();
		gemtListe_14 = new ArrayList();

		loadArray("gemtListe_1", gemtListe_1);
		loadArray("gemtListe_2", gemtListe_2);

		list = new JList();
		list.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				if(e.getClickCount() == 2){
					if(list.getSelectedIndex() == 0 && !gemtListe_1.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_1.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_1.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_1.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_1.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_1.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_1.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_1.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_1.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_1.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_1.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_1.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_1.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_1.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_1.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_1.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_1.get(16));
					}
					else if(list.getSelectedIndex() == 1 && !gemtListe_2.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_2.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_2.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_2.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_2.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_2.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_2.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_2.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_2.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_2.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_2.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_2.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_2.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_2.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_2.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_2.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_2.get(16));
					}
					else if(list.getSelectedIndex() == 2 && !gemtListe_3.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_3.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_3.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_3.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_3.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_3.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_3.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_3.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_3.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_3.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_3.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_3.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_3.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_3.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_3.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_3.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_3.get(16));
					}
					else if(list.getSelectedIndex() == 3 && !gemtListe_4.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_4.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_4.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_4.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_4.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_4.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_4.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_4.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_4.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_4.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_4.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_4.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_4.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_4.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_4.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_4.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_4.get(16));
					}
					else if(list.getSelectedIndex() == 4 && !gemtListe_5.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_5.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_5.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_5.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_5.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_5.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_5.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_5.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_5.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_5.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_5.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_5.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_5.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_5.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_5.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_5.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_5.get(16));
					}
					else if(list.getSelectedIndex() == 5 && !gemtListe_6.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_6.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_6.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_6.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_6.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_6.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_6.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_6.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_6.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_6.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_6.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_6.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_6.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_6.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_6.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_6.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_6.get(16));
					}
					else if(list.getSelectedIndex() == 6 && !gemtListe_7.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_7.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_7.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_7.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_7.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_7.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_7.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_7.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_7.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_7.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_7.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_7.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_7.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_7.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_7.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_7.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_7.get(16));
					}
					else if(list.getSelectedIndex() == 7 && !gemtListe_8.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_8.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_8.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_8.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_8.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_8.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_8.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_8.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_8.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_8.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_8.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_8.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_8.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_8.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_8.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_8.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_8.get(16));
					}
					else if(list.getSelectedIndex() == 8 && !gemtListe_9.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_9.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_9.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_9.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_9.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_9.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_9.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_9.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_9.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_9.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_9.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_9.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_9.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_9.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_9.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_9.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_9.get(16));
					}
					else if(list.getSelectedIndex() == 9 && !gemtListe_10.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_10.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_10.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_10.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_10.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_10.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_10.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_10.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_10.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_10.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_10.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_10.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_10.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_10.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_10.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_10.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_10.get(16));
					}
					else if(list.getSelectedIndex() == 10 && !gemtListe_11.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_11.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_11.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_11.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_11.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_11.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_11.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_11.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_11.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_11.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_11.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_11.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_11.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_11.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_11.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_11.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_11.get(16));
					}
					else if(list.getSelectedIndex() == 11 && !gemtListe_12.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_12.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_12.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_12.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_12.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_12.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_12.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_12.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_12.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_12.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_12.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_12.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_12.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_12.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_12.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_12.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_12.get(16));
					}
					else if(list.getSelectedIndex() == 12 && !gemtListe_13.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_13.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_13.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_13.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_13.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_13.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_13.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_13.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_13.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_13.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_13.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_13.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_13.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_13.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_13.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_13.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_13.get(16));
					}
					else if(list.getSelectedIndex() == 13 && !gemtListe_14.isEmpty()){
						catagory_combo_1.setSelectedIndex((int) gemtListe_14.get(1));
						catagory_combo_2.setSelectedIndex((int) gemtListe_14.get(3));
						catagory_combo_3.setSelectedIndex((int) gemtListe_14.get(5));
						catagory_combo_4.setSelectedIndex((int) gemtListe_14.get(7));
						catagory_combo_5.setSelectedIndex((int) gemtListe_14.get(9));
						catagory_combo_6.setSelectedIndex((int) gemtListe_14.get(11));
						catagory_combo_7.setSelectedIndex((int) gemtListe_14.get(13));
						catagory_combo_8.setSelectedIndex((int) gemtListe_14.get(15));
						ingredient_combo_1.setSelectedIndex((int) gemtListe_14.get(2));
						ingredient_combo_2.setSelectedIndex((int) gemtListe_14.get(4));
						ingredient_combo_3.setSelectedIndex((int) gemtListe_14.get(6));
						ingredient_combo_4.setSelectedIndex((int) gemtListe_14.get(8));
						ingredient_combo_5.setSelectedIndex((int) gemtListe_14.get(10));
						ingredient_combo_6.setSelectedIndex((int) gemtListe_14.get(12));
						ingredient_combo_7.setSelectedIndex((int) gemtListe_14.get(14));
						ingredient_combo_8.setSelectedIndex((int) gemtListe_14.get(16));
					}
					
				}
			}
		});
		list.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		list.setModel(new AbstractListModel() {
			String[] values = new String[] {"dag 1", "dag 2", "dag 3", "dag 4", "dag 5", "dag 6", "dag 7", "dag 8", "dag 9", "dag 10", "dag 11", "dag 12", "dag 13", "dag 14"};
			public int getSize() {
				return values.length;
			}
			public Object getElementAt(int index) {
				return values[index];
			}
		});
		list.setSelectedIndex(0);
		ImageIcon yes_ico = new ImageIcon("bin/assets/yes.png","");
		ImageIcon no_ico = new ImageIcon("bin/assets/no.png","");
		Map<Object, Icon> icons = new HashMap<Object, Icon>();
		icons.put("dag 1", yes_ico);
		icons.put("dag 2", yes_ico);
		icons.put("dag 3", yes_ico);
		icons.put("dag 4", yes_ico);
		icons.put("dag 5", yes_ico);
		icons.put("dag 6", yes_ico);
		icons.put("dag 7", yes_ico);
		icons.put("dag 8", yes_ico);
		icons.put("dag 9", yes_ico);
		icons.put("dag 10", yes_ico);
		icons.put("dag 11", yes_ico);
		icons.put("dag 12", yes_ico);
		icons.put("dag 13", yes_ico);
		icons.put("dag 14", yes_ico);

		list.setCellRenderer(new IconListRenderer(icons));

		statistic_panel_inner1.add(list);

		warning_panel = new JPanel();
		udregn_salat.add(warning_panel, BorderLayout.SOUTH);

		warning_salat = new JLabel("Advarsel! Salat m\u00F8nster afviger fra det anviste.");
		warning_salat.setVisible(false);
		warning_salat.setForeground(Color.RED);
		warning_panel.add(warning_salat);

		panel_7 = new JPanel();
		JPanel indstillinger = new JPanel();
		tabbedPane.addTab("Indstillinger", null, indstillinger, null);
		indstillinger.setLayout(new BorderLayout(0, 0));
		indstillinger.add(panel_7, BorderLayout.CENTER);
		panel_7.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		buttom_panel1 = new JPanel();
		buttom_panel1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		udregn_salat.add(buttom_panel1, BorderLayout.WEST);
		buttom_panel1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("center:201px"),
				ColumnSpec.decode("-10px"),},
				new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("31px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));

		random_button = new JButton("Tilf\u00E6ldig salat");
		random_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personer = Integer.parseInt(personer_.getText());

				setCombo();

				if(cat_1.equals("f")){
					gram_1.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("k")){
					gram_1.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("g")){
					gram_1.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("ko")){
					gram_1.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("t")){
					gram_1.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("s")){
					gram_1.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}


				if(cat_2.equals("f")){
					gram_2.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("k")){
					gram_2.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("g")){
					gram_2.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("ko")){
					gram_2.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("t")){
					gram_2.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("s")){
					gram_2.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}




				if(cat_3.equals("f")){
					gram_3.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("k")){
					gram_3.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("g")){
					gram_3.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("ko")){
					gram_3.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("t")){
					gram_3.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("s")){
					gram_3.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_4.equals("f")){
					gram_4.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("k")){
					gram_4.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("g")){
					gram_4.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("ko")){
					gram_4.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("t")){
					gram_4.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("s")){
					gram_4.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_5.equals("f")){
					gram_5.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("k")){
					gram_5.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("g")){
					gram_5.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("ko")){
					gram_5.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("t")){
					gram_5.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("s")){
					gram_5.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}


				if(cat_6.equals("f")){
					gram_6.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("k")){
					gram_6.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("g")){
					gram_6.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("ko")){
					gram_6.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("t")){
					gram_6.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("s")){
					gram_6.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}


				if(cat_7.equals("f")){
					gram_7.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("k")){
					gram_7.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("g")){
					gram_7.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("ko")){
					gram_7.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("t")){
					gram_7.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("s")){
					gram_7.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}


				if(cat_8.equals("f")){
					gram_8.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("k")){
					gram_8.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("g")){
					gram_8.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("ko")){
					gram_8.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("t")){
					gram_8.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("s")){
					gram_8.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
			}

			private void setCombo() {
				int index_random_1 = (int)(Math.random() * ((ingredient_combo_1.getItemCount() - 1) + 1));	
				int index_random_2 = (int)(Math.random() * ((ingredient_combo_2.getItemCount() - 1) + 1));
				int index_random_3 = (int)(Math.random() * ((ingredient_combo_3.getItemCount() - 1) + 1));
				int index_random_4 = (int)(Math.random() * ((ingredient_combo_4.getItemCount() - 1) + 1));	
				int index_random_5 = (int)(Math.random() * ((ingredient_combo_5.getItemCount() - 1) + 1));
				int index_random_6 = (int)(Math.random() * ((ingredient_combo_6.getItemCount() - 1) + 1));
				int index_random_7 = (int)(Math.random() * ((ingredient_combo_7.getItemCount() - 1) + 1));	
				int index_random_8 = (int)(Math.random() * ((ingredient_combo_8.getItemCount() - 1) + 1));

				ingredient_combo_1.setSelectedIndex(index_random_1);
				ingredient_combo_2.setSelectedIndex(index_random_2);
				ingredient_combo_3.setSelectedIndex(index_random_3);
				ingredient_combo_4.setSelectedIndex(index_random_4);
				ingredient_combo_5.setSelectedIndex(index_random_5);
				ingredient_combo_6.setSelectedIndex(index_random_6);
				ingredient_combo_7.setSelectedIndex(index_random_7);
				ingredient_combo_8.setSelectedIndex(index_random_8);
				if(carrots_fixed.getModel().isSelected() == true) {
					catagory_combo_2.setSelectedIndex(4);
					ingredient_combo_2.setSelectedIndex(4);
				}

				ArrayList dupes1 = new ArrayList();
				dupes1.add(cat_1);
				dupes1.add(cat_2);
				dupes1.add(cat_3);
				dupes1.add(cat_4);
				dupes1.add(cat_5);
				dupes1.add(cat_6);
				dupes1.add(cat_7);
				dupes1.add(cat_8);

				ArrayList dupes2 = new ArrayList();
				dupes2.add(ingredient_combo_1.getSelectedIndex());
				dupes2.add(ingredient_combo_2.getSelectedIndex());
				dupes2.add(ingredient_combo_3.getSelectedIndex());
				dupes2.add(ingredient_combo_4.getSelectedIndex());
				dupes2.add(ingredient_combo_5.getSelectedIndex());
				dupes2.add(ingredient_combo_6.getSelectedIndex());
				dupes2.add(ingredient_combo_7.getSelectedIndex());
				dupes2.add(ingredient_combo_8.getSelectedIndex());

				int index_o = 0;
				int index_true_test = 0;
				for(Object o : dupes1){
					int index_m = 0;
					for(Object m : dupes1){
						if(o.equals(m)){
							if(dupes2.get(index_o).equals(dupes2.get(index_m))){
								index_true_test++;
							}
						}
						index_m++;
					}
					index_o++;
				}
				if(index_true_test > 8){
					setCombo();
				}
			}
		});


		buttom_panel1.add(random_button, "2, 2, center, center");

		calc_button = new JButton(" Udregn ");
		calc_button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				personer = Integer.parseInt(personer_.getText());
				if(cat_1.equals("f")){
					gram_1.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("k")){
					gram_1.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("g")){
					gram_1.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("ko")){
					gram_1.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("t")){
					gram_1.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_1.equals("s")){
					gram_1.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_1.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_2.equals("f")){
					gram_2.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("k")){
					gram_2.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("g")){
					gram_2.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("ko")){
					gram_2.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("t")){
					gram_1.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_2.equals("s")){
					gram_2.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_2.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_3.equals("f")){
					gram_3.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("k")){
					gram_3.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("g")){
					gram_3.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("ko")){
					gram_3.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("t")){
					gram_3.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_3.equals("s")){
					gram_3.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_3.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_4.equals("f")){
					gram_4.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("k")){
					gram_4.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("g")){
					gram_4.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("ko")){
					gram_4.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("t")){
					gram_4.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("s")){
					gram_5.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_4.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_5.equals("f")){
					gram_5.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_4.equals("k")){
					gram_5.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("g")){
					gram_5.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("ko")){
					gram_5.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("t")){
					gram_5.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_5.equals("s")){
					gram_5.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_5.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_6.equals("f")){
					gram_6.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("k")){
					gram_6.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("g")){
					gram_6.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("ko")){
					gram_6.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("t")){
					gram_6.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_6.equals("s")){
					gram_6.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_6.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_7.equals("f")){
					gram_7.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("k")){
					gram_7.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("g")){
					gram_7.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("ko")){
					gram_7.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("t")){
					gram_7.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_7.equals("s")){
					gram_7.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_7.getSelectedIndex()).getVeagt())*personer));
				}

				if(cat_8.equals("f")){
					gram_8.setText(Integer.toString(Integer.parseInt(f.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("k")){
					gram_8.setText(Integer.toString(Integer.parseInt(k.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("g")){
					gram_8.setText(Integer.toString(Integer.parseInt(g.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("ko")){
					gram_8.setText(Integer.toString(Integer.parseInt(ko.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("t")){
					gram_8.setText(Integer.toString(Integer.parseInt(t.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
				else if(cat_8.equals("s")){
					gram_8.setText(Integer.toString(Integer.parseInt(s.getObject(ingredient_combo_8.getSelectedIndex()).getVeagt())*personer));
				}
			}
		});
		buttom_panel1.add(calc_button, "2, 4, center, center");

		btnGemDagensSalat = new JButton("Gem salat");

		buttom_panel1.add(btnGemDagensSalat, "2, 6");

		person_panel = new JPanel();
		buttom_panel1.add(person_panel, "2, 8, center, fill");

		lblNewLabel = new JLabel("Antal personer:");
		person_panel.add(lblNewLabel);

		personer_ = new JTextField();
		person_panel.add(personer_);
		personer_.setColumns(5);

		btnCheck = new JButton("Check");
		btnCheck.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				checkCollisions();
			}
		});
		buttom_panel1.add(btnCheck, "2, 10");
		if(personer_.getText().equals(""))
		{
			personer_.setText("1");
		}


		dropdown_panel = new JPanel();
		udregn_salat.add(dropdown_panel, BorderLayout.CENTER);
		dropdown_panel.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(55dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(89dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(59dlu;default)"),},
				new RowSpec[] {
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));
		catagory_combo_8 = new JComboBox();
		catagory_combo_7 = new JComboBox();
		catagory_combo_6 = new JComboBox();
		catagory_combo_5 = new JComboBox();
		catagory_combo_4 = new JComboBox();
		catagory_combo_3 = new JComboBox();
		catagory_combo_2 = new JComboBox();
		catagory_combo_1 = new JComboBox();
		ingredient_combo_1 = new JComboBox();
		cat_1 = "";
		cat_2 = "";
		cat_3 = "";
		cat_4 = "";
		cat_5 = "";
		cat_6 = "";
		cat_7 = "";
		cat_8 = "";
		gram_1 = new JTextField();
		dropdown_panel.add(ingredient_combo_1, "6, 2, fill, default");

		catagory_combo_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingredient_combo_1.setModel(new DefaultComboBoxModel());
				ingredient_combo_1.removeAllItems();
				warning();
				if(catagory_combo_1.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_1.addItem(k.getObject(i).getName());
						cat_1 = "k";
					}
				}
				else if(catagory_combo_1.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_1.addItem(f.getObject(i).getName());
						cat_1 = "f";
					}
				}
				else if(catagory_combo_1.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_1.addItem(g.getObject(i).getName());
						cat_1 = "g";
					}
				}
				else if(catagory_combo_1.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_1.addItem(ko.getObject(i).getName());
						cat_1 = "ko";
					}
				}
				else if(catagory_combo_1.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_1.addItem(s.getObject(i).getName());
						cat_1 = "s";
					}
				}
				else if(catagory_combo_1.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_1.addItem(t.getObject(i).getName());
						cat_1 = "t";
					}
				}
			}

		});
		catagory_combo_1.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_1.setSelectedIndex(1);
		dropdown_panel.add(catagory_combo_1, "4, 2, fill, default");

		ingredient_combo_2 = new JComboBox();
		dropdown_panel.add(ingredient_combo_2, "6, 4, fill, default");

		catagory_combo_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ingredient_combo_2.setModel(new DefaultComboBoxModel());
				ingredient_combo_2.removeAllItems();
				warning();
				if(catagory_combo_2.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_2.addItem(k.getObject(i).getName());
						cat_2 = "k";
					}
				}
				else if(catagory_combo_2.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_2.addItem(f.getObject(i).getName());
						cat_2 = "f";
					}
				}
				else if(catagory_combo_2.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_2.addItem(g.getObject(i).getName());
						cat_2 = "g";
					}
				}
				else if(catagory_combo_2.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_2.addItem(ko.getObject(i).getName());
						cat_2 = "ko";
					}
				}
				else if(catagory_combo_2.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_2.addItem(s.getObject(i).getName());
						cat_2 = "s";
					}
				}
				else if(catagory_combo_2.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_2.addItem(t.getObject(i).getName());
						cat_2 = "t";
					}
				}
			}
		});

		panel = new JPanel();
		dropdown_panel.add(panel, "8, 2, fill, fill");

		panel.add(gram_1);
		gram_1.setColumns(6);

		lblG = new JLabel("g");
		panel.add(lblG);
		catagory_combo_2.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_2.setSelectedIndex(4);
		dropdown_panel.add(catagory_combo_2, "4, 4, fill, default");

		ingredient_combo_3 = new JComboBox();
		dropdown_panel.add(ingredient_combo_3, "6, 6, fill, default");

		catagory_combo_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingredient_combo_3.setModel(new DefaultComboBoxModel());
				ingredient_combo_3.removeAllItems();
				warning();
				if(catagory_combo_3.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_3.addItem(k.getObject(i).getName());
						cat_3 = "k";
					}
				}
				else if(catagory_combo_3.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_3.addItem(f.getObject(i).getName());
						cat_3 = "f";
					}
				}
				else if(catagory_combo_3.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_3.addItem(g.getObject(i).getName());
						cat_3 = "g";
					}
				}
				else if(catagory_combo_3.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_3.addItem(ko.getObject(i).getName());
						cat_3 = "ko";
					}
				}
				else if(catagory_combo_3.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_3.addItem(s.getObject(i).getName());
						cat_3 = "s";
					}
				}
				else if(catagory_combo_3.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_3.addItem(t.getObject(i).getName());
						cat_3 = "t";
					}
				}
			}
		});

		panel_1 = new JPanel();
		dropdown_panel.add(panel_1, "8, 4, fill, fill");

		gram_2 = new JTextField();
		gram_2.setColumns(6);
		panel_1.add(gram_2);

		label = new JLabel("g");
		panel_1.add(label);
		catagory_combo_3.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_3.setSelectedIndex(4);
		dropdown_panel.add(catagory_combo_3, "4, 6, fill, default");

		ingredient_combo_4 = new JComboBox();
		dropdown_panel.add(ingredient_combo_4, "6, 8, fill, default");

		catagory_combo_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingredient_combo_4.setModel(new DefaultComboBoxModel());
				ingredient_combo_4.removeAllItems();
				warning();
				if(catagory_combo_4.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_4.addItem(k.getObject(i).getName());
						cat_4 = "k";
					}
				}
				else if(catagory_combo_4.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_4.addItem(f.getObject(i).getName());
						cat_4 = "f";
					}
				}
				else if(catagory_combo_4.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_4.addItem(g.getObject(i).getName());
						cat_4 = "g";
					}
				}
				else if(catagory_combo_4.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_4.addItem(ko.getObject(i).getName());
						cat_4 = "ko";
					}
				}
				else if(catagory_combo_4.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_4.addItem(s.getObject(i).getName());
						cat_4 = "s";
					}
				}
				else if(catagory_combo_4.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_4.addItem(t.getObject(i).getName());
						cat_4 = "t";
					}
				}
			}
		});

		panel_2 = new JPanel();
		dropdown_panel.add(panel_2, "8, 6, fill, fill");

		gram_3 = new JTextField();
		gram_3.setColumns(6);
		panel_2.add(gram_3);

		label_1 = new JLabel("g");
		panel_2.add(label_1);
		catagory_combo_4.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_4.setSelectedIndex(0);
		dropdown_panel.add(catagory_combo_4, "4, 8, fill, default");

		ingredient_combo_5 = new JComboBox();
		dropdown_panel.add(ingredient_combo_5, "6, 10, fill, default");

		catagory_combo_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingredient_combo_5.setModel(new DefaultComboBoxModel());
				ingredient_combo_5.removeAllItems();
				warning();
				if(catagory_combo_5.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_5.addItem(k.getObject(i).getName());
						cat_5 = "k";
					}
				}
				else if(catagory_combo_5.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_5.addItem(f.getObject(i).getName());
						cat_5 = "f";
					}
				}
				else if(catagory_combo_5.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_5.addItem(g.getObject(i).getName());
						cat_5 = "g";
					}
				}
				else if(catagory_combo_5.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_5.addItem(ko.getObject(i).getName());
						cat_5 = "ko";
					}
				}
				else if(catagory_combo_5.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_5.addItem(s.getObject(i).getName());
						cat_5 = "s";
					}
				}
				else if(catagory_combo_5.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_5.addItem(t.getObject(i).getName());
						cat_5 = "t";
					}
				}
			}
		});

		panel_3 = new JPanel();
		dropdown_panel.add(panel_3, "8, 8, fill, fill");

		gram_4 = new JTextField();
		gram_4.setColumns(6);
		panel_3.add(gram_4);
		carrots_fixed = new JCheckBox("Guler\u00F8dder fast");
		carrots_fixed.setSelected(false);
		panel_7.add(carrots_fixed, "4, 4");
		label_2 = new JLabel("g");
		panel_3.add(label_2);
		catagory_combo_5.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_5.setSelectedIndex(0);
		dropdown_panel.add(catagory_combo_5, "4, 10, fill, default");

		ingredient_combo_6 = new JComboBox();
		dropdown_panel.add(ingredient_combo_6, "6, 12, fill, default");

		catagory_combo_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingredient_combo_6.setModel(new DefaultComboBoxModel());
				ingredient_combo_6.removeAllItems();
				warning();
				if(catagory_combo_6.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_6.addItem(k.getObject(i).getName());
						cat_6 = "k";
					}
				}
				else if(catagory_combo_6.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_6.addItem(f.getObject(i).getName());
						cat_6 = "f";
					}
				}
				else if(catagory_combo_6.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_6.addItem(g.getObject(i).getName());
						cat_6 = "g";
					}
				}
				else if(catagory_combo_6.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_6.addItem(ko.getObject(i).getName());
						cat_6 = "ko";
					}
				}
				else if(catagory_combo_6.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_6.addItem(s.getObject(i).getName());
						cat_6 = "s";
					}
				}
				else if(catagory_combo_6.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_6.addItem(t.getObject(i).getName());
						cat_6 = "t";
					}
				}
			}
		});

		panel_4 = new JPanel();
		dropdown_panel.add(panel_4, "8, 10, fill, fill");

		gram_5 = new JTextField();
		gram_5.setColumns(6);
		panel_4.add(gram_5);

		label_3 = new JLabel("g");
		panel_4.add(label_3);
		catagory_combo_6.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_6.setSelectedIndex(3);
		dropdown_panel.add(catagory_combo_6, "4, 12, fill, default");

		ingredient_combo_7 = new JComboBox();
		dropdown_panel.add(ingredient_combo_7, "6, 14, fill, default");

		catagory_combo_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingredient_combo_7.setModel(new DefaultComboBoxModel());
				ingredient_combo_7.removeAllItems();
				warning();
				if(catagory_combo_7.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_7.addItem(k.getObject(i).getName());
						cat_7 = "k";
					}
				}
				else if(catagory_combo_7.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_7.addItem(f.getObject(i).getName());
						cat_7 = "f";
					}
				}
				else if(catagory_combo_7.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_7.addItem(g.getObject(i).getName());
						cat_7 = "g";
					}
				}
				else if(catagory_combo_7.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_7.addItem(ko.getObject(i).getName());
						cat_7 = "ko";
					}
				}
				else if(catagory_combo_7.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_7.addItem(s.getObject(i).getName());
						cat_7 = "s";
					}
				}
				else if(catagory_combo_7.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_7.addItem(t.getObject(i).getName());
						cat_7 = "t";
					}
				}
			}
		});

		panel_5 = new JPanel();
		dropdown_panel.add(panel_5, "8, 12, fill, fill");

		gram_6 = new JTextField();
		gram_6.setColumns(6);
		panel_5.add(gram_6);

		label_4 = new JLabel("g");
		panel_5.add(label_4);
		catagory_combo_7.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_7.setSelectedIndex(5);
		dropdown_panel.add(catagory_combo_7, "4, 14, fill, default");

		ingredient_combo_8 = new JComboBox();
		dropdown_panel.add(ingredient_combo_8, "6, 16, fill, default");


		catagory_combo_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ingredient_combo_8.setModel(new DefaultComboBoxModel());
				ingredient_combo_8.removeAllItems();
				warning();
				if(catagory_combo_8.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						ingredient_combo_8.addItem(k.getObject(i).getName());
						cat_8 = "k";
					}
				}
				else if(catagory_combo_8.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						ingredient_combo_8.addItem(f.getObject(i).getName());
						cat_8 = "f";
					}
				}
				else if(catagory_combo_8.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						ingredient_combo_8.addItem(g.getObject(i).getName());
						cat_8 = "g";
					}
				}
				else if(catagory_combo_8.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						ingredient_combo_8.addItem(ko.getObject(i).getName());
						cat_8 = "ko";
					}
				}
				else if(catagory_combo_8.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						ingredient_combo_8.addItem(s.getObject(i).getName());
						cat_8 = "s";
					}
				}
				else if(catagory_combo_8.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						ingredient_combo_8.addItem(t.getObject(i).getName());
						cat_8 = "t";
					}
				}
			}
		});


		panel_6 = new JPanel();
		dropdown_panel.add(panel_6, "8, 14, fill, fill");

		gram_7 = new JTextField();
		gram_7.setColumns(6);
		panel_6.add(gram_7);

		label_5 = new JLabel("g");
		panel_6.add(label_5);
		catagory_combo_8.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		catagory_combo_8.setSelectedIndex(2);
		dropdown_panel.add(catagory_combo_8, "4, 16, fill, default");



		panel_8 = new JPanel();
		dropdown_panel.add(panel_8, "8, 16, fill, fill");

		gram_8 = new JTextField();
		gram_8.setColumns(6);
		panel_8.add(gram_8);

		label_6 = new JLabel("g");
		panel_8.add(label_6);




		btnGemDagensSalat.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedValue().equals("dag 1")){
					gemtListe_1.clear();
					gemtListe_1.add(list.getSelectedIndex());
					gemtListe_1.add(catagory_combo_1.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_1.add(catagory_combo_2.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_1.add(catagory_combo_3.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_1.add(catagory_combo_4.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_1.add(catagory_combo_5.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_1.add(catagory_combo_6.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_1.add(catagory_combo_7.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_1.add(catagory_combo_8.getSelectedIndex());
					gemtListe_1.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_1);
				}
				else if(list.getSelectedValue().equals("dag 2")){
					gemtListe_2.clear();
					gemtListe_2.add(list.getSelectedIndex());
					gemtListe_2.add(catagory_combo_1.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_2.add(catagory_combo_2.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_2.add(catagory_combo_3.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_2.add(catagory_combo_4.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_2.add(catagory_combo_5.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_2.add(catagory_combo_6.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_2.add(catagory_combo_7.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_2.add(catagory_combo_8.getSelectedIndex());
					gemtListe_2.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_2);
				}
				else if(list.getSelectedValue().equals("dag 3")){
					gemtListe_3.clear();
					gemtListe_3.add(list.getSelectedIndex());
					gemtListe_3.add(catagory_combo_1.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_3.add(catagory_combo_2.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_3.add(catagory_combo_3.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_3.add(catagory_combo_4.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_3.add(catagory_combo_5.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_3.add(catagory_combo_6.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_3.add(catagory_combo_7.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_3.add(catagory_combo_8.getSelectedIndex());
					gemtListe_3.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_3);
				}
				else if(list.getSelectedValue().equals("dag 4")){
					gemtListe_4.clear();
					gemtListe_4.add(list.getSelectedIndex());
					gemtListe_4.add(catagory_combo_1.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_4.add(catagory_combo_2.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_4.add(catagory_combo_3.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_4.add(catagory_combo_4.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_4.add(catagory_combo_5.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_4.add(catagory_combo_6.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_4.add(catagory_combo_7.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_4.add(catagory_combo_8.getSelectedIndex());
					gemtListe_4.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_4);
				}
				else if(list.getSelectedValue().equals("dag 5")){
					gemtListe_5.clear();
					gemtListe_5.add(list.getSelectedIndex());
					gemtListe_5.add(catagory_combo_1.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_5.add(catagory_combo_2.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_5.add(catagory_combo_3.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_5.add(catagory_combo_4.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_5.add(catagory_combo_5.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_5.add(catagory_combo_6.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_5.add(catagory_combo_7.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_5.add(catagory_combo_8.getSelectedIndex());
					gemtListe_5.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_5);
				}
				else if(list.getSelectedValue().equals("dag 6")){
					gemtListe_6.clear();
					gemtListe_6.add(list.getSelectedIndex());
					gemtListe_6.add(catagory_combo_1.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_6.add(catagory_combo_2.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_6.add(catagory_combo_3.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_6.add(catagory_combo_4.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_6.add(catagory_combo_5.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_6.add(catagory_combo_6.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_6.add(catagory_combo_7.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_6.add(catagory_combo_8.getSelectedIndex());
					gemtListe_6.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_6);
				}
				else if(list.getSelectedValue().equals("dag 7")){
					gemtListe_7.clear();
					gemtListe_7.add(list.getSelectedIndex());
					gemtListe_7.add(catagory_combo_1.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_7.add(catagory_combo_2.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_7.add(catagory_combo_3.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_7.add(catagory_combo_4.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_7.add(catagory_combo_5.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_7.add(catagory_combo_6.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_7.add(catagory_combo_7.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_7.add(catagory_combo_8.getSelectedIndex());
					gemtListe_7.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_7);
				}
				else if(list.getSelectedValue().equals("dag 8")){
					gemtListe_8.clear();
					gemtListe_8.add(list.getSelectedIndex());
					gemtListe_8.add(catagory_combo_1.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_8.add(catagory_combo_2.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_8.add(catagory_combo_3.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_8.add(catagory_combo_4.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_8.add(catagory_combo_5.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_8.add(catagory_combo_6.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_8.add(catagory_combo_7.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_8.add(catagory_combo_8.getSelectedIndex());
					gemtListe_8.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_8);
				}
				else if(list.getSelectedValue().equals("dag 9")){
					gemtListe_9.clear();
					gemtListe_9.add(list.getSelectedIndex());
					gemtListe_9.add(catagory_combo_1.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_9.add(catagory_combo_2.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_9.add(catagory_combo_3.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_9.add(catagory_combo_4.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_9.add(catagory_combo_5.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_9.add(catagory_combo_6.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_9.add(catagory_combo_7.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_9.add(catagory_combo_8.getSelectedIndex());
					gemtListe_9.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_9);
				}
				else if(list.getSelectedValue().equals("dag 10")){
					gemtListe_10.clear();
					gemtListe_10.add(list.getSelectedIndex());
					gemtListe_10.add(catagory_combo_1.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_10.add(catagory_combo_2.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_10.add(catagory_combo_3.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_10.add(catagory_combo_4.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_10.add(catagory_combo_5.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_10.add(catagory_combo_6.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_10.add(catagory_combo_7.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_10.add(catagory_combo_8.getSelectedIndex());
					gemtListe_10.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_10);
				}
				else if(list.getSelectedValue().equals("dag 11")){
					gemtListe_11.clear();
					gemtListe_11.add(list.getSelectedIndex());
					gemtListe_11.add(catagory_combo_1.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_11.add(catagory_combo_2.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_11.add(catagory_combo_3.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_11.add(catagory_combo_4.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_11.add(catagory_combo_5.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_11.add(catagory_combo_6.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_11.add(catagory_combo_7.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_11.add(catagory_combo_8.getSelectedIndex());
					gemtListe_11.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_11);
				}
				else if(list.getSelectedValue().equals("dag 12")){
					gemtListe_12.clear();
					gemtListe_12.add(list.getSelectedIndex());
					gemtListe_12.add(catagory_combo_1.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_12.add(catagory_combo_2.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_12.add(catagory_combo_3.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_12.add(catagory_combo_4.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_12.add(catagory_combo_5.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_12.add(catagory_combo_6.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_12.add(catagory_combo_7.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_12.add(catagory_combo_8.getSelectedIndex());
					gemtListe_12.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_2);
				}
				else if(list.getSelectedValue().equals("dag 13")){
					gemtListe_13.clear();
					gemtListe_13.add(list.getSelectedIndex());
					gemtListe_13.add(catagory_combo_1.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_13.add(catagory_combo_2.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_13.add(catagory_combo_3.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_13.add(catagory_combo_4.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_13.add(catagory_combo_5.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_13.add(catagory_combo_6.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_13.add(catagory_combo_7.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_13.add(catagory_combo_8.getSelectedIndex());
					gemtListe_13.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_13);
				}
				else if(list.getSelectedValue().equals("dag 14")){
					gemtListe_14.clear();
					gemtListe_14.add(list.getSelectedIndex());
					gemtListe_14.add(catagory_combo_1.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_1.getSelectedIndex());
					gemtListe_14.add(catagory_combo_2.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_2.getSelectedIndex());
					gemtListe_14.add(catagory_combo_3.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_3.getSelectedIndex());
					gemtListe_14.add(catagory_combo_4.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_4.getSelectedIndex());
					gemtListe_14.add(catagory_combo_5.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_5.getSelectedIndex());
					gemtListe_14.add(catagory_combo_6.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_6.getSelectedIndex());
					gemtListe_14.add(catagory_combo_7.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_7.getSelectedIndex());
					gemtListe_14.add(catagory_combo_8.getSelectedIndex());
					gemtListe_14.add(ingredient_combo_8.getSelectedIndex());
					System.out.println(gemtListe_14);
				}
			}
		});
	}		
	public void warning(){

		if(catagory_combo_1.getSelectedIndex() == 1 &&
				catagory_combo_2.getSelectedIndex() == 4 &&
				catagory_combo_3.getSelectedIndex() == 4 &&
				catagory_combo_4.getSelectedIndex() == 0 &&
				catagory_combo_5.getSelectedIndex() == 0 &&
				catagory_combo_6.getSelectedIndex() == 3 &&
				catagory_combo_7.getSelectedIndex() == 5 &&
				catagory_combo_8.getSelectedIndex() == 2){
			warning_salat.setVisible(false);
		}
		else {
			warning_salat.setVisible(true);
		}
	}
	public void checkCollisions(){
		ArrayList collision_array = new ArrayList();
		collision_array.add(list.getSelectedIndex());
		if(ingredient_combo_1 != null){
			collision_array.add(catagory_combo_1.getSelectedIndex());
			collision_array.add(ingredient_combo_1.getSelectedIndex());
		}
		if(ingredient_combo_2 != null){
			collision_array.add(catagory_combo_2.getSelectedIndex());
			collision_array.add(ingredient_combo_2.getSelectedIndex());
		}
		if(ingredient_combo_3 != null){
			collision_array.add(catagory_combo_3.getSelectedIndex());
			collision_array.add(ingredient_combo_3.getSelectedIndex());
		}
		if(ingredient_combo_4 != null){
			collision_array.add(catagory_combo_4.getSelectedIndex());
			collision_array.add(ingredient_combo_4.getSelectedIndex());
		}
		if(ingredient_combo_5 != null){
			collision_array.add(catagory_combo_5.getSelectedIndex());
			collision_array.add(ingredient_combo_5.getSelectedIndex());
		}
		if(ingredient_combo_6 != null){
			collision_array.add(catagory_combo_6.getSelectedIndex());
			collision_array.add(ingredient_combo_6.getSelectedIndex());
		}
		if(ingredient_combo_7 != null){
			collision_array.add(catagory_combo_7.getSelectedIndex());
			collision_array.add(ingredient_combo_7.getSelectedIndex());
		}
		if(ingredient_combo_8 != null){
			collision_array.add(catagory_combo_8.getSelectedIndex());
			collision_array.add(ingredient_combo_8.getSelectedIndex());
		}

		ImageIcon yes_ico = new ImageIcon("bin/assets/yes.png","");
		ImageIcon no_ico = new ImageIcon("bin/assets/no.png","");
		Map<Object, Icon> icons = new HashMap<Object, Icon>();
		ArrayList tempArray = new ArrayList();

		collision_array.remove(0);
		System.out.println(collision_array);
		tempArray.addAll(gemtListe_1);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		System.out.println(tempArray);
		if(!collision_array.equals(tempArray)){
			icons.put("dag 1", yes_ico);
		}
		else icons.put("dag 1", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_2);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 2", yes_ico);
		}
		else icons.put("dag 2", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_3);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 3", yes_ico);
		}
		else icons.put("dag 3", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_4);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 4", yes_ico);
		}
		else icons.put("dag 4", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_5);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 5", yes_ico);
		}
		else icons.put("dag 5", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_6);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 6", yes_ico);
		}
		else icons.put("dag 6", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_7);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 7", yes_ico);
		}
		else icons.put("dag 7", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_8);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 8", yes_ico);
		}
		else icons.put("dag 8", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_9);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 9", yes_ico);
		}
		else icons.put("dag 9", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_10);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 10", yes_ico);
		}
		else icons.put("dag 10", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_11);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 11", yes_ico);
		}
		else icons.put("dag 11", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_12);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 12", yes_ico);
		}
		else icons.put("dag 12", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_13);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 13", yes_ico);
		}
		else icons.put("dag 13", no_ico);
		tempArray.clear();

		tempArray.addAll(gemtListe_14);
		if(!tempArray.isEmpty()){
			tempArray.remove(0);
		}
		if(!collision_array.equals(tempArray)){
			icons.put("dag 14", yes_ico);
		}
		else icons.put("dag 14", no_ico);
		tempArray.clear();

		list.setCellRenderer(new IconListRenderer(icons));
	}
	public void SaveArray() throws IOException {

		FileWriter fstream1 = null;
		FileWriter fstream2 = null;
		FileWriter fstream3 = null;
		FileWriter fstream4 = null;
		FileWriter fstream5 = null;
		FileWriter fstream6 = null;
		FileWriter fstream7 = null;
		FileWriter fstream8 = null;
		FileWriter fstream9 = null;
		FileWriter fstream10 = null;
		FileWriter fstream11 = null;
		FileWriter fstream12 = null;
		FileWriter fstream13 = null;
		FileWriter fstream14 = null;
		try {
			fstream1 = new FileWriter("gemtListe_1");
			BufferedWriter out1 = new BufferedWriter(fstream1);
			for(int i=0; gemtListe_1.size()>i ; i++){
				try {
					out1.write(gemtListe_1.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream2 = new FileWriter("gemtListe_2");
			BufferedWriter out2 = new BufferedWriter(fstream2);
			for(int i=0; gemtListe_2.size()>i ; i++){
				try {
					out2.write(gemtListe_2.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream3 = new FileWriter("gemtListe_3");
			BufferedWriter out3 = new BufferedWriter(fstream3);
			for(int i=0; gemtListe_3.size()>i ; i++){
				try {
					out3.write(gemtListe_3.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream4 = new FileWriter("gemtListe_4");
			BufferedWriter out4 = new BufferedWriter(fstream4);
			for(int i=0; gemtListe_4.size()>i ; i++){
				try {
					out4.write(gemtListe_4.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}			
			fstream5 = new FileWriter("gemtListe_5");
			BufferedWriter out5 = new BufferedWriter(fstream5);
			for(int i=0; gemtListe_5.size()>i ; i++){
				try {
					out5.write(gemtListe_5.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream6 = new FileWriter("gemtListe_6");
			BufferedWriter out6 = new BufferedWriter(fstream6);
			for(int i=0; gemtListe_6.size()>i ; i++){
				try {
					out6.write(gemtListe_6.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream7 = new FileWriter("gemtListe_7");
			BufferedWriter out7 = new BufferedWriter(fstream7);
			for(int i=0; gemtListe_7.size()>i ; i++){
				try {
					out7.write(gemtListe_7.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream8 = new FileWriter("gemtListe_8");
			BufferedWriter out8 = new BufferedWriter(fstream8);
			for(int i=0; gemtListe_8.size()>i ; i++){
				try {
					out8.write(gemtListe_8.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream9 = new FileWriter("gemtListe_9");
			BufferedWriter out9 = new BufferedWriter(fstream9);
			for(int i=0; gemtListe_9.size()>i ; i++){
				try {
					out9.write(gemtListe_9.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream10 = new FileWriter("gemtListe_10");
			BufferedWriter out10 = new BufferedWriter(fstream10);
			for(int i=0; gemtListe_10.size()>i ; i++){
				try {
					out10.write(gemtListe_10.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream11 = new FileWriter("gemtListe_11");
			BufferedWriter out11 = new BufferedWriter(fstream11);
			for(int i=0; gemtListe_11.size()>i ; i++){
				try {
					out11.write(gemtListe_11.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream12 = new FileWriter("gemtListe_12");
			BufferedWriter out12 = new BufferedWriter(fstream12);
			for(int i=0; gemtListe_12.size()>i ; i++){
				try {
					out12.write(gemtListe_12.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream13 = new FileWriter("gemtListe_13");
			BufferedWriter out13 = new BufferedWriter(fstream13);
			for(int i=0; gemtListe_13.size()>i ; i++){
				try {
					out13.write(gemtListe_13.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
			fstream14 = new FileWriter("gemtListe_14");
			BufferedWriter out14 = new BufferedWriter(fstream1);
			for(int i=0; gemtListe_14.size()>i ; i++){
				try {
					out14.write(gemtListe_14.get(i)+ "\n");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}

			out1.close();
			out2.close();
			out3.close();
			out4.close();
			out5.close();
			out6.close();
			out7.close();
			out8.close();
			out9.close();
			out10.close();
			out11.close();
			out12.close();
			out13.close();
			out14.close();



		} catch (IOException e1) {
			e1.printStackTrace();
		}
	}
	public void loadArray(String filename, ArrayList a){
		BufferedReader br = null;
		try {
			String sCurrentLine;
			br = new BufferedReader(new FileReader(filename));
			while ((sCurrentLine = br.readLine()) != null) {
				System.out.println(sCurrentLine);
				a.add(Integer.parseInt(sCurrentLine));
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
	}
}

