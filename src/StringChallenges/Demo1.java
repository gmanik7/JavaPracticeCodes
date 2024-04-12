package StringChallenges;
//Removing duplicates
public class Demo1 {
    public static void main(String[] args) {
        String str = "Programming";

        char[] ch = str.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<str.length();i++){
            boolean repeated = false;
            for (int j = i+1;j<ch.length;j++){
                if(ch[i] == ch[j]){
                    repeated = true;
                    break;
                }
            }
            if(!repeated){
                sb.append(ch[i]);
            }
        }
        System.out.println(sb);
        String s = "java";

        StringBuilder stringBuilder = new StringBuilder();
        s.chars().distinct().forEach(c -> stringBuilder.append((char)c));
        System.out.println(stringBuilder);
    }



}
