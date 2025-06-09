class Solution {
  
  public String average(int arr[])
 {
        // code here
       
	 if(arr.length == 0||arr == null){
   
    	 return "0.00";
       
 }
        
    
	    double sum=0;
      
  	for(int price: arr)
	{
   
         	sum+=price;
   
     	}
     
   	double avg=sum/arr.length;
     
   	return String.format("%.2f", avg);
 
   }

}