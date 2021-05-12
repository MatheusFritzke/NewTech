import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.ImageIcon;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JPasswordField;
import java.awt.event.KeyAdapter;
import java.text.ParseException;


@SuppressWarnings("serial")
public class tInicial extends JFrame {

	/**
	 * 
	 */
	
	private JPanel contentPane;
	private JTextField inputUsuario;
	private JPasswordField inputSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tInicial frame = new tInicial();
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
	
	
	public tInicial() {
	 	setFont(new Font("Bahnschrift", Font.BOLD, 15));
	 	setForeground(Color.LIGHT_GRAY);
	 	setTitle("Fa\u00E7a o login");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 480);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		inputUsuario = new JTextField();
		inputUsuario.setBounds(171, 267, 115, 20);
		contentPane.add(inputUsuario);
		inputUsuario.setColumns(10);
		
		JLabel incorrect = new JLabel("USU\u00C1RIO OU SENHA INCORRETO");
		incorrect.setForeground(Color.RED);
		incorrect.setFont(new Font("Microsoft JhengHei UI", Font.PLAIN, 19));
		incorrect.setHorizontalAlignment(SwingConstants.CENTER);
		incorrect.setBounds(296, 267, 350, 49);
		contentPane.add(incorrect);
		setLocationRelativeTo (null);
		incorrect.setVisible(false);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setBounds(274, 367, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(inputUsuario.getText().equals("Matheus") && inputSenha.getText().equals("Matheus")) {
		                
						tUsuario user = null;
						try {
							user = new tUsuario();
						} catch (ParseException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						user.setVisible(true);
						incorrect.setVisible(false);
						
				}
				else {
					incorrect.setVisible(true);
				}
				
			}
		});
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("Controle de estoque");
		lblNewLabel_1.setFont(new Font("Gabriola", Font.BOLD | Font.ITALIC, 58));
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBounds(-2, 151, 626, 126);
		contentPane.add(lblNewLabel_1);
		
		JLabel usuario = new JLabel("Usu\u00E1rio");
		usuario.addKeyListener(new KeyAdapter() {
			
		});
		usuario.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		usuario.setBounds(58, 265, 86, 20);
		contentPane.add(usuario);
		
		JLabel senha = new JLabel("Senha");
		senha.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 16));
		senha.setBounds(58, 296, 86, 20);
		contentPane.add(senha);
		
		ImageIcon image = new ImageIcon("C:\\Users\\Matheus Fritzke\\Downloads\\NewTechLogo.png");
		
		image.setImage(image.getImage().getScaledInstance(500, 500, 100));
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(image);
		lblNewLabel_3.setBounds(85, -75, 627, 325);
		contentPane.add(lblNewLabel_3);
		
		inputSenha = new JPasswordField();
		inputSenha.setBounds(171, 295, 115, 20);
		contentPane.add(inputSenha);
		
		
		
	}
}
