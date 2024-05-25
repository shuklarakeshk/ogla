package org.sonuka.chapter1;

public class StringReplace {
    public static void main(String[] args) throws Exception{
        var input="https://shukla.com?rakesh = shukla& shukla = rakesh          ".toCharArray();
        var realLength=51;
        for(int index = realLength-1,newIndex=input.length-1; index >= 0;)
        {
            if( input[index] != ' ')
            {
                  input[newIndex--]=input[index--];

            }
            else
            {
                input[newIndex--]='0';
                input[newIndex--]='2';
                input[newIndex--]='%';
                --index;
            }
        }
        System.out.println(input);
    }
}
