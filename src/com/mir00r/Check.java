package com.mir00r;

import java.util.*;
import java.util.concurrent.Callable;

/**
 * @author mir00r on 2019-10-14
 * @project IntelliJ IDEA
 */

//class Comparator {
//    public boolean compare(int a, int b) {
//        return a == b;
//    }
//
//    public boolean compare(String a, String b) {
//        return a.equals(b);
//    }
//
//    public boolean compare(int[] a, int[] b) {
//        boolean isArrayCompare = false;
//        if (a.length == b.length) {
//            for (int i = 0; i < a.length; i++) {
//                isArrayCompare = a[i] == b[i];
//            }
//        }
//        return isArrayCompare;
//    }
//}


//        String numbersChar = "abcdefghi";
//        String hashChar = "jklmnopqrstuvwxyz";
//
//        LinkedHashMap<String, Character> numberMap = new LinkedHashMap<>();
//        LinkedHashMap<String, Character> hashNumberMap = new LinkedHashMap<>();
//
//        int numberIndex = 1;
//        for (int i = 0; i < numbersChar.length(); i++) {
//            numberMap.put(String.valueOf(numberIndex), numbersChar.charAt(i));
//            numberIndex++;
//        }
//
//        int hashIndex = 10;
//        for (int i = 0; i < hashChar.length(); i++) {
//            hashNumberMap.put(hashIndex + "#", hashChar.charAt(i));
//            hashIndex++;
//        }

//        int indexCount;
//                for (int i = 0; i < str.length(); i++) {
//        if (i + 2 < str.length() && str.charAt(i + 2) == '#') {
//        indexCount = (str.charAt(i) - 48) * 10 + (str.charAt(i+1) - 48);
//        i+=2;
//        } else {
//        indexCount = (str.charAt(i) - 48);
//        }
//        ans.append((char) (indexCount+96));
//        }
//        System.out.println(ans);

//public String destCity(List<List<String>> paths) {
//        if (paths == null || paths.size() == 0) return "";
//        List<String> source = new ArrayList<>();
//
//        for (List<String> path : paths) {
//        source.add(path.get(0));
//        }
//        for (List<String> path : paths) {
//        if (!source.contains(path.get(1))) return path.get(1);
//        }
//        return "";
//        }
//
//public static long getMinCost(List<Integer> employeeId, List<Integer> jobId) {
//        // Write your code here
//        Collections.sort(employeeId);
//        Collections.sort(jobId);
//        long unitTraveled = 0;
//
//        for (int i = 0; i < employeeId.size(); i++) {
//        unitTraveled += Math.abs(employeeId.get(i) - jobId.get(i));
//        }
//        return unitTraveled;
//        }
//
//public static int filledOrders(List<Integer> order, int k) {
//        // Write your code here
//        int ans = 0;
//        int sum = 0;
//        Collections.sort(order);
//        for (Integer value : order) {
//        sum += value;
//        if (sum <= k) ans++;
//        }
//        return ans;
//        }

//private String ascendingChar(int uniqueSize, String str) {
//        StringBuilder ans = new StringBuilder();
//        int lastAscii, minAscii;
//        for (int i = 0; i < str.length(); i++) {
//        lastAscii = 0;
//        minAscii = Integer.MAX_VALUE;
//        if (ans.length() > 0) {
//        lastAscii = ans.charAt(ans.length() - 1);
//        }
//        for (int j = 0; j < str.length(); j++) {
//        if (lastAscii < str.charAt(j) && minAscii > str.charAt(j)) minAscii = str.charAt(j);
//        }
//        ans.append((char) minAscii);
//        }
//        return ans.toString();
//        }
//
//private String descendingChar(int uniqueSize, String str) {
//        StringBuilder ans = new StringBuilder();
//        int lastAscii, maxAscii;
//        for (int i = 0; i < uniqueSize; i++) {
//        maxAscii = Integer.MIN_VALUE;
//        lastAscii = 0;
//        if (ans.length() > 0) {
//        lastAscii = ans.charAt(ans.length() - 1);
//        }
//        for (int j = 0; j < str.length(); j++) {
//        if (lastAscii > str.charAt(j) && maxAscii < str.charAt(j)) maxAscii = str.charAt(j);
//        }
//        ans.append((char) maxAscii);
//        }
//        return ans.toString();
//        }

public class Check {


