package modulos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class Modulocajero extends JFrame {

	private JPanel contentPane;
	private JLabel lblCdigo;
	private JTextField txtCodigo;
	private JLabel lblApellido;
	private JTextField txtApellido;
	private JLabel lblNombre;
	private JTextField txtNombre;
	private JLabel lblEdad;
	private JTextField txtEdad;
	private JLabel lblTurno;
	private JComboBox cboTurno;
	private JLabel lblEstado;
	private JComboBox cboEstado;
	private JButton btnIngreso;
	private JButton btnModificacin;
	private JButton btnConsulta;
	private JButton btnEliminacin;
	private JButton btnListado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Modulocajero frame = new Modulocajero();
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
	public Modulocajero() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(26, 11, 56, 29);
		contentPane.add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(99, 11, 109, 29);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblApellido = new JLabel("Apellido");
		lblApellido.setBounds(26, 51, 64, 29);
		contentPane.add(lblApellido);
		
		txtApellido = new JTextField();
		txtApellido.setBounds(99, 46, 109, 29);
		contentPane.add(txtApellido);
		txtApellido.setColumns(10);
		
		lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(26, 81, 56, 29);
		contentPane.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(99, 81, 109, 29);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		lblEdad = new JLabel("Edad");
		lblEdad.setBounds(26, 121, 45, 29);
		contentPane.add(lblEdad);
		
		txtEdad = new JTextField();
		txtEdad.setBounds(99, 116, 109, 29);
		contentPane.add(txtEdad);
		txtEdad.setColumns(10);
		
		lblTurno = new JLabel("Turno");
		lblTurno.setBounds(26, 161, 56, 29);
		contentPane.add(lblTurno);
		
		cboTurno = new JComboBox();
		cboTurno.setModel(new DefaultComboBoxModel(new String[] {"D\u00EDa", "Noche"}));
		cboTurno.setBounds(99, 155, 109, 29);
		contentPane.add(cboTurno);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(26, 191, 56, 37);
		contentPane.add(lblEstado);
		
		cboEstado = new JComboBox();
		cboEstado.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "No disponible"}));
		cboEstado.setBounds(99, 195, 109, 29);
		contentPane.add(cboEstado);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.setBounds(297, 26, 109, 29);
		contentPane.add(btnIngreso);
		
		btnModificacin = new JButton("Modificaci\u00F3n");
		btnModificacin.setBounds(297, 60, 109, 29);
		contentPane.add(btnModificacin);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(297, 100, 109, 29);
		contentPane.add(btnConsulta);
		
		btnEliminacin = new JButton("Eliminaci\u00F3n");
		btnEliminacin.setBounds(297, 140, 109, 29);
		contentPane.add(btnEliminacin);
		
		btnListado = new JButton("Listado");
		btnListado.setBounds(297, 180, 109, 29);
		contentPane.add(btnListado);
	}
}
