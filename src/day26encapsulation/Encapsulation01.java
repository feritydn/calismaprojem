package day26encapsulation;

public class Encapsulation01 {
	private String idNo = "1010101010";
	private int cardNo = 123456789;
	boolean emekli = false;
	public static void main(String[] args) {
		// encapsulation data saklama(hiding) yontemidir.
		// encapsulation 2 stepte yapilir.
		//    1. Datayi (variable, method) private yapmaliyiz.
		//    2. public olan getter ve setter methodlar uretmeliyiz.
		
		// getter() methodu datayi sadece okumamizi saglar. getter() methodu ile datayi degistiremeyiz.
		// setter() methodu ise datayi degistirmemizi saglar. setter() methodu ile datayi okuyamayiz.
		
		/*getter() uretmek icin; 1. access modifier public olmali
		 *                       2. return type variable ile ayni olmali
		 *                       3. method ismi get+variableName seklinde olmali
		 *                       4. method icine return yazilmali
		 *                       5. return type boolean ise getter() method ismi "is" ile baslar get kullanilmaz.  
		 */
		
		/*setter() uretmek icin 1. access modifier public olmali
		 *                      2. return type void olmali
		 *                      3. method ismi set+variableName olmali
		 *                      4. parametre olmali (%99)
		 *                      5. return type boolean olsa bile method ismi set+variableName seklinde olur. is kullanilmaz.
		 */
	}
	
	public String getIdNo() {
		return idNo;
	}
	public void setIdNo(String idNo) {
		this.idNo = idNo;
	}
	public int getCardNo() {
		return cardNo;
	}
	public void setCardNo(int cardNo) {
		this.cardNo = cardNo;
	}
	public boolean isEmekli() {
		return emekli;
	}
	public void setEmekli(boolean emekli) {
		this.emekli = emekli;
	}

}
