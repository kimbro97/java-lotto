package lotto.domain;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Lotto {
    private static final int LOTTO_SIZE = 6;
    private List<LottoNumber> lotto;
    public Lotto(List<LottoNumber> lottoNumbers) {
        validateSize(lottoNumbers);
        validateDuplicate(lottoNumbers);
        this.lotto = new ArrayList<>(lottoNumbers);
    }
    public int match(Lotto winningLotto) {
        int count = 0;
        for (LottoNumber lottoNumber : lotto) {
            count = getCount(winningLotto, count, lottoNumber);
        }
        return count;
    }

    private int getCount(Lotto winningLotto, int count, LottoNumber lottoNumber) {
        if (winningLotto.contains(lottoNumber)) {
            count++;
        }
        return count;
    }

    private boolean contains(LottoNumber lottoNumber) {
        return lotto.contains(lottoNumber);
    }

    private void validateSize(List<LottoNumber> lottoNumbers) {
        if (lottoNumbers.size() != LOTTO_SIZE) {
            throw new IllegalArgumentException("로또 사이즈는 6이어야한다.");
        }
    }
    private void validateDuplicate(List<LottoNumber> lottoNumbers) {
        Set<LottoNumber> nonDuplicateNumberList = new HashSet<>(lottoNumbers);
        if (nonDuplicateNumberList.size() < LOTTO_SIZE) {
            throw new IllegalArgumentException("중복된 숫자를 가징 수 없습니다.");
        }
    }

    @Override
    public String toString() {
        return lotto + "";
    }
}
