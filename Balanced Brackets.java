 static boolean isMatching(char peek,char at){
          if(peek=='{'&& at=='}'){ return true;}
          if (peek == '[' && at == ']') {
            return true;
        }
        if (peek == '(' && at == ')') {
            return true;
        }else{
            return false;
        }



    }

    // Complete the isBalanced function below.
    static String isBalanced(String s) {
        Stack<Character> st=new Stack<Character>();
         for(int i=0;i<s.length();i++){
           if(s.charAt(i)=='{' || s.charAt(i) == '[' || s.charAt(i) == '('){

                    st.push(s.charAt(i));

           }else if(s.charAt(i)=='}' || s.charAt(i) == ']' || s.charAt(i) == ')')
           {

               if(st.empty() || (!isMatching(st.peek(),s.charAt(i)))){

                  return "NO";

               }else{
                   st.pop();
               }

           }

         }if(st.empty()){return "YES";}
         else{ return "NO";}

    }