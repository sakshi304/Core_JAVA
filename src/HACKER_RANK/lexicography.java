package HACKER_RANK;

import java.util.ArrayList;

// welcome
// below code adds strings of a certain length k to arraylist arr by 1st comparing and then placing them in order
class lexi{
    public static void lexi_comp(ArrayList<String> arr,String str){
        int k=4;
        String str1,str2;

        for(int i=1;i<str.length();i++){
            int last =i+k;
            System.out.println(arr);
            if(last>str.length()){
                break;
            }

            str1=str.substring(i,last);
            System.out.println(str1);
            for(int j=0;j<arr.size();j++){
                str2=arr.get(j);

                if(str1.compareTo(str2)<0){
                    arr.add(j,str1);
                    break;
                }
                if(str1.compareTo(str2)>0){
                    if(j==arr.size()-1){
                        System.out.println("str1>str2");

                        arr.add(str1);
                        break;
                    }
                    if(str1.compareTo(arr.get(j+1))<0){
                                arr.add(j+1,str1);
                                break;
                    }
                }
            }
            System.out.println(arr);
        }

    }

}
public class lexicography {
    public static void main(String[] args) {
            ArrayList<String> arr = new ArrayList<>();
            String str= "welcome";
            arr.add("wel");
        System.out.println(arr.size());
            lexi.lexi_comp(arr,str);
            int k=2;
    }
}
