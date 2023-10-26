package com.ll;

import java.util.Scanner;

public class App {
    void run(){
        int count = 0;

        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);

        while(true){
            System.out.printf("명령 : ");

            String cmd = scanner.nextLine();
            System.out.printf("입력하신 명령 : %s", cmd);

            if(cmd.equals("종료")){
                break;
            }
        }
    }
}
