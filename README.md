# 로또
## 진행 방법
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)


## Step1 - 문자열 덧셈 계산기

### 기능요구사항
1. 쉼표(,)또는 콜론(:)을 구분자로 가지는 문자열을 전달하는 경우 구분자를 기준으로 분리한 각 숫자의 합을 반환(예:""=>0, "1,2"=>3, "1,2:3"=>6)
2. 앞의 기본 구분자(쉼표, 콜론)외에 커스텀 구분자를 지정할 수 있다. 커스텀 구분자는 문자열 앞부분 "//"와 "\n"사이에 위차하는 문자를 커스텀 구분자로 사용한다. 예를 들어 "//;\n1;2;3"과 같이 값을 입력할 경우 커스텀 구분자는 세미콜론(;)이며, 결과 값은 6이 반환되어야 한다.
3. 문자열 계산기에 숫자 이외의 값 또는 음수를 전달하는 경우 RuntimeException 예외를 throw 한다.

### 프로그램 요구사항
1. indent depth를 2단계에서 1단계로 줄여라.
    - depth으 경우 if문을 사용하는 경우 1단계의 depth가 증가한다. if문 안에 while문을 사용한다면 depth가 2단계가 된다.
2. 메소드의 크기가 최대 10라인을 넘지 않도록 구현한다.
    - method가 한 가지 일만 하도록 최대한 작게 만들어라.
3. else를 사용하지 마라.

## Step2 - 로또 자동

### 기능요구사항
1. 구입 금액을 입력 받는다.
2. 구입 금액에 따른 로또 갯수를 구한다.
3. 로또 갯수 만큼 자동으로 로또를 발행한다.(6자리 숫자)
4. 로또 담청 번호를 입력받는다.
5. 발행된 로또 중 3개이상 맞춘것의 결과를 보여준다.
6. 맞춘 갯수별 금액이 존재
7. 총 수익률을 계산한다. 구입한 금액이 1로 당첨금액을 계산

#### 로또
1. 6자리 숫자를 가진다.
2. 로또 당첨 여부를 가진다.
