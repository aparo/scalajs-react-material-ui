package io.kinoplan.scalajs.react.material.ui.lab


import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

object MuiSkeleton extends ReactBridgeComponent with MuiSkeletonExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "Skeleton")
  @js.native
  object RawComponent extends js.Function

  def apply(
    animation: js.UndefOr[Animation.Value|Boolean]=js.undefined,
    height: js.UndefOr[Int|String]=js.undefined,
    width: js.UndefOr[Int|String]=js.undefined,
    variant: js.UndefOr[Variant.Value]=js.undefined,
    classKey: js.UndefOr[ClassKey.Value]=js.undefined
  ): WithProps = auto
}

trait MuiSkeletonExtensions {
  object Animation extends Enumeration {
    type Value = String

    val pulse = "pulse"
    val wave = "wave"
  }

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val text = "text"
    val rect = "rect"
    val circle = "circle"
    val pulse = "pulse"
    val wave = "wave"
    val withChildren = "withChildren"
    val fitContent = "fitContent"
    val heightAuto = "heightAuto"
  }

   object Variant extends Enumeration {
    type Value = String

    val text = "text"
    val rect = "rect"
    val circle = "circle"
  }
}
