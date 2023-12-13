package lotto;

import lotto.domain.*;
import lotto.view.InputView;
import lotto.view.ResultView;

import java.util.List;

public class LottoMain {
    public static void main(String[] args) {
        int number = InputView.priceView();
        int manualNumber = InputView.manualNumberView();

        Lotto manualLotto = InputView.manualLottoTicketView(number, manualNumber);
        LottoTicket manualLottoList = new LottoTicket(manualLotto);

        int autoNumber = number - manualNumber;
        LottoMachine lottoMachine = new LottoMachine();
        LottoTicket lottoTicket = lottoMachine.generateLottoTicket(manualLottoList.getLottoTicket(), autoNumber);
        ResultView.lottoTicketView(lottoTicket);
        Lotto lotto = InputView.winningLottoView();
        int bonusNo = InputView.bonusNumberView();

        WinningLotto winningLotto = new WinningLotto(lotto, bonusNo);
        LottoStatistics lottoStatistics = new LottoStatistics();
        lottoTicket.match(lottoMachine, winningLotto, lottoStatistics);
        ResultView.statisticsView(lottoStatistics, number);
    }
}
