package io.kinoplan.scalajs.react.material.ui.lab

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiAlertTitle extends ReactBridgeComponent with MuiAlertTitleExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/labs", "AlertTitle")
  @js.native
  object RawComponent extends js.Function

  def apply(
      classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined
  ): WithProps = auto
}

trait MuiAlertTitleExtensions {
  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
  }
}
