package project1;

public class SortThread implements Runnable {
	  int[] x; 
	  
	  public SortThread(int[] x){
	    this.x = x;
	  }
	    public void run(){
	      sort(x);
	  }
	    
	  private void sort(int[] x){
	    for(int i = 0; i < x.length ; i++){
	      int indexOfSmallest = findIndexOfSmallest(x, i);
	      int t = x[i];
	      x[i] = x[indexOfSmallest];
	      x[indexOfSmallest] = t;
	    }
	  }
	      
	  private int findIndexOfSmallest(int[] a, int from){
	    int indexOfSmallest = from;

	    for(int i = from; i < a.length; i++)
	      if(a[i] < a[indexOfSmallest])
	        indexOfSmallest = i;
	    return indexOfSmallest;
	  }
	  
	  
	  public int[] get(){
	    return x;
	  }
	}

