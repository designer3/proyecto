package Modulos;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;

public class Moduloplato extends JFrame {

	private JPanel contentPane;
	private JLabel lblCdigo;
	private JTextField txtCodigo;
	private JLabel lblCategora;
	private JComboBox cboCategoria;
	private JLabel lblPrecio;
	private JTextField txtPrecio;
	private JLabel lblDescripcin;
	private JTextField txtDescripcion;
	private JLabel lblEstado;
	private JComboBox comboBox;
	private JLabel lblCantidad;
	private JTextField txtCantidad;
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
					Moduloplato frame = new Moduloplato();
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
	public Moduloplato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblCdigo = new JLabel("C\u00F3digo");
		lblCdigo.setBounds(25, 11, 70, 32);
		contentPane.add(lblCdigo);
		
		txtCodigo = new JTextField();
		txtCodigo.setBounds(114, 15, 94, 25);
		contentPane.add(txtCodigo);
		txtCodigo.setColumns(10);
		
		lblCategora = new JLabel("Categor\u00EDa");
		lblCategora.setBounds(25, 37, 61, 39);
		contentPane.add(lblCategora);
		
		cboCategoria = new JComboBox();
		cboCategoria.setModel(new DefaultComboBoxModel(new String[] {"Criollo", "Marino", "Chifa"}));
		cboCategoria.setBounds(114, 44, 94, 25);
		contentPane.add(cboCategoria);
		
		lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(25, 67, 70, 32);
		contentPane.add(lblPrecio);
		
		txtPrecio = new JTextField();
		txtPrecio.setBounds(114, 77, 94, 25);
		contentPane.add(txtPrecio);
		txtPrecio.setColumns(10);
		
		lblDescripcin = new JLabel("Descripci\u00F3n");
		lblDescripcin.setBounds(25, 95, 70, 39);
		contentPane.add(lblDescripcin);
		
		txtDescripcion = new JTextField();
		txtDescripcion.setBounds(114, 107, 94, 25);
		contentPane.add(txtDescripcion);
		txtDescripcion.setColumns(10);
		
		lblEstado = new JLabel("Estado");
		lblEstado.setBounds(25, 130, 61, 32);
		contentPane.add(lblEstado);
		
		comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Disponible", "No disponible"}));
		comboBox.setBounds(114, 138, 94, 25);
		contentPane.add(comboBox);
		
		lblCantidad = new JLabel("Cantidad disponible");
		lblCantidad.setBounds(25, 168, 126, 39);
		contentPane.add(lblCantidad);
		
		txtCantidad = new JTextField();
		txtCantidad.setBounds(147, 171, 61, 25);
		contentPane.add(txtCantidad);
		txtCantidad.setColumns(10);
		
		btnIngreso = new JButton("Ingreso");
		btnIngreso.setBounds(296, 16, 112, 23);
		contentPane.add(btnIngreso);
		
		btnModificacin = new JButton("Modificaci\u00F3n");
		btnModificacin.setBounds(296, 53, 112, 23);
		contentPane.add(btnModificacin);
		
		btnConsulta = new JButton("Consulta");
		btnConsulta.setBounds(296, 91, 112, 23);
		contentPane.add(btnConsulta);
		
		btnEliminacin = new JButton("Eliminaci\u00F3n");
		btnEliminacin.setBounds(296, 130, 112, 23);
		contentPane.add(btnEliminacin);
		
		btnListado = new JButton("Listado");
		btnListado.setBounds(296, 168, 112, 23);
		contentPane.add(btnListado);
	}

}
