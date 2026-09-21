class Solution {
    public boolean isValidSudoku(char[][] board) {
        Map<Integer, Set<Character>> rowMap = new HashMap<>();
        Map<Integer, Set<Character>> columnMap = new HashMap<>();
        Map<String, Set<Character>> boxMap = new HashMap<>();

        for(int i = 0; i < board.length; i++){
            for(int j = 0; j < board[i].length; j++){
                if(board[i][j] == '.') continue;
                String boxKey = (i/3) + "," + (j/3);
                if(rowMap.computeIfAbsent(i, k -> new HashSet<>()).contains(board[i][j]) || columnMap.computeIfAbsent(j, k -> new HashSet<>()).contains(board[i][j]) || boxMap.computeIfAbsent(boxKey, k -> new HashSet<>()).contains(board[i][j])) return false;

                rowMap.get(i).add(board[i][j]);
                columnMap.get(j).add(board[i][j]);
                boxMap.get(boxKey).add(board[i][j]);
            }
        }

        return true;
    }
}
