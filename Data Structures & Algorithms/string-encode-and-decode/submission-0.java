class Solution {

    public String encode(List<String> strs) {
        StringBuilder encodedString = new StringBuilder();
        for(String s : strs){
            encodedString.append(s.length()).append('#').append(s);
        }
        return encodedString.toString();
    }

    public List<String> decode(String s) {
        List<String> decodedString = new ArrayList<>();
        int i = 0;
        while(i < s.length()){
            int j = i;
            while(s.charAt(j) != '#'){
                j++;
            }
            int length = Integer.parseInt(s.substring(i, j));
            i = j + 1;
            String extractedString = s.substring(i, i + length);
            decodedString.add(extractedString);

            i = i + length;
        }
        return decodedString;

    }
}
