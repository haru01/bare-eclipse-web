package stackoverflow
import geb.*

class ResultsPage extends Page {
	static at = { title == "Questions containing 'groovy' - Stack Overflow" }
	
	static content = {
		results { $("div.search-results div.search-result") }
		result { i -> results[i] }
		resultLink { i -> result(i).find("a")[0] }
		一番目のリンクをクリック { resultLink(0).click() }
	}
}
