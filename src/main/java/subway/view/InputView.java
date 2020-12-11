package subway.view;

import java.util.Scanner;

public class InputView {
    public static String inputFunctionNumber(Scanner scanner) {
        System.out.println("## 원하는 기능을 선택하세요.");
        String input = scanner.nextLine();
        printEmptyLine();
        return input;
    }

    public static String inputStationToCreate(Scanner scanner) {
        System.out.println("## 등록할 역 이름을 입력하세요.");
        String input = scanner.nextLine();
        printEmptyLine();
        return input;
    }

    public static String inputStationToDelete(Scanner scanner) {
        System.out.println("## 삭제할 역 이름을 입력하세요.");
        String input = scanner.nextLine();
        printEmptyLine();
        return input;
    }

    public static String inputLineName(Scanner scanner) {
        System.out.println("## 등록할 노선 이름을 입력하세요.");
        String input = scanner.nextLine();
        printEmptyLine();
        return input;
    }

    public static String inputUpwardTerminalStationName(Scanner scanner) {
        System.out.println("## 등록할 노선의 상행 종점역 이름을 입력하세요.");
        String input = scanner.nextLine();
        printEmptyLine();
        return input;
    }

    public static String inputDownwardTerminalStationName(Scanner scanner) {
        System.out.println("## 등록할 노선의 하행 종점역 이름을 입력하세요.");
        String input = scanner.nextLine();
        printEmptyLine();
        return input;
    }

    public static String inputLineToDelete(Scanner scanner) {
        System.out.println("## 삭제할 노선 이름을 입력하세요.");
        String input = scanner.nextLine();
        printEmptyLine();
        return input;
    }

    private static void printEmptyLine() {
        System.out.println();
    }
}
