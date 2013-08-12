package stackoverflow
import geb.*
import geb.junit4.*
import org.junit.Test

import org.junit.runner.RunWith
import org.junit.runners.JUnit4

@RunWith(JUnit4)
class SearchTest extends GebReportingTest {
	@Test
	void "検索し遷移できること"() {
		to SearchPage

		検索フォームに次を入力.with {
			q = "groovy"
		}
		Searchボタンをクリック()
		
		at ResultsPage
		
		一番目のリンクをクリック()
		
		assert title == 'Scala vs. Groovy vs. Clojure - Stack Overflow'
	}
}
