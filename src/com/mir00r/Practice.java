package com.mir00r;

import java.util.*;

/**
 * @author mir00r on 2/5/20
 * @project IntelliJ IDEA
 */
public class Practice {
    int StringAsIntegerCompare(String s1, String s2) {
        if (s1.length() > s2.length()) return 1;
        if (s1.length() < s2.length()) return -1;
        for (int i = 0; i < s1.length(); i++) {
            if ((int) s1.charAt(i) > (int) s2.charAt(i)) return 1;
            if ((int) s1.charAt(i) < (int) s2.charAt(i)) return -1;
        }
        return 0;
    }

    // Complete the isBalanced function below.
    String isBalanced(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(')
                stack.push(')');
            else if (ch == '{')
                stack.push('}');
            else if (ch == '[')
                stack.push(']');
            else {
                if (stack.isEmpty() || ch != stack.peek()) {
                    return "NO";
                } else {
                    stack.pop();
                }
            }
        }
        if (stack.isEmpty()) return "YES";
        return "NO";
    }

    // Function to right rotate an array by one position
    public static void rightRotateByOne(int[] A, int n) {
        int last = A[n - 1];
        System.arraycopy(A, 0, A, 1, n - 2 + 1);
        A[0] = last;
    }

    // Function to right rotate an array by k positions
    public static void rightRotate(int[] A, int k, int n) {
        for (int i = 0; i < k; i++)
            rightRotateByOne(A, n);
    }

    // Function to right rotate an array by k positions
    public static int[] rightNTimes(int[] A, int k, int n) {
        int dest = k % n;
        int[] B = new int[n];
        for (int i = 0; i < n; i++) {
            B[dest++] = A[i];
            if (dest == n) dest = 0;
        }
        return B;
    }

    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> queries) {
//        int[] myArr = new int[a.size()];
//        for (int i = 0; i < a.size(); i++) {
//            myArr[i] = a.get(i);
//        }
////        rightRotate(myArr, k, a.size());
//
//        int n = a.size();
//        int dest = k % n;
//        int[] B = new int[n];
//        for (int i = 0; i < n; i++) {
//            B[dest++] = myArr[i];
//            if (dest == n) dest = 0;
//        }

//        myArr = rightNTimes(myArr, k, a.size());

//        List<Integer> ans = new ArrayList<>();
//        for (int i = 0; i < queries.size(); i++) {
//            ans.add(B[i]);
//        }


        int[] arr = new int[a.size()];

        for (int i = 0; i < a.size(); i++)
            arr[(i + k) % a.size()] = a.get(i);

        List<Integer> ans = new ArrayList<>();
        for (Integer query : queries) ans.add(arr[query]);

        return ans;
    }


    public int[] runningSum(int[] nums) {
        int len = nums.length;
        int[] result = new int[len];
        for (int i = 0; i < len; i++) {
            int value = nums[i];
            result[i] = value * (value + 1) / 2;
        }
        return result;
    }

    public void calculate() {
        Scanner input = new Scanner(System.in);
        int tc, n, m, k, sum = 0, index = 0, count = 0;
        n = input.nextInt();
        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }

        int[] result = this.runningSum(arr);
        for (int j : result) {
//            System.out.printf(j);
        }
//        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        k = input.nextInt();
//
//        this.rightRotate(a, k, n);
//        for (int i : a) {
//            System.out.print(i);
//        }

//        Arrays.sort(unsorted, Comparator.comparingInt(String::length));
//        Arrays.sort(unsorted, this::StringAsIntegerCompare);
//        Arrays.sort(unsorted, (x, y) -> x.length() == y.length() ? x.compareTo(y) : Integer.compare(x.length(), y.length()));

//        String[] result = new String[n];
//        if (unsorted.length >= 0) System.arraycopy(unsorted, 0, result, 0, unsorted.length);
//
//        System.out.println(Arrays.toString(unsorted));


//        k = input.nextInt();
//        int[] nums = new int[n];
//        int[] nums1 = new int[n];
//        int[] result = new int[n];
//        int[] row = new int[n];
        //int[] col = new int[m];
//        int[][] points = new int[n][n];
//        int[][] matrix = new int[n][m];
//        int[][] indices = new int[n][m];

//        this.inputArray(n, nums, input);
//        this.printArray(result.length, result);