    public static String productValues(Inventory[] items) {
        Map<String, Integer> invCountByCode = new TreeMap<>();
        StringBuffer result = new StringBuffer();

        for (Inventory item : items) {
            if (!invCountByCode.containsKey(item.product)) {
                invCountByCode.put(item.product, 0);
            }
            Integer prevLevel = invCountByCode.get(item.product);
            invCountByCode.put(item.product, prevLevel + item.qty);
        }

        for (String prodId : invCountByCode.keySet()) {
            result.append(prodId).append(",").append(invCountByCode.get(prodId)).append("\n");
        }

        char[] arg = new char[100];
        Set<Character> ans = new LinkedHashSet<>();

        for (char c : arg) {
            ans.add(c);
        }

        int index = 0;
//        char[] result = new char[ans.size()];
//
//        for (Character an : ans) {
//            result[index++] = an;
//        }

        return "";
    }


    public static class Inventory {
        public String product;
        public int qty;

        public Inventory(String product, int qty) {
            this.product = product;
            this.qty = qty;
        }


        @Override
        public String toString() {
            return qty + " * " + product;
        }
    }

    public static String getUserName (String firstName, String lastName) {
        if (lastName == null) return capitaliseFirstLetter(firstName);
        else return capitaliseFirstLetter(lastName) + " , " + capitaliseFirstLetter(firstName);
    }


    public static String capitaliseFirstLetter (String s) {
        if (s == null || s.length() < 1) {
            return s;
        }

        char[] chars = s.toCharArray();

        chars[0] = Character.toUpperCase(chars[0]);

        return String.valueOf(chars);
    }


//    Set<Character> uniqueStrSet = new HashSet<>();
//    TreeSet<Character> treeSet = new TreeSet<>();
//    LinkedHashMap<Character, Integer> chMap = new LinkedHashMap<>();
//
//        for (int i = 0; i < str.length(); i++) {
//        treeSet.add(str.charAt(i));
//    }
//
//    Character[] chStr = new Character[treeSet.size()];
//    int[] frequency = new int[treeSet.size()];
//
//        for (int i = 0; i < treeSet.size(); i++) {
//        Character ch = (Character) treeSet.toArray()[i];
//        int chCount = 0;
//        for (int j = 0; j < str.length(); j++) {
//            if (ch == str.charAt(j)) chCount++;
//        }
//        chMap.put(ch, chCount);
//        chStr[i] = ch;
//        frequency[i] = chCount;
//    }
//
//        while (true) {
//        int frequencyCount = 0;
//        for (int value : frequency) {
//            if (value <= 0) frequencyCount++;
//        }
//        if (frequencyCount == frequency.length) break;
//
//        for (int i = 0; i < chStr.length; i++) {
//            if (frequency[i] > 0) {
//                ans.append(chStr[i]);
//                frequency[i] = frequency[i] - 1;
//            }
//        }
//        for (int i = chStr.length - 1; i >= 0; i--) {
//            if (frequency[i] > 0) {
//                ans.append(chStr[i]);
//                frequency[i] = frequency[i] - 1;
//            }
//        }
//    }


//    StringBuilder wordMorseCode = new StringBuilder();
//    Set<String> ansSet = new HashSet<String>();
//
//    String[] morseCode = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
//
//    LinkedHashMap<Character, String> morseCodeMap = new LinkedHashMap<>();
//
//        for (int i = 0; i < morseCode.length; i++) {
//        morseCodeMap.put((char) (i + 97), morseCode[i]);
//    }
//
//        for (String word : str) {
//        for (int j = 0; j < word.length(); j++) {
//            wordMorseCode.append(morseCodeMap.get(word.charAt(j)));
//        }
//        ansSet.add(wordMorseCode.toString());
//        wordMorseCode.setLength(0);
//    }
//        System.out.println(ansSet);


//    int rCount = 0;
//    int lCount = 0;
//    int ans = 0;
//        for (int i = 0; i < str.length(); i++) {
//        if (str.charAt(i) == 'R') {
//            rCount++;
//        } else if (str.charAt(i) == 'L') {
//            lCount++;
//        }
//        if (rCount == lCount) {
//            ans++;
//            rCount = 0;
//            lCount = 0;
//            continue;
//        }
//    }
//        System.out.println(ans);


//    public int[] kWeakestRows(int[][] matrix, int k) {
//        int[] ans = new int[k];
//        int r = matrix.length;
//        int c = matrix[0].length;
//        int[] soldierCount = new int[r];
//
//        for (int i = 0; i < r; i++) {
//            for (int j = 0; j < c; j++) {
//                if (matrix[i][j] == 1) soldierCount[i]++;
//            }
//        }
//        int indexer = 0;
//        while (k > 0) {
//            int minIndex = 0;
//            for (int i = 0; i < soldierCount.length; i++) {
//                if (soldierCount[i] < soldierCount[minIndex]) {
//                    minIndex = i;
//                }
//            }
//            ans[indexer++] = minIndex;
//            soldierCount[minIndex] = Integer.MAX_VALUE;
//            k--;
//        }
//        return ans;
//    }


//    public static void main(String[] args) {
//        Scanner scan = new Scanner(System.in);
//        Comparator comp = new Comparator();
//
//        int testCases = Integer.parseInt(scan.nextLine());
//        while (testCases-- > 0) {
//            int condition = Integer.parseInt(scan.nextLine());
//            switch (condition) {
//                case 1:
//                    String s1 = scan.nextLine().trim();
//                    String s2 = scan.nextLine().trim();
//
//                    System.out.println((comp.compare(s1, s2)) ? "Same" : "Different");
//                    break;
//                case 2:
//                    int num1 = scan.nextInt();
//                    int num2 = scan.nextInt();
//
//                    System.out.println((comp.compare(num1, num2)) ? "Same" : "Different");
//                    if (scan.hasNext()) { // avoid exception if this last test case
//                        scan.nextLine(); // eat space until next line
//                    }
//                    break;
//                case 3:
//                    // create and fill arrays
//                    int[] array1 = new int[scan.nextInt()];
//                    int[] array2 = new int[scan.nextInt()];
//                    for (int i = 0; i < array1.length; i++) {
//                        array1[i] = scan.nextInt();
//                    }
//                    for (int i = 0; i < array2.length; i++) {
//                        array2[i] = scan.nextInt();
//                    }
//
//                    System.out.println(comp.compare(array1, array2) ? "Same" : "Different");
//                    if (scan.hasNext()) { // avoid exception if this last test case
//                        scan.nextLine(); // eat space until next line
//                    }
//                    break;
//                default:
//                    System.err.println("Invalid input.");
//            }// end switch
//        }// end while
//        scan.close();
//    }


