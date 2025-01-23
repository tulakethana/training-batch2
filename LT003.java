public class LT003 {

    public int myAtoi(String s) {
        s = s.trim();
        if (s.isEmpty()) return 0;

        int sign = 1, i = 0, result = 0;

        if (s.charAt(i) == '-') {
            sign = -1;
            i++;
        } else if (s.charAt(i) == '+') {
            i++;
        }

        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            int digit = s.charAt(i) - '0';
            if (result > Integer.MAX_VALUE / 10 || (result == Integer.MAX_VALUE / 10 && digit > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            result = result * 10 + digit;
            i++;
        }

        return sign * result;
    }

    public static void main(String[] args) {
        LT003 solution = new LT003();
        System.out.println(solution.myAtoi("42"));            // Output: 42
        System.out.println(solution.myAtoi("   -042"));       // Output: -42
        System.out.println(solution.myAtoi("1337c0d3"));      // Output: 1337
        System.out.println(solution.myAtoi("0-1"));           // Output: 0
        System.out.println(solution.myAtoi("words and 987")); // Output: 0
        System.out.println(solution.myAtoi("21474836460"));   // Output: 2147483647
    }
}
