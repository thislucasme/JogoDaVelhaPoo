package jogodavelha;

public class Jogada {
	
	/**
	 * Posição i da matriz relacionada à jogada (linha)
	 */
	private int i;
	
	/**
	 * Posição j da matriz relacionada à jogada (coluna)
	 */
	private int j;
	
	
	
	
	
	
	

	public Jogada(String jogada) throws JogadaInvalidaException{
		parseString(jogada);
	}
	/**
	 * @param jogada Faz o parse da string da jogada.
	 * @throws JogadaInvalidaException Lançada se a jogada foi inválida
	 */
	private void parseString(String jogada) throws JogadaInvalidaException {
		
		try {
			//separa os dois tokens, onde o delemitador é o ','
			String [] tokens = jogada.split(",");
			
			//armazenda os tokens  nos atributos
			this.i = Integer.parseInt(tokens[0].trim());
			this.j = Integer.parseInt(tokens[1].trim());
			
		}catch (Exception e) {
			throw new JogadaInvalidaException("A jogada é inválida");
		}
		
	}
	

	/**
	 * Obtém a posição i
	 * @return Posição i
	 */
	public int getI() {
		return i;
	}

	/**
	 * Obtém a posição j
	 * @return Posição j
	 */
	public int getJ() {
		return j;
	}

}