    /*
    * class Parser {
    public boolean isBalanced(String bracket) {
        Stack<Character> st = new Stack<Character>();
        for (int i = 0; i < bracket.length(); i++) {
            if(bracket.charAt(i) == '{' || bracket.charAt(i) == '(' || bracket.charAt(i) == '[') {
                st.push(bracket.charAt(i));
            }
            if(bracket.charAt(i) == '}' || bracket.charAt(i) == ')' || bracket.charAt(i) == ']') {
                if(st.isEmpty()) {
                    return false;
                } else if (!isMatchingPair(st.pop(), bracket.charAt(i))) {
                    return false;
                }
            }
        }
        if(st.isEmpty()) return true;
        else return false;
    }

    public boolean isMatchingPair(char character1, char character2) {
       if (character1 == '(' && character2 == ')')
         return true;
       else if (character1 == '{' && character2 == '}')
         return true;
       else if (character1 == '[' && character2 == ']')
         return true;
       else
         return false;
    }
}

class Solution {

	public static void main(String[] args) {
		Parser parser = new Parser();

		Scanner in = new Scanner(System.in);

		while (in.hasNext()) {
			System.out.println(parser.isBalanced(in.next()));
		}

		in.close();
	}
}
    *
    * */


//    public static void acceptValidInput(Scanner sc) {
//        System.out.print("Enter a number greater than 10: ");
//
//        int i = sc.nextInt();
//
//        if (i <= 10) {
//            acceptValidInput(sc);
//        }
//        System.out.println(i);
//    }


