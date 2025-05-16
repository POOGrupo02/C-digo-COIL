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
import javax.swing.JTextArea;

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
	private JTextField txtFlecha;
	private JTextField txtEspada;
	private JLabel lblNewLabel_9;
	private JLabel lblNewLabel_10;
	private JTextField txtEscudo;
	private JLabel lblNewLabel_13;
	private JTextField txtNvlSigilo;
	private JLabel lblNewLabel_14;
	private JTextField txtHechizo;
	private JLabel lblNewLabel_16;
	private JTextField txtManá;
	private JLabel lblNewLabel_18;
	private JScrollPane scrollPane;
	private JTextArea txtS;
	private JLabel lblNewLabel_11;
	private JTextField txtPociones;
	private JTextField txtDañoVen;
	private JLabel lblNewLabel_12;

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
		comboBox.setBounds(65, 179, 180, 25);
		contentPane.add(comboBox);
		{
	
		btnMostrarSeleccion = new JButton("MOSTRAR SELECCIÓN");
		btnMostrarSeleccion.addActionListener(this);
		btnMostrarSeleccion.setVisible(false);
		btnMostrarSeleccion.setBounds(65, 137, 180, 25);
		contentPane.add(btnMostrarSeleccion);
		}
		
		lblPersonaje = new JLabel("");
		lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/asesino.png")));
		lblPersonaje.setBounds(37, 259, 256, 230);
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
		{
			txtFlecha = new JTextField();
			txtFlecha.setColumns(10);
			txtFlecha.setBounds(614, 139, 105, 20);
			contentPane.add(txtFlecha);
		}
		{
			txtEspada = new JTextField();
			txtEspada.setColumns(10);
			txtEspada.setBounds(486, 139, 105, 20);
			contentPane.add(txtEspada);
		}
		{
			lblNewLabel_9 = new JLabel("ESPADA");
			lblNewLabel_9.setForeground(Color.WHITE);
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_9.setBounds(486, 112, 116, 20);
			contentPane.add(lblNewLabel_9);
		}
		{
			lblNewLabel_10 = new JLabel("FLECHA ESPECIAL");
			lblNewLabel_10.setForeground(Color.WHITE);
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_10.setBounds(614, 112, 133, 20);
			contentPane.add(lblNewLabel_10);
		}
		{
			txtEscudo = new JTextField();
			txtEscudo.setColumns(10);
			txtEscudo.setBounds(349, 139, 105, 20);
			contentPane.add(txtEscudo);
		}
		{
			lblNewLabel_13 = new JLabel("ESCUDO DIVINO");
			lblNewLabel_13.setForeground(Color.WHITE);
			lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_13.setBounds(349, 112, 145, 20);
			contentPane.add(lblNewLabel_13);
		}
		{
			txtNvlSigilo = new JTextField();
			txtNvlSigilo.setColumns(10);
			txtNvlSigilo.setBounds(600, 201, 105, 20);
			contentPane.add(txtNvlSigilo);
		}
		{
			lblNewLabel_14 = new JLabel("NIVEL DE SIGILO");
			lblNewLabel_14.setForeground(Color.WHITE);
			lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_14.setBounds(593, 164, 126, 32);
			contentPane.add(lblNewLabel_14);
		}
		{
			txtHechizo = new JTextField();
			txtHechizo.setColumns(10);
			txtHechizo.setBounds(475, 199, 105, 20);
			contentPane.add(txtHechizo);
		}
		{
			lblNewLabel_16 = new JLabel("HECHIZO");
			lblNewLabel_16.setForeground(Color.WHITE);
			lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_16.setBounds(477, 170, 86, 20);
			contentPane.add(lblNewLabel_16);
		}
		{
			txtManá = new JTextField();
			txtManá.setColumns(10);
			txtManá.setBounds(349, 199, 105, 20);
			contentPane.add(txtManá);
		}
		{
			lblNewLabel_18 = new JLabel("MANÁ");
			lblNewLabel_18.setForeground(Color.WHITE);
			lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_18.setBounds(349, 170, 86, 20);
			contentPane.add(lblNewLabel_18);
		}
		{
			scrollPane = new JScrollPane();
			scrollPane.setBounds(349, 240, 598, 288);
			contentPane.add(scrollPane);
			{
				txtS = new JTextArea();
				scrollPane.setViewportView(txtS);
			}
		}
		{
			lblNewLabel_11 = new JLabel("CANTIDAD DE POCIONES");
			lblNewLabel_11.setForeground(Color.WHITE);
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_11.setBounds(753, 113, 207, 20);
			contentPane.add(lblNewLabel_11);
		}
		{
			txtPociones = new JTextField();
			txtPociones.setColumns(10);
			txtPociones.setBounds(751, 142, 105, 20);
			contentPane.add(txtPociones);
		}
		{
			txtDañoVen = new JTextField();
			txtDañoVen.setColumns(10);
			txtDañoVen.setBounds(738, 201, 105, 20);
			contentPane.add(txtDañoVen);
		}
		{
			lblNewLabel_12 = new JLabel("DAÑO VENENO");
			lblNewLabel_12.setForeground(Color.WHITE);
			lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_12.setBounds(740, 172, 116, 20);
			contentPane.add(lblNewLabel_12);
		}
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/background_999x570.png")));
		lblNewLabel_3.setBounds(0, 0, 988, 562);
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
