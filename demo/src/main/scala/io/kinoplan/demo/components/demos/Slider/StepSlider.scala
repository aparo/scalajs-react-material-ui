package io.kinoplan.demo.components.demos.Slider

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Slider.{DefaultSliderStyle, SliderStyle}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core._
import io.kinoplan.scalajs.react.material.ui.core.MuiSlider
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{
  BackendScope,
  Callback,
  ReactEvent,
  ScalaComponent
}
import scalacss.ScalaCssReactImplicits

object StepSlider extends ScalaCssReactImplicits {
  case class Props(style: SliderStyle)

  case class State(value: Double = 3) {
    def handleChange(value: Double) = copy(value = value)
  }

  class Backend(t: BackendScope[Props, State]) {
    def handleChange: (ReactEvent, Double) => Callback = (_, value) => {
      t.modState(_.handleChange(value))
    }

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      val sliderClasses = Map(
        MuiSlider.ClassKey.container -> styleAToClassName(css.slider)
      )

      div(
        ComponentContainer("Slider with steps")(
          div(
            css.root,
            MuiTypography()(id := "label", "Slider label"),
            MuiSlider(
              classes = sliderClasses,
              onChange = handleChange,
              min = 0,
              max = 6,
              step = 1
            )(
              aria.labelledBy := "label",
              value := state.value
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent
    .builder[Props]("StepSlider")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SliderStyle = DefaultSliderStyle) = component(Props(style))
}
