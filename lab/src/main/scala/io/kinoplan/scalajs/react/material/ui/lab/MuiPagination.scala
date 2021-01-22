package io.kinoplan.scalajs.react.material.ui.lab

import io.kinoplan.scalajs.react.bridge.{ReactBridgeComponent, WithProps}
import japgolly.scalajs.react.ReactEvent

import scala.scalajs.js
import scala.scalajs.js.annotation.JSImport
import scala.scalajs.js.|

object Pagination extends ReactBridgeComponent with MuiPaginationExtensions {
  override protected lazy val componentValue: js.Function = RawComponent

  @JSImport("@material-ui/lab", "Pagination")
  @js.native
  object RawComponent extends js.Function

  def apply(
      classes: js.UndefOr[Map[ClassKey.Value, String]] = js.undefined,
      color: js.UndefOr[Color.Value] = js.undefined,
      getItemAriaLabel: js.UndefOr[(String, Int, Boolean) => String] =
        js.undefined,
      shape: js.UndefOr[Shape.Value] = js.undefined,
      size: js.UndefOr[Size.Value] = js.undefined,
      variant: js.UndefOr[Variant.Value] = js.undefined,
      boundaryCount: js.UndefOr[Int] = js.undefined,
      componentName: js.UndefOr[String] = js.undefined,
      count: js.UndefOr[Int] = js.undefined,
      defaultPage: js.UndefOr[Int] = js.undefined,
      disabled: js.UndefOr[Boolean] = js.undefined,
      hideNextButton: js.UndefOr[Boolean] = js.undefined,
      hidePrevButton: js.UndefOr[Boolean] = js.undefined,
      onChange: js.UndefOr[ReactHandler2[ReactEvent, Int]] = js.undefined,
      page: js.UndefOr[Int] = js.undefined,
      showFirstButton: js.UndefOr[Boolean] = js.undefined,
      showLastButton: js.UndefOr[Boolean] = js.undefined,
      siblingCount: js.UndefOr[Int] = js.undefined,
      TransitionComponent: js.UndefOr[String | js.Function] = js.undefined,
      TransitionProps: js.UndefOr[js.Object] = js.undefined
  ): WithProps = auto
}

trait MuiPaginationExtensions {

  object ClassKey extends Enumeration {
    type Value = String

    val root = "root"
    val ul = "ul"
  }

  object Color extends Enumeration {
    type Value = String

    val primary = "primary"
    val secondary = "secondary"
    val standard = "standard"
  }

  object Shape extends Enumeration {
    type Value = String

    val round = "round"
    val rounded = "rounded"
  }

  object Size extends Enumeration {
    type Value = String
    val small = "small"
    val medium = "medium"
    val large = "large"
  }

  object Variant extends Enumeration {
    type Value = String

    val text = "text"
    val outlined = "outlined"
  }

}
