package crawler.example;

import com.github.abola.crawler.CrawlerPack;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;


/**
 * 簡易練習
 * 
 * 找出所有文章中按推的id
 * 
 * @author Abola Lee
 *
 */
public class PttHomework {
	
	public static void main(String[] args) {
		String uri = "https://www.ptt.cc/bbs/PuzzleDragon/M.1466610709.A.186.html";
		

//		System.out.println(
//			CrawlerPack.start()
//			    .addCookie("over18", "1")
//				.getFromHtml(uri)
//					.select(".push-tag:matchesOwn(推)+push-userid")
//				.toString()
//		);




//		System.out.println(
//				CrawlerPack.start()
//						.addCookie("over18", "1")
//						.getFromHtml(uri)
//						.select("div.push+.span:eq(2)")
//						.toString()
//		);






		Document jsoupDoc = CrawlerPack.start()
				.getFromXml(uri);
//		System.out.println(jsoupDoc.select("div.push"));

//		System.out.println(jsoupDoc.select("div.push span:gt(1)"));
//		System.out.println(jsoupDoc.select("div.push:matches(推)"));
//		System.out.println(jsoupDoc.select("div.push span[class]"));

//		System.out.println(jsoupDoc.select("div.push .push-tag:matchesOwn(推)"));
//		System.out.println(jsoupDoc.select("div.push .push-tag:matchesOwn(推)"));


		for( Element elem: jsoupDoc.select("div.push") ){
//			System.out.println(elem.select(".push-tag").text());
if(elem.select(".push-tag").text().equals("推")){
			System.out.println(elem.select(".push-tag").text());
			System.out.println(","+elem.select(".push-userid").text());
			System.out.println(","+elem.select(".push-content").text());
			System.out.println();}
		}

	}
}
