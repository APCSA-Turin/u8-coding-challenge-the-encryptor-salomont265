package com.example.project;
import java.util.ArrayList;
import java.util.Arrays;

public class Encryptor {
    
    public static int determineColumns(int messageLen, int rows){
        int num =1;
        if((messageLen% rows == 0)&&(messageLen!=0)){
            num = messageLen/rows;
        }else{
            num = messageLen/rows + 1;
        }
        return num;
    }
    
    public static String[][] generateEncryptArray(String message, int rows) {
        int num = determineColumns(message.length(), rows);
        String[][] arr = new String[rows][num];
        int count =0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(count >= message.length()){
                    arr[i][j] = "=";
                }else{
                    arr[i][j] = message.substring(count, count+1);
                }
                count++;
            }
        }
        return arr;
    }

    public static String encryptMessage(String message, int rows){
        String encrypt = "";
        String arr[][] = generateEncryptArray(message, rows);
        for(int i= arr[0].length -1;i>=0;i--){
            for(int j=0;j<arr.length;j++){
                encrypt += arr[j][i];
            }
        }
        return encrypt;
    }

    public static String decryptMessage(String encryptedMessage, int rows) {
        // turn into array
        int count =0;
        String[][] correct = new String[rows][determineColumns(encryptedMessage.length(), rows)];
        System.out.println(correct[0].length);
        System.out.println(encryptedMessage.length());
        for(int i = correct[0].length-1; i>=0;i--){
            System.out.println(i);
            for(int j=0;j<correct.length;j++){
                if(count < encryptedMessage.length()){
                correct[j][i] = encryptedMessage.substring(count, count+1);
                count++;
                }

            }
        }

        //read it
        String last = "";
        int count2 =0;
        for(int i=0;i<correct.length;i++){
            for(int j=0;j<correct[0].length;j++){
               
                System.out.println(correct[i][j]);
                boolean isNull = (correct[i][j] == null);
                System.out.println(isNull);
                if((!isNull && (!correct[i][j].equals("=")))){
                last += correct[i][j];
                }
            
            }
        }
        return last;
    }
}