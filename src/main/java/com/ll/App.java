package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    void run(){
        int count = 0;

        System.out.println("== 명언 앱 ==");

        Scanner scanner = new Scanner(System.in);

        List<String> wise_sayings = new ArrayList<>();
        List<String> authors = new ArrayList<>();

        while(true){
            System.out.print("명령 : ");
            String cmd = scanner.nextLine();


            if(cmd.equals("종료")){
                break;
            }else if(cmd.equals("등록")) {

                System.out.print("명언 : ");
                String wise_saying = scanner.nextLine();


                System.out.print("작가 : ");
                String author = scanner.nextLine();
                System.out.println("");

                wise_sayings.add(wise_saying);
                authors.add(author);

                count++;

                System.out.println(count + "번 명언이 등록되었습니다.");
            } else if (cmd.equals("목록")) {
                System.out.println(" 번호 / 작가 / 명언");
                System.out.println("--------------------");

                for(int i = (wise_sayings.size() - 1); i>=0; i--){
                    System.out.println((i+1)+ "/" + authors.get(i) + "/" + wise_sayings.get(i));
                }

            }
        }
    }
}
