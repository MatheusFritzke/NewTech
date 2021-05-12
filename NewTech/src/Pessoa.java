import java.util.Calendar;
import java.util.Date;

public class Pessoa {

	private String sNome;
	private String sCpf;
	private Date dDataNascimento;
	
	public Pessoa(String sNome, String sCpf,Date date) {
		// TODO Auto-generated constructor stub
		
		setsNome(sNome);
		setsCpf(sCpf);
		setdDataNascimento(date);
		
	}

	public String getsNome() {
		return sNome;
	}
	
	public boolean setsNome(String sNome) {
		//sNome = sNome.replaceAll("[^a-zA-Z0-9]", " ");
		 String regex = ("^[a-zA-Z]+$");
	        if (sNome.matches(regex)) {
	            this.sNome = sNome;
	            return true;
	            
	        }else
	        	return false;
	}
	        
	public String getsCpf() {
		return sCpf;
	}

	public boolean setsCpf(String sCpf) {
		
         if (ValidaCPF.isCPF(sCpf) == true) {
        	 this.sCpf = sCpf;	 
        	 return true;
         }
           
         else {
        	 return false;
         }
		
         
	}

	public Date getdDataNascimento() {
		return dDataNascimento;
	}

	public boolean setdDataNascimento(Date dDataNascimento) {
		
		Calendar dataAtual = Calendar.getInstance();
		Calendar dataNascimento = Calendar.getInstance();
		dataNascimento.setTime(dDataNascimento);
		int ano = dataAtual.get(Calendar.YEAR) -  dataNascimento.get(Calendar.YEAR);
		int dia = dataAtual.get(Calendar.DAY_OF_MONTH) - dataNascimento.get(Calendar.DAY_OF_MONTH);
		int mes = dataAtual.get(Calendar.MONTH) - dataNascimento.get(Calendar.MONTH);
		
		if(dia < 0 || mes == 0 && dia <0) {
			ano --;
		}
		if(ano >= 18) {
			this.dDataNascimento = dDataNascimento;
			return true;
		}
		else
			return false;
	}
	
}
