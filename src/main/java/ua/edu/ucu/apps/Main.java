package ua.edu.ucu.apps;

public class Main {
    public static void main(String[] args) {
        Document sd = new SmartDocument("gs://cv-examples/wiki.png");
        System.out.println(sd.parse());
    }
}