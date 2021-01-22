package io.kinoplan.demo.components.labs.Alert

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Alert.{AlertStyle, DefaultAlertStyle}
import io.kinoplan.demo.utils.Helpers.StringExtended
import io.kinoplan.scalajs.react.material.ui.core.MuiGrid
import io.kinoplan.scalajs.react.material.ui.lab.MuiAlert
import japgolly.scalajs.react.vdom.all.{VdomElement, div}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object SimpleAlerts extends ScalaCssReactImplicits {
  case class Props(style: AlertStyle)

  case class State(
      selected: String = ""
  )
  class Backend(t: BackendScope[Props, State]) {

    def render(props: Props, state: State): VdomElement = {
//      val css = props.style

      div(
        ComponentContainer("Simple Alerts")(
          MuiGrid(container = true, spacing = 16)(
            MuiGrid(item = true, xs = 12, sm = 6)(
              MuiAlert(severity = MuiAlert.Color.error)(
                "This is an error alert — check it out!".toVdom
              ),
              MuiAlert(severity = MuiAlert.Color.warning)(
                "This is a warning alert — check it out!".toVdom
              ),
              MuiAlert(severity = MuiAlert.Color.info)(
                "This is an info alert — check it out!".toVdom
              ),
              MuiAlert(severity = MuiAlert.Color.success)(
                "This is a success alert — check it out!".toVdom
              )
            )
          )
        )
      )
    }
  }

  private val component = ScalaComponent
    .builder[Props]("Alert")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: AlertStyle = DefaultAlertStyle) =
    component(Props(style))

}
