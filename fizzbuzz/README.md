# FizzBuzz Coding Dojo

## Einleitung

Dieser Kotlin-Code ist das Ergebnis der Code Dojo für die Kata [FizzBuzz](http://codingdojo.org/kata/FizzBuzz/).

- Die [Tests](https://github.com/bastian-nolte/coding-dojos-de/blob/master/fizzbuzz/src/test/kotlin/FizzbuzzTest.kt) der Kata.
- Der [Kotin-Code](https://github.com/bastian-nolte/coding-dojos-de/blob/master/fizzbuzz/src/main/kotlin/Fizzbuzz.kt) als Ergebnis der Kata.
- Den Code direkt im Kotlin-Playground [ausführen](https://play.kotlinlang.org/embed?short=W6Dk8f43J).

## Beschreibung der Kata
_Kurz gesagt, sollte folgendes Problem gelöst werden:_

Gegeben ist 
- eine Folge natürlicher Zahlen bis 100

Ausgegeben werden soll eine Liste von Werten, die folgender Bildungsvorschrift entsprechen:
- Der String «fizzbuzz», wenn das Glied der Folge durch 15 teilbar ist oder
- der String «buzz», wenn das Glied der Folge durch 5 teilbar ist oder
- der String «fizz», wenn das Glied der Folge durch 3 teilbar ist 
- ansonsten, das Glied der Folge als String.

_Beispielausgabe bis 15:_
```
1
2
fizz
4
buzz
fizz
7
8
fizz
buzz
11
fizz
13
14
fizzbuzz
```

## Dieses Kata im Playground ausführen
Entweder direkt Ausführen im Kotlin-Playground: [https://play.kotlinlang.org/embed?short=W6Dk8f43J]

## Dieses Kata auf eigenem Computer ausführen

### Code klonen
```
git clone https://github.com/bastian-nolte/coding-dojos-de.git
```

### Den Code übersetzen und ausführen
```
 ./mvnw compile exec:java
```

### Die Tests ausführen
Dieser Code entstand in [testgetriebener Entwicklung nach Kent Beck](https://amzn.to/2zwI4Fu)*. Die dabei entstandenen Tests können wie folgt ausgeführt werden.
```
 ./mvnw test
 ```

_*) Dieser Link ist ein Affiliate Link auf die Amazon Web-Plattform._
