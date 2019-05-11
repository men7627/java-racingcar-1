package view;

import model.LapRepository;
import model.Winners;

public class OutputView {
    private static final String WINNER_MESSAGE = "%s 가 최종 우승했습니다.";

    public static void printWinners(Winners winners) {
        System.out.println(String.format(WINNER_MESSAGE, winners.toString()));
    }

    public static void printGameResult(LapRepository lapRepository) {
        System.out.println("실행 결과");
        System.out.print(lapRepository.toString());
    }
}