//        this.inputMatrix(n, m, matrix, input);
//        int r = matrix.length;
//        int c = matrix[0].length;
//        System.out.println("R -> " + r + " " + "C -> " + c);

//        String str = input.nextLine();
//        String str2 = input.nextLine();
//        StringBuilder ans = new StringBuilder();

//        String[] str1 = {"bbb", "cc"};
//        String[] str2 = {"a", "aa", "aaa", "aaaa"};
//        System.out.println(this.callDequeue(n, m));
//        callDequeue(n, m);
    }

//    public void callDequeue(int k, int value) {
//        MyCircularDeque obj = new MyCircularDeque(k);
//        boolean param_1 = obj.insertFront(value);
//        boolean param_2 = obj.insertLast(value);
//        boolean param_3 = obj.deleteFront();
//        boolean param_4 = obj.deleteLast();
//        int param_5 = obj.getFront();
//        System.out.println("Front value -> " + param_5);
//        int param_6 = obj.getRear();
//        System.out.println("Rear value -> " + param_6);
//        boolean param_7 = obj.isEmpty();
//        boolean param_8 = obj.isFull();
//    }

    public static boolean alphaNumeric(char char1) {
        return (char1 >= 'a' && char1 <= 'z')
                || (char1 >= 'A' && char1 <= 'Z')
                || (char1 >= '0' && char1 <= '9')
                || (char1 == '!' || char1 == '@' || char1 == '#' || char1 == '$'
                || char1 == '%' || char1 == '^' || char1 == '&' || char1 == '*'
                || char1 == '(' || char1 == ')' || char1 == '-' || char1 == '+');
    }

    public static boolean lower(char char1) {
        return (char1 >= 'a' && char1 <= 'z');
    }

    public static boolean upper(char char1) {
        return (char1 >= 'A' && char1 <= 'Z');
    }

    public static boolean numeric(char char1) {
        return (char1 >= '0' && char1 <= '9');
    }

    public static boolean special(char char1) {
        return (char1 == '!' || char1 == '@' || char1 == '#' || char1 == '$'
                || char1 == '%' || char1 == '^' || char1 == '&' || char1 == '*'
                || char1 == '(' || char1 == ')' || char1 == '-' || char1 == '+');
    }

    public static int minimumNumber(int n, String password) {
        int ans = 0;
        boolean[] needCh = new boolean[4];

        for (int i = 0; i < password.length(); i++) {
            if (numeric(password.charAt(i))) needCh[0] = true;
            if (lower(password.charAt(i))) needCh[1] = true;
            if (upper(password.charAt(i))) needCh[2] = true;
            if (special(password.charAt(i))) needCh[3] = true;
        }
        for (boolean ch : needCh) {
            if (!ch) ans++;
        }
        return Math.max(ans, 6 - n);

    }

    public static void foo(Object o) {
        System.out.println("Object argument");
    }

    public static void foo(String s) {
        System.out.println("String argument");
    }

    public static void foo(Boolean b) {
        System.out.println("Boolean argument");
    }

    interface Service {
        default void execute() {
            System.out.println("Do Action");
        }
    }

    public static String firstStep(int n) {
        StringBuilder brackets = new StringBuilder();
        for (int i = 0; i < n; i++) {
            brackets.append("(");
        }
        for (int i = 0; i < n; i++) {
            brackets.append(")");
        }
        return brackets.toString();
    }

    public static String secondStep(int n) {
        StringBuilder brackets = new StringBuilder();
        int pair = ((n * 2) - 2) / 2;
        brackets.append("(");
        for (int i = 0; i < pair; i++) {
            brackets.append("(").append(")");
        }
        brackets.append(")");

        return brackets.toString();
    }

    public static String thirdStep(int n) {
        StringBuilder brackets = new StringBuilder();
        int pair = ((n * 2) - 2) / 2;
        brackets.append("(");
        for (int i = 0; i < pair - 1; i++) {
            brackets.append("(").append(")");
        }
        brackets.append(")").append("(").append(")");

        return brackets.toString();
    }

    public static String forthStep(int n) {
        StringBuilder brackets = new StringBuilder();
        int pair = ((n * 2) - 2) / 2;
        brackets.append("(").append(")").append("(");
        for (int i = 0; i < pair - 1; i++) {
            brackets.append("(").append(")");
        }
        brackets.append(")");

        return brackets.toString();
    }

    public static String lastStep(int n) {
        StringBuilder brackets = new StringBuilder();
        for (int i = 0; i < n; i++) {
            brackets.append("(").append(")");
        }
        return brackets.toString();
    }

    public enum ProcessName {
        CREATED("created"),
        RUNNING("running"),
        WAITING("waiting"),
        TERMINATED("terminated");

        private final String name;

        ProcessName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

    public String solution(int t, String[] logs) {
        String[] logValue;

        String ans = "-1";
        for (String log : logs) {
            logValue = log.split(" ");
            int time = Integer.parseInt(logValue[0]);
            if (time <= t && logValue[2].equals(ProcessName.RUNNING.getName())) {
                ans = logValue[1];
            }
        }
        return ans;
    }

    public class HashMap<K, V> {

        //Initial capacity of hash table
        static final int initial_capacity = 4;
        //Factor loaded
        float load_factor = 0.75f;
        //Record the number of entries
        int count = 0;

        Entry<K, V>[] table;


        public K put(K key, V value) {
            Entry<K, V> newEntry = new Entry(key, value);
            int hash = hash(key);
            if (table == null) {
                table = new Entry[initial_capacity];
                count++;
            }
            Entry<K, V> head = table[hash];
            //Perform capacity expansion,
            if (count > initial_capacity * load_factor) {
                resize();
            }
            if (head == null) {
                table[hash] = newEntry;
                count++;
                return key;
            } else {
                Entry tail = new Entry<K, V>();
                if (head.next == null) {
                    head.next = newEntry;
                } else {
                    do {
                        tail = head;
                    } while ((head = head.next) != null);
                    tail.next = newEntry;
                }
                count++;
                return key;
            }
        }

        public V get(K key) {
            Entry<K, V> entry;
            return (entry = getEntry(hash(key), key)) == null ? null : entry.value;
        }

        public V remove(K key) {
            Entry<K, V> entry;
            int hash = hash(key);
            Entry<K, V> head = table[hash];
            return (entry = getEntry(hash(key), key)) == null ? null : entry.value;
        }

        public V evict(K key) {
            Entry<K, V> entry;
            return (entry = getEntry(hash(key), key)) == null ? null : entry.value;
        }

        public Entry<K, V> getEntry(int hash, K key) {
            Entry<K, V> entry = table[hash];
            if (entry == null) {
                return null;
            } else if (entry != null && entry.next == null) {
                return entry;
            } else if (entry.next != null) {
                do {
                    if (hash == hash(entry.key) &&
                            (key == entry.key || (key != null && key.equals(entry.key)))) {
                        return entry;
                    }
                } while ((entry = entry.next) != null);
                return entry;
            }
            return null;
        }

        public int resize() {
            int newCapacity = initial_capacity << 2;
            Entry[] newTable = new Entry[newCapacity];
            System.arraycopy(table, 0, newTable, 0, table.length);
            this.table = newTable;
            return newCapacity;
        }

        public final int hash(K key) {
            //The key.hashCode may generate a negative value. Perform the key.hashCode() & 0x7fffff operation once,
            //Change to integer, and generate hash value direct module 4 here to ensure that the generated hash value will not change due to capacity expansion
            return (key == null) ? 0 : (key.hashCode() & 0x7FFFFFFF % initial_capacity);
        }
    }

    public class MyEntry<K, V> {
        private final K key;
        private V value;

        public MyEntry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public K getKey() {
            return key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public class MyMap<K, V> {
        private int size;
        private int DEFAULT_CAPACITY = 16;
        @SuppressWarnings("unchecked")
        private MyEntry<K, V>[] values = new MyEntry[DEFAULT_CAPACITY];


        public V get(K key) {
            for (int i = 0; i < size; i++) {
                if (values[i] != null) {
                    if (values[i].getKey().equals(key)) {
                        return values[i].getValue();
                    }
                }
            }
            return null;
        }

        public void put(K key, V value) {
            boolean insert = true;
            for (int i = 0; i < size; i++) {
                if (values[i].getKey().equals(key)) {
                    values[i].setValue(value);
                    insert = false;
                }
            }
            if (insert) {
                ensureCapa();
                values[size++] = new MyEntry<K, V>(key, value);
            }
        }

        private void ensureCapa() {
            if (size == values.length) {
                int newSize = values.length * 2;
                values = Arrays.copyOf(values, newSize);
            }
        }

        public int size() {
            return size;
        }

        public void remove(K key) {
            for (int i = 0; i < size; i++) {
                if (values[i].getKey().equals(key)) {
                    values[i] = null;
                    size--;
                    condenseArray(i);
                }
            }
        }

        private void condenseArray(int start) {
            if (size - start >= 0) System.arraycopy(values, start + 1, values, start, size - start);
        }

        public Set<K> keySet() {
            Set<K> set = new HashSet<K>();
            for (int i = 0; i < size; i++) {
                set.add(values[i].getKey());
            }
            return set;
        }
    }

    public class Entry<K, V> {

        int hash;
        K key;
        V value;
        Entry<K, V> next;

        public Entry() {
        }

        public Entry(K key, V value) {
            this.key = key;
            this.value = value;
        }

        public Entry(int hash, K key, V value, Entry<K, V> next) {
            this.hash = hash;
            this.key = key;
            this.value = value;
            this.next = next;
        }

        public K getKey() {
            return key;
        }

        public void setKey(K key) {
            this.key = key;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o instanceof Entry) {
                Entry<K, V> e = (Entry<K, V>) o;
                return Objects.equals(e.key, key) &&
                        Objects.equals(e.value, value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return Objects.hash(key) ^ Objects.hash(value);
        }

        @Override
        public String toString() {
            return key + "=" + value;
        }
    }

    public static String[] solution1(int n, String[] logs) {
        String[] logValue;
        String[] urlValue;
        String[] urls = new String[logs.length];
        Map<String, Long> urlMap = new LinkedHashMap<>();
        int index = 0;
        for (String log : logs) {
            logValue = log.split(" ");
            int statusCode = Integer.parseInt(logValue[1]);
            long count = 0L;
            if (statusCode == 200) {
                urls[index++] = logValue[2];
                urlValue = logValue[2].split("/");
                if (urlMap.containsKey(urlValue[3]))
                    urlMap.put(urlValue[3], urlMap.get(urlValue[3]) + 1);
                else
                    urlMap.put(urlValue[3], count += 1);
            }
        }
        Set<String> urlSet = new LinkedHashSet<>();
        for (String url : urls) {
            if (url != null) {
                urlValue = url.split("/");
                long totalCount = urlMap.get(urlValue[3]);
                if (totalCount <= n) urlSet.add(url);
            }
        }
        // allocate memory for string array
        String[] array = new String[urlSet.size()];

        // copy elements from set to string array
        int i = 0;
        for (String s : urlSet) {
            array[i++] = s;
        }
        return sortUrls(array);
    }

    public static String[] sortWordAlphabetically(String[] words) {
        String temp;
        int len = words.length;
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {

                // to compare one string with other strings
                if (words[i].compareTo(words[j]) > 0) {
                    // swapping
                    temp = words[i];
                    words[i] = words[j];
                    words[j] = temp;
                }
            }
        }
        return words;
    }

    public static String[] sortUrls(String[] urls) {
        String[] sortedUrl = new String[urls.length];
        String[] words = new String[urls.length];
        String[] urlValue;
        int index = 0;
        int wordIndex = 0;

        for (String url : urls) {
            urlValue = url.split("/");
            words[wordIndex++] = urlValue[3];
        }
        Arrays.sort(words);

        for (String word : words) {
            for (String url : urls) {
                urlValue = url.split("/");
                if (word.equals(urlValue[3])) {
                    sortedUrl[index++] = url;
                }
            }
        }
        return sortedUrl;
    }

    public String[] solution(String[] n) {
        String[] nValue;
        String[] ans = new String[n.length];
        int index = 0;

        HashMap<String, String> map = new HashMap<>();
        label:
        for (String s : n) {
            nValue = s.split(" ");
            switch (nValue[0]) {
                case "add":
                    map.put(nValue[1], nValue[2]);
                    break;
                case "get":
                    ans[index++] = map.get(nValue[1]);
                    break;
                case "remove":
                    map.remove(nValue[1]);
                    break;
                case "evict":
                    map.evict(nValue[1]);
                    break;
                default:
                    break label;
            }
        }
        return ans;
    }

    static String drawImage(boolean imageType, int num) {
        StringBuilder image = new StringBuilder();
        for (int i = 0; i < num; i++) {
            if (imageType) {
                image.append("#");
            } else {
                image.append(".");
            }
        }
        return image.toString();
    }

    public static int any(int a, int b) {
        return new Random().nextBoolean() ? 0 : 1;
    }

}

