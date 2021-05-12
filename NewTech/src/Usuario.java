import java.util.Date;



public class Usuario extends Pessoa{
	
	private String sEmail;
	private String sLogin;
	private String sSenha;//Senha que será cadastrada 
	
	

	public Usuario(String sNome, String sCpf, Date date, String sEmail, String sLogin, String sSenha, String sVsenha) {
		super(sNome, sCpf, date);
		// TODO Auto-generated constructor stub
		setsEmail(sEmail);
		setsLogin(sLogin);
		setsSenha(sSenha,sVsenha);
		
	}

	public String getsEmail() {
		return sEmail;
	}

	public boolean setsEmail(String sEmail) {
		
		if(sEmail.contains("@")) {
			this.sEmail = sEmail;
			return true;
		}
		else
			return false;
	}
	
	public String getsLogin() {
		return sLogin;
	}

	public int setsLogin(String sLogin) {
		
		String regex = ("^[a-zA-Z]+$");
        if (sLogin.matches(regex)) {
        	int length = sLogin.replace(" ", "").length();
        	if(length >= 6){
        		this.sLogin = sLogin;
        		return 0;
        	}
        	else
        	return 1;
        }
        else
		return 2;
    }

	public String getsSenha() {
		return sSenha;
	}

	public boolean setsSenha(String sSenha, String confirmaSenha) {
		//String regex = "^[a-zA-Z0-9]+$";
		int length = sSenha.length();	
			if(length >= 8) {
				//if(sSenha.matches(regex)) {
					if(sSenha.equals(confirmaSenha)) {
						this.sSenha = sSenha;
						return true;
					}else 
						return false;
				//}else
					//return false;
			}else
				return false;
				
	}


	

	
	
	    
}

