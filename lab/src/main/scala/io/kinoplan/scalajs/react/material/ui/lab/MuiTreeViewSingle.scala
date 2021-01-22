package io.kinoplan.scalajs.react.material.ui.lab

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react._
import japgolly.scalajs.react.vdom.VdomNode

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport

object MuiTreeViewSingle
    extends ReactBridgeComponent
    with MuiTreeViewSingleExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "TreeView")
  @js.native
  object RawComponent extends js.Function

  def apply(
      defaultCollapseIcon: js.UndefOr[VdomNode] = js.undefined,
      defaultEndIcon: js.UndefOr[VdomNode] = js.undefined,
      defaultExpanded: js.UndefOr[js.Array[String]] = js.undefined,
      defaultExpandIcon: js.UndefOr[VdomNode] = js.undefined,
      defaultParentIcon: js.UndefOr[VdomNode] = js.undefined,
      disableSelection: js.UndefOr[Boolean] = js.undefined,
      expanded: js.UndefOr[js.Array[String]] = js.undefined,
      onNodeToggle: js.UndefOr[(ReactEvent, js.Array[String]) => Callback] =
        js.undefined,
      classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
      defaultSelected: js.UndefOr[String] = js.undefined,
      selected: js.UndefOr[String] = js.undefined,
      multiSelect: Boolean = false,
      onNodeSelect: js.UndefOr[(ReactEvent, String) => Callback] = js.undefined
  ): WithProps = auto
}

trait MuiTreeViewSingleExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"

  }
}
