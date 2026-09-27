class Solution {
    public String longestDiverseString(int a, int b, int c) {
        StringBuilder sb = new StringBuilder();
        String[][] arr = new String[][]{
            {"a", "" + a}, {"b", "" + b}, {"c", "" + c}
        };
        PriorityQueue<String[]> pq = new PriorityQueue<>((x, y) ->{
            int num1 = Integer.valueOf(x[1]);
            int num2 = Integer.valueOf(y[1]);
            return Integer.compare(num2, num1);
        });
        for(String[] sarr : arr){
            if(Integer.valueOf(sarr[1]) != 0)
                pq.add(sarr);
        }

        String[] hold = null;
        while(!pq.isEmpty()){
            String[] temp = pq.poll();
            int count = Integer.valueOf(temp[1]);
            if(sb.length() >= 2 &&
            sb.charAt(sb.length() - 1) == temp[0].charAt(0) &&
            sb.charAt(sb.length() - 2) == temp[0].charAt(0)
            ){
                if(pq.isEmpty()) break;
                hold = temp;
                temp = pq.poll();
                count = Integer.valueOf(temp[1]);
            }
            if(count >= 1){
                sb.append(temp[0]);
                count--;
            }
            if(count > 0){
                temp[1] = count + "";
                pq.add(temp);
            }
            if(hold != null){
                pq.add(hold);
                hold = null;
            }
        }

        return new String(sb);
    }
}