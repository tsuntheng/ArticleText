import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class ArticleText {
	public static void main(String[] args) throws IOException {
		Document doc = Jsoup.connect("https://www.cnn.com/").get();
		//String title = doc.title();
        //System.out.println("title : " + title);
        Elements links = doc.select("a[href]");

		for(Element link : links) {
			System.out.println("text : " + link.text());
    	}
	}
}
