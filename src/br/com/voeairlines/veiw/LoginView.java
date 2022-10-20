package br.com.voeairlines.veiw;
//pacote awt eh antecessor do swing
import java.awt.*; //gerenciadores de layout
import java.awt.event.*; //eventos
import javax.swing.*; //controles swing

//JTextFeild - Caixa de Texto
//JPasswordField - Caixa de texto para Senhas
//JLabel - Titulo
//JButton
//JTable
//JCombobox4
public class LoginView extends JFrame{
	
	//Construtor
	public LoginView() {
		
		//Atribuindo o titulo do JFrame
		setTitle("Sistema VoeAirlines");
		setSize(500,100);
		setResizable(false);
		this.setLocationRelativeTo(null);
		
		//Gerenciamento de Layout
		getContentPane().setLayout(new GridLayout(3,2));
		
		
		JButton btnVerificar;//botao
		JTextField txtUsuario;//caixa de texto
		JPasswordField pwfSenha;//caixa de texto para senhas
		JLabel lblUsuario;
		JLabel lblSenha;
		
		
		//objeto --> eh uma instancia de uma classe 
		btnVerificar = new JButton("Verficiar");
		
		txtUsuario = new JTextField(20);
		pwfSenha = new JPasswordField(20);
		lblUsuario = new JLabel("Usuario");
		lblSenha = new JLabel("Senha");
		pwfSenha.setEchoChar('$');
		
		//
		getContentPane().add(lblUsuario);
		getContentPane().add(txtUsuario);
		getContentPane().add(lblSenha);
		getContentPane().add(pwfSenha);
		
		getContentPane().add(btnVerificar);
		//	getContentPane().add(btnLimpar);
	}	
}


