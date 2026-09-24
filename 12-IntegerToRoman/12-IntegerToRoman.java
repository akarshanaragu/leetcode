// Last updated: 24/9/2026, 3:16:42 pm
class Solution {
    public String intToRoman(int temp) {

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "I");
        map.put(2, "II");
        map.put(3, "III");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(6, "VI");
        map.put(7, "VII");
        map.put(8, "VIII");
        map.put(9, "IX");
        map.put(10, "X");

        StringBuilder sb = new StringBuilder();

        while (temp > 0) {

            if (temp <= 10) {
                sb.append(map.get(temp));
                break;
            } 
            
            else if (temp >= 1000) {
                sb.append("M");
                temp -= 1000;
            }
            
            else if (temp >= 900) {
                sb.append("CM");
                temp -= 900;
            } 
            
            else if (temp >= 500) {
                sb.append("D");
                temp -= 500;
            }
            
            else if (temp >= 400) {
                sb.append("CD");
                temp -= 400;
            } 
            
            else if (temp >= 100) {
                sb.append("C");
                temp -= 100;
            }
            
            else if (temp >= 90) {
                sb.append("XC");
                temp -= 90;
            }
            
            else if (temp >= 50) {
                sb.append("L");
                temp -= 50;
            } 
            
            else if (temp >= 40) {
                sb.append("XL");
                temp -= 40;
            } 
            
            else if (temp >= 10) {
                sb.append("X");
                temp -= 10;
            }
            
        }

        return sb.toString();
    }
}