//Longest Common Prefix in an Array 

int giveshort(string arr[],int n)
   {
       int m = arr[0].length();
       
       for(int i=1; i<n; i++)
       {
           if(arr[i].length() < m)
           m = arr[i].length();
       }
       
       return m;
   }
      
   public:
   
   string longestCommonPrefix (string arr[], int N)
   {
       
       string ans;
       int count;
       
       int k = giveshort(arr,N);
       
       for(int j = 0; j < k; j++)
       {
           
          count = 1;
          
          for(int i = 0; i < N-1; i++)
          {
             if(arr[i].at(j) == arr[i+1].at(j))
             count++;
          }
          
          
            if(count == N)
            ans.push_back(arr[0].at(j));
       }
       
       if(!ans.empty())
       return ans;
       else
       return "-1";
       
       
   }