package io.kinoplan.demo.pages.demos

import io.kinoplan.demo.components.demos.Slider._
import io.kinoplan.demo.router.AppRouter.Page
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all.{VdomElement, div}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}

object SliderPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {

      div(
        SimpleSlider(),
        StepSlider(),
        DisabledSlider(),
        VerticalSlider(),
        CustomIconSlider()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SliderPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
