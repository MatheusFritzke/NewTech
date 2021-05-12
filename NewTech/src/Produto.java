
public class Produto {

		private int iCodigo;
		private String sCategoria;
		private String sNome;
		private float fPreco;
		private String sTamanho;
		private String sCor;
		private String sDescricao;
		
		public Produto(int iCodigo, String sCategoria, String sNome, float fPreco, String sTamanho,
				String sCor, String sDescricao) {
			
			setiCodigo(iCodigo);
			setsCategoria(sCategoria);
			setsNome(sNome);
			setfPreco(fPreco);
			setsTamanho(sTamanho);
			setsCor(sCor);
			setsDescricao(sDescricao);
			
		}

		public int getiCodigo() {
			return iCodigo;
		}

		public boolean setiCodigo(int iCodigo) {
			int length = Integer.toString(iCodigo).replace(" ", "").length();
			if(iCodigo >=1 && length <= 5) {
				this.iCodigo = iCodigo;
				return true;
			}
			return false;
			
		}

		public String getsCategoria() {
			return sCategoria;
		}

		public boolean setsCategoria(String sCategoria) {
			if(sCategoria.equals("")) {
				return false;
			}
			else {
				this.sCategoria = sCategoria;
				return true;
			}
			
		}

		public String getsNome() {
			return sNome;
		}

		public boolean setsNome(String sNome) {
			String regex = ("^[a-zA-Z]+$");
	        if (sNome.matches(regex)) {
	            this.sNome = sNome;
	            return true;
	            
	        }else
	        	return false;
		}

		public float getfPreco() {
			return fPreco;
		}

		public boolean setfPreco(float fPreco) {
			if(fPreco >= 0.01) {
				this.fPreco = fPreco;
				return true;
			}
			return false;
			
		}

		public String getsTamanho() {
			return sTamanho;
		}

		public boolean setsTamanho(String sTamanho) {
			if(sTamanho.equals("")) {
				return false;
			}
			else {
				this.sTamanho = sTamanho;
				return true;
			}
			
		}

		public String getsCor() {
			return sCor;
		}

		public boolean setsCor(String sCor) {
			if(sCor.equals("")) {
				return false;
			}
			else {
				this.sCor = sCor;
				return true;
			}
		}

		public String getsDescicao() {
			return sDescricao;
		}

		public void setsDescricao(String sDescricao) {
			if(sDescricao.equals("")) {
				this.sDescricao = "Descrição indisponível";
			}
			else
			this.sDescricao = sDescricao;
		}

}
