package gui;

import java.awt.BorderLayout;
import javax.swing.JOptionPane;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Clase_abuelo.Personaje_Base;
import Clase_hijos.Asesino;
import Clase_hijos.Brujo;
import Clase_hijos.Curandero;
import Clase_hijos.Explorador;
import Clase_hijos.Paladin;

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
import javax.swing.JTextPane;

public class Sistema_de_Personajes extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JButton btnElegirHere;
	private JComboBox<String> cboPerso;
	private JButton btnMostrarSeleccion;
	private JLabel lblPersonaje;
	private JLabel lblNewLabel_4;
	private JTextField txtNom;
	private JLabel lblNewLabel_5;
	private JTextField txtNivel;
	private JLabel lblNewLabel_6;
	private JTextField txtSalud;
	private JTextField txtResistencia;
	private JLabel lblNewLabel_7;
	private JTextField txtVelocidad;
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
	private JTextArea txtS;
	private JLabel lblNewLabel_11;
	private JTextField txtCantPociones;
	private JTextField txtDañoVen;
	private JLabel lblNewLabel_12;
	private JButton btnMostrarInfo;
	private JTextField txtEnergiaLumi;
	private JLabel lblNewLabel_15;
	private JLabel lblNewLabel_19;
	private JTextField txtHonor;
	private JLabel lblNewLabel_21;
	private JTextField txtEnergíaOscura;
	private JTextField txtMalicia;
	private JLabel lblNewLabel_22;

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
		setBounds(100, 100, 997, 594);
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
			lblNewLabel_1.setBounds(37, 40, 66, 21);
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
			btnNewButton.setBounds(10, 68, 138, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnElegirHere = new JButton("ELEGIR HÉROE");
			btnElegirHere.addActionListener(this);
			btnElegirHere.setBounds(199, 68, 126, 23);
			contentPane.add(btnElegirHere);
		}
		cboPerso = new JComboBox<>();
		cboPerso.addActionListener(this);
		cboPerso.setVisible(false);
		cboPerso.setBounds(65, 173, 180, 25);
		contentPane.add(cboPerso);
		{
	
		btnMostrarSeleccion = new JButton("MOSTRAR SELECCIÓN");
		btnMostrarSeleccion.addActionListener(this);
		btnMostrarSeleccion.setVisible(false);
		btnMostrarSeleccion.setBounds(65, 131, 180, 25);
		contentPane.add(btnMostrarSeleccion);
		}
		
		lblPersonaje = new JLabel("");
		lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/asesino.png")));
		lblPersonaje.setBounds(37, 246, 256, 230);
		contentPane.add(lblPersonaje);
		lblPersonaje.setVisible(false);
		{
			lblNewLabel_4 = new JLabel("NOMBRE");
			lblNewLabel_4.setForeground(Color.WHITE);
			lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_4.setBounds(349, 40, 86, 20);
			contentPane.add(lblNewLabel_4);
		}
		{
			txtNom = new JTextField();
			txtNom.setBounds(349, 69, 105, 20);
			contentPane.add(txtNom);
			txtNom.setColumns(10);
		}
		{
			lblNewLabel_5 = new JLabel("NIVEL");
			lblNewLabel_5.setForeground(Color.WHITE);
			lblNewLabel_5.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_5.setBounds(475, 40, 86, 20);
			contentPane.add(lblNewLabel_5);
		}
		{
			txtNivel = new JTextField();
			txtNivel.setColumns(10);
			txtNivel.setBounds(471, 69, 105, 20);
			contentPane.add(txtNivel);
		}
		{
			lblNewLabel_6 = new JLabel("SALUD");
			lblNewLabel_6.setForeground(Color.WHITE);
			lblNewLabel_6.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_6.setBounds(593, 40, 86, 20);
			contentPane.add(lblNewLabel_6);
		}
		{
			txtSalud = new JTextField();
			txtSalud.setColumns(10);
			txtSalud.setBounds(591, 69, 105, 20);
			contentPane.add(txtSalud);
		}
		{
			txtResistencia = new JTextField();
			txtResistencia.setColumns(10);
			txtResistencia.setBounds(716, 71, 105, 20);
			contentPane.add(txtResistencia);
		}
		{
			lblNewLabel_7 = new JLabel("RESISTENCIA");
			lblNewLabel_7.setForeground(Color.WHITE);
			lblNewLabel_7.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_7.setBounds(718, 42, 116, 20);
			contentPane.add(lblNewLabel_7);
		}
		{
			txtVelocidad = new JTextField();
			txtVelocidad.setColumns(10);
			txtVelocidad.setBounds(842, 71, 105, 20);
			contentPane.add(txtVelocidad);
		}
		{
			lblNewLabel_8 = new JLabel("VELOCIDAD");
			lblNewLabel_8.setForeground(Color.WHITE);
			lblNewLabel_8.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_8.setBounds(844, 42, 116, 20);
			contentPane.add(lblNewLabel_8);
		}
		{
			txtFlecha = new JTextField();
			txtFlecha.setEditable(false);
			txtFlecha.setColumns(10);
			txtFlecha.setBounds(614, 133, 105, 20);
			contentPane.add(txtFlecha);
		}
		{
			txtEspada = new JTextField();
			txtEspada.setEditable(false);
			txtEspada.setColumns(10);
			txtEspada.setBounds(486, 133, 105, 20);
			contentPane.add(txtEspada);
		}
		{
			lblNewLabel_9 = new JLabel("ESPADA");
			lblNewLabel_9.setForeground(Color.WHITE);
			lblNewLabel_9.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_9.setBounds(486, 106, 116, 20);
			contentPane.add(lblNewLabel_9);
		}
		{
			lblNewLabel_10 = new JLabel("FLECHA ESPECIAL");
			lblNewLabel_10.setForeground(Color.WHITE);
			lblNewLabel_10.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_10.setBounds(614, 106, 133, 20);
			contentPane.add(lblNewLabel_10);
		}
		{
			txtEscudo = new JTextField();
			txtEscudo.setEditable(false);
			txtEscudo.setColumns(10);
			txtEscudo.setBounds(349, 133, 105, 20);
			contentPane.add(txtEscudo);
		}
		{
			lblNewLabel_13 = new JLabel("ESCUDO DIVINO");
			lblNewLabel_13.setForeground(Color.WHITE);
			lblNewLabel_13.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_13.setBounds(349, 106, 145, 20);
			contentPane.add(lblNewLabel_13);
		}
		{
			txtNvlSigilo = new JTextField();
			txtNvlSigilo.setEditable(false);
			txtNvlSigilo.setColumns(10);
			txtNvlSigilo.setBounds(600, 195, 105, 20);
			contentPane.add(txtNvlSigilo);
		}
		{
			lblNewLabel_14 = new JLabel("NIVEL DE SIGILO");
			lblNewLabel_14.setForeground(Color.WHITE);
			lblNewLabel_14.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_14.setBounds(593, 158, 126, 32);
			contentPane.add(lblNewLabel_14);
		}
		{
			txtHechizo = new JTextField();
			txtHechizo.setEditable(false);
			txtHechizo.setColumns(10);
			txtHechizo.setBounds(475, 193, 105, 20);
			contentPane.add(txtHechizo);
		}
		{
			lblNewLabel_16 = new JLabel("HECHIZO");
			lblNewLabel_16.setForeground(Color.WHITE);
			lblNewLabel_16.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_16.setBounds(477, 164, 86, 20);
			contentPane.add(lblNewLabel_16);
		}
		{
			txtManá = new JTextField();
			txtManá.setEditable(false);
			txtManá.setColumns(10);
			txtManá.setBounds(349, 193, 105, 20);
			contentPane.add(txtManá);
		}
		{
			lblNewLabel_18 = new JLabel("MANÁ");
			lblNewLabel_18.setForeground(Color.WHITE);
			lblNewLabel_18.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_18.setBounds(349, 164, 86, 20);
			contentPane.add(lblNewLabel_18);
		}
		{
			lblNewLabel_11 = new JLabel("CANTIDAD DE POCIONES");
			lblNewLabel_11.setForeground(Color.WHITE);
			lblNewLabel_11.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_11.setBounds(753, 107, 207, 20);
			contentPane.add(lblNewLabel_11);
		}
		{
			txtCantPociones = new JTextField();
			txtCantPociones.setEditable(false);
			txtCantPociones.setColumns(10);
			txtCantPociones.setBounds(751, 136, 105, 20);
			contentPane.add(txtCantPociones);
		}
		{
			txtDañoVen = new JTextField();
			txtDañoVen.setEditable(false);
			txtDañoVen.setColumns(10);
			txtDañoVen.setBounds(738, 195, 105, 20);
			contentPane.add(txtDañoVen);
		}
		{
			lblNewLabel_12 = new JLabel("DAÑO VENENO");
			lblNewLabel_12.setForeground(Color.WHITE);
			lblNewLabel_12.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_12.setBounds(740, 166, 116, 20);
			contentPane.add(lblNewLabel_12);
		}
		{
			btnMostrarInfo = new JButton("MOSTRAR INFORMACIÓN");
			btnMostrarInfo.addActionListener(this);
			btnMostrarInfo.setFont(new Font("Tahoma", Font.PLAIN, 11));
			btnMostrarInfo.setBounds(37, 521, 186, 23);
			contentPane.add(btnMostrarInfo);
		}
		{
			txtS = new JTextArea();
			txtS.setBounds(351, 282, 596, 262);
			contentPane.add(txtS);
		}
		{
			txtEnergiaLumi = new JTextField();
			txtEnergiaLumi.setEditable(false);
			txtEnergiaLumi.setColumns(10);
			txtEnergiaLumi.setBounds(349, 253, 105, 20);
			contentPane.add(txtEnergiaLumi);
		}
		{
			lblNewLabel_15 = new JLabel("ENERGÍA LUMINOSA");
			lblNewLabel_15.setForeground(Color.WHITE);
			lblNewLabel_15.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_15.setBounds(349, 224, 171, 20);
			contentPane.add(lblNewLabel_15);
		}
		{
			txtHonor = new JTextField();
			txtHonor.setEditable(false);
			txtHonor.setColumns(10);
			txtHonor.setBounds(513, 253, 105, 20);
			contentPane.add(txtHonor);
		}
		{
			lblNewLabel_21 = new JLabel("ENERGÍA OSCURA");
			lblNewLabel_21.setForeground(Color.WHITE);
			lblNewLabel_21.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_21.setBounds(635, 224, 171, 20);
			contentPane.add(lblNewLabel_21);
		}
		{
			txtEnergíaOscura = new JTextField();
			txtEnergíaOscura.setEditable(false);
			txtEnergíaOscura.setColumns(10);
			txtEnergíaOscura.setBounds(635, 253, 105, 20);
			contentPane.add(txtEnergíaOscura);
		}
		{
			txtMalicia = new JTextField();
			txtMalicia.setEditable(false);
			txtMalicia.setColumns(10);
			txtMalicia.setBounds(799, 253, 105, 20);
			contentPane.add(txtMalicia);
		}
		{
			lblNewLabel_22 = new JLabel("MALICIA");
			lblNewLabel_22.setForeground(Color.WHITE);
			lblNewLabel_22.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_22.setBounds(799, 224, 171, 20);
			contentPane.add(lblNewLabel_22);
		}
		{
			lblNewLabel_19 = new JLabel("HONOR");
			lblNewLabel_19.setForeground(Color.WHITE);
			lblNewLabel_19.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_19.setBounds(513, 224, 171, 20);
			contentPane.add(lblNewLabel_19);
		}
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/background_999x570.png")));
		lblNewLabel_3.setBounds(0, 0, 988, 562);
		contentPane.add(lblNewLabel_3);
	
	}
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == btnMostrarInfo) {
			do_btnMostrarInfo_actionPerformed(e);
		}
		if (e.getSource() == cboPerso) {
			do_cboPerso_actionPerformed(e);
		}
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
		cboPerso.removeAllItems();
		cboPerso.addItem("Brujo");
		cboPerso.addItem("Asesino");
		cboPerso.setVisible(true);
		btnMostrarSeleccion.setVisible(true);
	}
	protected void do_btnElegirHere_actionPerformed(ActionEvent e) {
		lblPersonaje.setVisible(false);
		cboPerso.removeAllItems();
		cboPerso.addItem("Curandero");
		cboPerso.addItem("Explorador");
		cboPerso.addItem("Paladín");
		cboPerso.setVisible(true);
		btnMostrarSeleccion.setVisible(true);
	}
	protected void do_btnMostrarSeleccion_actionPerformed(ActionEvent e) {
		String seleccion =cboPerso.getSelectedItem().toString();
		String mensaje = "";
		
		Personaje_Base perso=null;
		switch (seleccion) {
		case"Brujo" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Brujo.\nUsa magia oscura y drena la vida de sus enemigos.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/brujo.png")));
			Desactivar();
			txtHechizo.setEditable(true);
			txtEnergíaOscura.setEditable(true);
			txtMalicia.setEditable(true);
			break;
		case"Asesino" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Asesino.\nSilencioso y mortal, experto en venenos.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/asesino.png")));
			Desactivar();
			txtNvlSigilo.setEditable(true);
			txtDañoVen.setEditable(true);
			txtEnergíaOscura.setEditable(true);
			txtMalicia.setEditable(true);
			break;
		case"Curandero" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Curandero.\nSana y protege a sus aliados en batalla.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/curandero.png")));
			Desactivar();
			txtCantPociones.setEditable(true);
			txtManá.setEditable(true);
			txtEnergiaLumi.setEditable(true );
			txtHonor.setEditable(true);
			break;
		case"Explorador" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Explorador.\nÁgil y certero con el arco, se oculta entre las sombras.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/explorador.png")));
			Desactivar();
			txtFlecha.setEditable(true);
			txtEnergiaLumi.setEditable(true );
			txtHonor.setEditable(true);
			break;
		case"Paladín" :
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Paladín.\\nUn valiente guerrero con gran resistencia y fuerte sentido de la justicia.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/paladin.jpg")));
			Desactivar();
			txtEscudo.setEditable(true);
			txtEspada.setEditable(true);
			txtEnergiaLumi.setEditable(true );
			txtHonor.setEditable(true);
			break;
                  
		default:
			mensaje = "Por favor, selecciona un personaje.";
			break;
		}

		JOptionPane.showMessageDialog(this, mensaje);
		JOptionPane.showMessageDialog(this,"Ahora ingrese los datos del personaje");
	}
	void Desactivar() 
	{
		txtEscudo.setEditable(false);
		txtEspada.setEditable(false);
		txtFlecha.setEditable(false);
		txtCantPociones.setEditable(false);
		txtManá.setEditable(false);
		txtHechizo.setEditable(false);
		txtNvlSigilo.setEditable(false);
		txtDañoVen.setEditable(false);
		txtEnergiaLumi.setEditable(false);
		txtHonor.setEditable(false);
		txtEnergíaOscura.setEditable(false);
		txtMalicia.setEditable(false);
	}
	void Imprimir(String s) {
		txtS.append(s+"\n");
	}
	void Listado(Personaje_Base perso) {
		Imprimir(perso.estadoGeneral());
		Imprimir(perso.ataqueBásico());
		Imprimir(perso.habilidadEspecial());
		Imprimir(perso.estadoGeneral());
	}
	protected void do_cboPerso_actionPerformed(ActionEvent e) {

	}
	protected void do_btnMostrarInfo_actionPerformed(ActionEvent e) {
		String seleccion =cboPerso.getSelectedItem().toString();
	
		
		String nombre=txtNom.getText();
		int nivel=Integer.parseInt(txtNivel.getText());
		int salud =Integer.parseInt(txtSalud.getText());
		int resistencia=Integer.parseInt(txtResistencia.getText());
		int velocidad=Integer.parseInt(txtVelocidad.getText());
		
		Personaje_Base perso=null;
		switch (seleccion) {
		case"Brujo" :
		    String hechizo=txtHechizo.getText();
		    int energiaOsc=Integer.parseInt(txtEnergíaOscura.getText());
		    int malicia=Integer.parseInt(txtMalicia.getText());
		    perso=new Brujo(nombre, nivel, salud, resistencia, velocidad, malicia, energiaOsc, hechizo);
		    Listado(perso);
			break;
		case"Asesino" :
			int nvlSigilo=Integer.parseInt(txtNvlSigilo.getText());
			int dañoVen=Integer.parseInt(txtDañoVen.getText());
			int energiaOsc1=Integer.parseInt(txtEnergíaOscura.getText());
		    int malicia1=Integer.parseInt(txtMalicia.getText());
			perso=new Asesino(nombre, nivel, salud, resistencia, velocidad, malicia1, energiaOsc1, nvlSigilo, dañoVen);
			Listado(perso);
			break;
		case"Curandero" :
			int cantPociones=Integer.parseInt(txtCantPociones.getText());
			int maná=Integer.parseInt(txtManá.getText());
			int energiaLum=Integer.parseInt(txtEnergiaLumi.getText());
		    int honor=Integer.parseInt(txtHechizo.getText());
		    perso=new Curandero(nombre, nivel, salud, resistencia, velocidad, honor, energiaLum, cantPociones, maná);
		    Listado(perso);
			break;
		case"Explorador" :
			String flecha=txtFlecha.getText();
			int energiaLum1=Integer.parseInt(txtEnergiaLumi.getText());
		    int honor1=Integer.parseInt(txtHechizo.getText());
		    perso=new Explorador(nombre, nivel, salud, resistencia, velocidad, honor1, energiaLum1, flecha);
		    Listado(perso);
			break;
		case"Paladín" :
			String escudo=txtEscudo.getText();
			String espada=txtEspada.getText();
			int energiaLum2=Integer.parseInt(txtEnergiaLumi.getText());
		    int honor2=Integer.parseInt(txtHechizo.getText());
		    perso=new Paladin(nombre, nivel, salud, resistencia, velocidad, honor2, energiaLum2, escudo, espada);
		    Listado(perso);
			break;
                 
		}
	}
}
