package org.example;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

// Shift을(를) 두 번 눌러 전체 검색 대화상자를 열고 'show whitespaces'를 입력한 다음,
// Enter를 누르세요. 그러면 코드 내에서 공백 문자를 확인할 수 있습니다.
public class Main{
    public static void main(String[] args) {
        // 캐럿을 강조 표시된 텍스트에 놓고 Alt+Enter을(를) 누르면
        // IntelliJ IDEA의 수정 제안을 볼 수 있습니다.
        // Shift+F9을(를) 눌러 코드 디버그를 시작합니다.
        System.out.print("Hello and welcome! 테스트");
        String systemPath = "C:\\Users\\user\\AppData\\Roaming\\MDIO", downloadPath = "C:\\Users\\user\\Downloads";

        Path path = Paths.get(systemPath);
        // 디렉토리가 존재하지 않으면 생성
        if (!Files.exists(path)) {
            try {
                Files.createDirectories(path);
                System.out.println("디렉토리가 생성되었습니다: " + path);
            } catch (IOException e) {
                System.err.println("디렉토리 생성 중 오류가 발생했습니다: " + e.getMessage());
            }
        } else {
            System.out.println("디렉토리가 이미 존재합니다: " + path);
        }

        Path filePath = Paths.get(systemPath, "config.yml");
        // 파일이 존재하지 않으면 생성
        if (!Files.exists(filePath)) {
            try {
                Files.createFile(filePath);
                System.out.println("파일이 생성되었습니다: " + filePath);
            } catch (IOException e) {
                System.err.println("파일 생성 중 오류가 발생했습니다: " + e.getMessage());
            }
        }
        else {
            System.out.println("파일이 이미 존재합니다: " + filePath);
        }
        File downloadDirectory = new File(downloadPath); // 디렉토리 객체 생성

        // 디렉토리가 존재하는지 확인
        if (downloadDirectory.exists() && downloadDirectory.isDirectory()) {
            File[] fileList = downloadDirectory.listFiles(); // 디렉토리 내의 파일 리스트 가져오기
            // 파일 리스트 출력
            if (fileList != null) {
                System.out.println("다운로드 파일 디렉토리의 파일 리스트:");
                for (File file : fileList) {
                    System.out.println(file.getName());
                }
            } else {
                System.out.println("다운로드 파일 디렉토리에 파일이 존재하지 않습니다.");
            }
        } else {
            System.out.println("다운로드 파일 디렉토리가 존재하지 않거나 디렉토리가 아닙니다.");
        }

        new RoundedRectanglesGUI();
    }
}