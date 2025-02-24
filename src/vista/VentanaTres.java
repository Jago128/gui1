package vista;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

public class VentanaTres extends JDialog implements ActionListener {

	private static final long serialVersionUID = 1L;
	private final JPanel contentPanel = new JPanel();
	private JButton btnNewButton;



	/**
	 * Create the dialog.
	 */
	public VentanaTres(JDialog parent, String texto) {
		super(parent,true);
		setTitle("Tercera Ventana");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel(texto);
		lblNewLabel.setBounds(55, 70, 330, 29);
		getContentPane().add(lblNewLabel);
		
		btnNewButton = new JButton("SALIR");
		btnNewButton.setBounds(172, 176, 85, 21);
		getContentPane().add(btnNewButton);
		contentPanel.setLayout(new FlowLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		btnNewButton.addActionListener(this);		
		
	}



	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource()==btnNewButton) {
			dispose(); 
		}
	}
}
