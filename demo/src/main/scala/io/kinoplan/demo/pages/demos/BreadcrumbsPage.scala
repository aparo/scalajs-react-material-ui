package io.kinoplan.demo.pages.demos

import io.kinoplan.demo.components.demos.Breadcrumbs._
import io.kinoplan.demo.router.AppRouter.Page
import japgolly.scalajs.react.extra.router.RouterCtl
import japgolly.scalajs.react.vdom.all.{VdomElement, div}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}

object BreadcrumbsPage {
  case class Props(router: RouterCtl[Page])

  class Backend(t: BackendScope[Props, Unit]) {
    def render(props: Props): VdomElement = {

      div(
        SimpleBreadcrumbs(),
//        CustomSeparator(),
//        IconBreadcrumbs(),
//        CollapsedBreadcrumbs(),
//        CustomizedBreadcrumbs()
      )
    }
  }

  private val component = ScalaComponent.builder[Props]("BreadcrumbsPage")
    .renderBackend[Backend]
    .build

  def apply(router: RouterCtl[Page]) = component(Props(router))
}
