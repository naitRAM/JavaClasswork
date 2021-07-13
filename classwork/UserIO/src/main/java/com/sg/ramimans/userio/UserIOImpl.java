package com.sg.ramimans.userio;
import java.util.Scanner;

public class UserIOImpl implements UserIO {
    
    Scanner userInput = new Scanner(System.in);
    
    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        System.out.println(prompt);
        return userInput.nextLine();
    }

    @Override
    public int readInt(String prompt) {
        System.out.println(prompt);
        return userInput.nextInt();
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        System.out.println(prompt);
        int num = userInput.nextInt();
        while (num <= min || num >= max) {
            System.out.println(prompt);
            num = userInput.nextInt();
        }
        return num;
    }

    @Override
    public double readDouble(String prompt) {
        System.out.println(prompt);
        double num = userInput.nextDouble();
        return num;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        System.out.println(prompt);
        double num = userInput.nextDouble();
        while (num <= min || num >= max) {
            System.out.println(prompt);
            num = userInput.nextDouble();
        }
        return num;
    }

    @Override
    public float readFloat(String prompt) {
        System.out.println(prompt);
        float num = userInput.nextFloat();
        return num;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        System.out.println(prompt);
        float num = userInput.nextFloat();
        while (num <= min || num >= max) {
            System.out.println(prompt);
            num = userInput.nextFloat();
        }
        return num;
    }

    @Override
    public long readLong(String prompt) {
        System.out.println(prompt);
        long num = userInput.nextLong();
        return num;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        System.out.println(prompt);
        long num = userInput.nextLong();
        while (num <= min || num >= max) {
            System.out.println(prompt);
            num = userInput.nextLong();
        }
        return num;
    }
}
