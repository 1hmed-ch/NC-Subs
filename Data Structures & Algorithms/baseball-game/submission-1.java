class Solution {
    public int calPoints(String[] operations) {
        Deque<Integer> record = new ArrayDeque<>();
        int firstPrevious = 0;
        int totalSum = 0;
        for(String ops : operations){
            if(!ops.equals("+") && !ops.equals("C") && !ops.equals("D")){
                int decodedNumber = Integer.valueOf(ops);
                record.offerFirst(decodedNumber);
            } else if(ops.equals("+") && !record.isEmpty()){
                firstPrevious = record.pollFirst();
                int sum = 0;
                if(record.peekFirst() != null)
                    sum = firstPrevious + record.peekFirst();
                else 
                    sum = firstPrevious;
                record.offerFirst(firstPrevious);
                record.offerFirst(sum);
            } else if(ops.equals("D") && !record.isEmpty()){
                record.offerFirst(record.peekFirst() * 2);
            } else if(ops.equals("C") && !record.isEmpty()){
                record.pop();
            }
        }

        while(!record.isEmpty()){
            totalSum += record.pop();
        }

        return totalSum;
    }
}