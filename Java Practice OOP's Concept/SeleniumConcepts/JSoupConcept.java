package SeleniumConcepts;

import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class JSoupConcept {

	public static void main(String[] args) throws IOException {
		
		Document doc = Jsoup.connect("C:\\Users\\S0070155\\Desktop\\Table.html").get();
		
		for (Element table : doc.select("table")) {
			for (Element row : table.select("tr")) {
				Elements tds = row.select("td");
				System.out.println(tds.get(0).text());
			}
		}
		

	}

}
