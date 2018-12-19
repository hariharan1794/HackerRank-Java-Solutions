 static String gameOfThrones(String s) {
          
        int b[] = new int[26];
        
        int odd = 0;
        int even = 0;
        for (int i = 0; i < s.length(); i++) {
             b[s.charAt(i) - 'a']++;
        }
        for (int j = 0; j < b.length; j++) {

            if (b[j] % 2 == 1) {
                odd++;
            } else {
                even++;
            }
        }

        if (odd > 1) {
            return "NO";
        } else {
            return "YES";
        }

    }