
package b101;

/**
 * Selam sınıfı tipinde bir nesne oluşturur ve o nesneden bir hizmet(metod) çağırır. 
 * Çağırılan hizmetten(metoddan) geriye dönen değeri ekrana yazdırır.
 *  
 * 
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 * <p>
 * Daha fazla bilgi için @see <a href="http://www.javaturk.org">http://www.javaturk.org</a>
 * </p>
 * @see <a href="http://www.javakitabi.com">JavaKitabi.com</a>
 */

public class SelamTest {
	/**
	 * Tüm sistemin çalışmasını <code>main</code> metot başlatır. 
	 * 
	 * 
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		Selam ornek = new Selam();
		
		String cevap = ornek.selamSoyle("Ali");
		
		System.out.println(cevap);
		
		
	}
}
