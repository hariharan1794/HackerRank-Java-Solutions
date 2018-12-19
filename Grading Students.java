 static int[] gradingStudents(int[] grades) {
        /*
         * Write your code here.
         */double a;
         for(int i=0;i<grades.length;i++){
             a=Math.ceil(grades[i]/5.0);
              if(((a*5)-grades[i])<3 && grades[i]>37 ){
                grades[i]=(int)a*5;
              }
             

         }
              return grades;
    }