# 미션 - 자동차 경주

## 🚀 구현 기능 목록

### 자동차

**자동차 이름**

- [x] 자동차 이름은 1자 이상 5자 이하만 가능하다.
- [x] 자동차 이름은 쉼표(`,`)를 기준으로 구분한다.
- [x] 자동차 이름은 중복될 수 없다.
- [x] 최소 1대의 자동차가 존재해야 한다.

**자동차 상태**

- [x] 각 자동차는 전진 또는 멈출 수 있다.
- [x] 전진하는 경우, 위치를 1 증가시킨다.
- [x] 멈추는 경우, 위치를 증가시키지 않는다.

**전진 조건**

- [x] 0에서 9 사이의 무작위 값을 구한다.
- [x] 무작위 값이 4 이상일 경우, 전진한다.
- [x] 무작위 값이 3 이하일 경우, 멈춘다.

**자동차 이름 입력값 검증**

- [x] 자동차 이름은 1자 이상 5자 이하인가
- [x] 입력값이 쉼표(`,`)로 시작되거나 끝나지 않는가
- [x] 자동차 이름은 쉼표(`,`)를 기준으로 구분되는가
- [x] 자동차 이름은 중복되지 않는가
- [x] 잘못된 값을 입력할 경우, `IllegalArgumentException` 발생 후 어플리케이션 종료

**시도할 회수**

- [x] 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- [x] 시도할 회수는 1 이상의 숫자만 가능하다.

**시도할 횟수 입력값 검증**

- [x] 시도할 횟수는 숫자인가
- [x] 시도할 횟수는 1 이상인가
- [x] 잘못된 값을 입력할 경우, `IllegalArgumentException` 발생 후 어플리케이션 종료

### 경주

**경주 진행**

- [x] 각 회마다 자동차의 이름과 위치를 출력한다.

**우승자**

- [x] 최종 우승자를 출력한다.
- [x] 공동 우승자의 경우 쉼표(`,`)를 이용하여 구분한다.
