 static int marsExploration(String s) {
        int count=0;
        for(int i=0;i<s.length();i+=3){

            if(s.charAt(i)!='S'){
                count++;
            }
            if(s.charAt(i+1)!='O'){
                count++;
            }
            if(s.charAt(i+2)!='S'){
                count++;
            }
        }
        return count;

    }