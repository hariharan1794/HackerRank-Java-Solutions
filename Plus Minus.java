 static void plusMinus(int[] arr) {
        double plus=0;double minus=0;double zeros=0;
        int n=arr.length;
        for(int i=0;i<n;i++){
          if(arr[i]>0){
              plus++;
          }else if(arr[i]<0){
              minus++;
          }else{zeros++;}
          
        }
        System.out.println((plus / n));
        System.out.println((minus / n));
        System.out.println((zeros / n));

    }
