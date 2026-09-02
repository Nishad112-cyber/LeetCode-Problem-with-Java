import java.util.Arrays;

class Hindex {
    public int hIndex(int[] citations) {

        Arrays.sort(citations);

        int n = citations.length;
        int hIndex = 0;

        for (int i = 0; i < n; i++) {

            int papers = n - i;

            if (citations[i] >= papers) {
                hIndex = papers;
            }
        }

        return hIndex;
    }
}