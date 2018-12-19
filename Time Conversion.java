 static String timeConversion(String s) {
      
         int hour = Integer.parseInt(s.substring(0, 2));
        if (s.charAt(s.length() - 2) == 'P') {
            if (hour != 12) {

                hour += 12;
                String h= Integer.toString(hour);
                return h + s.substring(2, s.length() - 2);

            }else{
                String h = Integer.toString(hour);
                return h + s.substring(2, s.length() - 2);
            }
        } else if (s.charAt(s.length() - 2) == 'A') {
            if (hour != 12) {
                return s.substring(0, s.length() - 2);
            } else {

                return "00" + s.substring(2, s.length() - 2);
            }

        }
      return null;
    }

    