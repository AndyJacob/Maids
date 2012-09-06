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
	private Kød_array k;
	private Frugt_array f;
	private Grønt_array g;
	private Korn_array ko;
	private Syltet_array s;
	private Tørret_array t;
	private JPanel contentPane;
	private JPanel buttom_panel1;
	private JButton btnNewButton;
	private JPanel dropdown_panel;
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
	private JLabel lblNewLabel;
	private JPanel person_panel;
	private JTextField textField;
	private JButton btnNewButton_1;

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
		k = new Kød_array();
		f = new Frugt_array();
		g = new Grønt_array();
		ko = new Korn_array();
		s = new Syltet_array();
		t = new Tørret_array();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 350);
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

		buttom_panel1 = new JPanel();
		udregn_salat.add(buttom_panel1, BorderLayout.WEST);
		buttom_panel1.setLayout(new FormLayout(new ColumnSpec[] {
				FormFactory.LABEL_COMPONENT_GAP_COLSPEC,
				ColumnSpec.decode("center:190px:grow"),
				ColumnSpec.decode("-10px"),},
			new RowSpec[] {
				FormFactory.LINE_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("23px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("31px"),
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("max(22dlu;default)"),
				FormFactory.RELATED_GAP_ROWSPEC,
				RowSpec.decode("default:grow"),}));
		
				btnNewButton = new JButton("Tilf\u00E6ldig salat");
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
				buttom_panel1.add(btnNewButton, "2, 2, center, center");
		
		btnNewButton_1 = new JButton(" Udregn ");
		buttom_panel1.add(btnNewButton_1, "2, 4, center, center");
		
		person_panel = new JPanel();
		buttom_panel1.add(person_panel, "2, 6, fill, fill");
		
				lblNewLabel = new JLabel("Antal personer:");
				person_panel.add(lblNewLabel);
				
				textField = new JTextField();
				person_panel.add(textField);
				textField.setColumns(5);

		dropdown_panel = new JPanel();
		udregn_salat.add(dropdown_panel, BorderLayout.CENTER);
		dropdown_panel.setLayout(new FormLayout(new ColumnSpec[] {
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
		dropdown_panel.add(comboBox, "4, 2, fill, default");

		comboBox_1 = new JComboBox();
		dropdown_panel.add(comboBox_1, "8, 2, fill, default");

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
		dropdown_panel.add(comboBox_2, "4, 4, fill, default");

		comboBox_9 = new JComboBox();
		dropdown_panel.add(comboBox_9, "8, 4, fill, default");

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
		dropdown_panel.add(comboBox_3, "4, 6, fill, default");

		comboBox_10 = new JComboBox();
		dropdown_panel.add(comboBox_10, "8, 6, fill, default");

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
		dropdown_panel.add(comboBox_4, "4, 8, fill, default");

		comboBox_11 = new JComboBox();
		dropdown_panel.add(comboBox_11, "8, 8, fill, default");

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
		dropdown_panel.add(comboBox_5, "4, 10, fill, default");

		comboBox_12 = new JComboBox();
		dropdown_panel.add(comboBox_12, "8, 10, fill, default");

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
		dropdown_panel.add(comboBox_6, "4, 12, fill, default");

		comboBox_13 = new JComboBox();
		dropdown_panel.add(comboBox_13, "8, 12, fill, default");

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
		dropdown_panel.add(comboBox_7, "4, 14, fill, default");

		comboBox_14 = new JComboBox();
		dropdown_panel.add(comboBox_14, "8, 14, fill, default");

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
		dropdown_panel.add(comboBox_8, "4, 16, fill, default");

		comboBox_15 = new JComboBox();
		dropdown_panel.add(comboBox_15, "8, 16, fill, default");

		JPanel indstillinger = new JPanel();
		tabbedPane.addTab("Indstillinger", null, indstillinger, null);
		indstillinger.setLayout(new BorderLayout(0, 0));

		panel_7 = new JPanel();
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

		chckbxNewCheckBox = new JCheckBox("Guler\u00F8dder fast");
		panel_7.add(chckbxNewCheckBox, "4, 4");
	}
}

