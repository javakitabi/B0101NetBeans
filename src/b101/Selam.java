
package b101;

/**
 * <code>world</code> adında bir veriyi ve String bir değer 
 * döndüren <code>selamSoyle</code> adında bir hizmeti(metodu) sarmalar. 
 * Eğer <code>Selam</code> sınıfı tipinde bir nesne oluşturup, ona <code>selamSoyle</code> 
 * deyip <code>kime</code> bilgisini geçersek o kişiye selam söyler. 
 *
 * @author <a href="mailto:akin@javaturk.org">Akin Kaldiroglu</a>
 *         <p>
 *         Daha fazla bilgi için @see
 *         <a href="http://www.javaturk.org" target="_blank">http://www.javaturk.org</a>
 *         </p>
 * @see <a href="http://www.javakitabi.com" target="_blank">JavaKitabi.com</a>
 * 
 */
public class Selam {

	/**
	 * 
	 */
	private String world = "millet";
	
	
	/**
	 * Kendisine parametre olarak gönderilen veya geçilen kişiye selam söyler ve
	 * selam cümlesini geriye verir.
	 * @param kime 
	 * 		  Selam söylemek istediğimiz kişidir.
	 * 
	 * @return cumle 
	 * 		   İstediğimiz kişiye selam söyler ve selam cümlesini bize geri verir.
	 */
	public String selamSoyle(String kime) {

		String cumle;
		if (kime != "")
			cumle = "Selam " + kime + " :)";
		else
			cumle = "Selam " + world + " :)";
		
		return cumle;
	}
}
