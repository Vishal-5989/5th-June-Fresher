package com.demo;
public class DuplicateString {

    public void getdupString(){

        String str= "WellcomeToNeutrino";
       int length =str.length();
       char[] ch =str.toCharArray();
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(ch[i]==ch[j]){
                    System.out.println("Duplicate Number Is-> "+ch[j] );
                }
            }
        }
    }
    public static void main(String[] args) {
        DuplicateString dup = new DuplicateString();
        dup.getdupString();
    }
}

