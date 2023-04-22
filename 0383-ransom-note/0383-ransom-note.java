class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        
        for(int i=0;i<ransomNote.length();i++){
            char r = ransomNote.charAt(i);
            int index = magazine.indexOf(r); //r이 들어있지 않으면 -1 반환
            if(index==-1){
                return false;
            }
            //일치한 char을 제외하는 과정
            magazine=magazine.substring(0,index)+magazine.substring(index+1);
        }
        return true;
        
    }
}