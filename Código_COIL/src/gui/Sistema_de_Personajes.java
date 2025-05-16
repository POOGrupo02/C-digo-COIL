package gui;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTextField;

public class Sistema_de_Personajes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnElegirHere;
	private JComboBox<String> comboBox;
	private JButton btnMostrarSeleccion;
	private JLabel lblPersonaje;
	private JLabel lblNewLabel_4;
	private JTextField txtNom;
	private JLabel lblNewLabel_5;
	private JTextField txtNivel;
	private JLabel lblNewLabel_6;
	private JTextField txtSalud;
	private JTextField textField;
	private JLabel lblNewLabel_7;
	private JTextField textField_1;
	private JLabel lblNewLabel_8;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Sistema_de_Personajes frame = new Sistema_de_Personajes();
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
	
	public Sistema_de_Personajes() {
		
		setTitle("Sistema de Personajes");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1004, 601);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("ELECCIÓN DE PERSONAJES");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Palatino Linotype", Font.ITALIC, 29));
			lblNewLabel.setBounds(304, 0, 414, 53);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("VILLANO");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(37, 46, 66, 21);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("HÉROE");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(226, 40, 57, 32);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnNewButton = new JButton("ELEGIR VILLANO");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(10, 74, 138, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnElegirHere = new JButton("ELEGIR HÉROE");
			btnElegirHere.addActionListener(this);
			btnElegirHere.setBounds(199, 74, 126, 23);
			contentPane.add(btnElegirHere);
		}
		comboBox = new JComboBox<>();
		comboBox.setVisible(false);
		comboBox.setBounds(61, 166, 180, 25);
		contentPane.add(comboBox);
		{
	
		btnMostrarSeleccion = new JButton("MOSTRAR SELECCIÓN");
		btnMostrarSeleccion.addActionListener(this);
		btnMostrarSeleccion.setVisible(false);
		btnMostrarSeleccion.setBounds(61, 124, 180, 25);
		contentPane.add(btnMostrarSeleccion);
		}
		
		lblPersonaje = new JLabel("");
		lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/asesino.png")));
		lblPersonaje.setBounds(24, 224, 256, 230);
		contentPane.add(lblPersonaje);
		lblPersonaje.setVisible(false);
		{
			lblNewLabel_4 = new JLabel("NOMBRE");
			lblNewLabel_4.setForeground(Color.WHITE);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(349, 46, 86, 20);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(349, 75, 105, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			lblNewLabel_5 = new JLabel("NIVEL");
			lblNewLabel_5.setForeground(Color.WHITE);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setBounds(475, 46, 86, 20);
			contentPane.add(lblNewLabel_5);
		}
		{
			txtNivel = new JTextField();
			txtNivel.setColumns(10);
			txtNivel.setBounds(471, 75, 105, 20);
			contentPane.add(txtNivel);
		}
		{
			lblNewLabel_6 = new JLabel("SALUD");
			lblNewLabel_6.setForeground(Color.WHITE);
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_6.setBounds(593, 46, 86, 20);
			contentPane.add(lblNewLabel_6);
		}
		{
			txtSalud = new JTextField();
			txtSalud.setColumns(10);
			txtSalud.setBounds(591, 75, 105, 20);
			contentPane.add(txtSalud);
		}
		{
			textField = new JTextField();
			textField.setColumns(10);
			textField.setBounds(716, 77, 105, 20);
			contentPane.add(textField);
		}
		{
			lblNewLabel_7 = new JLabel("RESISTENCIA");
			lblNewLabel_7.setForeground(Color.WHITE);
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_7.setBounds(718, 48, 116, 20);
			contentPane.add(lblNewLabel_7);
		}
		{
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(842, 77, 105, 20);
			contentPane.add(textField_1);
		}
		{
			lblNewLabel_8 = new JLabel("VELOCIDAD");
			lblNewLabel_8.setForeground(Color.WHITE);
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_8.setBounds(844, 48, 116, 20);
			contentPane.add(lblNewLabel_8);
		}
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/background_999x570.png")));
		lblNewLabel_3.setBounds(0, 0, 339, 562);
		contentPane.add(lblNewLabel_3);
	
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMostrarSeleccion) {
			do_btnMostrarSeleccion_actionPerformed(e);
		}
		if (e.getSource() == btnElegirHere) {
			do_btnElegirHere_actionPerformed(e);
		}
		if (e.getSource() == btnNewButton) {
			do_btnNewButton_actionPerformed(e);
		}
	}
	protected void do_btnNewButton_actionPerformed(ActionEvent e) {
		lblPersonaje.setVisible(false);
		comboBox.removeAllItems();
		comboBox.addItem("Brujo");
		comboBox.addItem("Asesino");
		comboBox.setVisible(true);
		btnMostrarSeleccion.setVisible(true);
	}
	protected void do_btnElegirHere_actionPerformed(ActionEvent e) {
		lblPersonaje.setVisible(false);
		comboBox.removeAllItems();
		comboBox.addItem("Curandero");
		comboBox.addItem("Explorador");
		comboBox.setVisible(true);
		btnMostrarSeleccion.setVisible(true);
	}
	protected void do_btnMostrarSeleccion_actionPerformed(ActionEvent e) {
		String seleccion =comboBox.getSelectedItem().toString();
		
		String mensaje = "";
		switch (seleccion) {
		case"Brujo" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Brujo.\nUsa magia oscura y drena la vida de sus enemigos.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/brujo.png")));
			break;
		case"Asesino" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Asesino.\nSilencioso y mortal, experto en venenos.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/asesino.png")));
			break;
		case"Curandero" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Curandero.\nSana y protege a sus aliados en batalla.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/curandero.png")));
			break;
		case"Explorador" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Explorador.\nÁgil y certero con el arco, se oculta entre las sombras.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/explorador.png")));
			break;
                  
		default:
			mensaje = "Por favor, selecciona un personaje.";
			break;
		}

		JOptionPane.showMessageDialog(this, mensaje);
	}
}