    //    public static void helloWorldPrint(int n) {
//        if (n == 0) return;
//        else {
//            helloWorldPrint(n - 1);
//            System.out.println(n + " Hello World!");
//            //helloWorldPrint(n-1);
//        }
//    }

//    public List<Integer> preOrderTraversal(TreeNode root) {
//        List<Integer> nodeList = new ArrayList<>();
//        if (root == null) return nodeList;
//
//        Stack<TreeNode> st = new Stack<>();
//        st.push(root);
//
//        while (!st.empty()) {
//            root = st.pop();
//            nodeList.add(root.val);
//            if (root.left != null) st.push(root.left);
//            if (root.right != null) st.push(root.right);
//        }
//        return nodeList;
//    }


//    int evenIndex = 0;
//    int oddIndex = 1;
//        for (int num : nums) {
//        if (num % 2 == 0) {
//            result[evenIndex] = num;
//            evenIndex += 2;
//        } else {
//            result[oddIndex] = num;
//            oddIndex += 2;
//        }
//    }

//      this.inputArray(n, nums, input);
//        this.copyArray(result, nums, nums.length);
//
//        this.printArray(result.length, result);
//        this.sortArray(nums, nums.length);
//        this.printArray(nums.length, nums);
//
//        for (int i = 0; i < nums.length; i++) {
//        if (nums[i] != result[i]) count++;
//    }
//        System.out.println("Count - "+count);

//    public boolean colCheck(int[][] grid, int value, int cSize, int r) {
//        boolean isLuckyNumber = true;
//        for (int i = 0; i < cSize; i++) {
//            if (value > grid[r][i]) {
//                isLuckyNumber = false;
//                break;
//            }
//        }
//        return isLuckyNumber;
//    }
//
//    public boolean rowCheck(int[][] grid, int value, int rSize, int c) {
//        boolean isLuckyNumber = true;
//        for (int i = 0; i < rSize; i++) {
//            if (value < grid[i][c]) {
//                isLuckyNumber = false;
//                break;
//            }
//        }
//        return isLuckyNumber;
//    }

//    List<Integer> luckyNumbers = new ArrayList<>();
//        for (int i = 0; i < r; i++) {
//        for (int j = 0; j < c; j++) {
//            if (this.colCheck(matrix, matrix[i][j], c, i) && this.rowCheck(matrix, matrix[i][j], r, j)) {
//                luckyNumbers.add(matrix[i][j]);
//            }
//        }
//    }
//
//        for (Integer luckyNumber : luckyNumbers) {
//        System.out.println("List -> " + luckyNumber);


//    for (int i = 0; i < n; i++) {
//        int square = nums[i] * nums[i];
//        result[i] = square;
//    }


//    int col = matrix[0].length;
//        this.inputMatrix(n, m, matrix, input);
//        for (int i = 0; i < n; i++) {
//        this.reverseRow(i, m, matrix);
//    }
//        System.out.println("------------ After Revers every row ---------------");
//        this.printMatrix(n, m, matrix);
//        for (int i = 0; i < n; i++) {
//        this.invertRow(i, m, matrix);
//    }
//        System.out.println("------------ After Invert every row ---------------");
//        this.printMatrix(n, m, matrix);


    //        int div = n / 2;
//        for (int i = -div; i < 0; i++) {
//            result[index++] = i;
//        }
//        for (int i = 1; i <= div; i++) {
//            result[index++] = i;
//        }
//        if (n % 2 != 0) {
//            result[index++] = 0;
//        }
//        for (int value : result) {
//            System.out.print(value + " ");
//        }
//        System.out.println();

//        int negativeCount = 0;
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++)
//                matrix[i][j] = input.nextInt();
//        }
//        int len = matrix.length;
//        System.out.println("Len -> " + len);
//        int col = matrix[0].length;
//        System.out.println("COL -> " + col);
//        for(int i = 0; i < n; i++) {
//            for(int j = 0; j < m; j++)
//                if(matrix[i][j] < 0) negativeCount++;
//        }
//        System.out.println(negativeCount);

//        for (int i = 0; i < n; i++) {
//            nums[i] = input.nextInt();
//        }
//
//        int maxn = -1;
//        result[nums.length - 1] = -1;
//        for (int i = nums.length - 2; i >= 0; i--) {
//            maxn = Math.max(nums[i+1], maxn);
//            result[i] = maxn;

//        for (int i = 0; i < nums.length; i++) {
//            int largeItem = 0;
//            for (int i1 = i+1; i1 < nums.length; i1++) {
//                if (largeItem < nums[i1]) {
//                    largeItem = nums[i1];
//                }
//            }
//            if (largeItem == 0) result[i] = -1;
//            else
//                result[i] = largeItem;
//        }

//        for (int i : result) {
//            System.out.print(i + " ");
//        }

//        this.initMatrix(n, m, matrix);
//        for (int i = 0; i < 2; i++) {
//            for (int j = 0; j < 2; j++) {
//                indices[i][j] = input.nextInt();
//            }
//        }

//        for (int[] ints : indices) {
//            row[ints[0]]++;
//            col[ints[1]]++;
//        }

//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                matrix[i][j] += 1;
//            }
//            for (int[] ints : indices) {
//                matrix[i][ints[0]]++;
//                matrix[i][ints[1]]++;
//            }
//        }
//        this.printMatrix(n, m, matrix);

//        for (int value : row) {
//            System.out.print("ROW -> " + value + " ");
//        }
//        System.out.println();
//        for (int value : col) {
//            System.out.print("COL -> " + value + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < n; i++) {
//            for (int j = 0; j < m; j++) {
//                if (matrix[i][j] % 2 != 0) count++;
//                //if ((row[i] + col[j]) % 2 != 0) count++;
//               // if ((matrix[i][j] + matrix[1][j]) % 2 != 0) count++;
//            }
//        }
//        System.out.println(count);
//
//        for (int i = 1; i < n; i++) {
//            sum += getMax(points[i - 1][0], points[i - 1][1], points[i][0], points[i][1]);
//        }
//        System.out.println(sum);

//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i < nums.length; i++) {
//            list.add(nums1[i], nums[i]);
//        }
//        int[] ans = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) {
//            ans[i] = list.get(i);
//        }


