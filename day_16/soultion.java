class Solution {

    

    public void segregateElements(int arr[], int n)

    {

       int [] a = new int[n];

       int j=0;

       for ( int i=0; i<n; i++){

           if ( arr[i]>= 0)

           a[j++] =arr[i];

       }

       for ( int i=0; i<n; i++) {

           if( arr[i]<0)

           a[j++]=arr[i];

           

       }

       for ( int i=0; i<n; i++){

           arr[i]= a[i];

       }

}

}
