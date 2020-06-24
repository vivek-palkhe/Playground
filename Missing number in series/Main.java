#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int findDelta(long *x, int n);

int main(){
    int n;
        fscanf(stdin,"%d",&n); 
        long *x= (long*) calloc(n,sizeof(long));
    long k;
    for(int i=0;i<n;i++){
        scanf("%ld",&k);
        x[i]=k;
    }

    int delta=findDelta(x,n);
    for(int i=0;i<n-1;i++){
        if (x[i+1]-x[i] != delta)
            printf("%ld\n",x[i]+delta);
    }
    free(x);    
    return 0;
}

int findDelta(long *x, int n){
    long delta1,delta2;
    delta1=x[1]-x[0];
    int d1Count=0;
    int d2Count=0;

    for(int i=1;i<n-1;i++){
        delta2=x[i+1]-x[i];
        if(delta2==delta1)
          d1Count++;
        else
          d2Count++;
    }
    if (d1Count > d2Count)
        return (delta1);
    else
        return (delta2);
}