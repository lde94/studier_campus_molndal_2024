package se.dsve;

import java.util.ArrayList;
import java.util.List;

public class EvenNumbers {

        // Metod som filtrerar jämna tal från en lista
        public static List<Integer> filterEvenNumbers(List<Integer> numbers) {
            List<Integer> evenNumbers = new ArrayList<>();  // Ny lista för att lagra jämna tal

            for (Integer num : numbers) {  // Iterera genom varje element i listan
                if (num % 2 == 0) {        // Kontrollera om talet är jämnt
                    evenNumbers.add(num);  // Lägg till talet i listan med jämna tal
                }
            }

            return evenNumbers;  // Returnera listan med jämna tal
        }
    }