//        int[] target = new int[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            if (count > nums1[i]) {
//                for (int j = count; j > nums1[i]; j--) {
//                    target[j] = target[j - 1];
//                }
//            }
//            target[nums1[i]] = nums[i];
//            count++;
//        }
//
//        for (int value : target) {
//            System.out.print(value + " ");
//        }

//        for (int value : nums) {
//            if (getDigit(value) % 2 == 0) count++;
//        }
//        System.out.println(count);

//        for (int value : nums) {
//            count = 0;
//            for (int num : nums) {
//                if (value > num) count++;
//            }
//            result[index++] = count;
//        }
//
//        for (int i = 0; i < index; i++) {
//            System.out.println(result[i]);
//        }
//        x = input.nextInt();
//
//        int maxValue = this.getMax(nums, -1);
//        List<Boolean> kidsWithCandies = new ArrayList<>();
//
//        for (int i = 0; i < nums.length; i++) {
//            if (nums[i] < maxValue) {
//                int diff = maxValue - nums[i];
//                if (diff > x) kidsWithCandies.add(false);
//                else kidsWithCandies.add(true);
//            } else if (nums[i] == maxValue) kidsWithCandies.add(true);
//            else kidsWithCandies.add(false);
//        }
//
//        for (Boolean item : kidsWithCandies) {
//            System.out.println(item);
//        }

        /*System.out.println("Sum -> " +getSum(nums));
        int[] result = new int[getSum(nums)];
        System.out.println("Result Len -> " +result.length);
        for (int i1 = 1; i1 <= n; i1 += 2) {
            if ((i1 + 1) <= n) {
                for (int i = 0; i < nums[i1]; i++) {
                    result[index++] = nums[i1+1];
                }
            }
        }
        System.out.println("Index len -> "+index);
        for (int i = 0; i < index; i++) {
            System.out.print(result[i] + " ");
        }*/


//    public int tryCatchCheck(int n) {
//        try {
//            if (n % 2 == 0) return n % 2;
//            else return n / 2;
//        } catch (Exception ex) {
//            System.out.println(ex.getMessage());
//        } finally {
//            System.out.println("Finally Block calling");
//        }
//        return n;
//    }

//    public boolean judgeCircle(String moves) {
//        int right = 0, left = 0, up = 0, down = 0;
//        for (int i = 0; i < moves.length(); i++) {
//            if (moves.charAt(i) == 'R') right++;
//            if (moves.charAt(i) == 'L') left++;
//            if (moves.charAt(i) == 'U') up++;
//            if (moves.charAt(i) == 'D') down++;
//        }
//        return (up == down) && (left == right);
//    }

//    public int numUniqueEmails(String[] emails) {
//        Set<String> ansSet = new HashSet<>();
//        for (String email : emails) {
//            StringBuilder sb = new StringBuilder();
//
//            for (int i = 0; i < email.length(); i++) {
//                if (email.charAt(i) == '.') continue;
//                else if (email.charAt(i) == '+') {
//                    /*
//                        Returns a string that is a substring of this string. The
//                        substring begins with the character at the specified index and
//                        extends to the end of this string
//                     */
//                    while (email.charAt(i) != '@') i++;
//                    sb.append(email.substring(i));
//                    break;
//                } else {
//                    if (email.charAt(i) == '@') {
//                        sb.append(email.charAt(i++));
//                        sb.append(email.substring(i));
//                        break;
//                    } else {
//                        sb.append(email.charAt(i));
//                    }
//                }
//            }
//            ansSet.add(sb.toString());
//        }
//        return ansSet.size();
//    }

//    public int isPrefixOfWord(String sentence, String searchWord) {
//        int ans = -1;
//        String[] words = sentence.split(" ");
//        for (int i = 0; i < words.length; i++) {
//            String word = words[i];
//            int searchWordLen = searchWord.length();
//            int lenCount = 0;
//            if (word.length() >= searchWordLen) {
//                for (int j = 0; j < word.length(); j++) {
//                    if (j < searchWordLen && word.charAt(j) == searchWord.charAt(j)) lenCount++;
//                }
//                if (lenCount == searchWordLen) {
//                    ans = i + 1;
//                    break;
//                }
//            }
//        }
//        return ans;
//    }


