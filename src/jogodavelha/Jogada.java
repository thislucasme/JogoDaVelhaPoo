package jogodavelha;

public class Jogada {
	
	/**
	 * Posi��o i da matriz relacionada � jogada (linha)
	 */
	private int i;
	
	/**
	 * Posi��o j da matriz relacionada � jogada (coluna)
	 */
	private int j;
	
	
	
	
	
	
	

	public Jogada(String jogada) throws JogadaInvalidaException{
		parseString(jogada);
	}
	/**
	 * @param jogada Faz o parse da string da jogada.
	 * @throws JogadaInvalidaException Lan�ada se a jogada foi inv�lida
	 */
	private void parseString(String jogada) throws JogadaInvalidaException {
		
		try {
			//separa os dois tokens, onde o delemitador � o ','
			String [] tokens = jogada.split(",");
			
			//armazenda os tokens  nos atributos
			this.i = Integer.parseInt(tokens[0].trim());
			this.j = Integer.parseInt(tokens[1].trim());
			
		}catch (Exception e) {
			throw new JogadaInvalidaException("A jogada � inv�lida");
		}
		
	}
	

	/**
	 * Obt�m a posi��o i
	 * @return Posi��o i
	 */
	public int getI() {
		return i;
	}

	/**
	 * Obt�m a posi��o j
	 * @return Posi��o j
	 */
	public int getJ() {
		return j;
	}

}
