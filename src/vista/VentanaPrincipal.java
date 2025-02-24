package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JDialog;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Color;

public class VentanaPrincipal extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton btnNewButton;

	/**
	 * Create the frame.
	 */
	public VentanaPrincipal() {
		setTitle("Ventana Principal");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(204, 236, 221));
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnNewButton = new JButton("ACEPTAR");
		btnNewButton.setFont(new Font("Tempus Sans ITC", Font.BOLD, 15));
		btnNewButton.setBounds(133, 163, 164, 45);
		contentPane.add(btnNewButton);
		btnNewButton.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnNewButton) {
			try {
				VentanaSecundaria dialog = new VentanaSecundaria(VentanaPrincipal.this);
				dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
				dialog.setVisible(true);
			} catch (Exception ex) {
				ex.printStackTrace();
			}
		}
	}
}
