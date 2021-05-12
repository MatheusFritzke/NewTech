import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;

import net.sourceforge.jdatepicker.impl.JDatePanelImpl;
import net.sourceforge.jdatepicker.impl.JDatePickerImpl;
import net.sourceforge.jdatepicker.impl.UtilDateModel;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.text.ParseException;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JFormattedTextField;
import java.awt.Color;

@SuppressWarnings("serial")
public class tUsuario extends JFrame {


	private JPanel contentPane;
	private JTextField inputNome;
	private JTextField inputEMAIL;
	private JTextField inputLogin;
	private JPasswordField passwordField;
	private JPasswordField passwordField_1;
	

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tUsuario frame = new tUsuario();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	public tUsuario() throws ParseException {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 480);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeInvalido = new JLabel("Nome inv\u00E1lido");
		nomeInvalido.setForeground(Color.RED);
		nomeInvalido.setBounds(323, 148, 232, 20);
		contentPane.add(nomeInvalido);
		nomeInvalido.setVisible(false);
		
		JLabel cpfInvalido = new JLabel("CPF inv\u00E1lido");
		cpfInvalido.setForeground(Color.RED);
		cpfInvalido.setBounds(323, 186, 232, 20);
		contentPane.add(cpfInvalido);
		cpfInvalido.setVisible(false);
		
		JLabel dataInvalida = new JLabel("Data de nascimento inv\u00E1lida");
		dataInvalida.setForeground(Color.RED);
		dataInvalida.setBounds(323, 224, 232, 20);
		contentPane.add(dataInvalida);
		dataInvalida.setVisible(false);
		
		JLabel emailInvalido = new JLabel("Email inv\u00E1lido");
		emailInvalido.setForeground(Color.RED);
		emailInvalido.setBounds(323, 262, 232, 20);
		contentPane.add(emailInvalido);
		emailInvalido.setVisible(false);
		
		JLabel loginInvalido = new JLabel("Utilize apenas caracteres");
		loginInvalido.setForeground(Color.RED);
		loginInvalido.setBounds(323, 300, 304, 20);
		contentPane.add(loginInvalido);
		loginInvalido.setVisible(false);
		
		JLabel tamanhoInvalido = new JLabel("Tamanho inv\u00E1ilido, utilize 6 ou mais caracteres");
		tamanhoInvalido.setForeground(Color.RED);
		tamanhoInvalido.setBounds(323, 303, 304, 17);
		contentPane.add(tamanhoInvalido);
		tamanhoInvalido.setVisible(false);
		
		JLabel senhaInvalida = new JLabel("Senha inv\u00E1lida");
		senhaInvalida.setForeground(Color.RED);
		senhaInvalida.setBounds(322, 339, 232, 20);
		contentPane.add(senhaInvalida);
		senhaInvalida.setVisible(false);
		
		JLabel confSenhaInvalida = new JLabel("As senhas n\u00E3o conferem");
		confSenhaInvalida.setForeground(Color.RED);
		confSenhaInvalida.setBounds(323, 376, 232, 20);
		contentPane.add(confSenhaInvalida);
		confSenhaInvalida.setVisible(false);
		
