package ninja.greenlemon.codedojo.fizzbuzz

/**
 * Gibt eine Liste von Strings gemäss [Fizzbuzz.fizzbuzz] auf der Konsole aus.
 * Grundlage der Idee ist  @see http://codingdojo.org/kata/FizzBuzz/.
 *
 * Für die Liste werden als Eingangswerte Zahlen herangezogen und zwar beginnend mit der Zahl 1, jeweils
 * inkrementiert um 1 bis der Wert erreicht wird, der als Parameter übergeben wurde.
 *
 * Wird kein Wert übergeben, so wird als Maximum 100 angenommen.
 *
 * @param arguments Optionaler Parameter, der vorgibt, bis zu welcher Zahl die Strings ausgegeben werden sollen.
 */
fun main(arguments: Array<String>) {
    Fizzbuzz.fizzbuzzUpTo(arguments.getOrNull(0)?.toIntOrNull()).map { println(it) }
}

class Fizzbuzz {
    companion object {
        /**
         * Liefert eine Liste von Strings gemäss der Definition aus [Fizzbuzz.fizzbuzz].
         *
         * Für die Liste werden als Eingangswerte Zahlen herangezogen und zwar beginnend mit der Zahl 1, jeweils
         * inkrementiert um 1 bis der übergebene Wert erreicht wird.
         *
         * @param zahl: Die Zahl, bis zum Erreichen derer iteriert werden soll (Standard ist 100).
         * @return Die Liste der Ergebnisse gemäss Definition in [Fizzbuzz.fizzbuzz].
         */
        fun fizzbuzzUpTo(zahl: Int?) = (1..(zahl ?: 100)).map { fizzbuzz(it) }

        /**
         * Liefert je nach eingegebener Zahl unterschiedliche Ergebnisse nach folgenden Regeln:
         * - Das Wort «fizzbuzz», wenn die Zahl durch 15 teilbar ist.
         * - Das Wort «buzz», wenn die Zahl durch 5 teilbar ist.
         * - Das Wort «fizz», wenn die Zahl durch 3 teilbar ist.
         * - In allen anderen Fällen die übergebene Zahl als String.
         *
         * @param zahl Die Zahl, auf die die Regeln angewendet werden sollen.
         * @return Der String, wie oben definiert.
         */
        fun fizzbuzz(zahl: Int) = when {
            zahl % 15 == 0 -> "fizzbuzz"
            zahl % 5 == 0 -> "buzz"
            zahl % 3 == 0 -> "fizz"
            else -> zahl.toString()
        }
    }
}