//    public int numSpecialEquivGroups(String[] A) {
//        Set<String> ansSet = new HashSet<>();
//        for (String s : A) {
////            ansSet.add(getEquivalentStr(s));
//            String str = this.sortChWithIndex(s.toCharArray());
//            ansSet.add(str);
//        }
//        return ansSet.size();
//    }
//
//    private String sortChWithIndex(char[] str) {
//        for (int i = 0; i < str.length; i++) {
//            for (int j = i + 2; j < str.length; j += 2) {
//                if (str[i] > str[j]) {
//                    char tempCh = str[j];
//                    str[j] = str[i];
//                    str[i] = tempCh;
//                }
//            }
//        }
//        return Arrays.toString(str);
//    }
//
//    private String getEquivalentStr(String str) {
//        int[] odd = new int[26];
//        int[] even = new int[26];
//        StringBuilder ans = new StringBuilder();
//
//        for (int i = 0; i < str.length(); i += 2) {
//            even[str.charAt(i) - 'a']++;
//        }
//        for (int i = 1; i < str.length(); i += 2) {
//            odd[str.charAt(i) - 'a']++;
//        }
//        for (int i = 0; i < 26; i++) {
//            ans.append(even[i]);
//        }
//
//        for (int i = 0; i < 26; i++) {
//            ans.append(odd[i]);
//        }
//        return ans.toString();
//    }

//    public String toGoatLatin(String S) {
//        String[] word = S.split(" ");
//        StringBuilder ans = new StringBuilder();
//        for (int i = 0; i < word.length; i++) {
//            String w = word[i];
//            if (this.isVowel(w.charAt(0))) {
//                ans.append(w).append("ma");
//            } else {
//                for (int j = 1; j < w.length(); j++) {
//                    ans.append(w.charAt(j));
//                }
//                ans.append(w.charAt(0)).append("ma");
//            }
//            for (int i1 = 0; i1 <= i; i1++) {
//                ans.append('a');
//            }
//            if (i != word.length - 1)
//                ans.append(" ");
//        }
//        return ans.toString();
//    }
//
//    private boolean isVowel(char ch) {
//        String vowel = "aeiouAEIOU";
//        for (int i = 0; i < vowel.length(); i++) {
//            if (vowel.charAt(i) == ch) return true;
//        }
//        return false;
//    }

//    public int maxPower(String s) {
//        int ans = 0;
//        for (int i = 0; i < s.length(); i++) {
//            int maxCount = 1;
//            for (int j = i + 1; j < s.length(); j++) {
//                if (s.charAt(i) != s.charAt(j)) break;
//                maxCount++;
//            }
//            if (maxCount > ans) ans = maxCount;
//        }
//        return ans;
//    }

//    public int maxNumberOfBalloons(String text) {
//        Integer chCount = 0;
//        int sum = 0;
//        String balloonStr = "balon";
//        LinkedHashMap<Character, Integer> map = new LinkedHashMap<>();
//
//        for (int i = 0; i < text.length(); i++) {
//            for (int j = 0; j < balloonStr.length(); j++) {
//                if (text.charAt(i) == balloonStr.charAt(j)) {
//                    chCount = map.getOrDefault(text.charAt(i), 0);
//                    map.put(text.charAt(i), chCount + 1);
//                    break;
//                }
//            }
//        }
//
//        if (map.size() == 5)
//            return Math.min(map.get('l') / 2, map.get('o') / 2);
//        else return 0;
//    }

//    public List<String> stringMatching(String[] words) {
//        List<String> ans = new ArrayList<>();
//        for (int i = 0; i < words.length; i++) {
//            for (int j = 0; j < words.length; j++) {
//                if (i != j) {
//                    if (words[j].contains(words[i])) {
//                        ans.add(words[i]);
//                        break;
//                    }
//                }
//            }
//        }
//        return ans;
//    }


//    public int removePalindromeSub(String s) {
//        int ans = 1;
//        if (s.isEmpty()) return 0;
//        if (this.isPalindrome(s)) return 1;
//        else {
//            return 2;
//        }
//    }


//    public boolean isPalindrome(String str) {
//        int start = 0;
//        int end = str.length() - 1;
//
//        while (start < end) {
//            if (str.charAt(start) != str.charAt(end)) return false;
//            start++;
//            end--;
//        }
//        return true;
//    }

//    public int[] numSmallerByFrequency(String[] queries, String[] words) {
//        int[] ans = new int[queries.length];
//        int[] query = new int[queries.length];
//        int[] word = new int[words.length];
//
//        for (int i = 0; i < queries.length; i++) {
//            query[i] = this.getSmallFrequencyCount(queries[i]);
//        }
//        for (int i = 0; i < words.length; i++) {
//            word[i] = this.getSmallFrequencyCount(words[i]);
//        }
//        for (int i = 0; i < query.length; i++) {
//            int count = 0;
//            for (int value : word) {
//                if (query[i] < value) count++;
//            }
//            ans[i] = count;
//        }
//        return ans;
//    }
//
//    private int getSmallFrequencyCount(String str) {
//        int[] alphabet = new int[26];
//        for (int i = 0; i < str.length(); i++) {
//            alphabet[str.charAt(i) - 'a']++;
//        }
//        for (int value : alphabet) {
//            if (value > 0) return value;
//        }
//        return 0;
//    }


