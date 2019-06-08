package io.kinoplan.scalajs.react.material.ui.core

import com.payalabs.scalajs.react.bridge.{ReactBridgeComponent, WithProps}

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiExpansionPanelActions extends ReactBridgeComponent with MuiExpansionPanelActionsExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/core", "ExpansionPanelActions")
  @js.native
  object RawComponent extends js.Function

  def apply(
    classes: Map[ClassKey.ClassKey, String] = Map.empty
  ): WithProps = auto
}

trait MuiExpansionPanelActionsExtensions {
  object ClassKey extends Enumeration {
    type ClassKey = String

    val root = "root"
    val action = "action"
  }
}