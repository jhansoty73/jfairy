package snippets

import com.devskiller.jfairy.Fairy
import com.devskiller.jfairy.producer.person.Person

/**
 *
 */
class PrintAllLocales {
	static void main(String[] args) {
		[Locale.ENGLISH, Locale.FRENCH, Locale.ITALIAN,
		 Locale.CHINESE, new Locale("es"),
		 new Locale("sv"), new Locale("ka"),
		 new Locale("pl")].each { locale ->
			Fairy fairy = Fairy.create(locale)
			Person person = fairy.person()
			println person
		}
	}
}
