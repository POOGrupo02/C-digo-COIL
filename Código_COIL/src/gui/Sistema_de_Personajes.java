package gui;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;

public class Sistema_de_Personajes extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox cboPerso;
	private JLabel lblNewLabel;

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
			cboPerso = new JComboBox();
			cboPerso.setBounds(36, 36, 92, 22);
			contentPane.add(cboPerso);
		}
		{
			lblNewLabel = new JLabel("Tipo de Personaje:");
			lblNewLabel.setBounds(36, 11, 102, 14);
			contentPane.add(lblNewLabel);
		}
	}
}
