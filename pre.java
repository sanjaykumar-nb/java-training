class  pre{
    public static void main(String[] args) {
        String[] words = {"flower","flow","floght"};
        String one=words[0];
        for(int i=1;i<words.length;i++)
        {
            while(words[i].indexOf(one)!=0){
                one=one.substring(0,one.length()-1);
                if(one.isEmpty()){
                    i=words.length;
                    break;
                }

            }
        }
        System.out.println(one);

    }
}