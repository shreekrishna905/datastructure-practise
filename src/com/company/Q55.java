package com.company;

public class Q55 {

    public static void main(String[] args) {
        System.out.println(areAnagrams(new char[]{'s', 'i', 't'}, new char[]{'i', 't', 's'}));
        System.out.println(areAnagrams(new char[]{'p', 'o', 'o','l'}, new char[]{'p', 'o', 'l','l'}));
    }

    static int areAnagrams(char[] a1,char[] a2){
        if(elementExist(a1,a2) && elementExist(a2,a1))
            return 1;
        return 0;
    }

    static boolean elementExist(char[] a1,char[] a2){
        char[] matches = new char[a1.length];
        int index=0;
        for(int i=0;i<a1.length;i++){
            boolean elementExist = false;
            for(int j=0;j<a2.length;j++){
                if(matches[j]!=a2[j] && a1[i]==a2[j]){
                    matches[index] = a1[i];
                    index++;
                    elementExist = true;
                    break;
                }
            }
            if(!elementExist)
                return false;
        }
        return true;
    }
}
