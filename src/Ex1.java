    public class Ex1 {
        public static class RemoveVowels {
            // Hàm kiểm tra nguyên âm
            public static boolean isVowel(char c) {

                return c == 'a' || c == 'e' || c == 'i'
                        || c == 'o' || c == 'u'
                        || c == 'A' || c == 'E'
                        || c == 'I' || c == 'O'
                        || c == 'U';
            }
            // Hàm xóa nguyên âm
            public static String removeVowels(String input) {
                if (input == null) {
                    return null;
                }

                StringBuilder result = new StringBuilder();

                // Duyệt từng ký tự
                for (int i = 0; i < input.length(); i++) {
                    char currentChar = input.charAt(i);

                    // Nếu KHÔNG phải nguyên âm
                    if (!isVowel(currentChar)) {
                        result.append(currentChar);
                    }
                }

                return result.toString();
            }
        }
            public static void main1(String[] args) {
                RemoveVowels rm = new RemoveVowels();
                System.out.println(rm.removeVowels("Cybersoft"));
                System.out.println(rm.removeVowels("hello"));
            }

    }
