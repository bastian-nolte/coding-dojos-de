# FizzBuzz Coding Dojo

## Einleitung

Dieser Kotlin-Code ist das Ergebnis der Code Dojo für die Kata [FizzBuzz](http://codingdojo.org/kata/FizzBuzz/).
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
1
bizz
12
13
fizzbuzz
```

## Dieses Kata ausführen
Code klonen mit
```
git clone https://github.com/bastian-nolte/coding-dojos-de.git
```

## Den Code übersetzen und ausführen
```
 ./mvnw compile exec:java
```

## Die Tests ausführen
Dieser Code entstand in testgetriebener Entwicklung. Die dabei entstandenen Tests können wie folgt ausgeführt werden.
```
 ./mvnw test
 ```