package io.kinoplan.demo.components.demos.Pickers

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.demos.Pickers.{DefaultPickersStyle, PickersStyle}
import io.kinoplan.demo.utils.props.MuiInputLabelProps
import io.kinoplan.scalajs.react.material.ui.core.MuiTextField
import japgolly.scalajs.react.vdom.all._
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object DatePickers extends ScalaCssReactImplicits {
  case class Props(style: PickersStyle)

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Date pickers")(
          form(css.container, noValidate := true,
            MuiTextField(label = Some("Birthday"), InputLabelProps = MuiInputLabelProps(shrink = Some(true)))(
              css.textField,
              id := "date",
              `type` := "date",
              defaultValue := "2017-05-24",
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("DatePickers")
    .renderBackend[Backend]
    .build

  def apply(style: PickersStyle = DefaultPickersStyle) = component(Props(style))
}
