package io.kinoplan.demo.components.labs.Skeleton

import io.kinoplan.demo.components.ComponentContainer
import io.kinoplan.demo.styles.labs.Skeleton._
import io.kinoplan.scalajs.react.material.ui.core.MuiTypography
import io.kinoplan.scalajs.react.material.ui.lab.MuiSkeleton
import japgolly.scalajs.react.vdom.all.{VdomElement, _}
import japgolly.scalajs.react.{BackendScope, ScalaComponent}
import scalacss.ScalaCssReactImplicits

object SimpleSkeleton extends ScalaCssReactImplicits {

  case class Props(style: SkeletonStyle)

  case class State()

  class Backend(t: BackendScope[Props, State]) {

    def render(props: Props, state: State): VdomElement = {
      val css = props.style

      div(
        ComponentContainer("Simple skeleton")(
          div(css.root,
            MuiSkeleton(variant = MuiSkeleton.Variant.text, width = 210, height = 118)
          )
        ),
        ComponentContainer("Variants")(
          div(css.root,
            MuiSkeleton(variant = MuiSkeleton.Variant.text),
            MuiSkeleton(variant = MuiSkeleton.Variant.circle, width = 40, height = 40),
            MuiSkeleton(variant = MuiSkeleton.Variant.rect, width = 210, height = 118)
          )
        ),
        ComponentContainer("Animation")(
          div(css.root,
            MuiSkeleton(width = 210, height = 40),
            MuiSkeleton(animation = false, width = 210, height = 40),
            MuiSkeleton(animation = MuiSkeleton.Animation.pulse, width = 210, height = 40),
            MuiSkeleton(animation = MuiSkeleton.Animation.wave, width = 210, height = 40)
          )
        ),
        ComponentContainer("Infer from typography")(
          div(css.root,
            MuiTypography(variant = MuiTypography.Variant.h1)(
              MuiSkeleton(width = 210)
            )
          )
        )

      )
    }
  }

  private val component = ScalaComponent.builder[Props]("SimpleSkeleton")
    .initialState(State())
    .renderBackend[Backend]
    .build

  def apply(style: SkeletonStyle = DefaultSkeletonStyle) = component(Props(style))
}
