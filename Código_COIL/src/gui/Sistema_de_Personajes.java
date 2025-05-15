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
		setBounds(100, 100, 641, 448);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("ELECCIÓN DE PERSONAJES");
			lblNewLabel.setForeground(new Color(255, 255, 255));
			lblNewLabel.setFont(new Font("Palatino Linotype", Font.ITALIC, 29));
			lblNewLabel.setBounds(130, 29, 414, 64);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("VILLANO");
			lblNewLabel_1.setForeground(new Color(255, 255, 255));
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(42, 142, 66, 21);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("HÉROE");
			lblNewLabel_2.setForeground(new Color(255, 255, 255));
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(526, 136, 57, 32);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnNewButton = new JButton("ELEGIR VILLANO");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(10, 174, 126, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnElegirHere = new JButton("ELEGIR HÉROE");
			btnElegirHere.addActionListener(this);
			btnElegirHere.setBounds(489, 174, 126, 23);
			contentPane.add(btnElegirHere);
		}
		comboBox = new JComboBox<>();
		comboBox.setVisible(false);
		comboBox.setBounds(219, 337, 180, 25);
		contentPane.add(comboBox);
		{
	
		btnMostrarSeleccion = new JButton("MOSTRAR SELECCIÓN");
		btnMostrarSeleccion.addActionListener(this);
		btnMostrarSeleccion.setVisible(false);
		btnMostrarSeleccion.setBounds(219, 373, 180, 25);
		contentPane.add(btnMostrarSeleccion);
		}
		
		lblPersonaje = new JLabel("");
		lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/asesino.png")));
		lblPersonaje.setBounds(182, 83, 256, 230);
		contentPane.add(lblPersonaje);
		lblPersonaje.setVisible(false);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/background.png")));
		lblNewLabel_3.setBounds(-54, 14, 686, 412);
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
		String seleccion = (String) comboBox.getSelectedItem();
		
		String mensaje = "";
		if (seleccion.equals("Brujo")) {
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Brujo.\nUsa magia oscura y drena la vida de sus enemigos.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/brujo.png")));
		} else if (seleccion.equals("Asesino")) {
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Asesino.\nSilencioso y mortal, experto en venenos.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/asesino.png")));
		} else if (seleccion.equals("Curandero")) {
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Curandero.\nSana y protege a sus aliados en batalla.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/curandero.png")));
		} else if (seleccion.equals("Explorador")) {
			lblPersonaje.setVisible(true);
			mensaje = "Has elegido al Explorador.\nÁgil y certero con el arco, se oculta entre las sombras.";
			lblPersonaje.setIcon(new ImageIcon(Sistema_de_Personajes.class.getResource("/images/explorador.png")));
		} else {
			mensaje = "Por favor, selecciona un personaje.";
		}

		JOptionPane.showMessageDialog(null, mensaje);
	}
}
