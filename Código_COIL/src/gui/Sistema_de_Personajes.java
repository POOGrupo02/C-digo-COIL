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
		setBounds(100, 100, 696, 520);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		{
			lblNewLabel = new JLabel("ELECCIÓN DE PERSONAJEES");
			lblNewLabel.setFont(new Font("Old English Text MT", Font.ITALIC, 29));
			lblNewLabel.setBounds(76, 11, 511, 132);
			contentPane.add(lblNewLabel);
		}
		{
			lblNewLabel_1 = new JLabel("VILLANO");
			lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_1.setBounds(97, 168, 81, 21);
			contentPane.add(lblNewLabel_1);
		}
		{
			lblNewLabel_2 = new JLabel("HERÓE");
			lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 16));
			lblNewLabel_2.setBounds(478, 171, 49, 14);
			contentPane.add(lblNewLabel_2);
		}
		{
			btnNewButton = new JButton("ELEGIR VILLANO");
			btnNewButton.addActionListener(this);
			btnNewButton.setBounds(64, 200, 126, 23);
			contentPane.add(btnNewButton);
		}
		{
			btnElegirHere = new JButton("ELEGIR HERÓE");
			btnElegirHere.addActionListener(this);
			btnElegirHere.setBounds(442, 196, 126, 23);
			contentPane.add(btnElegirHere);
		}
		comboBox = new JComboBox<>();
		comboBox.setVisible(false);
		comboBox.setBounds(240, 250, 180, 25);
		contentPane.add(comboBox);
		{
	
		btnMostrarSeleccion = new JButton("MOSTRAR SELECCIÓN");
		btnMostrarSeleccion.addActionListener(this);
		btnMostrarSeleccion.setVisible(false);
		btnMostrarSeleccion.setBounds(240, 290, 180, 25);
		contentPane.add(btnMostrarSeleccion);
		}
	
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
		comboBox.removeAllItems();
		comboBox.addItem("Brujo");
		comboBox.addItem("Asesino");
		comboBox.setVisible(true);
		btnMostrarSeleccion.setVisible(true);
	}
	protected void do_btnElegirHere_actionPerformed(ActionEvent e) {
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
			mensaje = "Has elegido al Brujo.\nUsa magia oscura y drena la vida de sus enemigos.";
		} else if (seleccion.equals("Asesino")) {
			mensaje = "Has elegido al Asesino.\nSilencioso y mortal, experto en venenos.";
		} else if (seleccion.equals("Curandero")) {
			mensaje = "Has elegido al Curandero.\nSana y protege a sus aliados en batalla.";
		} else if (seleccion.equals("Explorador")) {
			mensaje = "Has elegido al Explorador.\nÁgil y certero con el arco, se oculta entre las sombras.";
		} else {
			mensaje = "Por favor, selecciona un personaje.";
		}
//aqui hice con chat pq no me salia el mensaje luego del if xD
		JOptionPane.showMessageDialog(null, mensaje);
	}
	
}
