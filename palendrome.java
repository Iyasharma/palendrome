class palendrome {
    public static void main(String[] args) {
       System.out.println(isPalendrome("")); 
    }
    public static boolean isPalendrome(String s){
        int a=s.length()-1;
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i)!=s.charAt(a)){
                return false;
            }
            a--;
        }
        return true;
}
    
}
