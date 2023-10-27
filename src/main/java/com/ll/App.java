package com.ll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    void run(){
        int lastQuotationid = 0;

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
                String content = scanner.nextLine();


                System.out.print("작가 : ");
                String authorName = scanner.nextLine();
                System.out.println("");

                lastQuotationid++;
                int id = lastQuotationid;

                Quotatiom quotatiom = new Quotatiom(id, content, authorName);

                System.out.printf("%d번 명언이 등록되었습니다.\n", lastQuotationid);

            }
        }
    }
}