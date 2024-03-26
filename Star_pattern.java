public class Star_pattern {
    public static void main(String[] args) {
        /*
        int row = 4;

        int i;
        int j;
        for (i = 0; i <= row; i++) {
            for (j = 0; j < row; j++) {
                if(i==2){
                    // System.out.println(" ");
                    continue;
                }

                if(i==2){
                    continue;
                }



                System.out.print("*");
            }
            System.out.println();

        } */
        String search_Me="peter pipe picked a " +"peck of pickled peppers";
        int max=search_Me.length();
        int numPs=0;
        int i;
        int count=0;
                for(i=0;i<max;i++){
                    if(search_Me.charAt(i)!='p'){
                        continue;
                    }
                    count++;

                }
        System.out.println(count);
    }
}