		JLabel lblNewLabel = new JLabel("Cadastro de usu\u00E1rios");
		lblNewLabel.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 34));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(10, 11, 636, 84);
		contentPane.add(lblNewLabel);
		
		JLabel nome = new JLabel("Nome");
		nome.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		nome.setHorizontalAlignment(SwingConstants.LEFT);
		nome.setBounds(56, 131, 65, 27);
		contentPane.add(nome);
		
		JLabel cpf = new JLabel("CPF");
		cpf.setHorizontalAlignment(SwingConstants.LEFT);
		cpf.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		cpf.setBounds(56, 169, 42, 27);
		contentPane.add(cpf);
		
		JLabel data = new JLabel("Data de Nascimento");
		data.setHorizontalAlignment(SwingConstants.LEFT);
		data.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		data.setBounds(56, 207, 200, 27);
		contentPane.add(data);
		
		JLabel email = new JLabel("E-mail");
		email.setHorizontalAlignment(SwingConstants.LEFT);
		email.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		email.setBounds(56, 245, 65, 27);
		contentPane.add(email);
		
		JLabel login = new JLabel("Login");
		login.setHorizontalAlignment(SwingConstants.LEFT);
		login.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		login.setBounds(56, 283, 55, 27);
		contentPane.add(login);
		
		JLabel senha = new JLabel("Senha");
		senha.setHorizontalAlignment(SwingConstants.LEFT);
		senha.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		senha.setBounds(56, 322, 65, 27);
		contentPane.add(senha);
		
		JLabel confSenha = new JLabel("Confirma\u00E7\u00E3o de senha");
		confSenha.setHorizontalAlignment(SwingConstants.LEFT);
		confSenha.setFont(new Font("Microsoft JhengHei UI", Font.BOLD, 20));
		confSenha.setBounds(56, 360, 221, 27);
		contentPane.add(confSenha);
		
		inputNome = new JTextField();
		inputNome.setBounds(323, 131, 232, 20);
		contentPane.add(inputNome);
		inputNome.setColumns(10);
		
		inputEMAIL = new JTextField();
		inputEMAIL.setColumns(10);
		inputEMAIL.setBounds(323, 245, 232, 20);
		contentPane.add(inputEMAIL);
		
		inputLogin = new JTextField();
		inputLogin.setColumns(10);
		inputLogin.setBounds(323, 283, 232, 20);
		contentPane.add(inputLogin);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(323, 322, 232, 20);
		contentPane.add(passwordField);
		
		passwordField_1 = new JPasswordField();
		passwordField_1.setBounds(323, 360, 232, 20);
		contentPane.add(passwordField_1);
		
		UtilDateModel modelo = new UtilDateModel();
		JDatePanelImpl painelData = new JDatePanelImpl(modelo);
		JDatePickerImpl selecionaData = new JDatePickerImpl(painelData);
		selecionaData.setBounds(323, 207, 232, 20);
		contentPane.add(selecionaData);
		
		MaskFormatter mascaraCpf = null;
		mascaraCpf = new MaskFormatter("###.###.###-##");	
		JFormattedTextField inputCPF = new JFormattedTextField(mascaraCpf);
		inputCPF.setText("\r\n");
		inputCPF.setBounds(323, 169, 232, 20);
		contentPane.add(inputCPF);
		
		JButton cadastrar = new JButton("CADASTRAR");
		cadastrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String senha = new String(passwordField.getPassword()); 
				String cSenha = new String (passwordField_1.getPassword());
				Date data = new Date();
				data = (Date) selecionaData.getModel().getValue();
				Usuario user = new Usuario(inputNome.getText(), inputCPF.getText().replaceAll("\\D",""), data, 
						inputEMAIL.getText(), inputLogin.getText(), senha, cSenha);
				if(user.setsNome(inputNome.getText()) == false) {
					nomeInvalido.setVisible(true);
				}else {
					nomeInvalido.setVisible(false);
				
				}
				
				if(user.setsCpf(inputCPF.getText().replaceAll("\\D","")) == false) {
					cpfInvalido.setVisible(true);
				}else {
					cpfInvalido.setVisible(false);
				}
				
				if(user.setdDataNascimento(data) == false) {
					dataInvalida.setVisible(true);
				}else {
					dataInvalida.setVisible(false);
				}
				
				if(user.setsEmail(inputEMAIL.getText()) == false) {
					emailInvalido.setVisible(true);
				}else {
					emailInvalido.setVisible(false);
				}
				
				if(user.setsLogin(inputLogin.getText()) == 0) {
					loginInvalido.setVisible(false);
					tamanhoInvalido.setVisible(false);
					
				}	if(user.setsLogin(inputLogin.getText()) == 1) {
					loginInvalido.setVisible(false);
					tamanhoInvalido.setVisible(true);
					}	if(user.setsLogin(inputLogin.getText()) == 2){
						loginInvalido.setVisible(true);
						tamanhoInvalido.setVisible(false);
						}
				
				if(user.setsSenha(senha, cSenha) == false) {
					senhaInvalida.setVisible(true);
				}else {
					senhaInvalida.setVisible(false);
				}
				
				if(user.setsSenha(cSenha, cSenha) == user.setsSenha(senha, senha)) {
					confSenhaInvalida.setVisible(false);
				}
				else {
					confSenhaInvalida.setVisible(true);
				}
				
				
				
			}
		});
		cadastrar.setBounds(280, 407, 108, 23);
		contentPane.add(cadastrar);
		
		
		
		
		
		
		
		
	}
}
