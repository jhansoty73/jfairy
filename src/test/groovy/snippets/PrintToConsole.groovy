package snippets

import com.devskiller.jfairy.Fairy
import com.devskiller.jfairy.producer.person.Person

/**
 *
 */
class PrintToConsole {
	static void main(String[] args) {
		Fairy fairy = Fairy.create(Locale.default)
		5.times {
			Person person = fairy.person()
			println person
		}
	}
}
