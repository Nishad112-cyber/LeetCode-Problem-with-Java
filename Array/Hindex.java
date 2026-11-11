import java.util.Arrays;

class Hindex {
    public static int hIndex(int[] citations) {

        Arrays.sort(citations);

        int n = citations.length;
        int hIndex = 0;

        for (int i = 0; i < n; i++) {

            int papers = n - i;

            if (citations[i] >= papers) {
                hIndex = Math.max(hIndex, papers);
            }
        }

        return hIndex;
    }

    public static void main(String[] args) {

        int[] citations = {3, 0, 6, 1, 5};

        int result = hIndex(citations);

        System.out.println("H-Index: " + result);
    }
}