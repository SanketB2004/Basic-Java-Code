// import java.util.*;

// public class Comment {

//     // Method to convert number to its textual representation
//     public static String numberToText(int num) {
//         String[] ones = {"", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};
//         String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};
//         String[] tens = {"", "", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};

//         if (num == 100) {
//             return "hundred";
//         } else if (num < 10) {
//             return ones[num];
//         } else if (num < 20) {
//             return teens[num - 10];
//         } else {
//             int tenPart = num / 10;
//             int onePart = num % 10;
//             return tens[tenPart] + (onePart != 0 ? ones[onePart] : "");
//         }
//     }

//     // Method to count vowels in a string
//     public static int countVowels(String text) {
//         int count = 0;
//         for (char c : text.toCharArray()) {
//             if ("aeiou".indexOf(c) != -1) {
//                 count++;
//             }
//         }
//         return count;
//     }

//     // Method to convert number to Marathi text representation
//     public static String numberToMarathiText(int num) {
//         String[] marathiWords = {
//                 "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
//                 "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen",
//                 "eighteen", "nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four",
//                 "twenty five", "twenty six", "twenty seven", "twenty eight", "twenty nine", "thirty",
//                 "thirty one", "thirty two", "thirty three", "thirty four", "thirty five", "thirty six",
//                 "thirty seven", "thirty eight", "thirty nine", "forty", "forty one", "forty two", "forty three",
//                 "forty four", "forty five", "forty six", "forty seven", "forty eight", "forty nine", "fifty",
//                 "fifty one", "fifty two", "fifty three", "fifty four", "fifty five", "fifty six", "fifty seven",
//                 "fifty eight", "fifty nine", "sixty", "sixty one", "sixty two", "sixty three", "sixty four",
//                 "sixty five", "sixty six", "sixty seven", "sixty eight", "sixty nine", "seventy", "seventy one",
//                 "seventy two", "seventy three", "seventy four", "seventy five", "seventy six", "seventy seven",
//                 "seventy eight", "seventy nine", "eighty", "eighty one", "eighty two", "eighty three", "eighty four",
//                 "eighty five", "eighty six", "eighty seven", "eighty eight", "eighty nine", "ninety", "ninety one",
//                 "ninety two", "ninety three", "ninety four", "ninety five", "ninety six", "ninety seven",
//                 "ninety eight", "ninety nine", "hundred"
//         };

//         if (num <= 100) {
//             return marathiWords[num];
//         }
//         return "greater 100";  // In case count exceeds 100
//     }

//     // Main method to solve the problem
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);

//         // Read input
//         int N = scanner.nextInt();
//         int[] numbers = new int[N];
//         for (int i = 0; i < N; i++) {
//             numbers[i] = scanner.nextInt();
//         }

//         // Step 1: Calculate D (vowel count sum)
//         int D = 0;
//         for (int number : numbers) {
//             String text = numberToText(number);
//             D += countVowels(text);
//         }

//         // Step 2: Find pairs whose sum is equal to D
//         Map<Integer, Integer> freq = new HashMap<>();
//         for (int num : numbers) {
//             freq.put(num, freq.getOrDefault(num, 0) + 1);
//         }

//         int pairCount = 0;

//         for (Map.Entry<Integer, Integer> entry : freq.entrySet()) {
//             int num1 = entry.getKey();
//             int count1 = entry.getValue();
//             int num2 = D - num1;

//             if (freq.containsKey(num2)) {
//                 int count2 = freq.get(num2);
//                 if (num1 == num2) {
//                     pairCount += count1 * (count1 - 1) / 2; // Choose 2 from count1
//                 } else {
//                     pairCount += count1 * count2;
//                 }
//             }
//         }

//         // Step 3: Output result as Marathi word
//         if (pairCount > 100) {
//             System.out.println("greater 100");
//         } else {
//             System.out.println(numberToMarathiText(pairCount));
//         }

//         scanner.close();
//     }
// }



// Kay Ahe Mahit Nahii Pn Lavkar Kalan 
