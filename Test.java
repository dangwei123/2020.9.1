

给定两个长度相等的，由小写字母组成的字符串S1和S2，定义S1和S2的距离为两个字符串有多少个位置上的字母不相等。
现在牛牛可以选定两个字母X1和X2，将S1中的所有字母X1均替换成X2。（X1和X2可以相同）
牛牛希望知道执行一次替换之后，两个字符串的距离最少为多少。

链接：https://www.nowcoder.com/questionTerminal/82bd533cd9c34df29ba15bbf1591bedf
来源：牛客网


import java.util.*;


public class Solution {
    /**
     * 计算最少的距离
     * @param S1 string字符串 第一个字符串
     * @param S2 string字符串 第二个字符串
     * @return int整型
     */
    public int GetMinDistance (String S1, String S2) {
        int n=S1.length();
       int[][] arr=new int[26][26];
        int distance=0;
        for(int i=0;i<S1.length();i++) {
            arr[S1.charAt(i)-'a'][S2.charAt(i)-'a']++;
            if(S1.charAt(i)!=S2.charAt(i)) {
                distance++;
            }
        }
        int max=0;
        for(int j=0;j<26;j++) {
            for(int i=0;i<26;i++) {
                if(j!=i) {
                   max=Math.max(max,arr[j][i]-arr[j][j]); 
                }
            }
        }
        return distance-max;
    }
}