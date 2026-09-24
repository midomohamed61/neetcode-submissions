class Solution {

    public String encode(List<String> strs) {
        StringBuilder sb = new StringBuilder();
        for(String s : strs){
        sb.append(s.length());
        sb.append("#");
        sb.append(s);

        }
        return sb.toString(); 

    }

    public List<String> decode(String str) {
        List<String> result = new ArrayList<>();

    int i = 0;

    while (i < str.length()) {

        int j = i;

        // 1. نمشي لحد #
        while (str.charAt(j) != '#') {
            j++;
        }

        // 2. نجيب الطول اللي قبل #
        String lengthString = str.substring(i, j);

        // 3. نحول الطول من String لـ int
        int length = Integer.parseInt(lengthString);

        // 4. نجيب الـ String نفسه بعد #
        String word = str.substring(j + 1, j + 1 + length);

        // 5. نضيفه للـ List
        result.add(word);

        // 6. نتحرك لبداية الـ String اللي بعده
        i = j + 1 + length;
    }

    return result;

}
}