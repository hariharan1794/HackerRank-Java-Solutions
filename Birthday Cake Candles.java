 static int birthdayCakeCandles(int[] ar) {
        int count=0;
        int min=Integer.MIN_VALUE;
        for(int i=0;i<ar.length;i++){
            if(ar[i]>min){
                min=ar[i];
            }else if(ar[i]==min){
                count++;

            }
        }return count+1;


    }