//    public int findLUSlength(String a, String b) {
//        int match = 0, dontMatch = 0;
//        if (a.length() == b.length()) {
//            for (int i = 0; i < b.length(); i++) {
//                if (b.charAt(i) != a.charAt(i)) dontMatch++;
//                else match++;
//            }
//            if (match == a.length()) return -1;
//            else return match + dontMatch;
//        } else return Math.max(a.length(), b.length());
//    }
//
//    public String reverseOnlyLetters(String S) {
//        int start = 0;
//        int end = S.length() - 1;
//
//        char[] chArray = S.toCharArray();
//        while (start < end) {
//            if (this.isAlphabet(chArray[start]) && this.isAlphabet(chArray[end])) {
//                char tempCh = chArray[end];
//                chArray[end] = chArray[start];
//                chArray[start] = tempCh;
//                start++;
//                end--;
//            } else if (!this.isAlphabet(chArray[start])) {
//                start++;
//            } else if (!this.isAlphabet(chArray[end])) {
//                end--;
//            }
//        }
//        return String.valueOf(chArray);
//    }
//
//    public boolean isAlphabet(char ch) {
//        return (ch >= 'a' && ch <= 'z' || ch >= 'A' && ch <= 'Z');
//    }


//    public int rotatedDigits(int N) {
//        int ans = 0;
//        for (int i = 1; i <= N; i++) {
//            ans += this.digitCount(i);
//        }
//        return ans;
//    }
//
//    private int digitCount(int n) {
//        boolean have2569 = false;
//        boolean have347 = false;
//
//        while (n != 0) {
//            int mod = n % 10;
//            n /= 10;
//            if (mod == 2 || mod == 5 || mod == 6 || mod == 9) {
//                have2569 = true;
//            }
//            if (mod == 3 || mod == 4 || mod == 7) {
//                have347 = true;
//            }
//        }
//        if (!have347 && have2569) return 1;
//        return 0;
//    }


//    public int countBinarySubstrings(String s) {
//        int ans = 0;
//        int len = s.length();
////        for (int i = 1; i < len; i += 2) {
////            for (int j = 0; j < len; j++) {
////                if ((j + i) < len && this.isBalanced(s.substring(j, (j + i) + 1))) ans++;
////            }
////        }
////        for (int i = 0; i < len - 1; i++) {
////            System.out.println(s.substring(i, (i + 1) + 1));
////            if (this.isBalanced(s.substring(i, (i + 1) + 1))) ans++;
////        }
////        return ans;
//
//        int duplicate = 1;
//        int previousDuplicate = 0;
//        int sum = 0;
//        for (int i = 0; i < s.length() - 1; i++) {
//            System.out.println(s.substring(i, (i + 1) + 1));
//            if (s.charAt(i) != s.charAt(i + 1)) {
//                sum += Math.min(previousDuplicate, duplicate);      //calculate sum on bases of previous duplicates and new duplicates
//                previousDuplicate = duplicate;
//                duplicate = 1;
//            } else
//                duplicate++;      //count duplicates
//        }
//        sum += Math.min(previousDuplicate, duplicate);
//        return sum;
//
//    }

//    public boolean isBalanced(String digit) {
//        int len = digit.length();
//        int start = 0;
//        int end = len - 1;
//        int misMatch = 0;
//        boolean isOk = true;
//
////        System.out.println("Digit -> " + digit);
//        for (int i = 1; i < len; i++) {
//            if (misMatch > 1) break;
//            if (digit.charAt(i - 1) != digit.charAt(i)) misMatch++;
//        }
//        while (start < end) {
//            if (digit.charAt(start) == digit.charAt(end)) {
//                isOk = false;
//                break;
//            }
//            start++;
//            end--;
//        }
//        return misMatch == 1 && isOk;
//    }


//    public String reformat(String s) {
//        StringBuilder ans = new StringBuilder();
//        int len = s.length();
//        int alphabetIndex = 0, numericIndex = 0;
//        int alphabetCount = 0, numericCount = 0;
//
//        for (int i = 0; i < len; i++) {
//            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') alphabetCount++;
//            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') numericCount++;
//        }
//
//        char[] alphabet = new char[alphabetCount];
//        char[] numeric = new char[numericCount];
//        for (int i = 0; i < len; i++) {
//            if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') alphabet[alphabetIndex++] = s.charAt(i);
//            if (s.charAt(i) >= '0' && s.charAt(i) <= '9') numeric[numericIndex++] = s.charAt(i);
//        }
//
//        int difference = alphabetCount - numericCount;
//        if (difference == -1 || difference == 0 || difference == 1) {
//            if (alphabetIndex > numericIndex) {
//                for (int i = 0; i < alphabet.length; i++) {
//                    if (alphabet[i] >= 'a' && alphabet[i] <= 'z') ans.append(alphabet[i]);
//                    if (i < numericIndex && numeric[i] >= '0' && numeric[i] <= '9') ans.append(numeric[i]);
//                }
//            } else {
//                for (int i = 0; i < numeric.length; i++) {
//                    if (numeric[i] >= '0' && numeric[i] <= '9') ans.append(numeric[i]);
//                    if (i < alphabetIndex && alphabet[i] >= 'a' && alphabet[i] <= 'z') ans.append(alphabet[i]);
//                }
//            }
//        }
//        return ans.toString();
//    }


