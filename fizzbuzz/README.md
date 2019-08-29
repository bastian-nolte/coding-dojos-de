# FizzBuzz Coding Dojo

## Einleitung

Dieser Kotlin-Code ist das Ergebnis der Code Dojo für die Kata [FizzBuzz](http://codingdojo.org/kata/FizzBuzz/).

- Die [Tests](https://github.com/bastian-nolte/coding-dojos-de/blob/master/fizzbuzz/src/test/kotlin/FizzbuzzTest.kt) der Kata.
- Der [Kotin-Code](https://github.com/bastian-nolte/coding-dojos-de/blob/master/fizzbuzz/src/main/kotlin/Fizzbuzz.kt) als Ergebnis der Kata.
- Den Code direkt im Kotlin-Playground [ausführen](https://pl.kotl.in/SeXqOZBXQ).

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
Dieses Kata kann direkt im [Kotlin-Playground ausgeführt](https://pl.kotl.in/SeXqOZBXQ) werden.

## Dieses Kata auf eigenem Computer ausführen

### Voraussetzungen
- [Ein installiertes Java Development Kit (JDK)](https://www.oracle.com/technetwork/java/javase/downloads/index.html)
- [Ein installiertes Kotlin](https://kotlinlang.org/docs/tutorials/command-line.html)

### Code klonen
```
git clone https://github.com/bastian-nolte/coding-dojos-de.git && cd coding-dojos-de/fizzbuzz
```

### Den Code übersetzen und ausführen
```
 ./mvnw compile exec:java
```

### Die Tests ausführen
Dieser Code entstand in [testgetriebener Entwicklung nach Kent Beck](https://amzn.to/2zwI4Fu). Die dabei entstandenen Tests können wie folgt ausgeführt werden.
```
 ./mvnw test
 ```

#### Author und Hinweise
Dieser Artikel wurde von [Bastian Nolte](https://bastian-nolte.name) geschrieben.<br/>
Der Code ist in einem Coding Dojo der [CSS Versicherung](https://www.css.ch) entstanden.<br/>
Du suchst einen Job in der Informationstechnik? Vielleicht wirst Du auf der [Jobseite](https://jobs.css.ch) der CSS Versicherung fündig.

_Das Dokument enthält einen Affiliate Link auf ein Buch bei Amazon._
