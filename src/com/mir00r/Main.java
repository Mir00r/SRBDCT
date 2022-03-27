package com.mir00r;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {

//        TheInquiringManager.takeInputAndSolve();
//        WhichWarehousesCanFulfillTheseOrders.takeInputAndSolve();
//        FindSignNumber.inputAndSolve();

//        TrappingRainWater.inputAndSolve();
//        LinkListUtil.prepareDate();

//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

//        Scanner input = new Scanner(System.in);
//        String[] nk = input.nextLine().split(" ");
//        int k, m, n, t;
//
//        k = Integer.parseInt(nk[0]);
//        m = Integer.parseInt(nk[1]);
//        n = Integer.parseInt(nk[2]);

//        String[] arrInp = input.nextLine().split("\n");
//        input.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
//        int[] arr = new int[n];
//        for (int i = 0; i < n; i++) {
//            arr[i] = input.nextInt();
//        }

//        System.out.print(Arrays.toString(MatchTheShows.solve(arr, k)));

//        bufferedWriter.write(Arrays.toString(arr));
//        bufferedWriter.newLine();
//        bufferedWriter.close();
//        input.close();

//        String val = "my.song.mp3 11b greatSong.flac 1000b not3.txt 5b video.mp4 200b game.exe 100b mov!e.mkv 10000b";
        String val = "my.song.mp3 11b\ngreatSong.flac 1000b\nnot3.txt 5b\nvideo.mp4 200b\ngame.exe 100b\nmov!e.mkv 10000b";

        String[] vPart = val.split("\n");

        String music = "music";
        String images = "images";
        String movies = "movies";
        String other = "other";

        int musicFileSize = 0;
        int imagesFileSize = 0;
        int moviesFileSize = 0;
        int otherFileSize = 0;

        for (String s : vPart) {
            String[] diskInfo = s.split(" ");
            String[] fileNames = diskInfo[0].split("\\.");
            String fileExtension = fileNames[fileNames.length - 1];

            String fileSize = diskInfo[1].replace("b", "");
            switch (fileExtension) {
                case "mp3":
                case "aac":
                case "flac":
                    musicFileSize += Integer.parseInt(fileSize);
                    continue;
                case "jpg":
                case "bmp":
                case "gif":
                    imagesFileSize += Integer.parseInt(fileSize);
                    continue;
                case "mp4":
                case "avi":
                case "mkv":
                    moviesFileSize += Integer.parseInt(fileSize);
                    continue;
                default:
                    otherFileSize += Integer.parseInt(fileSize);
            }
        }

        StringBuilder ans = new StringBuilder();
        ans.append(music).append(" ")
                .append(musicFileSize).append("b").append("\n")
                .append(images).append(" ")
                .append(imagesFileSize).append("b").append("\n")
                .append(movies).append(" ")
                .append(moviesFileSize).append("b").append("\n")
                .append(other).append(" ")
                .append(otherFileSize).append("b");

        System.out.println(ans.toString());
    }

    public int firstfunction(int N) {

        // edge case
        if (N == 0) {
            return 5 * 10;
        }
        String stringValue = String.valueOf(N);
        int maximumValue = Integer.MIN_VALUE;

        for (int i = (N < 0) ? 1 : 0; i <= stringValue.length(); ++i) {
            String singleValue = String.valueOf(stringValue.charAt(i));
            int testValue = Integer.parseInt(singleValue + "5");
            if (maximumValue < testValue)
                maximumValue = testValue;
        }
        return maximumValue;
    }

    public int solution(int N) {
        int ans = 0;
        int digit = 5;

        while (N / digit > 0) {
            int temp = (N / (digit * 10)) * digit + (N % digit);
            digit *= 10;

            if (temp > ans)
                ans = temp;
        }
        N = ans;

        return N;
    }

    public static void maximizeNumber(int N, int K) {
        // Convert it into N to string
        String s = Integer.toString(N);
        int L = s.length();

        // Stores the maximum value of N
        // after inserting K
        String result = "";
        int i = 0;

        // Iterate till all digits that
        // are not less than K
        while ((i < L) && (K <= ((int) s.charAt(i) - (int) '0'))) {

            // Add the current digit to
            // the string result
            result += (s.charAt(i));
            ++i;
        }

        // Add digit 'K' to result
        result += ((char) (K + (int) '0'));

        // Iterate through all remaining
        // characters
        while (i < L) {

            // Add current digit to result
            result += (s.charAt(i));
            ++i;
        }

        // Print the maximum number formed
        System.out.println(result);
    }

    static int MaximumPossible(int num, int digit) {
        // edge case
        if (num == 0) {
            return digit * 10;
        }

        // -1 if num is negative number else 1
        int negative = num / Math.abs(num);
        // get the absolute value of given number
        num = Math.abs(num);
        int n = num;
        // maximum number obtained after inserting digit.
        int maxVal = Integer.MIN_VALUE;
        int counter = 0;
        int position = 1;

        // count the number of digits in the given number.
        while (n > 0) {
            counter++;
            n = n / 10;
        }

        // loop to place digit at every possible position in the number,
        // and check the obtained value.
        for (int i = 0; i <= counter; i++) {
            int newVal = ((num / position) * (position * 10)) + (digit * position) + (num % position);

            // if new value is greater the maxVal
            if (newVal * negative > maxVal) {
                maxVal = newVal * negative;
            }
            position = position * 10;
        }

        return maxVal;
    }

}