//    public int maxScore(String s) {
//        int sum = 0;
//        int start = 0;
//        int end = s.length();
//        for (int i = 0; i < end - 1; i++) {
//            String leftStr = s.substring(start, i + 1);
//            String rightStr = s.substring(i + 1, end);
////            System.out.println("Left -> " + leftStr);
////            System.out.println("Right -> " + rightStr);
//
//            int countSum = this.countBinaryCh(leftStr, 0) + this.countBinaryCh(rightStr, 1);
////            System.out.println("Sum -> " + countSum);
//            if (countSum > sum) sum = countSum;
//        }
//        return sum;
//    }
//
//    private int countBinaryCh(String str, int binary) {
//        int count = 0;
//        if (binary == 1) {
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == '1') count++;
//            }
//        } else {
//            for (int i = 0; i < str.length(); i++) {
//                if (str.charAt(i) == '0') count++;
//            }
//        }
//        return count;
//    }

//    public boolean buddyStrings(String A, String B) {
//        int lenA = A.length();
//        int lenB = B.length();
//        if (lenA != lenB) return false;
//        else if (lenA <= 1 || lenB <= 1) return false;
//        else {
//            return this.isAdjacentSwapOk(A, B) || this.isIncrementalSwapOk(A, B);
//        }
//    }
//
//    public boolean isIncrementalSwapOk(String A, String B) {
//        for (int i = 1; i < A.length(); i++) {
//            String swapStr = this.swap(A, 0, i);
//            System.out.println("Incremental Swap Str -> " + swapStr);
//            if (swapStr.equals(B)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public boolean isAdjacentSwapOk(String A, String B) {
//        for (int i = 1; i < A.length(); i++) {
//            String swapStr = this.swap(A, i - 1, i);
//            System.out.println("Adjacent Swap Str -> " + swapStr);
//            if (swapStr.equals(B)) {
//                return true;
//            }
//        }
//        return false;
//    }
//
//    public String swap(String str, int i, int j) {
//        StringBuilder sb = new StringBuilder(str);
//        sb.setCharAt(i, str.charAt(j));
//        sb.setCharAt(j, str.charAt(i));
//        return sb.toString();
//    }


//    public int repeatedStringMatch(String A, String B) {
//        int ans = 1;
//        int lenB = B.length();
//        boolean repeatStr = false;
//        StringBuilder queryStr = new StringBuilder(A);
//
//        while (queryStr.length() < lenB) {
//            queryStr.append(A);
//            ans++;
//        }
//
//        if (queryStr.indexOf(B) != -1) return ans;
//        else {
//            queryStr.append(A);
//            ans++;
//        }
//
//        System.out.println("Final Str -> " + queryStr);
//
//        if (queryStr.indexOf(B) != -1) return ans;
//        else return -1;
//    }

//    public boolean validPalindrome(String s) {
//        int start = 0;
//        int end = s.length() - 1;
//
//        while (start < end) {
//            if (s.charAt(start) == s.charAt(end)) {
//                start++;
//                end--;
//            } else {
//                if (this.isPalindrome(s, start + 1, end)) return true;
//                return this.isPalindrome(s, start, end - 1);
//            }
//        }
//        return true;
//    }
//
//    private boolean isPalindrome(String str, int start, int end) {
//        while (start < end) {
//            if (str.charAt(start) != str.charAt(end)) return false;
//            start++;
//            end--;
//        }
//        return true;
//    }
//
//    private String getOperationStr(String str, int skipIndex) {
//        StringBuilder operationStr = new StringBuilder();
//        for (int i = 0; i < str.length(); i++) {
//            if (i != skipIndex) operationStr.append(str.charAt(i));
//        }
////        System.out.println(operationStr.toString());
//        return operationStr.toString();
//    }

//    public int ping(int t) {
//        Queue<Integer> myQueue = new LinkedList<>();
//        myQueue.offer(t);
//        while (myQueue.peek() < (t - 3000)) {
//            myQueue.poll();
//        }
//        return myQueue.size();
//    }
}
