package ninja.greenlemon.codedojo.fizzbuzz

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test
import org.junit.jupiter.params.ParameterizedTest
import org.junit.jupiter.params.provider.ValueSource


@DisplayName("Die Methoden der Klasse Fizzbuzz sollten folgendes Verhalten implementieren…")
internal class FizzbuzzTest {

    @DisplayName("fizzbuzz() sollte bei Zahlen die keine Vielfachen von 3 oder 5 sind, die übergebene Zahl als String zurückgeben.")
    @ValueSource(ints = [1, 7, Int.MAX_VALUE])
    @ParameterizedTest(name = "fizzbuzz sollte bei der Übergabe von {0} den String «{0}» zurückgeben.")
    fun fizzbuzz_nmo3o5(noMultiplesOfThreeOrFive: Int) {
        assertEquals(noMultiplesOfThreeOrFive.toString(), Fizzbuzz.fizzbuzz(noMultiplesOfThreeOrFive))
    }

    @DisplayName("fizzbuzz() sollte bei Zahlen die gemeinsame Vielfache von 3 und 5 sind, den String «fizzbuzz» zurückgeben.")
    @ValueSource(ints = [15, 75, Int.MAX_VALUE - 7])
    @ParameterizedTest(name = "fizzbuzz sollte bei der Übergabe von {0} den String «fizzbuzz» zurückgeben.")
    fun fizzbuzz_cmo3a5(cMultiOf3And5: Int) = assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(cMultiOf3And5))

    @DisplayName("fizzbuzz() sollte bei Zahlen die Vielfache von 3 aber nicht von 5 sind, den String «fizz» zurückgeben.")
    @ValueSource(ints = [3, 18, Int.MAX_VALUE - 1])
    @ParameterizedTest(name = "fizzbuzz sollte bei der Übergabe von {0} den String «fizz» zurückgeben.")
    fun fizzbuzz_mo3(multiplesOf3: Int) = assertEquals("fizz", Fizzbuzz.fizzbuzz(multiplesOf3))

    @DisplayName("fizzbuzz() sollte bei Zahlen die Vielfache von 5 aber nicht von 3 sind, den String «buzz» zurückgeben.")
    @ValueSource(ints = [5, 35, Int.MAX_VALUE - 2])
    @ParameterizedTest(name = "fizzbuzz sollte bei der Übergabe von {0} den String «buzz» zurückgeben.")
    fun fizzbuzz_mo5(multiplesOf5: Int) = assertEquals("buzz", Fizzbuzz.fizzbuzz(multiplesOf5))

    @Test
    @DisplayName("fizzbuzzUpTo() sollte eine Liste mit 100 Einträgen liefern, wenn «null» als Parameter übergeben wurde.")
    fun fizzbuzzUpToDefault() = assertEquals(100, Fizzbuzz.fizzbuzzUpTo(null).size)

    @Test
    @DisplayName("fizzbuzzUpTo() sollte bei Eingabe von 15 eine Liste von 15 korrekt berechneten Werten liefern.")
    fun fizzbuzzUpTo() = assertEquals(
            listOf(
                    "1",
                    "2",
                    "fizz",
                    "4",
                    "buzz",
                    "fizz",
                    "7",
                    "8",
                    "fizz",
                    "buzz",
                    "11",
                    "fizz",
                    "13",
                    "14",
                    "fizzbuzz"
            ), Fizzbuzz.fizzbuzzUpTo(15))
}
