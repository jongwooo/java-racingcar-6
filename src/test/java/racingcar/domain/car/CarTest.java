package racingcar.domain.car;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import racingcar.domain.formula.MockFormula;
import racingcar.domain.formula.MoveState;

public class CarTest {

  @Nested
  @DisplayName("자동차를 생성할 때")
  public class CreateNewCarTest {

    @Test
    @DisplayName("이름과 위치를 지정하면 지정한 이름과 위치로 생성된다.")
    void 이름과_위치를_지정하면_지정한_이름과_위치로_생성된다() {
      // given
      var name = "pobi";
      var position = 0;

      // when
      var car = new Car(name, position);

      // then
      assertThat(car).isNotNull();
      assertThat(car.getName()).isEqualTo(name);
      assertThat(car.getPosition()).isEqualTo(position);
    }
  }

  @Nested
  @DisplayName("자동차 전진 또는 멈춤 여부를 판단할 때")
  public class CarMoveTest {

    private final String name = "pobi";
    private final int position = 0;

    @Test
    @DisplayName("MoveState가 MOVING_FORWARD일 때 자동차가 전진한다.")
    void MoveState가_MOVING_FORWARD일_때_자동차가_전진한다() {
      // given
      var car = new Car(name, position);
      var mockFormula = new MockFormula(MoveState.MOVING_FORWARD);

      // when
      var actual = car.move(mockFormula);

      // then
      assertThat(actual).isEqualTo(position + 1);
    }

    @Test
    @DisplayName("MoveState가 STOP일 때 자동차가 멈춘다.")
    void MoveState가_STOP일_때_자동차가_멈춘다() {
      // given
      var car = new Car(name, position);
      var mockFormula = new MockFormula(MoveState.STOP);

      // when
      var actual = car.move(mockFormula);

      // then
      assertThat(actual).isEqualTo(position);
    }
  }

  @Nested
  @DisplayName("자동차의 정보를 가져올 때")
  public class GetCarInfoTest {

    private final String name = "pobi";
    private final int position = 0;

    @Test
    @DisplayName("자동차 이름을 반환한다.")
    void 자동차_이름을_반환한다() {
      // given
      var car = new Car(name, position);

      // when
      var actual = car.getName();

      // then
      assertThat(actual).isEqualTo(name);
    }

    @Test
    @DisplayName("자동차 위치를 반환한다.")
    void 자동차_위치를_반환한다() {
      // given
      var car = new Car(name, position);

      // when
      var actual = car.getPosition();

      // then
      assertThat(actual).isEqualTo(position);
    }
  }
}