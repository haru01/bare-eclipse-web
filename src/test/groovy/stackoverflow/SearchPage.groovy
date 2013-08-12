package stackoverflow
import geb.*

class SearchPage extends Page {
	static url = "http://stackoverflow.com/search"
	static at = { title == "Search - Stack Overflow" }
	static content = {
		検索フォームに次を入力 { $("form#bigsearch") }
		Searchボタンをクリック { $("form#bigsearch input[type='submit']").click() }
	}
}