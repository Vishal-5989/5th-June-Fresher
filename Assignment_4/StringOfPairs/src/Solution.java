public class Solution {
    public static void main(String[] args) {
        String arr1[]={"ab","AB","cd","BE"};
        String arr2[]={"AB","ab","CD","EF"};
        for (int i=0;i<arr1.length;i++){
            int count=1;
            for (int j=0;j< arr2.length;j++){
                if (arr1[i]==arr2[j]){
                    count++;
                }
            }
            if(count>1){
                System.out.println(arr1[i]+" :" +count);
            }
        }

    }
}
