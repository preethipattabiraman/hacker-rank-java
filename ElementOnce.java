class Sol
{
    public static int search(int A[], int N)
    {
        // your code here
        HashMap<Integer, Integer> counter = new HashMap<Integer, Integer>();
        for(int i = 0; i < N; i++) {
            if(!counter.containsKey(A[i])) {
                counter.put(A[i], 0);
            }
            counter.put(A[i],counter.get(A[i]) + 1);
        }
        
        for(Map.Entry<Integer, Integer> me : counter.entrySet())
        {
            if(me.getValue()==1)
            {
                return me.getKey();
            }
        }
        return -1;
    }
}
