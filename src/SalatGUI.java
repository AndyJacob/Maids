import java.awt.BorderLayout;
import java.awt.EventQueue;

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
import javax.swing.JComboBox;
import javax.swing.JCheckBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTable;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class SalatGUI extends JFrame {
	private K�d_array k;
	private Frugt_array f;
	private Gr�nt_array g;
	private Korn_array ko;
	private Syltet_array s;
	private T�rret_array t;
	private JPanel contentPane;
	private JTextField personer;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JLabel lblGramIAlt;
	private JLabel label;
	private JLabel label_1;
	private JLabel label_2;
	private JLabel label_3;
	private JLabel label_4;
	private JLabel label_5;
	private JLabel label_6;
	private JLabel label_7;
	private JPanel panel_5;
	private JButton btnNewButton;
	private JPanel panel_6;
	private JComboBox comboBox;
	private JComboBox comboBox_1;
	private JComboBox comboBox_2;
	private JComboBox comboBox_3;
	private JComboBox comboBox_4;
	private JComboBox comboBox_5;
	private JComboBox comboBox_6;
	private JComboBox comboBox_7;
	private JComboBox comboBox_8;
	private JComboBox comboBox_9;
	private JComboBox comboBox_10;
	private JComboBox comboBox_11;
	private JComboBox comboBox_12;
	private JComboBox comboBox_13;
	private JComboBox comboBox_14;
	private JComboBox comboBox_15;
	private JPanel panel_7;
	private JCheckBox chckbxNewCheckBox;
	private JTextField textField_18;
	private JLabel lblNewLabel;

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
		k = new K�d_array();
		f = new Frugt_array();
		g = new Gr�nt_array();
		ko = new Korn_array();
		s = new Syltet_array();
		t = new T�rret_array();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 565, 329);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBorder(new BevelBorder(BevelBorder.RAISED, null, null, null, null));
		contentPane.add(tabbedPane, BorderLayout.CENTER);

		JPanel panel_1 = new JPanel();
		tabbedPane.addTab("Udregning af Salat", null, panel_1, null);
		panel_1.setLayout(new BorderLayout(0, 0));

		JPanel panel_3 = new JPanel();
		panel_1.add(panel_3, BorderLayout.WEST);
		panel_3.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("max(44dlu;default)"),
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(5dlu;default)"),},
				new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		JButton btlav = new JButton("Lav ny Salat");
		panel_3.add(btlav, "2, 4, 4, 1, center, top");

		JLabel lblAntalPersoner = new JLabel("Antal Personer:");
		panel_3.add(lblAntalPersoner, "2, 8, right, default");

		personer = new JTextField();
		panel_3.add(personer, "3, 8, fill, default");
		personer.setColumns(10);

		JPanel panel_4 = new JPanel();
		panel_1.add(panel_4, BorderLayout.CENTER);
		panel_4.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("31dlu"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("default:grow"),},
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
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,}));

		textField = new JTextField();
		textField.setEditable(false);
		panel_4.add(textField, "2, 2, fill, default");
		textField.setColumns(10);

		textField_9 = new JTextField();
		panel_4.add(textField_9, "4, 2");
		textField_9.setColumns(10);

		lblGramIAlt = new JLabel("gram i alt");
		panel_4.add(lblGramIAlt, "6, 2, center, default");

		textField_1 = new JTextField();
		textField_1.setEditable(false);
		panel_4.add(textField_1, "2, 4, fill, default");
		textField_1.setColumns(10);

		textField_10 = new JTextField();
		panel_4.add(textField_10, "4, 4, left, default");
		textField_10.setColumns(10);

		label = new JLabel("gram i alt");
		panel_4.add(label, "6, 4, center, default");

		textField_2 = new JTextField();
		textField_2.setEditable(false);
		panel_4.add(textField_2, "2, 6, fill, default");
		textField_2.setColumns(10);

		textField_11 = new JTextField();
		panel_4.add(textField_11, "4, 6, left, default");
		textField_11.setColumns(10);

		label_1 = new JLabel("gram i alt");
		panel_4.add(label_1, "6, 6, center, default");

		textField_3 = new JTextField();
		textField_3.setEditable(false);
		panel_4.add(textField_3, "2, 8, fill, default");
		textField_3.setColumns(10);

		textField_12 = new JTextField();
		panel_4.add(textField_12, "4, 8, left, default");
		textField_12.setColumns(10);

		label_2 = new JLabel("gram i alt");
		panel_4.add(label_2, "6, 8, center, default");

		textField_4 = new JTextField();
		textField_4.setEditable(false);
		panel_4.add(textField_4, "2, 10, fill, default");
		textField_4.setColumns(10);

		textField_13 = new JTextField();
		panel_4.add(textField_13, "4, 10, left, default");
		textField_13.setColumns(10);

		label_3 = new JLabel("gram i alt");
		panel_4.add(label_3, "6, 10, center, default");

		textField_5 = new JTextField();
		textField_5.setEditable(false);
		panel_4.add(textField_5, "2, 12, fill, default");
		textField_5.setColumns(10);

		textField_14 = new JTextField();
		panel_4.add(textField_14, "4, 12, left, default");
		textField_14.setColumns(10);

		label_4 = new JLabel("gram i alt");
		panel_4.add(label_4, "6, 12, center, default");

		textField_6 = new JTextField();
		textField_6.setEditable(false);
		panel_4.add(textField_6, "2, 14, fill, default");
		textField_6.setColumns(10);

		textField_15 = new JTextField();
		panel_4.add(textField_15, "4, 14, left, default");
		textField_15.setColumns(10);

		label_5 = new JLabel("gram i alt");
		panel_4.add(label_5, "6, 14, center, default");

		textField_7 = new JTextField();
		textField_7.setEditable(false);
		panel_4.add(textField_7, "2, 16, fill, default");
		textField_7.setColumns(10);

		textField_16 = new JTextField();
		panel_4.add(textField_16, "4, 16, left, default");
		textField_16.setColumns(10);

		label_6 = new JLabel("gram i alt");
		panel_4.add(label_6, "6, 16, center, default");

		textField_8 = new JTextField();
		textField_8.setEditable(false);
		panel_4.add(textField_8, "2, 18, fill, default");
		textField_8.setColumns(10);

		textField_17 = new JTextField();
		panel_4.add(textField_17, "4, 18, left, default");
		textField_17.setColumns(10);

		label_7 = new JLabel("gram i alt");
		panel_4.add(label_7, "6, 18, center, default");

		JPanel panel_2 = new JPanel();
		tabbedPane.addTab("Lav salat manuelt", null, panel_2, null);
		panel_2.setLayout(new BorderLayout(0, 0));

		panel_5 = new JPanel();
		panel_2.add(panel_5, BorderLayout.WEST);
		panel_5.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("91px:grow"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("-5px"),},
				new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(22dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));

		btnNewButton = new JButton("Lav Salat");
		btnNewButton.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent arg0) {
				int l = comboBox_1.getSelectedIndex();
				Ingerdines mid =null;
				if(k.getObject(l).getName().equals(comboBox_1.getModel().getSelectedItem()))
				{
					mid = k.getObject(l);
				}
				else if(s.getObject(l).getName().equals(comboBox_1.getModel().getSelectedItem()))
				{
					mid = s.getObject(l);
				}
				else if(g.getObject(l).getName().equals(comboBox_1.getModel().getSelectedItem()))
				{
					mid = g.getObject(l);
				}
				else if(t.getObject(l).getName().equals(comboBox_1.getModel().getSelectedItem()))
				{	
					mid = t.getObject(l);
				}
				else if(f.getObject(l).getName().equals(comboBox_1.getModel().getSelectedItem()))
				{	
					mid = f.getObject(l);
				}
				else if(ko.getObject(l).getName().equals(comboBox_1.getModel().getSelectedItem()))
				{	
					mid = ko.getObject(l);
				}
				if(textField_18.getText().equals(""))
				{
					textField_18.setText("1");
				}
					int u = Integer.parseInt(textField_18.getText());

				textField_9.setText(Integer.toString(Integer.parseInt(mid.getVeagt())*u));
				textField.setText(mid.getName());



			}
		});
		panel_5.add(btnNewButton, "2, 6, 5, 1, center, center");

		lblNewLabel = new JLabel("Antal personer:");
		panel_5.add(lblNewLabel, "2, 10, center, default");

		textField_18 = new JTextField();
		panel_5.add(textField_18, "4, 10, left, default");
		textField_18.setColumns(10);

		panel_6 = new JPanel();
		panel_2.add(panel_6, BorderLayout.CENTER);
		panel_6.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(55dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(80dlu;default)"),},
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

		comboBox = new JComboBox();
		comboBox.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_1.setModel(new DefaultComboBoxModel());
				comboBox_1.removeAllItems();
				if(comboBox.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_1.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_1.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_1.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_1.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_1.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_1.addItem(t.getObject(i).getName());
					}
				}
			}

		});
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox, "4, 2, fill, default");

		comboBox_1 = new JComboBox();
		panel_6.add(comboBox_1, "8, 2, fill, default");

		comboBox_2 = new JComboBox();
		comboBox_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				comboBox_9.setModel(new DefaultComboBoxModel());
				comboBox_9.removeAllItems();
				if(comboBox_2.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_9.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox_2.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_9.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox_2.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_9.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox_2.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_9.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox_2.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_9.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox_2.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_9.addItem(t.getObject(i).getName());
					}
				}
			}
		});
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox_2, "4, 4, fill, default");

		comboBox_9 = new JComboBox();
		panel_6.add(comboBox_9, "8, 4, fill, default");

		comboBox_3 = new JComboBox();
		comboBox_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_10.setModel(new DefaultComboBoxModel());
				comboBox_10.removeAllItems();
				if(comboBox_3.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_10.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox_3.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_10.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox_3.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_10.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox_3.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_10.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox_3.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_10.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox_3.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_10.addItem(t.getObject(i).getName());
					}
				}
			}
		});
		comboBox_3.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox_3, "4, 6, fill, default");

		comboBox_10 = new JComboBox();
		panel_6.add(comboBox_10, "8, 6, fill, default");

		comboBox_4 = new JComboBox();
		comboBox_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_11.setModel(new DefaultComboBoxModel());
				comboBox_11.removeAllItems();
				if(comboBox_4.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_11.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox_4.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_11.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox_4.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_11.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox_4.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_11.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox_4.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_11.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox_4.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_11.addItem(t.getObject(i).getName());
					}
				}
			}
		});
		comboBox_4.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox_4, "4, 8, fill, default");

		comboBox_11 = new JComboBox();
		panel_6.add(comboBox_11, "8, 8, fill, default");

		comboBox_5 = new JComboBox();
		comboBox_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_12.setModel(new DefaultComboBoxModel());
				comboBox_12.removeAllItems();
				if(comboBox_5.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_12.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox_5.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_12.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox_5.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_12.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox_5.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_12.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox_5.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_12.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox_5.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_12.addItem(t.getObject(i).getName());
					}
				}
			}
		});
		comboBox_5.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox_5, "4, 10, fill, default");

		comboBox_12 = new JComboBox();
		panel_6.add(comboBox_12, "8, 10, fill, default");

		comboBox_6 = new JComboBox();
		comboBox_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_13.setModel(new DefaultComboBoxModel());
				comboBox_13.removeAllItems();
				if(comboBox_6.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_13.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox_6.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_13.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox_6.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_13.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox_6.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_13.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox_6.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_13.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox_6.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_13.addItem(t.getObject(i).getName());
					}
				}
			}
		});
		comboBox_6.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox_6, "4, 12, fill, default");

		comboBox_13 = new JComboBox();
		panel_6.add(comboBox_13, "8, 12, fill, default");

		comboBox_7 = new JComboBox();
		comboBox_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_14.setModel(new DefaultComboBoxModel());
				comboBox_14.removeAllItems();
				if(comboBox_7.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_14.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox_7.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_14.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox_7.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_14.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox_7.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_14.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox_7.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_14.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox_7.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_14.addItem(t.getObject(i).getName());
					}
				}
			}
		});
		comboBox_7.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox_7, "4, 14, fill, default");

		comboBox_14 = new JComboBox();
		panel_6.add(comboBox_14, "8, 14, fill, default");

		comboBox_8 = new JComboBox();
		comboBox_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				comboBox_15.setModel(new DefaultComboBoxModel());
				comboBox_15.removeAllItems();
				if(comboBox_8.getModel().getSelectedItem().toString().equals("K\u00F8d/Ost")){
					for(int i=0; i<k.getSize(); i++){
						comboBox_15.addItem(k.getObject(i).getName());
					}
				}
				else if(comboBox_8.getModel().getSelectedItem().toString().equals("Frugt")){
					for(int i=0; i<f.getSize(); i++){
						comboBox_15.addItem(f.getObject(i).getName());
					}
				}
				else if(comboBox_8.getModel().getSelectedItem().toString().equals("Gr\u00F8nt")){
					for(int i=0; i<g.getSize(); i++){
						comboBox_15.addItem(g.getObject(i).getName());
					}
				}
				else if(comboBox_8.getModel().getSelectedItem().toString().equals("Korn")){
					for(int i=0; i<ko.getSize(); i++){
						comboBox_15.addItem(ko.getObject(i).getName());
					}
				}
				else if(comboBox_8.getModel().getSelectedItem().toString().equals("Syltet")){
					for(int i=0; i<s.getSize(); i++){
						comboBox_15.addItem(s.getObject(i).getName());
					}
				}
				else if(comboBox_8.getModel().getSelectedItem().toString().equals("T\u00F8rret")){
					for(int i=0; i<t.getSize(); i++){
						comboBox_15.addItem(t.getObject(i).getName());
					}
				}
			}
		});
		comboBox_8.setModel(new DefaultComboBoxModel(new String[] {"Syltet", "K\u00F8d/Ost", "Frugt", "Korn", "Gr\u00F8nt", "T\u00F8rret"}));
		panel_6.add(comboBox_8, "4, 16, fill, default");

		comboBox_15 = new JComboBox();
		panel_6.add(comboBox_15, "8, 16, fill, default");

		JPanel panel = new JPanel();
		tabbedPane.addTab("Indstilling", null, panel, null);
		panel.setLayout(new BorderLayout(0, 0));

		panel_7 = new JPanel();
		panel.add(panel_7, BorderLayout.CENTER);
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

		chckbxNewCheckBox = new JCheckBox("Guler\u00F8dder fast");
		panel_7.add(chckbxNewCheckBox, "4, 4");
	}
}

