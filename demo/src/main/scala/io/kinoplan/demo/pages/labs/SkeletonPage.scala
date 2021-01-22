package io.kinoplan.demo.pages.labs

import io.kinoplan.demo.components.labs.Skeleton.SimpleSkeleton
import io.kinoplan.demo.router.AppRouter.Page
import japgolly.scalajs.react._
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all._

object SkeletonPage {

  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {

      div(
        SimpleSkeleton()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
