package ReadConcept;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ReadFromHTML {

	public static void main(String[] args) throws IOException {

		Document doc = Jsoup.connect("http://javatpoint.com").get();
		
		
		//Getting Title from WebURL
		String title = doc.title();
		System.out.println(title);
		
		//Getting All Links from WebURL
		
		Elements links = doc.select("a[href]");
		
		for (Element link : links) {
			System.out.println(link.text());
		}
		
		
		
	}	

}
