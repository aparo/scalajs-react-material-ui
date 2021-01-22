package io.kinoplan.demo.components.demos.Slider

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Slider.{
  DefaultDisabledSliderStyle,
  DisabledSliderStyle
}
import io.kinoplan.demo.utils.Helpers.styleAToClassName
import io.kinoplan.scalajs.react.material.ui.core.MuiSlider
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object DisabledSlider extends ScalaCssReactImplicits {
  case class Props(style: DisabledSliderStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      val sliderClasses = Map(
        MuiSlider.ClassKey.container -> styleAToClassName(css.slider)
      )

      div(
        ComponentContainer("Disabled slider")(
          div(
            css.root,
            MuiSlider(classes = sliderClasses)(value := 0, disabled := true),
            MuiSlider(classes = sliderClasses)(value := 50, disabled := true),
            MuiSlider(classes = sliderClasses)(value := 100, disabled := true)
          )
        )
      )
    }
  }

  private val component = ScalaComponent
    .builder[Props]("DisabledSlider")
    .renderBackend[Backend]
    .build

  def apply(style: DisabledSliderStyle = DefaultDisabledSliderStyle) =
    component(Props(style))
}
