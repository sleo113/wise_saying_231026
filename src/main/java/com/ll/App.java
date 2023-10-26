package com.ll;

import java.util.Scanner;

public class App {
    void run(){
        int count = 0;

        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);


        while(true){
            System.out.print("명령 : ");
            String cmd = scanner.nextLine();


            if(cmd.equals("종료")){
                break;
            }else if(cmd.equals("등록")) {

                System.out.println("명언 : ");
                String wise_saying = scanner.nextLine();


                System.out.print("작가 : ");
                String author = scanner.nextLine();
                System.out.println("");

                count++;

                System.out.println(count + "번 명언이 등록되었습니다.");
            }
        }
    }
}
