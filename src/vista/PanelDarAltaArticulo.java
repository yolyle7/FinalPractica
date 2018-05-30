package vista;

import javax.swing.JPanel;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;

public class PanelDarAltaArticulo extends JPanel {
	private JTextField txtNombre;
	private JTextField txtDescripcion;
	private JTextField txtProveedor;

	/**
	 * Create the panel.
	 */
	public PanelDarAltaArticulo() {
		GridBagLayout gridBagLayout = new GridBagLayout();
		gridBagLayout.columnWidths = new int[]{0, 0, 0, 0};
		gridBagLayout.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
		gridBagLayout.columnWeights = new double[]{0.0, 1.0, 0.0, Double.MIN_VALUE};
		gridBagLayout.rowWeights = new double[]{0.0, 1.0, 1.0, 0.0, 0.0, 1.0, 0.0, 1.0, 1.0, 0.0, 1.0, Double.MIN_VALUE};
		setLayout(gridBagLayout);
		
		JLabel lblNombre = new JLabel("Introduce nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombre = new GridBagConstraints();
		gbc_lblNombre.fill = GridBagConstraints.BOTH;
		gbc_lblNombre.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombre.gridx = 1;
		gbc_lblNombre.gridy = 1;
		add(lblNombre, gbc_lblNombre);
		
		txtNombre = new JTextField();
		GridBagConstraints gbc_txtNombre = new GridBagConstraints();
		gbc_txtNombre.insets = new Insets(0, 0, 5, 5);
		gbc_txtNombre.fill = GridBagConstraints.BOTH;
		gbc_txtNombre.gridx = 1;
		gbc_txtNombre.gridy = 2;
		add(txtNombre, gbc_txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblDescripcion = new JLabel("Introduce descripcion:");
		lblDescripcion.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblDescripcion = new GridBagConstraints();
		gbc_lblDescripcion.anchor = GridBagConstraints.WEST;
		gbc_lblDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_lblDescripcion.gridx = 1;
		gbc_lblDescripcion.gridy = 4;
		add(lblDescripcion, gbc_lblDescripcion);
		
		txtDescripcion = new JTextField();
		GridBagConstraints gbc_txtDescripcion = new GridBagConstraints();
		gbc_txtDescripcion.insets = new Insets(0, 0, 5, 5);
		gbc_txtDescripcion.fill = GridBagConstraints.BOTH;
		gbc_txtDescripcion.gridx = 1;
		gbc_txtDescripcion.gridy = 5;
		add(txtDescripcion, gbc_txtDescripcion);
		txtDescripcion.setColumns(10);
		
		JLabel lblNombreProveedor = new JLabel("Nombre Proveedor:");
		lblNombreProveedor.setFont(new Font("Tahoma", Font.PLAIN, 18));
		GridBagConstraints gbc_lblNombreProveedor = new GridBagConstraints();
		gbc_lblNombreProveedor.fill = GridBagConstraints.VERTICAL;
		gbc_lblNombreProveedor.anchor = GridBagConstraints.WEST;
		gbc_lblNombreProveedor.insets = new Insets(0, 0, 5, 5);
		gbc_lblNombreProveedor.gridx = 1;
		gbc_lblNombreProveedor.gridy = 7;
		add(lblNombreProveedor, gbc_lblNombreProveedor);
		
		txtProveedor = new JTextField();
		GridBagConstraints gbc_txtProveedor = new GridBagConstraints();
		gbc_txtProveedor.insets = new Insets(0, 0, 5, 5);
		gbc_txtProveedor.fill = GridBagConstraints.BOTH;
		gbc_txtProveedor.gridx = 1;
		gbc_txtProveedor.gridy = 8;
		add(txtProveedor, gbc_txtProveedor);
		txtProveedor.setColumns(10);
		
		JButton btnDarAlta = new JButton("DarAlta");
		GridBagConstraints gbc_btnDarAlta = new GridBagConstraints();
		gbc_btnDarAlta.fill = GridBagConstraints.VERTICAL;
		gbc_btnDarAlta.insets = new Insets(0, 0, 0, 5);
		gbc_btnDarAlta.gridx = 1;
		gbc_btnDarAlta.gridy = 10;
		add(btnDarAlta, gbc_btnDarAlta);

	}

}
