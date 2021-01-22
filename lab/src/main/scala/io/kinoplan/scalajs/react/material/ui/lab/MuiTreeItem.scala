package io.kinoplan.scalajs.react.material.ui.lab

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.vdom.VdomNode
import org.scalajs.dom.html

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object MuiTreeItem extends ReactBridgeComponent with MuiTreeItemExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "TreeItem")
  @js.native
  object RawComponent extends js.Function

  def apply(
      nodeId: String,
      collapseIcon: js.UndefOr[VdomNode] = js.undefined,
      endIcon: js.UndefOr[VdomNode] = js.undefined,
      expandIcon: js.UndefOr[VdomNode] = js.undefined,
      icon: js.UndefOr[VdomNode] = js.undefined,
      onIconClick: js.UndefOr[html.Element => Callback] = js.undefined,
      label: js.UndefOr[VdomNode|String] = js.undefined,
      onLabelClick: js.UndefOr[html.Element => Callback] = js.undefined,
      classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
      TransitionComponent: js.UndefOr[String | js.Function] = js.undefined,
      TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiTreeItemExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val expanded = "expanded"
    val selected = "selected"
    val group = "group"
    val content = "content"
    val iconContainer = "iconContainer"
    val label = "label"

  }
}
