public class Propercase {
    public static void main(String[] args) {
        
        System.out.println(propercase("aManKumar heLLO Jiii hIII"));
    }
    public static String propercase(String s){
        
        String p=s.toLowerCase().trim();
        p.trim();
        String t="";
        t=t+(char)(p.charAt(0)-32);
        for(int i=1;i<p.length();i++){
            if(p.charAt(i)==' ' && (i+1!=p.length())){
                t=t+" "+(char)(p.charAt(i+1)-32);
                i++;
            }else{
                t=t+p.charAt(i);
            }
        }
        return t;
    }
}
