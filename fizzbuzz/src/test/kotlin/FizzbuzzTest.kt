package ch.css.mob0801

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.DisplayName
import org.junit.jupiter.api.Test


@DisplayName("FizzbuzzTests")
internal class FizzbuzzTest {

    @Test
    @DisplayName("fizzbuzz sollte bei Eingabe von 1 den String «1» zurückgeben.")
    fun fizzbuzz_1() = assertEquals("1", Fizzbuzz.fizzbuzz(1))

    @Test
    @DisplayName("fizzbuzz sollte bei Eingabe von 2 den String «2» zurückgeben.")
    fun fizzbuzz_2() = assertEquals("2", Fizzbuzz.fizzbuzz(2))

    @Test
    @DisplayName("fizzbuzz sollte bei Eingabe von 3 den String «fizz» zurückgeben.")
    fun fizzbuzz_3() = assertEquals("fizz", Fizzbuzz.fizzbuzz(3))

    @Test
    @DisplayName("fizzbuzz sollte bei Eingabe von 5 den String «buzz» zurückgeben.")
    fun fizzbuzz_5() = assertEquals("buzz", Fizzbuzz.fizzbuzz(5))

    @Test
    @DisplayName("fizzbuzz sollte bei Eingabe von 6 den String «fizz» zurückgeben.")
    fun fizzbuzz_6() = assertEquals("fizz", Fizzbuzz.fizzbuzz(6))

    @Test
    @DisplayName("fizzbuzz sollte bei Eingabe von 10 den String «buzz» zurückgeben.")
    fun fizzbuzz_10() = assertEquals("buzz", Fizzbuzz.fizzbuzz(10))

    @Test
    @DisplayName("fizzbuzz sollte bei Eingabe von 15 den String «fizzbuzz» zurückgeben.")
    fun fizzbuzz_15() = assertEquals("fizzbuzz", Fizzbuzz.fizzbuzz(15))

    @Test
    @DisplayName("fizzbuzzUpTo sollte eine Liste mit 100 Einträgen liefern, wenn «null» als Parameter übergeben wurde.")
    fun fizzbuzzUpToDefault() = assertEquals(100, Fizzbuzz.fizzbuzzUpTo(null).size)

    @Test
    @DisplayName("fizzbuzzUpTo sollte bei Eingabe von 15 eine Liste von 15 korrekt berechneten Werten liefern.")
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
